package io.layux.example.listener

import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.player.PlayerChatEvent
import com.velocitypowered.api.proxy.ProxyServer
import io.layux.example.ExamplePlugin
import io.layux.example.contract.Registrable
import net.kyori.adventure.text.Component
import javax.inject.Inject

/**
 * @author Fernando Lopez <fernando.lopez@layux.io>
 * @project template-minecraft
 * @package io.layux.example.listener
 * @date 13/09/23 1:42
 *
 * © 2023 Layux LLC. All rights reserved.
 */
class PlayerEventsListener @Inject constructor(
    private val plugin: ExamplePlugin,
    private val proxyServer: ProxyServer
) : Registrable {
    override fun register() {
        proxyServer.eventManager.register(plugin, this)
    }

    @Subscribe
    fun handlePlayerChatEvent(event: PlayerChatEvent) {
        event.player.sendMessage(Component.text("Hello from Velocity!"))
    }
}
