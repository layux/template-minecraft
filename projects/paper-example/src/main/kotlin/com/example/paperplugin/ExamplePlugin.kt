package com.example.paperplugin

import org.bukkit.plugin.java.JavaPlugin

class ExamplePlugin : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("Hello World!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}