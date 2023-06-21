package io.layux.example.client.mixin;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * @author MisterQuestions <misterquestions@layux.io>
 * @project template-minecraft
 * @package io.layux.example.client.mixin
 * @date 21/06/2023 01:23 PM
 * <p>
 * © 2023 Layux LLC. All rights reserved.
 */
@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {
    @Inject(at = @At("HEAD"), method = "run")
    private void run(CallbackInfo info) {
        System.out.println("This line is printed by an example mixin!");
    }
}
