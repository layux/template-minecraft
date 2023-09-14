package io.layux.example.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Mixin class that injects code into MinecraftServer.loadWorld()V.
 *
 * @author Fernando Lopez <fernando.lopez@layux.io>
 * @project template-minecraft
 * @package io.layux.example.client.mixin
 * @date 12/09/2023 8:03 AM
 *
 * © 2023 Layux LLC. All rights reserved.
 */
@Mixin(MinecraftServer.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "loadWorld")
	private void init(CallbackInfo info) {
		// This code is injected into the start of MinecraftServer.loadWorld()V
	}
}
