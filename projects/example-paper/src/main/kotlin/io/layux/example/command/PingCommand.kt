package io.layux.example.command

import net.kyori.adventure.text.Component
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.craftbukkit.v1_20_R1.entity.CraftPlayer
import org.bukkit.entity.Player

/**
 * A simple command that retrieves the latency between the server and the client.
 *
 * @project template-minecraft
 * @package io.layux.example.command
 * @author MisterQuestions <misterquestions@layux.io>
 * @date 14/09/2023 08:33 p. m.
 *
 * © 2023 Layux LLC. All rights reserved.
 */
class PingCommand : Command("ping", "Retrieves the latency between the server and the client.", "/ping", listOf("latency")) {
    /**
     * Executes the command, returning its success
     *
     * @param sender Source object which is executing this command
     * @param commandLabel The alias of the command used
     * @param args All arguments passed to the command, split via ' '
     * @return true if the command was successful, otherwise false
     */
    override fun execute(
        sender: CommandSender,
        commandLabel: String,
        args: Array<out String>?
    ): Boolean {
        if (sender !is Player) {
            sender.sendMessage("You must be a player to use this command.")
            return false
        }

        val player = sender as CraftPlayer
        val ping = player.handle.latency

        sender.sendMessage(Component.text("Your ping is ${ping}ms."))
        return true
    }
}
