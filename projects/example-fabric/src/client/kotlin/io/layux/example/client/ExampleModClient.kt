package io.layux.example.client

import io.layux.example.Constants
import net.fabricmc.api.ClientModInitializer

/**
 * Entry point for client-side code.
 *
 * @author Fernando Lopez <fernando.lopez@layux.io>
 * @project template-minecraft
 * @package io.layux.example.client
 * @date 12/09/2023 8:03 AM
 *
 * © 2023 Layux LLC. All rights reserved.
 */
object ExampleModClient : ClientModInitializer {
	override fun onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
        println("Hello Fabric world! (client) - ${Constants.MOD_ID}")
	}
}
