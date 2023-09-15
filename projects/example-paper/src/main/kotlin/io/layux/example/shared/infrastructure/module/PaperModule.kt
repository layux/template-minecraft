package io.layux.example.shared.infrastructure.module

import dagger.Module
import dagger.Provides
import org.bukkit.plugin.java.JavaPlugin
import java.util.logging.Logger
import javax.inject.Singleton

/**
 * @author Fernando Lopez <fernando.lopez@layux.io>
 * @project template-minecraft
 * @package io.layux.example.shared.infrastructure.module
 * @date 14/09/23 3:33
 *
 * © 2023 Layux LLC. All rights reserved.
 */
@Module
class PaperModule(private val plugin: JavaPlugin) {
    @Provides
    @Singleton
    fun providePlugin(): JavaPlugin {
        return plugin
    }

    @Provides
    @Singleton
    fun provideLogger(): Logger {
        return plugin.logger
    }
}
