# Gradle & Kotlin

This is a template project for a Gradle project using Kotlin.

## How to use

### Easy way

Click the "Use this template" button on the top right of this page.

### Other platforms

Download the zip file from the "Clone or download" button on the top right of this page.

## Getting started

1. Modify the `settings.gradle` file to change the root project name
2. Create a new module by creating a new directory in the `projects` directory and adding a `build.gradle` file to it.
3. Add the module to the `settings.gradle` file.

## Adding plugins

If you need to add a gradle plugin that is only used in a single module, you can add it to the `build.gradle` file in that module. Otherwise please add it to the root `build.gradle` file with `apply: false` and then in your module at the top of the `build.gradle` file add a `plugins` block with your dependency, you will only need to supply the name of it.

## Adding dependencies

We recommend adding versions inside the `gradle.properties` file and then referencing them in the `build.gradle` files. This makes it easier to update versions in the future.

## Contributing

If you have any suggestions or improvements please feel free to open an issue or pull request. If you have any questions please feel free to contact us in our [Discord server](https://discord.gg/VgbRfxkPeD).
