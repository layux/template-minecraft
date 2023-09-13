# Dependency Injection (DI)

## Getting started

Dependency Injection (DI) is a design pattern that deals with how components or objects acquire their dependencies. Instead of components creating their own dependencies, they receive them from an external source.

### Advantages:

- **Separation of Concerns**: Components focus on their core logic, not on creating dependencies.
- **Reusability**: Dependencies can be shared among multiple components.
- **Testability**: By injecting mock or stub dependencies, we can easily unit test our components.

## Problem Introduction
Let's take an example to illustrate a problem that can arise without using DI.

**Scenario: Minecraft Mod - "MysteryChests"**: Imagine we have a mod called "MysteryChests". This mod spawns chests in the world that contain random loot. The loot is determined by a LootGenerator service.

```java
public class MysteryChest {
    private LootGenerator lootGenerator = new LootGenerator();

    public void spawnChestAt(Location loc) {
        Chest chest = loc.spawnChest();
        chest.setLoot(lootGenerator.generateLoot());
    }
}

public class LootGenerator {
    public ItemStack[] generateLoot() {
        // Complex logic to generate random loot
        return new ItemStack[]{...};
    }
}
```

In this example, `MysteryChest` is tightly coupled with the `LootGenerator`.

### Issues:

- **Testing**: If we wanted to test `MysteryChest` with a mock `LootGenerator`, we couldn't.
- **Lack of Flexibility**: What if we wanted to use a different LootGenerator in the future?
- **Lack of Reusability**: What if we wanted to use the LootGenerator in another mod or feature?

## Introducing Dagger for our Minecraft Mod

1. Lets start by defining a module that provides a `LootGenerator`:

```java
@Module
public class LootGeneratorModule {
    @Provides
    public LootGenerator provideLootGenerator() {
        return new LootGenerator();
    }
}
```

2. Next, we need to create a component that will inject the `LootGenerator` into our `MysteryChest`:

```java
@Component(modules = LootGeneratorModule.class)
public interface MysteryChestsComponent {
    void inject(MysteryChestsMod mod);
}
```

3. Now lets refactor our `MysteryChest` to use Dagger:

```java
public class MysteryChest {
    LootGenerator lootGenerator;
    
    @Inject
    public MysteryChest(LootGenerator lootGenerator) {
        this.lootGenerator = lootGenerator;
    }
    
    public void spawnChestAt(Location loc) {
        Chest chest = loc.spawnChest();
        chest.setLoot(lootGenerator.generateLoot());
    }
}
```

4. Finally, we need to create an instance of our component and inject it into our mod:

```java
public class MysteryChestsMod implements ModInitializer {
    @Inject
    MysteryChest mysteryChest;
    
    @Override
    public void onInitialize() {
        MysteryChestsComponent component = DaggerMysteryChestsComponent.create();
        component.inject(this);
        
        mysteryChest.spawnChestAt(...);
    }
}
```

## What have we achieved?

Dependency Injection, facilitated by Dagger in this example, has addressed the previously mentioned issues:

- **Testing**: With DI, we can now easily provide a mock implementation of LootGenerator for testing purposes. This makes it easier to test the behaviors of the MysteryChest class without being dependent on the actual logic of the LootGenerator.
- **Lack of Flexibility**: By injecting the dependency, our MysteryChest is no longer tightly coupled to a specific LootGenerator implementation. In the future, if we want to use a different kind of loot generator, we can simply provide it via our module without needing to modify the MysteryChest class directly.
- **Lack of Reusability**: The LootGenerator can now be easily reused across different parts of the mod or even in other mods. If another feature or mod requires the LootGenerator, they can request it via Dagger, ensuring a single source of truth and potentially reducing redundant code.

In essence, Dependency Injection has made our Minecraft mod more modular, maintainable, and testable. This pattern is not only beneficial for game mods but for software development in general. By decoupling components and their dependencies, developers achieve a cleaner architecture, allowing for easier changes in the future, better reusability of components, and more straightforward testing scenarios.
