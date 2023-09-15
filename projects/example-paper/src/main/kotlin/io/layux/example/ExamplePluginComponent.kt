package io.layux.example

import dagger.Component
import io.layux.example.shared.infrastructure.module.PaperModule
import org.bukkit.plugin.java.JavaPlugin
import javax.inject.Singleton

/**
 * Main DI container for the plugin.
 *
 * @author Fernando Lopez <fernando.lopez@layux.io>
 * @project template-minecraft
 * @package io.layux.example
 * @date 14/09/23 3:31
 *
 * © 2023 Layux LLC. All rights reserved.
 */
@Component(modules = [PaperModule::class])
@Singleton
interface ExamplePluginComponent {
    fun inject(plugin: JavaPlugin)
}
