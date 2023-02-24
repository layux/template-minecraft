package io.layux.paperexample

import org.bukkit.Material
import org.bukkit.block.BlockFace
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.material.Directional
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.plugin.java.annotation.plugin.Plugin

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
@Plugin(name = "ExamplePlugin", version = "1.0.0")
class ExamplePlugin : JavaPlugin() {
    override fun onEnable() {
        logger.info("ExamplePlugin enabled!")
    }

    override fun onDisable() {
        logger.info("ExamplePlugin disabled!")
    }
}
