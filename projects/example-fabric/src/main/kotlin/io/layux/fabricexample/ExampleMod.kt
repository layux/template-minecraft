package io.layux.fabricexample

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 *
 *
 * @project template-minecraft
 * @package io.layux.fabricexample
 * @author MisterQuestions <misterquestions@layux.io>
 * @date 12/04/2023 02:37 AM
 *
 * © 2023 Layux LLC. All rights reserved.
 */
class ExampleMod : ModInitializer {
    companion object {
        const val MOD_ID = "fabricexample"
        val LOGGER: Logger = LoggerFactory.getLogger(MOD_ID)
    }

    /**
     * Runs the mod initializer.
     */
    override fun onInitialize() {
        LOGGER.info("Hello Fabric world!")
    }
}