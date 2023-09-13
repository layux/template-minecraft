# Gradle

## Adding plugins

Adding plugins is done in the `build.gradle` file for the module you want to add the plugin to.

```groovy
plugins {
    id 'java'
    id 'org.springframework.boot' version '2.1.3.RELEASE'
    id 'io.spring.dependency-management' version '1.0.8.RELEASE'
}
```

As you can see, the `plugins` block is a simple list of plugins. The `id` is the name of the plugin, and the `version` is the version of the plugin to use. The `id` is the only required field.

However, most of the time we need plugins we use them in more than one project, thats why in our root `build.gradle` we have a `plugins` block with all the plugins we use in our projects and then we apply them in the modules we need them. For example:


```groovy
// root build.gradle
plugins {
    id 'com.github.johnrengelman.shadow' version "$shadow_version" apply false
    id 'fabric-loom' version "$fabric_loom_version" apply false
    id 'io.papermc.paperweight.userdev' version "$paperweight_version" apply false
    id 'net.minecrell.plugin-yml.bukkit' version "$plugin_yml_version" apply false
    id 'org.jetbrains.kotlin.jvm' version "$kotlin_version" apply false
    id 'org.jetbrains.kotlin.kapt' version "$kotlin_version" apply false
    id 'xyz.jpenilla.run-paper' version "$run_paper_version" apply false
}

// module build.gradle
plugins {
    id 'com.github.johnrengelman.shadow'
}
```

Something to note is that we use the `apply false` option to avoid applying the plugin in the root `build.gradle` and then we apply it in the module we need it. We do this because some plugins require configuration and we want to keep the root `build.gradle` as clean as possible. Also we only define the plugin with the `id` because we use the `version` from `gradle.properties` that was previously defined on the root `build.gradle`.

## Adding repositories

Sometimes you need to add a repository to download dependencies from. This is done in the `build.gradle` file for the module you want to add the repository to. By default, Gradle will use Maven Central, but you can add more repositories if you need to.

```groovy
repositories {
    mavenCentral()
    maven { url = 'https://jitpack.io' }
    maven { url = 'https://maven.fabricmc.net/' }
    maven { url = 'https://oss.sonatype.org/content/repositories/snapshots' }
}
```

## Adding dependencies

Adding dependencies is done in the `build.gradle` file for the module you want to add the dependency to, we preffer using the short syntax for adding dependencies and we use `gradle.properties` to manage versions.

```groovy
dependencies {
    // External dependencies
    minecraft "com.mojang:minecraft:$minecraft_version"
    mappings "net.fabricmc:yarn:$yarn_mappings_version:v2"
    modImplementation "net.fabricmc:fabric-loader:$fabric_loader_version"

    modImplementation "net.fabricmc.fabric-api:fabric-api:$fabric_version"
    modImplementation "net.fabricmc:fabric-language-kotlin:$fabric_language_kotlin_version"
}
```

## Managing versions

We use `gradle.properties` to manage versions. This is a file in the root of the project that contains key-value pairs. The key is the name of the version, and the value is the version number. For example:

```properties
dagger_version = 2.48
minecraft_version = 1.20.1
geckolib_version = 3.0.42
```

## Running tasks

To run a task, you can use the `gradlew` script in the root of the project. For example, to run the `build` task, you can run `./gradlew build` on Unix-like systems, or `gradlew.bat build` on Windows. Also if you are using IntelliJ IDEA you can run tasks from the Gradle tab.

## Bundled tasks

### Global tasks 

- `build` - Assembles and tests this project.
- `clean` - Deletes the build directory.
- `publish` - Publishes all publications produced by this project.
- `test` - Runs the unit tests.

### Root tasks

- `buildAffected` - Assembles all projects that have changed since the last release.
- `testAffected` - Tests all projects that have changed since the last release.
- `publishAffected` - Publishes all projects that have changed since the last release.

### Platform-specific tasks

- **FabricMC**
  - `downloadAssets` - Downloads all assets for Minecraft and Fabric.
  - `genSources` - Generates sources for the project allowing you to properly read the Minecraft source code.
  - `runClient` - Launches a Minecraft client instance with your mod and dependencies injected into it.
  - `runServer` - Launches a Minecraft server instance with your mod and dependencies injected into it.
  - `runDatagen` - Runs the data generators for this project to generate data files for use in-game.
- **Paper**
  - `runServer` - Launches a Minecraft server instance with the Paper server jar, your plugin and dependencies injected into it.
