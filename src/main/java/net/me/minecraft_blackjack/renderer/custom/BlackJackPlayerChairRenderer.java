package net.me.minecraft_blackjack.renderer.custom;

import net.me.minecraft_blackjack.blackjack;
import net.me.minecraft_blackjack.entity.custom.SittingEntity;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class BlackJackPlayerChairRenderer extends EntityRenderer<SittingEntity> {
    public BlackJackPlayerChairRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }
    @Override
    public boolean shouldRender(SittingEntity pLivingEntity, Frustum pCamera, double pCamX, double pCamY, double pCamZ) {
        return true;
    }
    @Override
    public ResourceLocation getTextureLocation(SittingEntity pEntity) {
        return new ResourceLocation(blackjack.MODID,"");
    }
}
