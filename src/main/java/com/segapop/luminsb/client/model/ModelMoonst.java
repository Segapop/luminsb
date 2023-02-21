package com.segapop.luminsb.client.model;

import com.gempire.client.entity.model.ModelGem;
import com.gempire.entities.bases.EntityGem;
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * MoonstoneGempire - Dbro2112g
 * Created using Tabula 8.0.0
 */
@OnlyIn(Dist.CLIENT)
public class ModelMoonst<T extends EntityGem> extends ModelGem<T> {
    public ModelRenderer gemHead;
    public ModelRenderer gemHair;
    public ModelRenderer gemBody;
    public ModelRenderer gemLArm;
    public ModelRenderer gemRArm;
    public ModelRenderer gemLLeg;
    public ModelRenderer gemRLeg;
    public ModelRenderer gemShawl;
    public ModelRenderer gemMask;
    public ModelRenderer gemMaskNose;
    public ModelRenderer gemPigtails;
    public ModelRenderer gemDoodle;
    public ModelRenderer gemBun;
    public ModelRenderer gemBun_1;
    public ModelRenderer gemBun_2;
    public ModelRenderer gemBangs;

    public ModelMoonst() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.gemRLeg = new ModelRenderer(this, 0, 30);
        this.gemRLeg.setRotationPoint(-1.2F, 12.0F, 0.0F);
        this.gemRLeg.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.gemBun_1 = new ModelRenderer(this, 8, 28);
        this.gemBun_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gemBun_1.addBox(-5.0F, -8.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.gemMaskNose = new ModelRenderer(this, 0, 0);
        this.gemMaskNose.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gemMaskNose.addBox(-0.5F, -2.5F, -4.8F, 1.0F, 1.0F, 2.0F, -0.1F, -0.1F, -0.3F);
        this.gemPigtails = new ModelRenderer(this, 32, 16);
        this.gemPigtails.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.gemPigtails.addBox(-4.0F, -7.0F, -4.0F, 8.0F, 5.0F, 8.0F, -0.5F, -0.5F, -0.5F);
        this.gemBody = new ModelRenderer(this, 8, 16);
        this.gemBody.setRotationPoint(-2.0F, 3.0F, -1.5F);
        this.gemBody.addBox(0.0F, 0.0F, 0.0F, 4.0F, 9.0F, 3.0F, 0.2F, 0.0F, 0.0F);
        this.gemLArm = new ModelRenderer(this, 22, 16);
        this.gemLArm.setRotationPoint(1.7F, 3.5F, 0.0F);
        this.gemLArm.addBox(0.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, -0.5F, -0.5F, -0.5F);
        this.gemDoodle = new ModelRenderer(this, 0, 44);
        this.gemDoodle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gemDoodle.addBox(-6.0F, -8.5F, -1.0F, 12.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.gemHead = new ModelRenderer(this, 0, 0);
        this.gemHead.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.gemHead.addBox(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, -1.0F, -1.0F, -1.0F);
        this.gemHair = new ModelRenderer(this, 32, 0);
        this.gemHair.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.gemHair.addBox(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, -0.5F, -0.5F, -0.5F);
        this.gemShawl = new ModelRenderer(this, 34, 29);
        this.gemShawl.setRotationPoint(0.0F, 9.5F, 0.0F);
        this.gemShawl.addBox(-4.5F, -7.0F, -3.0F, 9.0F, 10.0F, 6.0F, -0.5F, -0.5F, -0.5F);
        this.gemLLeg = new ModelRenderer(this, 22, 30);
        this.gemLLeg.setRotationPoint(1.2F, 12.0F, 0.0F);
        this.gemLLeg.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.gemMask = new ModelRenderer(this, 26, 0);
        this.gemMask.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gemMask.addBox(-3.0F, -6.0F, -3.2F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.gemBun_2 = new ModelRenderer(this, 8, 34);
        this.gemBun_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gemBun_2.addBox(2.0F, -8.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.gemBangs = new ModelRenderer(this, 24, 45);
        this.gemBangs.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gemBangs.addBox(-6.0F, -8.5F, -3.5F, 12.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.gemRArm = new ModelRenderer(this, 0, 16);
        this.gemRArm.setRotationPoint(-1.7F, 3.5F, 0.0F);
        this.gemRArm.addBox(-2.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, -0.5F, -0.5F, -0.5F);
        this.gemBun = new ModelRenderer(this, 0, 52);
        this.gemBun.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.gemBun.addBox(-3.0F, -10.5F, 2.0F, 6.0F, 6.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.gemHair.addChild(this.gemBun_1);
        this.gemHead.addChild(this.gemMaskNose);
        this.gemHair.addChild(this.gemPigtails);
        this.gemHair.addChild(this.gemDoodle);
        this.gemHead.addChild(this.gemMask);
        this.gemHair.addChild(this.gemBun_2);
        this.gemHair.addChild(this.gemBangs);
        this.gemHair.addChild(this.gemBun);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.gemRLeg, this.gemBody, this.gemLArm, this.gemHead, this.gemHair, this.gemShawl, this.gemLLeg, this.gemRArm).forEach((modelRenderer) -> {
            modelRenderer.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
        });
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.setRotateAngle(this.gemHead, headPitch * 0.9f * ((float)Math.PI / 180F), netHeadYaw * ((float)Math.PI / 180F), 0);
        this.setRotateAngle(this.gemHair, headPitch * 0.9f * ((float)Math.PI / 180F), netHeadYaw * ((float)Math.PI / 180F), 0);
        this.setRotateAngle(this.gemLArm, MathHelper.cos(limbSwing * 0.5F + (float)Math.PI) * 1.5F * limbSwingAmount * 0.8f, 0, 0);
        this.setRotateAngle(this.gemRArm, MathHelper.cos(limbSwing * 0.5F) * 1.5F * limbSwingAmount * 0.8f, 0, 0);
        this.setRotateAngle(this.gemLLeg, MathHelper.cos(limbSwing * 0.5F) * 1.5F * limbSwingAmount * 0.8f, 0, 0);
        this.setRotateAngle(this.gemRLeg, MathHelper.cos(limbSwing * 0.5F + (float)Math.PI) * 1.5F * limbSwingAmount * 0.8f, 0, 0);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
