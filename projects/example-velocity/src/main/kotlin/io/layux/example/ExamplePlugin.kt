package io.layux.example

import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.plugin.Plugin
import com.velocitypowered.api.plugin.annotation.DataDirectory
import com.velocitypowered.api.proxy.ProxyServer
import io.layux.example.component.DaggerExamplePluginComponent
import io.layux.example.listener.PlayerEventsListener
import io.layux.example.module.ExampleModule
import io.layux.example.module.VelocityModule
import org.slf4j.Logger
import java.nio.file.Path
import javax.inject.Inject

@Plugin(
    id = "example-velocity",
    name = "ExampleVelocity",
    version = "1.0",
    description = "Example Velocity plugin",
    authors = ["Layux"],
    url = "https://layux.io"
)
class ExamplePlugin @Inject constructor(
    private val server: ProxyServer,
    private val logger: Logger,
    @DataDirectory private val dataDirectory: Path
) {
    @Inject
    lateinit var playerEventsListener: PlayerEventsListener

    @Subscribe
    fun onProxyInitialization(event: ProxyInitializeEvent) {
        DaggerExamplePluginComponent.builder()
            .velocityModule(VelocityModule(this, server, logger))
            .exampleModule(ExampleModule())
            .build()
            .inject(this)

        playerEventsListener.register()

        logger.info("Example Velocity plugin loaded!")
    }
}
