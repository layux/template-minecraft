package io.layux.example

import org.bukkit.plugin.java.JavaPlugin

/**
 * Entrypoint for the plugin.
 *
 * @project template-minecraft
 * @package io.layux.paperexample
 * @author MisterQuestions <misterquestions@layux.io>
 * @date 22/02/23 0:45
 *
 * © 2023 Layux LLC. All rights reserved.
 */
class ExamplePlugin : JavaPlugin() {
    override fun onEnable() {


        logger.info("ExamplePlugin enabled!")
    }

    override fun onDisable() {
        logger.info("ExamplePlugin disabled!")
    }
}
