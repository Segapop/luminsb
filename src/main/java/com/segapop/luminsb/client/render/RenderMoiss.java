package com.segapop.luminsb.client.render;

import com.gempire.client.entity.render.layers.*;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.segapop.luminsb.client.model.ModelMoiss;
import com.segapop.luminsb.entities.gems.EntityMoiss0;
import com.segapop.luminsb.luminsb;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;


public class RenderMoiss extends MobRenderer<EntityMoiss0, ModelMoiss<EntityMoiss0>>
{
    public RenderMoiss(EntityRendererManager rendererManagerIn) {
        super(rendererManagerIn, new ModelMoiss<>(), .25f);
        this.addLayer(new SkinLayer(this));
        this.addLayer(new FaceLayer(this));
        this.addLayer(new HairLayer(this));
        this.addLayer(new OutfitLayer(this));
        this.addLayer(new InsigniaLayer(this));
        this.addLayer(new GemPlacementLayer(this));
    }

    @Override
    protected void preRenderCallback(EntityMoiss0 entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        super.preRenderCallback(entitylivingbaseIn, matrixStackIn, partialTickTime);
    }
    @Override
    public ResourceLocation getEntityTexture(EntityMoiss0 entity) {
        return new ResourceLocation(luminsb.MODID+":textures/entity/moiss0/blank.png");
    }
    @Override
    protected void renderName(EntityMoiss0 entityIn, ITextComponent displayNameIn, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        super.renderName(entityIn, displayNameIn, matrixStackIn, bufferIn, packedLightIn);
    }
}