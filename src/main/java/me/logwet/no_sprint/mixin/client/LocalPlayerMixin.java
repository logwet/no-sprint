package me.logwet.no_sprint.mixin.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.player.LocalPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Environment(EnvType.CLIENT)
@Mixin(LocalPlayer.class)
public abstract class LocalPlayerMixin {
    @ModifyVariable(method = "setSprinting", at = @At("HEAD"), ordinal = 0)
    private boolean overrideSetSprinting(boolean original) {
        return false;
    }
}
