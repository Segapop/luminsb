package com.segapop.luminsb.client.render;

import com.gempire.client.entity.render.layers.*;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.segapop.luminsb.client.model.ModelJade;
import com.segapop.luminsb.client.model.ModelMoonst;
import com.segapop.luminsb.entities.gems.EntityMoonst0;
import com.segapop.luminsb.luminsb;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;


public class RenderMoonst extends MobRenderer<EntityMoonst0, ModelMoonst<EntityMoonst0>>
{
    public RenderMoonst(EntityRendererManager rendererManagerIn) {
        super(rendererManagerIn, new ModelMoonst<>(), .25f);
        this.addLayer(new SkinLayer(this));
        this.addLayer(new FaceLayer(this));
        this.addLayer(new HairLayer(this));
        this.addLayer(new OutfitLayer(this));
        this.addLayer(new InsigniaLayer(this));
        this.addLayer(new GemPlacementLayer(this));
    }

    @Override
    protected void preRenderCallback(EntityMoonst0 entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        super.preRenderCallback(entitylivingbaseIn, matrixStackIn, partialTickTime);
    }
    @Override
    public ResourceLocation getEntityTexture(EntityMoonst0 entity) {
        return new ResourceLocation(luminsb.MODID+":textures/entity/moonst0/blank.png");
    }
    @Override
    protected void renderName(EntityMoonst0 entityIn, ITextComponent displayNameIn, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        super.renderName(entityIn, displayNameIn, matrixStackIn, bufferIn, packedLightIn);
    }
}