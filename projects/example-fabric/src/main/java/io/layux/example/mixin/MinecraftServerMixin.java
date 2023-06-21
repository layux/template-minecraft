package io.layux.example.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * @author MisterQuestions <misterquestions@layux.io>
 * @project template-minecraft
 * @package io.layux.example.mixin
 * @date 21/06/2023 01:18 PM
 * <p>
 * © 2023 Layux LLC. All rights reserved.
 */
@Mixin(MinecraftServer.class)
public class MinecraftServerMixin {
    @Inject(at = @At("HEAD"), method = "loadWorld")
    private void loadWorld(CallbackInfo ci) {
        System.out.println("Loading world");
    }
}
