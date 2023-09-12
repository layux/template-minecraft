package io.layux.example

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

/**
 * Entry point for common-side code.
 *
 * @author Fernando Lopez <fernando.lopez@layux.io>
 * @project template-minecraft
 * @package io.layux.example.client.mixin
 * @date 12/09/2023 8:03 AM
 *
 * © 2023 Layux LLC. All rights reserved.
 */
object ExampleMod : ModInitializer {
    private val logger = LoggerFactory.getLogger("fabric-example")

	override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		logger.info("Hello Fabric world!")
	}
}