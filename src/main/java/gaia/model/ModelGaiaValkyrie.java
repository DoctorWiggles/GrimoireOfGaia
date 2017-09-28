package gaia.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelGaiaValkyrie extends ModelGaia {
	ModelRenderer head;
    ModelRenderer headeyes;
	ModelRenderer headaccessory;
	ModelRenderer neck;
	ModelRenderer bodytop;
	ModelRenderer bodymiddle;
	ModelRenderer bodymiddlebutton;
	ModelRenderer bodybottom;
	ModelRenderer rightchest;
	ModelRenderer leftchest;
	public static ModelRenderer rightarm;
	public static ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer hair1;
	ModelRenderer hair2;
	ModelRenderer rightfeather;
	ModelRenderer leftfeather;
	ModelRenderer headhelmet;
	ModelRenderer cape1;
	ModelRenderer cape2;
	ModelRenderer cape3;
	ModelRenderer rightpauldron;
	ModelRenderer leftpauldron;
	ModelRenderer rightgauntlet;
	ModelRenderer skirtmantle;
	ModelRenderer skirt1;
	ModelRenderer skirt2;
	ModelRenderer skirt3;
	ModelRenderer rightwing;
	ModelRenderer leftwing;
    ModelRenderer rightfoot;
    ModelRenderer leftfoot;

	public ModelGaiaValkyrie() {
		this.textureWidth = 128;
		this.textureHeight = 64;

        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-3F, -6F, -3F, 6, 6, 6);
        this.head.setRotationPoint(0F, 1F, 0F);
        this.head.setTextureSize(64, 32);
        this.setRotation(head, 0F, 0F, 0F);
        this.headeyes = new ModelRenderer(this, 24, 0);
        this.headeyes.addBox(-3F, -6F, -3.1F, 6, 6, 0);
        this.headeyes.setRotationPoint(0F, 1F, 0F);
        this.headeyes.setTextureSize(64, 32);
        this.setRotation(headeyes, 0F, 0F, 0F);
        this.headaccessory = new ModelRenderer(this, 36, 0);
        this.headaccessory.addBox(-3.5F, -6.5F, -3.5F, 7, 7, 7);
        this.headaccessory.setRotationPoint(0F, 1F, 0F);
        this.headaccessory.setTextureSize(64, 32);
        this.setRotation(headaccessory, 0F, 0F, 0F);
        this.neck = new ModelRenderer(this, 0, 12);
        this.neck.addBox(-1F, -1F, -1F, 2, 2, 2);
        this.neck.setRotationPoint(0F, 1F, 0F);
        this.neck.setTextureSize(64, 32);
        this.setRotation(neck, 0F, 0F, 0F);
        this.bodytop = new ModelRenderer(this, 0, 16);
        this.bodytop.addBox(-2.5F, 0F, -1.5F, 5, 6, 3);
        this.bodytop.setRotationPoint(0F, 1F, 0F);
        this.bodytop.setTextureSize(64, 32);
        this.setRotation(bodytop, -0.0872665F, 0F, 0F);
        this.bodymiddle = new ModelRenderer(this, 0, 25);
        this.bodymiddle.addBox(-2F, 5.5F, -1.5F, 4, 3, 2);
        this.bodymiddle.setRotationPoint(0F, 1F, 0F);
        this.bodymiddle.setTextureSize(64, 32);
        this.setRotation(bodymiddle, 0F, 0F, 0F);
        this.bodymiddlebutton = new ModelRenderer(this, 0, 25);
        this.bodymiddlebutton.addBox(-0.5F, 6F, -1.6F, 1, 2, 0);
        this.bodymiddlebutton.setRotationPoint(0F, 1F, 0F);
        this.bodymiddlebutton.setTextureSize(64, 32);
        this.setRotation(bodymiddlebutton, 0F, 0F, 0F);
        this.bodybottom = new ModelRenderer(this, 0, 30);
        this.bodybottom.addBox(-3F, 8F, -2.5F, 6, 3, 3);
        this.bodybottom.setRotationPoint(0F, 1F, 0F);
        this.bodybottom.setTextureSize(64, 32);
        this.setRotation(bodybottom, 0.0872665F, 0F, 0F);
        this.rightchest = new ModelRenderer(this, 0, 36);
        this.rightchest.addBox(-1F, -1F, -1F, 2, 2, 2);
        this.rightchest.setRotationPoint(-1.3F, 3F, -1.5F);
        this.rightchest.setTextureSize(64, 32);
        this.setRotation(rightchest, 0.7853982F, 0.1745329F, 0.0872665F);
        this.leftchest = new ModelRenderer(this, 0, 36);
        this.leftchest.mirror = true;
        this.leftchest.addBox(-1F, -1F, -1F, 2, 2, 2);
        this.leftchest.setRotationPoint(1.3F, 3F, -1.5F);
        this.leftchest.setTextureSize(64, 32);
        this.setRotation(leftchest, 0.7853982F, -0.1745329F, -0.0872665F);
        this.rightarm = new ModelRenderer(this, 16, 12);
        this.rightarm.addBox(-2F, -1F, -1F, 2, 12, 2);
        this.rightarm.setRotationPoint(-2.5F, 3F, 0F);
        this.rightarm.setTextureSize(64, 32);
        this.setRotation(rightarm, 0.0872665F, 0F, 0.1745329F);
        this.leftarm = new ModelRenderer(this, 16, 12);
        this.leftarm.addBox(0F, -1F, -1F, 2, 12, 2);
        this.leftarm.setRotationPoint(2.5F, 3F, 0F);
        this.leftarm.setTextureSize(64, 32);
        this.setRotation(leftarm, 0.0872665F, 0F, -0.1745329F);
        this.rightleg = new ModelRenderer(this, 24, 12);
        this.rightleg.addBox(-1.5F, -1F, -1.5F, 3, 14, 3);
        this.rightleg.setRotationPoint(-2F, 11F, 0F);
        this.rightleg.setTextureSize(64, 32);
        this.setRotation(rightleg, 0F, 0F, 0F);
        this.leftleg = new ModelRenderer(this, 24, 12);
        this.leftleg.addBox(-1.5F, -1F, -1.5F, 3, 14, 3);
        this.leftleg.setRotationPoint(2F, 11F, 0F);
        this.leftleg.setTextureSize(64, 32);
        this.setRotation(leftleg, 0F, 0F, 0F);
        this.hair1 = new ModelRenderer(this, 36, 14);
        this.hair1.addBox(-4F, -4F, 2.5F, 8, 8, 3);
        this.hair1.setRotationPoint(0F, 1F, 0F);
        this.hair1.setTextureSize(64, 32);
        this.setRotation(hair1, 0.2617994F, 0F, 0F);
        this.hair2 = new ModelRenderer(this, 36, 25);
        this.hair2.addBox(-4.5F, 1F, 3F, 9, 9, 3);
        this.hair2.setRotationPoint(0F, 1F, 0F);
        this.hair2.setTextureSize(64, 32);
        this.setRotation(hair2, 0.2617994F, 0F, 0F);
        this.rightfeather = new ModelRenderer(this, 36, 37);
        this.rightfeather.addBox(-4.5F, -7F, 0F, 1, 6, 8);
        this.rightfeather.setRotationPoint(0F, 1F, 0F);
        this.rightfeather.setTextureSize(64, 32);
        this.setRotation(rightfeather, 0.3490659F, -0.2617994F, 0F);
        this.leftfeather = new ModelRenderer(this, 36, 37);
        this.leftfeather.addBox(3.5F, -7F, 0F, 1, 6, 8);
        this.leftfeather.setRotationPoint(0F, 1F, 0F);
        this.leftfeather.setTextureSize(64, 32);
        this.setRotation(leftfeather, 0.3490659F, 0.2617994F, 0F);
        this.headhelmet = new ModelRenderer(this, 36, 51);
        this.headhelmet.addBox(-3F, -7F, -4F, 6, 3, 4);
        this.headhelmet.setRotationPoint(0F, 1F, 0F);
        this.headhelmet.setTextureSize(64, 32);
        this.setRotation(headhelmet, 0F, 0F, 0F);
        this.cape1 = new ModelRenderer(this, 64, 0);
        this.cape1.addBox(-3.5F, 0F, 0.5F, 7, 4, 2);
        this.cape1.setRotationPoint(0F, 1F, 0F);
        this.cape1.setTextureSize(64, 32);
        this.setRotation(cape1, 0.1745329F, 0F, 0F);
        this.cape2 = new ModelRenderer(this, 64, 6);
        this.cape2.addBox(-4F, 3.5F, 0F, 8, 5, 3);
        this.cape2.setRotationPoint(0F, 1F, 0F);
        this.cape2.setTextureSize(64, 32);
        this.setRotation(cape2, 0.1745329F, 0F, 0F);
        this.cape3 = new ModelRenderer(this, 64, 14);
        this.cape3.addBox(-4.5F, 8F, 0.5F, 9, 6, 3);
        this.cape3.setRotationPoint(0F, 1F, 0F);
        this.cape3.setTextureSize(64, 32);
        this.setRotation(cape3, 0.1745329F, 0F, 0F);
        this.rightpauldron = new ModelRenderer(this, 64, 23);
        this.rightpauldron.addBox(-4F, -2F, -2F, 4, 3, 4);
        this.rightpauldron.setRotationPoint(-2.5F, 3F, 0F);
        this.rightpauldron.setTextureSize(64, 32);
        this.setRotation(rightpauldron, 0.0872665F, 0F, -0.1745329F);
        this.leftpauldron = new ModelRenderer(this, 80, 23);
        this.leftpauldron.addBox(0F, -2F, -2F, 4, 3, 4);
        this.leftpauldron.setRotationPoint(2.5F, 3F, 0F);
        this.leftpauldron.setTextureSize(64, 32);
        this.setRotation(leftpauldron, 0.0872665F, 0F, 0.1745329F);
        this.rightgauntlet = new ModelRenderer(this, 64, 30);
        this.rightgauntlet.addBox(-2.5F, 3.5F, -1.5F, 2, 6, 3);
        this.rightgauntlet.setRotationPoint(-2.5F, 3F, 0F);
        this.rightgauntlet.setTextureSize(64, 32);
        this.setRotation(rightgauntlet, 0.0872665F, 0F, 0.1745329F);
        this.skirtmantle = new ModelRenderer(this, 96, 0);
        this.skirtmantle.addBox(-3.5F, -2.5F, -2F, 7, 4, 4);
        this.skirtmantle.setRotationPoint(0F, 12F, 0F);
        this.skirtmantle.setTextureSize(64, 32);
        this.setRotation(skirtmantle, 0.1745329F, 0F, 0F);
        this.skirt1 = new ModelRenderer(this, 96, 8);
        this.skirt1.addBox(-4F, -2F, -1.5F, 8, 4, 4);
        this.skirt1.setRotationPoint(0F, 12F, 0F);
        this.skirt1.setTextureSize(64, 32);
        this.setRotation(skirt1, 0.1832596F, 0F, 0F);
        this.skirt2 = new ModelRenderer(this, 96, 16);
        this.skirt2.addBox(-4.5F, 1F, -1F, 9, 5, 4);
        this.skirt2.setRotationPoint(0F, 12F, 0F);
        this.skirt2.setTextureSize(64, 32);
        this.setRotation(skirt2, 0.1745329F, 0F, 0F);
        this.skirt3 = new ModelRenderer(this, 96, 25);
        this.skirt3.addBox(-5F, 5F, -0.5F, 10, 5, 4);
        this.skirt3.setRotationPoint(0F, 12F, 0F);
        this.skirt3.setTextureSize(64, 32);
        this.setRotation(skirt3, 0.1745329F, 0F, 0F);
        this.rightwing = new ModelRenderer(this, 74, 34);
        this.rightwing.addBox(0F, 0F, 0.5F, 0, 12, 18);
        this.rightwing.setRotationPoint(-2F, 2F, 1F);
        this.rightwing.setTextureSize(64, 32);
        this.setRotation(rightwing, 0.6981317F, -0.5235988F, 0F);
        this.leftwing = new ModelRenderer(this, 92, 34);
        this.leftwing.addBox(-1F, 0F, 0.5F, 0, 12, 18);
        this.leftwing.setRotationPoint(2F, 2F, 1F);
        this.leftwing.setTextureSize(64, 32);
        this.setRotation(leftwing, 0.6981317F, 0.5235988F, 0F);
        this.rightfoot = new ModelRenderer(this, 96, 34);
        this.rightfoot.addBox(-2F, 5F, -2F, 4, 8, 4);
        this.rightfoot.setRotationPoint(-2F, 11F, 0F);
        this.rightfoot.setTextureSize(128, 64);
        this.setRotation(rightfoot, 0F, 0F, 0F);
        this.leftfoot = new ModelRenderer(this, 96, 34);
        this.leftfoot.addBox(-2F, 5F, -2F, 4, 8, 4);
        this.leftfoot.setRotationPoint(2F, 11F, 0F);
        this.leftfoot.setTextureSize(128, 64);
        this.setRotation(leftfoot, 0F, 0F, 0F);

		this.convertToChild(head, rightfeather);
		this.convertToChild(head, leftfeather);
		this.convertToChild(head, headhelmet);
		this.convertToChild(rightarm, rightpauldron);
		this.convertToChild(rightarm, rightgauntlet);
		this.convertToChild(leftarm, leftpauldron);
		this.convertToChild(rightleg, rightfoot);
		this.convertToChild(leftleg, leftfoot);
	}

	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		this.head.render(scale);
		this.headaccessory.render(scale);
		this.neck.render(scale);
		this.bodytop.render(scale);
		this.bodymiddle.render(scale);
		this.bodymiddlebutton.render(scale);
		this.bodybottom.render(scale);
		this.rightchest.render(scale);
		this.leftchest.render(scale);
		this.rightarm.render(scale);
		this.leftarm.render(scale);
		this.rightleg.render(scale);
		this.leftleg.render(scale);
		this.hair1.render(scale);
		this.hair2.render(scale);
