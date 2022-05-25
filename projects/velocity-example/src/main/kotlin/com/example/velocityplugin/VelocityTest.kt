package com.example.velocityplugin

import com.google.inject.Inject
import com.velocitypowered.api.plugin.Plugin
import com.velocitypowered.api.proxy.ProxyServer
import org.slf4j.Logger

@Plugin(
    id = "myfirstplugin",
    name = "My First Plugin",
    version = "0.1.0-SNAPSHOT",
    url = "https://example.org",
    description = "I did it!",
    authors = ["Me"]
)
class VelocityTest @Inject constructor(
    private val server: ProxyServer,
    private val logger: Logger
) {
    init {
        logger.info("Hello there! I made my first plugin with Velocity.")
    }
}
