package io.layux.fabricexample.mixin;

import io.layux.fabricexample.ExampleMod;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * @author MisterQuestions <misterquestions@layux.io>
 * @project template-minecraft
 * @package io.layux.fabricexample.mixin
 * @date 12/04/2023 02:51 AM
 * <p>
 * © 2023 Layux LLC. All rights reserved.
 */
@Mixin(TitleScreen.class)
public class ExampleMixin {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        ExampleMod.Companion.getLOGGER().info("This line is printed by an example mod mixin!");
    }
}
