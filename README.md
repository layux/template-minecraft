# Plantilla: Minecraft

Este repositorio es una plantilla base para la creación de proyectos de Minecraft con Java y Kotlin, que emplea Gradle como sistema de compilación.

## Estructura de carpetas

- [docker](/docker): Configuraciones de docker y archivos de docker-compose para multiples servicios y ambientes.
- [docs](/docs): Carpeta donde se puede encontrar documentación sobre el proyecto y guías para el desarrollo.
- [projects](/projects): En esta carpeta están los múltiples proyectos de este repositorio anidados y vinculados con el uso de Gradle.

## Usando alguna plantilla

1. Clona la carpeta del tipo de proyecto que deseas emplear y renombrala conforme al nombre de tu proyecto.
2. En el archivo `settings.gradle` modifica la directiva de `include` añadiendo el nombre exacto de la carpeta que clonaste previamente.
3. Lleva a cabo la tarea de sincronización de gradle.
