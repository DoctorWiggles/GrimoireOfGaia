package gaia.model;

import gaia.renderer.base_held;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelGaiaKobold extends base_held {
	
	
	
	ModelRenderer head;
	ModelRenderer headaccessory;
	ModelRenderer rightear;
	ModelRenderer leftear;
	ModelRenderer hair1;
	ModelRenderer hair2;
	ModelRenderer bodytop;
	ModelRenderer bodymiddle;
	ModelRenderer bodymiddlebutton;
	ModelRenderer bodybottom;
	ModelRenderer rightchest;
	ModelRenderer leftchest;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
    ModelRenderer rightarmguard;
	ModelRenderer rightarmlower;
	ModelRenderer leftarmlower;
	//public static ModelRenderer righthand;
	ModelRenderer lefthand;
	ModelRenderer backpack;
    ModelRenderer quiver;
	ModelRenderer tail1;
	ModelRenderer tail2;
	ModelRenderer waist;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer rightlegmid;
	ModelRenderer leftlegmid;
	ModelRenderer rightleglower;
	ModelRenderer leftleglower;
	ModelRenderer rightfootlower;
	ModelRenderer leftfootlower;
	
	

	public ModelGaiaKobold() {
		this.textureWidth = 128;
		this.textureHeight = 64;

		this.head = new ModelRenderer(this, 0, 0);
		this.head.addBox(-3F, -6F, -3F, 6, 6, 6);
		this.head.setRotationPoint(0F, 1F, -1F);
		this.head.setTextureSize(64, 32);
		this.head.mirror = true;
		this.setRotation(head, 0F, 0F, 0F);
		this.headaccessory = new ModelRenderer(this, 36, 0);
		this.headaccessory.addBox(-3.5F, -6.5F, -3.5F, 7, 7, 7);
		this.headaccessory.setRotationPoint(0F, 1F, -1F);
		this.headaccessory.setTextureSize(64, 32);
		this.headaccessory.mirror = true;
		this.setRotation(headaccessory, 0F, 0F, 0F);
		this.rightear = new ModelRenderer(this, 36, 28);
		this.rightear.addBox(-4.5F, -10F, -1.5F, 4, 4, 3);
		this.rightear.setRotationPoint(0F, 1F, -1F);
		this.rightear.setTextureSize(64, 32);
		this.rightear.mirror = true;
		this.setRotation(rightear, 0F, 0F, 0F);
		this.leftear = new ModelRenderer(this, 50, 28);
		this.leftear.addBox(0.5F, -10F, -1.5F, 4, 4, 3);
		this.leftear.setRotationPoint(0F, 1F, -1F);
		this.leftear.setTextureSize(64, 32);
		this.leftear.mirror = true;
		this.setRotation(leftear, 0F, 0F, 0F);
		this.hair1 = new ModelRenderer(this, 36, 14);
		this.hair1.addBox(-4F, -6F, 1F, 8, 4, 3);
		this.hair1.setRotationPoint(0F, 1F, -1F);
		this.hair1.setTextureSize(64, 32);
		this.hair1.mirror = true;
		this.setRotation(hair1, 0F, 0F, 0F);
		this.hair2 = new ModelRenderer(this, 36, 21);
		this.hair2.addBox(-4.5F, -3F, 1.5F, 9, 4, 3);
		this.hair2.setRotationPoint(0F, 1F, -1F);
		this.hair2.setTextureSize(64, 32);
		this.hair2.mirror = true;
		this.setRotation(hair2, 0F, 0F, 0F);
		this.bodytop = new ModelRenderer(this, 0, 12);
		this.bodytop.addBox(-2.5F, 0F, -1.5F, 5, 5, 3);
		this.bodytop.setRotationPoint(0F, 1F, -1F);
		this.bodytop.setTextureSize(64, 32);
		this.bodytop.mirror = true;
		this.setRotation(bodytop, 0F, 0F, 0F);
		this.bodymiddle = new ModelRenderer(this, 0, 20);
		this.bodymiddle.addBox(-2F, 4.5F, -1.5F, 4, 3, 2);
		this.bodymiddle.setRotationPoint(0F, 1F, -1F);
		this.bodymiddle.setTextureSize(64, 32);
		this.bodymiddle.mirror = true;
		this.setRotation(bodymiddle, 0.0872665F, 0F, 0F);
		this.bodymiddlebutton = new ModelRenderer(this, 0, 20);
		this.bodymiddlebutton.addBox(-0.5F, 5F, -1.6F, 1, 2, 0);
		this.bodymiddlebutton.setRotationPoint(0F, 1F, -1F);
		this.bodymiddlebutton.setTextureSize(64, 32);
		this.bodymiddlebutton.mirror = true;
		this.setRotation(bodymiddlebutton, 0.0872665F, 0F, 0F);
		this.bodybottom = new ModelRenderer(this, 0, 25);
		this.bodybottom.addBox(-2.5F, 7F, -2.5F, 5, 3, 3);
		this.bodybottom.setRotationPoint(0F, 1F, -1F);
		this.bodybottom.setTextureSize(64, 32);
		this.bodybottom.mirror = true;
		this.setRotation(bodybottom, 0.1745329F, 0F, 0F);
		this.rightchest = new ModelRenderer(this, 0, 31);
		this.rightchest.addBox(-1F, -1F, -1F, 2, 2, 2);
		this.rightchest.setRotationPoint(-1.3F, 3F, -2.5F);
		this.rightchest.setTextureSize(64, 32);
		this.rightchest.mirror = true;
		this.setRotation(rightchest, 0.8726646F, 0.1745329F, 0.0872665F);
		this.leftchest = new ModelRenderer(this, 8, 31);
		this.leftchest.addBox(-1F, -1F, -1F, 2, 2, 2);
		this.leftchest.setRotationPoint(1.3F, 3F, -2.5F);
		this.leftchest.setTextureSize(64, 32);
		this.leftchest.mirror = true;
		this.setRotation(leftchest, 0.8726646F, -0.1745329F, -0.0872665F);
		this.rightarm = new ModelRenderer(this, 16, 12);
		this.rightarm.addBox(-2F, -1F, -1F, 2, 8, 2);
		this.rightarm.setRotationPoint(-2.5F, 2.5F, -1F);
		this.rightarm.setTextureSize(64, 32);
		this.rightarm.mirror = true;
		this.setRotation(rightarm, 0F, 0F, 0.1745329F);
		this.leftarm = new ModelRenderer(this, 16, 22);
		this.leftarm.addBox(0F, -1F, -1F, 2, 8, 2);
		this.leftarm.setRotationPoint(2.5F, 2.5F, -1F);
		this.leftarm.setTextureSize(64, 32);
		this.leftarm.mirror = true;
		this.setRotation(leftarm, 0F, 0F, -0.1745329F);
		this.rightarmlower = new ModelRenderer(this, 36, 35);
		this.rightarmlower.addBox(-2.5F, 2F, -1.5F, 2, 8, 3);
		this.rightarmlower.setRotationPoint(-2.5F, 2.5F, -1F);
		this.rightarmlower.setTextureSize(64, 32);
		this.rightarmlower.mirror = true;
		this.setRotation(rightarmlower, 0F, 0F, 0.1745329F);
		this.leftarmlower = new ModelRenderer(this, 46, 35);
		this.leftarmlower.addBox(0.5F, 2F, -1.5F, 2, 8, 3);
		this.leftarmlower.setRotationPoint(2.5F, 2.5F, -1F);
		this.leftarmlower.setTextureSize(64, 32);
		this.leftarmlower.mirror = true;
		this.setRotation(leftarmlower, 0F, 0F, -0.1745329F);
		this.rightarmguard = new ModelRenderer(this, 16, 32);
		this.rightarmguard.addBox(-0.5F, 4F, -1.5F, 1, 4, 3);
		this.rightarmguard.setRotationPoint(-2.5F, 2.5F, -1F);
		this.rightarmguard.setTextureSize(64, 32);
		this.rightarmguard.mirror = true;
		this.setRotation(rightarmguard, 0F, 0F, 0.1745329F);
		this.righthand = new ModelRenderer(this, 36, 46);
		this.righthand.addBox(-2.5F, 8F, -2F, 2, 4, 4);
		this.righthand.setRotationPoint(-2.5F, 2.5F, -1F);
		this.righthand.setTextureSize(64, 32);
		this.righthand.mirror = true;
		this.setRotation(righthand, 0F, 0F, 0.0872665F);
		this.lefthand = new ModelRenderer(this, 48, 46);
		this.lefthand.addBox(0.5F, 8F, -2F, 2, 4, 4);
		this.lefthand.setRotationPoint(2.5F, 2.5F, -1F);
		this.lefthand.setTextureSize(64, 32);
		this.lefthand.mirror = true;
		this.setRotation(lefthand, 0F, 0F, -0.0872665F);
		this.backpack = new ModelRenderer(this, 64, 0);
		this.backpack.addBox(-2.5F, 5F, 0.5F, 5, 4, 3);
		this.backpack.setRotationPoint(0F, 1F, -1F);
		this.backpack.setTextureSize(64, 32);
		this.backpack.mirror = true;
		this.setRotation(backpack, 0.1745329F, 0F, 0F);
		this.quiver = new ModelRenderer(this, 64, 7);
		this.quiver.addBox(-3.5F, 0F, 1.5F, 2, 8, 2);
		this.quiver.setRotationPoint(0F, 1F, -1F);
		this.quiver.setTextureSize(64, 32);
		this.quiver.mirror = true;
		this.setRotation(quiver, 0F, 0F, 0F);
		this.tail1 = new ModelRenderer(this, 88, 0);
		this.tail1.addBox(-1F, 7F, -3.5F, 2, 5, 2);
		this.tail1.setRotationPoint(0F, 1F, -1F);
		this.tail1.setTextureSize(64, 32);
		this.tail1.mirror = true;
		this.setRotation(tail1, 0.5235988F, 0F, 0F);
		this.tail2 = new ModelRenderer(this, 88, 7);
		this.tail2.addBox(-1.5F, 11F, -5F, 3, 8, 3);
		this.tail2.setRotationPoint(0F, 1F, -1F);
		this.tail2.setTextureSize(64, 32);
		this.tail2.mirror = true;
		this.setRotation(tail2, 0.6108652F, 0F, 0F);
		this.waist = new ModelRenderer(this, 64, 17);
		this.waist.addBox(-3.5F, 8F, -2F, 7, 5, 5);
		this.waist.setRotationPoint(0F, 1F, -1F);
		this.waist.setTextureSize(64, 32);
		this.waist.mirror = true;
		this.setRotation(waist, 0F, 0F, 0F);
		this.rightleg = new ModelRenderer(this, 88, 18);
		this.rightleg.addBox(-1F, -2F, -2F, 2, 7, 3);
		this.rightleg.setRotationPoint(-2F, 11F, 0F);
		this.rightleg.setTextureSize(64, 32);
		this.rightleg.mirror = true;
		this.setRotation(rightleg, -0.3490659F, 0F, -0.0349066F);
		this.leftleg = new ModelRenderer(this, 88, 18);
		this.leftleg.addBox(-1F, -2F, -2F, 2, 7, 3);
		this.leftleg.setRotationPoint(2F, 11F, 0F);
		this.leftleg.setTextureSize(64, 32);
		this.leftleg.mirror = true;
		this.setRotation(leftleg, -0.3490659F, 0F, 0.0349066F);
		this.rightlegmid = new ModelRenderer(this, 88, 28);
		this.rightlegmid.addBox(-1F, 1F, -5F, 2, 2, 2);
		this.rightlegmid.setRotationPoint(-2F, 11F, 0F);
		this.rightlegmid.setTextureSize(64, 32);
		this.rightlegmid.mirror = true;
		this.setRotation(rightlegmid, 1.22173F, 0F, -0.0349066F);
		this.leftlegmid = new ModelRenderer(this, 88, 28);
		this.leftlegmid.addBox(-1F, 1F, -5F, 2, 2, 2);
		this.leftlegmid.setRotationPoint(2F, 11F, 0F);
		this.leftlegmid.setTextureSize(64, 32);
		this.leftlegmid.mirror = true;
		this.setRotation(leftlegmid, 1.22173F, 0F, 0.0349066F);
		this.rightleglower = new ModelRenderer(this, 88, 32);
		this.rightleglower.addBox(-1.5F, 5F, 0.5F, 3, 7, 3);
		this.rightleglower.setRotationPoint(-2F, 11F, 0F);
		this.rightleglower.setTextureSize(64, 32);
		this.rightleglower.mirror = true;
		this.setRotation(rightleglower, -0.3490659F, 0F, -0.0349066F);
		this.leftleglower = new ModelRenderer(this, 88, 32);
		this.leftleglower.addBox(-1.5F, 5F, 0.5F, 3, 7, 3);
		this.leftleglower.setRotationPoint(2F, 11F, 0F);
		this.leftleglower.setTextureSize(64, 32);
		this.leftleglower.mirror = true;
		this.setRotation(leftleglower, -0.3490659F, 0F, 0.0349066F);
		this.rightfootlower = new ModelRenderer(this, 88, 42);
		this.rightfootlower.addBox(-1.5F, 9.5F, -8.5F, 3, 1, 3);
		this.rightfootlower.setRotationPoint(-2F, 11F, 0F);
		this.rightfootlower.setTextureSize(64, 32);
		this.rightfootlower.mirror = true;
		this.setRotation(rightfootlower, 0.4363323F, 0F, -0.0349066F);
		this.leftfootlower = new ModelRenderer(this, 88, 42);
		this.leftfootlower.addBox(-1.5F, 9.5F, -8.5F, 3, 1, 3);
		this.leftfootlower.setRotationPoint(2F, 11F, 0F);
		this.leftfootlower.setTextureSize(64, 32);
		this.leftfootlower.mirror = true;
		this.setRotation(leftfootlower, 0.4363323F, 0F, 0.0349066F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float par7) {
		super.render(entity, f, f1, f2, f3, f4, par7);
		setRotationAngles(f, f1, f2, f3, f4, par7);
		this.head.render(par7);
		this.headaccessory.render(par7);
		this.rightear.render(par7);
		this.leftear.render(par7);
		this.hair1.render(par7);
		this.hair2.render(par7);
		this.bodytop.render(par7);
		this.bodymiddle.render(par7);
		this.bodymiddlebutton.render(par7);
		this.bodybottom.render(par7);
		this.rightchest.render(par7);
		this.leftchest.render(par7);
		this.rightarm.render(par7);
		this.leftarm.render(par7);
		this.rightarmlower.render(par7);
		this.leftarmlower.render(par7);
		this.rightarmguard.render(par7);
		this.righthand.render(par7);
		this.lefthand.render(par7);
		this.backpack.render(par7);
		this.quiver.render(par7);
		this.tail1.render(par7);
		this.tail2.render(par7);
		this.waist.render(par7);
		this.rightleg.render(par7);
		this.leftleg.render(par7);
		this.rightlegmid.render(par7);
		this.leftlegmid.render(par7);
		this.rightleglower.render(par7);
		this.leftleglower.render(par7);
		this.rightfootlower.render(par7);
		this.leftfootlower.render(par7);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6) {
		this.head.rotateAngleY = par4 / 57.295776F;
		this.head.rotateAngleX = par5 / 57.295776F;
		this.headaccessory.rotateAngleY = this.head.rotateAngleY;
		this.headaccessory.rotateAngleX = this.head.rotateAngleX;
		this.rightear.rotateAngleX = this.head.rotateAngleX;
		this.rightear.rotateAngleY = this.head.rotateAngleY;
		this.leftear.rotateAngleX = this.head.rotateAngleX;
		this.leftear.rotateAngleY = this.head.rotateAngleY;
		this.hair1.rotateAngleY = this.head.rotateAngleY;
		this.hair2.rotateAngleY = this.head.rotateAngleY;
		this.righthand.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.8F * par2 * 0.5F;
		this.lefthand.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.8F * par2 * 0.5F;
		this.rightarm.rotateAngleX = this.righthand.rotateAngleX;
		this.leftarm.rotateAngleX = this.lefthand.rotateAngleX;
		this.rightarmguard.rotateAngleX = this.righthand.rotateAngleX;
		this.rightarmlower.rotateAngleX = this.righthand.rotateAngleX;
		this.leftarmlower.rotateAngleX = this.lefthand.rotateAngleX;
		this.tail1.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 0.5F * par2;
		this.tail2.rotateAngleY = this.tail1.rotateAngleY;
		this.rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.5F * par2;
		this.leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.5F * par2;
		this.rightlegmid.rotateAngleX = this.rightleg.rotateAngleX + 1.22173F;
		this.leftlegmid.rotateAngleX = this.leftleg.rotateAngleX + 1.22173F;
		this.rightleglower.rotateAngleX = this.rightleg.rotateAngleX - 0.3490659F;
		this.leftleglower.rotateAngleX = this.leftleg.rotateAngleX - 0.3490659F;
		this.rightfootlower.rotateAngleX = this.rightleg.rotateAngleX + 0.4363323F;
		this.leftfootlower.rotateAngleX = this.leftleg.rotateAngleX + 0.4363323F;
		this.rightleg.rotateAngleX = this.rightleg.rotateAngleX - 0.3490659F;
		this.leftleg.rotateAngleX = this.leftleg.rotateAngleX - 0.3490659F;

        float f6;
        float f7;

        if (this.swingProgress > -9990.0F) {
            f6 = this.swingProgress;
            f6 = 1.0F - this.swingProgress;
            f6 *= f6;
            f6 *= f6;
            f6 = 1.0F - f6;
            f7 = MathHelper.sin(f6 * (float)Math.PI);
            float f8 = MathHelper.sin(this.swingProgress * (float)Math.PI) * -(this.head.rotateAngleX - 0.7F) * 0.75F;
            
            this.righthand.rotateAngleX = (float)((double)this.righthand.rotateAngleX - ((double)f7 * 1.2D + (double)f8));
            this.rightarm.rotateAngleX = this.righthand.rotateAngleX; 
            this.rightarmlower.rotateAngleX = this.righthand.rotateAngleX;
            this.righthand.rotateAngleY += (this.bodytop.rotateAngleY * 2.0F);
            this.rightarm.rotateAngleY = this.righthand.rotateAngleY; 
            this.rightarmlower.rotateAngleY = this.righthand.rotateAngleY;
            this.righthand.rotateAngleZ = (MathHelper.sin(this.swingProgress * (float)Math.PI) * -0.4F);
            this.rightarm.rotateAngleZ = this.righthand.rotateAngleZ + 0.1745329F; 
            this.rightarmlower.rotateAngleZ = this.righthand.rotateAngleZ + 0.1745329F;
            this.righthand.rotateAngleZ = this.righthand.rotateAngleZ + 0.0872665F;
        }
	}
}