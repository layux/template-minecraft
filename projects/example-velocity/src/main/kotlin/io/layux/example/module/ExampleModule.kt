package io.layux.example.module

import com.velocitypowered.api.proxy.ProxyServer
import dagger.Module
import dagger.Provides
import io.layux.example.ExamplePlugin
import io.layux.example.listener.PlayerEventsListener
import javax.inject.Singleton

/**
 * @author Fernando Lopez <fernando.lopez@layux.io>
 * @project template-minecraft
 * @package io.layux.example.module
 * @date 13/09/23 0:45
 *
 * © 2023 Layux LLC. All rights reserved.
 */
@Module
class ExampleModule {
    @Provides
    @Singleton
    fun providePlayerEventsListener(plugin: ExamplePlugin, proxyServer: ProxyServer): PlayerEventsListener {
        return PlayerEventsListener(plugin, proxyServer)
    }
}
