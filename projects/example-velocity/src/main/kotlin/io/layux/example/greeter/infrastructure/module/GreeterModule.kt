package io.layux.example.greeter.infrastructure.module

import com.velocitypowered.api.proxy.ProxyServer
import dagger.Module
import dagger.Provides
import io.layux.example.ExamplePlugin
import io.layux.example.greeter.application.contract.MessageProvider
import io.layux.example.greeter.application.usecase.GreetPlayerUseCase
import io.layux.example.greeter.infrastructure.listener.PlayerEventsListener
import io.layux.example.greeter.infrastructure.provider.SimpleMessageProvider
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
class GreeterModule {
    @Provides
    @Singleton
    fun providePlayerEventsListener(plugin: ExamplePlugin, proxyServer: ProxyServer, greetPlayerUseCase: GreetPlayerUseCase): PlayerEventsListener {
        return PlayerEventsListener(plugin, proxyServer, greetPlayerUseCase)
    }

    @Provides
    @Singleton
    fun provideGreetPlayerUseCase(messageProvider: MessageProvider): GreetPlayerUseCase {
        return GreetPlayerUseCase(messageProvider)
    }

    @Provides
    @Singleton
    fun provideMessageProvider(): MessageProvider {
        return SimpleMessageProvider()
    }
}
