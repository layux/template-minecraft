package io.layux.example.component

import dagger.Component
import io.layux.example.ExamplePlugin
import io.layux.example.module.ExampleModule
import io.layux.example.module.VelocityModule
import javax.inject.Singleton

/**
 * @author Fernando Lopez <fernando.lopez@layux.io>
 * @project template-minecraft
 * @package io.layux.example.component
 * @date 13/09/23 1:38
 *
 * © 2023 Layux LLC. All rights reserved.
 */
@Component(modules = [VelocityModule::class, ExampleModule::class])
@Singleton
interface ExamplePluginComponent {
    fun inject(plugin: ExamplePlugin)
}
