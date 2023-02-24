package io.layux.velocityexample

import com.google.inject.Inject
import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.plugin.Plugin
import com.velocitypowered.api.plugin.annotation.DataDirectory
import com.velocitypowered.api.proxy.ProxyServer
import org.slf4j.Logger
import java.nio.file.Path

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
    @Subscribe
    fun onProxyInitialization(event: ProxyInitializeEvent) {
        logger.info("Example Velocity plugin loaded!")
    }
}
