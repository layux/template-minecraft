package io.layux.paperexample

import org.bukkit.Material
import org.bukkit.block.BlockFace
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.material.Directional
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

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (command.name == "rotateglass") {
            if (sender is Player) {
                val block = sender.getTargetBlock(null, 5)

                if (block.type == Material.GLASS) {
                    // Get the current direction the block is facing
                    val directional = block.blockData as Directional

                    // Determine the new direction based on the current direction
                    val newDirection = when (directional.facing) {
                        BlockFace.NORTH -> BlockFace.EAST
                        BlockFace.EAST -> BlockFace.SOUTH
                        BlockFace.SOUTH -> BlockFace.WEST
                        BlockFace.WEST -> BlockFace.NORTH
                        else -> directional.facing // In case the current direction is not one of the cardinal directions
                    }

                    // Set the new direction for the block
                    directional.setFacingDirection(newDirection)
                    block.state.update()

                    sender.sendMessage("Glass block rotated")
                } else {
                    sender.sendMessage("You must be looking at a glass block to use this command")
                }
            } else {
                sender.sendMessage("You must be a player to use this command")
            }
            return true
        }
        return super.onCommand(sender, command, label, args)
    }
}