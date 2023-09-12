package io.layux.example.client.mixin;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Mixin that injects code into the MinecraftClient class.
 *
 * @author Fernando Lopez <fernando.lopez@layux.io>
 * @project template-minecraft
 * @package io.layux.example.client.mixin
 * @date 12/09/2023 8:03 AM
 *
 * © 2023 Layux LLC. All rights reserved.
 */
@Mixin(MinecraftClient.class)
public class ExampleClientMixin {
	@Inject(at = @At("HEAD"), method = "run")
	private void run(CallbackInfo info) {
		// This code is injected into the start of MinecraftClient.run()V
	}
}