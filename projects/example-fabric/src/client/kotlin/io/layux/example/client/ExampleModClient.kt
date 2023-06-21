package io.layux.example.client

import io.layux.example.ExampleMod
import net.fabricmc.api.ClientModInitializer

/**
 *
 *
 * @project template-minecraft
 * @package io.layux.example.client
 * @author MisterQuestions <misterquestions@layux.io>
 * @date 21/06/2023 01:22 PM
 *
 * © 2023 Layux LLC. All rights reserved.
 */
class ExampleModClient : ClientModInitializer {
    /**
     * Runs the mod initializer on the client environment.
     */
    override fun onInitializeClient() {
        ExampleMod.LOGGER.info("Initializing client...")
    }
}