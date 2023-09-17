package io.layux.example

import dagger.Component
import io.layux.example.greeter.infrastructure.module.GreeterModule
import io.layux.example.shared.module.VelocityModule
import javax.inject.Singleton

/**
 * Main DI container for the plugin.
 *
 * @author Fernando Lopez <fernando.lopez@layux.io>
 * @project template-minecraft
 * @package io.layux.example.component
 * @date 13/09/23 1:38
 *
 * © 2023 Layux LLC. All rights reserved.
 */
@Component(modules = [VelocityModule::class, GreeterModule::class])
@Singleton
interface ExamplePluginComponent {
    fun inject(plugin: ExamplePlugin)
}