//		this.rightfeather.render(scale);
//		this.leftfeather.render(scale);
//		this.headhelmet.render(scale);
		this.cape1.render(scale);
		this.cape2.render(scale);
		this.cape3.render(scale);
//      this.rightpauldron.render(scale);
//      this.leftpauldron.render(scale);
//      this.rightgauntlet.render(scale);
		this.skirtmantle.render(scale);
		this.skirt1.render(scale);
		this.skirt2.render(scale);
		this.skirt3.render(scale);
		this.rightwing.render(scale);
		this.leftwing.render(scale);
		
		if (entityIn.ticksExisted % 60 == 0 && limbSwingAmount <= 0.1F) {
			this.headeyes.render(scale);
		}
	}

	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		//head
		this.head.rotateAngleY = netHeadYaw / 57.295776F;
		this.head.rotateAngleX = headPitch / 57.295776F;
		this.headeyes.rotateAngleY = this.head.rotateAngleY;
		this.headeyes.rotateAngleX = this.head.rotateAngleX;
		this.headaccessory.rotateAngleY = this.head.rotateAngleY;
		this.headaccessory.rotateAngleX = this.head.rotateAngleX;
		this.hair1.rotateAngleY = this.head.rotateAngleY;
		this.hair2.rotateAngleY = (this.head.rotateAngleY) * 0.75F;
		
		//arms
		this.rightarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 0.8F * limbSwingAmount * 0.5F;
		this.leftarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount * 0.5F;
		
		this.rightarm.rotateAngleZ = 0.0F;
		this.leftarm.rotateAngleZ = 0.0F;
		
        if (this.swingProgress > -9990.0F) {
			holdingMelee(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch,scaleFactor, entityIn);
        }
        
        this.rightarm.rotateAngleZ += (MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F) + 0.0872665F;
        this.rightarm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.leftarm.rotateAngleZ -= (MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F) + 0.0872665F;
        this.leftarm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
		
		//body
		this.rightwing.rotateAngleY = MathHelper.cos(ageInTicks * 0.6662F + (float)Math.PI) * 1.0F * limbSwingAmount * 0.5F;
		this.leftwing.rotateAngleY = MathHelper.cos(ageInTicks * 0.6662F) * 1.0F * limbSwingAmount * 0.5F;
		this.rightwing.rotateAngleY -= 0.5235988F;
		this.leftwing.rotateAngleY += 0.5235988F;
		
		//legs
		this.rightleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.35F * limbSwingAmount;
		this.leftleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 0.35F * limbSwingAmount;
	}
	
	public void holdingMelee(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		float f6;
		float f7;
		
		f6 = this.swingProgress;
        f6 = 1.0F - this.swingProgress;
        f6 *= f6;
        f6 *= f6;
        f6 = 1.0F - f6;
        f7 = MathHelper.sin(f6 * (float)Math.PI);
        float f8 = MathHelper.sin(this.swingProgress * (float)Math.PI) * -(this.head.rotateAngleX - 0.7F) * 0.75F;
        
        this.rightarm.rotateAngleX = (float)((double)this.rightarm.rotateAngleX - ((double)f7 * 1.2D + (double)f8));
        this.rightarm.rotateAngleX += (this.bodytop.rotateAngleY * 2.0F);
        this.rightarm.rotateAngleZ = (MathHelper.sin(this.swingProgress * (float)Math.PI) * -0.4F);
	}
}
