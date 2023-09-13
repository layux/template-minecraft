package io.layux.example.module

import com.velocitypowered.api.proxy.ProxyServer
import dagger.Module
import dagger.Provides
import io.layux.example.ExamplePlugin
import org.slf4j.Logger
import javax.inject.Singleton

/**
 * @author Fernando Lopez <fernando.lopez@layux.io>
 * @project template-minecraft
 * @package io.layux.example.module
 * @date 13/09/23 1:36
 *
 * © 2023 Layux LLC. All rights reserved.
 */
@Module
class VelocityModule(
    private val plugin: ExamplePlugin,
    private val proxyServer: ProxyServer,
    private val logger: Logger
) {
    @Provides
    @Singleton
    fun providePlugin(): ExamplePlugin {
        return plugin
    }

    @Provides
    @Singleton
    fun provideProxyServer(): ProxyServer {
        return proxyServer
    }

    @Provides
    @Singleton
    fun provideLogger(): Logger {
        return logger
    }
}
