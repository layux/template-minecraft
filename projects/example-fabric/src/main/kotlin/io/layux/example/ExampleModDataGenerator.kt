package io.layux.example

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator

/**
 *
 *
 * @project template-minecraft
 * @package io.layux.example
 * @author MisterQuestions <misterquestions@layux.io>
 * @date 21/06/2023 01:17 PM
 *
 * © 2023 Layux LLC. All rights reserved.
 */
object ExampleModDataGenerator : DataGeneratorEntrypoint {
    /**
     * Register [net.minecraft.data.DataProvider] with the [FabricDataGenerator] during this entrypoint.
     *
     * @param fabricDataGenerator The [FabricDataGenerator] instance
     */
    override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator?) {

    }
}