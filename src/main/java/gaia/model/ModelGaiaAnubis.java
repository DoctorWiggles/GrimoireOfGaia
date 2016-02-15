package gaia.model;

import gaia.renderer.base_held;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelGaiaAnubis extends base_held {
	
	
	ModelRenderer head;
	ModelRenderer headaccessory;
	ModelRenderer rightear;
	ModelRenderer leftear;
    ModelRenderer crown;
	ModelRenderer hair1;
	ModelRenderer hair2;
	ModelRenderer mantle;
	ModelRenderer bodytop;
	ModelRenderer bodymid;
	ModelRenderer bodymidbutton;
	ModelRenderer bodybottom;
	ModelRenderer rightchest;
	ModelRenderer leftchest;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightarmlower;
	ModelRenderer leftarmlower;
	//public static ModelRenderer righthand;
	ModelRenderer leftarmhand;
	ModelRenderer tail;
	ModelRenderer waist;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer rightleglower1;
	ModelRenderer leftleglower1;
	ModelRenderer rightleglower2;
	ModelRenderer leftleglower2;
	ModelRenderer rightfoot;
	ModelRenderer leftfoot;

	
	public ModelGaiaAnubis() {
		this.textureWidth = 128;
		this.textureHeight = 64;

		this.head = new ModelRenderer(this, 0, 0);
		this.head.addBox(-3F, -6F, -3F, 6, 6, 6);
		this.head.setRotationPoint(0F, 1F, 0F);
		this.head.setTextureSize(128, 64);
		this.head.mirror = true;
		this.setRotation(head, 0F, 0F, 0F);
		this.headaccessory = new ModelRenderer(this, 36, 0);
		this.headaccessory.addBox(-3.5F, -6.5F, -3.5F, 7, 9, 7);
		this.headaccessory.setRotationPoint(0F, 1F, 0F);
		this.headaccessory.setTextureSize(128, 64);
		this.headaccessory.mirror = true;
		this.setRotation(headaccessory, 0F, 0F, 0F);
		this.rightear = new ModelRenderer(this, 36, 43);
		this.rightear.addBox(-4.5F, -10F, -1.5F, 3, 4, 3);
		this.rightear.setRotationPoint(0F, 1F, 0F);
		this.rightear.setTextureSize(64, 32);
		this.rightear.mirror = true;
		this.setRotation(rightear, 0F, 0F, 0F);
		this.leftear = new ModelRenderer(this, 48, 43);
		this.leftear.addBox(1.5F, -10F, -1.5F, 3, 4, 3);
		this.leftear.setRotationPoint(0F, 1F, 0F);
		this.leftear.setTextureSize(64, 32);
		this.leftear.mirror = true;
		this.setRotation(leftear, 0F, 0F, 0F);
		this.crown = new ModelRenderer(this, 36, 39);
		this.crown.addBox(-1F, -8F, -4.6F, 2, 3, 1);
		this.crown.setRotationPoint(0F, 1F, 0F);
		this.crown.setTextureSize(128, 64);
		this.crown.mirror = true;
		this.setRotation(crown, 0F, 0F, 0F);
		this.hair1 = new ModelRenderer(this, 36, 16);
		this.hair1.addBox(-4F, -6F, 1F, 8, 8, 3);
		this.hair1.setRotationPoint(0F, 1F, 0F);
		this.hair1.setTextureSize(128, 64);
		this.hair1.mirror = true;
		this.setRotation(hair1, 0F, 0F, 0F);
		this.hair2 = new ModelRenderer(this, 36, 27);
		this.hair2.addBox(-4.5F, -1F, 1.5F, 9, 9, 3);
		this.hair2.setRotationPoint(0F, 1F, 0F);
		this.hair2.setTextureSize(128, 64);
		this.hair2.mirror = true;
		this.setRotation(hair2, 0F, 0F, 0F);
		this.mantle = new ModelRenderer(this, 36, 50);
		this.mantle.addBox(-4F, 0F, -2F, 8, 2, 4);
		this.mantle.setRotationPoint(0F, 1F, 0F);
		this.mantle.setTextureSize(128, 64);
		this.mantle.mirror = true;
		this.setRotation(mantle, 0F, 0F, 0F);
		this.bodytop = new ModelRenderer(this, 0, 12);
		this.bodytop.addBox(-2.5F, 0F, -1.5F, 5, 5, 3);
		this.bodytop.setRotationPoint(0F, 1F, 0F);
		this.bodytop.setTextureSize(64, 32);
		this.bodytop.mirror = true;
		this.setRotation(bodytop, -0.0872665F, 0F, 0F);
		this.bodymid = new ModelRenderer(this, 0, 20);
		this.bodymid.addBox(-2F, 4.5F, -1.5F, 4, 3, 2);
		this.bodymid.setRotationPoint(0F, 1F, 0F);
		this.bodymid.setTextureSize(64, 32);
		this.bodymid.mirror = true;
		this.setRotation(bodymid, 0F, 0F, 0F);
		this.bodymidbutton = new ModelRenderer(this, 0, 20);
		this.bodymidbutton.addBox(-0.5F, 5F, -1.6F, 1, 2, 0);
		this.bodymidbutton.setRotationPoint(0F, 1F, 0F);
		this.bodymidbutton.setTextureSize(64, 32);
		this.bodymidbutton.mirror = true;
		this.setRotation(bodymidbutton, 0F, 0F, 0F);
		this.bodybottom = new ModelRenderer(this, 0, 25);
		this.bodybottom.addBox(-2.5F, 7F, -2.5F, 5, 3, 3);
		this.bodybottom.setRotationPoint(0F, 1F, 0F);
		this.bodybottom.setTextureSize(64, 32);
		this.bodybottom.mirror = true;
		this.setRotation(bodybottom, 0.0872665F, 0F, 0F);
		this.rightchest = new ModelRenderer(this, 8, 31);
		this.rightchest.addBox(-1F, -1F, -1F, 2, 2, 2);
		this.rightchest.setRotationPoint(1.3F, 3F, -1.5F);
		this.rightchest.setTextureSize(64, 32);
		this.rightchest.mirror = true;
		this.setRotation(rightchest, 0.7853982F, -0.1745329F, -0.0872665F);
		this.leftchest = new ModelRenderer(this, 0, 31);
		this.leftchest.addBox(-1F, -1F, -1F, 2, 2, 2);
		this.leftchest.setRotationPoint(-1.3F, 3F, -1.5F);
		this.leftchest.setTextureSize(64, 32);
		this.leftchest.mirror = true;
		this.setRotation(leftchest, 0.7853982F, 0.1745329F, 0.0872665F);
		this.rightarm = new ModelRenderer(this, 16, 12);
		this.rightarm.addBox(-2F, -1F, -1F, 2, 8, 2);
		this.rightarm.setRotationPoint(-2.5F, 2.5F, 0F);
		this.rightarm.setTextureSize(64, 32);
		this.rightarm.mirror = true;
		this.setRotation(rightarm, 0F, 0F, 0.1745329F);
		this.leftarm = new ModelRenderer(this, 16, 12);
		this.leftarm.addBox(0F, -1F, -1F, 2, 8, 2);
		this.leftarm.setRotationPoint(2.5F, 2.5F, 0F);
		this.leftarm.setTextureSize(64, 32);
		this.leftarm.mirror = true;
		this.setRotation(leftarm, 0F, 0F, -0.1745329F);
		this.rightarmlower = new ModelRenderer(this, 64, 0);
		this.rightarmlower.addBox(-2.5F, 2F, -1.5F, 2, 8, 3);
		this.rightarmlower.setRotationPoint(-2.5F, 2.5F, 0F);
		this.rightarmlower.setTextureSize(64, 32);
		this.rightarmlower.mirror = true;
		this.setRotation(rightarmlower, 0F, 0F, 0.1745329F);
		this.leftarmlower = new ModelRenderer(this, 74, 0);
		this.leftarmlower.addBox(0.5F, 2F, -1.5F, 2, 8, 3);
		this.leftarmlower.setRotationPoint(2.5F, 2.5F, 0F);
		this.leftarmlower.setTextureSize(64, 32);
		this.leftarmlower.mirror = true;
		this.setRotation(leftarmlower, 0F, 0F, -0.1745329F);
		this.righthand = new ModelRenderer(this, 64, 11);
		this.righthand.addBox(-1.5F, 8F, -2F, 2, 4, 4);
		this.righthand.setRotationPoint(-2.5F, 2.5F, 0F);
		this.righthand.setTextureSize(64, 32);
		this.righthand.mirror = true;
		this.setRotation(righthand, 0F, 0F, 0.1745329F);
		this.leftarmhand = new ModelRenderer(this, 76, 11);
		this.leftarmhand.addBox(-0.5F, 7.5F, -2F, 2, 4, 4);
		this.leftarmhand.setRotationPoint(2.5F, 2.5F, 0F);
		this.leftarmhand.setTextureSize(64, 32);
		this.leftarmhand.mirror = true;
		this.setRotation(leftarmhand, 0F, 0F, -0.1745329F);
		this.tail = new ModelRenderer(this, 88, 0);
		this.tail.addBox(-1F, 8.5F, -3F, 2, 10, 2);
		this.tail.setRotationPoint(0F, 1F, 0F);
		this.tail.setTextureSize(64, 32);
		this.tail.mirror = true;
		this.setRotation(tail, 0.4363323F, 0F, 0F);
		this.waist = new ModelRenderer(this, 88, 12);
		this.waist.addBox(-3F, 9F, -2F, 6, 6, 4);
		this.waist.setRotationPoint(0F, 1F, 0F);
		this.waist.setTextureSize(64, 32);
		this.waist.mirror = true;
		this.setRotation(waist, 0F, 0F, 0F);
		this.rightleg = new ModelRenderer(this, 24, 12);
		this.rightleg.addBox(-1F, 0F, -1F, 2, 13, 2);
		this.rightleg.setRotationPoint(-1.5F, 11F, 0F);
		this.rightleg.setTextureSize(64, 32);
		this.rightleg.mirror = true;
		this.setRotation(rightleg, 0F, 0F, 0F);
		this.leftleg = new ModelRenderer(this, 24, 12);
		this.leftleg.addBox(-1F, 0F, -1F, 2, 13, 2);
		this.leftleg.setRotationPoint(1.5F, 11F, 0F);
		this.leftleg.setTextureSize(64, 32);
		this.leftleg.mirror = true;
		this.setRotation(leftleg, 0F, 0F, 0F);
		this.rightleglower1 = new ModelRenderer(this, 88, 22);
		this.rightleglower1.addBox(-1.5F, 0F, -1.5F, 3, 11, 3);
		this.rightleglower1.setRotationPoint(-1.5F, 11F, 0F);
		this.rightleglower1.setTextureSize(64, 32);
		this.rightleglower1.mirror = true;
		this.setRotation(rightleglower1, 0F, 0F, 0.0349066F);
		this.leftleglower1 = new ModelRenderer(this, 100, 22);
		this.leftleglower1.addBox(-1.5F, 0F, -1.5F, 3, 11, 3);
		this.leftleglower1.setRotationPoint(1.5F, 11F, 0F);
		this.leftleglower1.setTextureSize(64, 32);
		this.leftleglower1.mirror = true;
		this.setRotation(leftleglower1, 0F, 0F, -0.0349066F);
		this.rightleglower2 = new ModelRenderer(this, 88, 36);
		this.rightleglower2.addBox(-2F, 6F, -2F, 3, 5, 4);
		this.rightleglower2.setRotationPoint(-1.5F, 11F, 0F);
		this.rightleglower2.setTextureSize(64, 32);
		this.rightleglower2.mirror = true;
		this.setRotation(rightleglower2, 0F, 0F, 0.0349066F);
		this.leftleglower2 = new ModelRenderer(this, 102, 36);
		this.leftleglower2.addBox(-1F, 6F, -2F, 3, 5, 4);
		this.leftleglower2.setRotationPoint(1.5F, 11F, 0F);
		this.leftleglower2.setTextureSize(64, 32);
		this.leftleglower2.mirror = true;
		this.setRotation(leftleglower2, 0F, 0F, -0.0349066F);
		this.rightfoot = new ModelRenderer(this, 88, 45);
		this.rightfoot.addBox(-1.5F, 11F, -3.5F, 3, 2, 4);
		this.rightfoot.setRotationPoint(-1.5F, 11F, 0F);
		this.rightfoot.setTextureSize(64, 32);
		this.rightfoot.mirror = true;
		this.setRotation(rightfoot, 0.0872665F, 0F, 0.0349066F);
		this.leftfoot = new ModelRenderer(this, 88, 45);
		this.leftfoot.addBox(-1.5F, 11F, -3.5F, 3, 2, 4);
		this.leftfoot.setRotationPoint(1.5F, 11F, 0F);
		this.leftfoot.setTextureSize(64, 32);
		this.leftfoot.mirror = true;
		this.setRotation(leftfoot, 0.0872665F, 0F, -0.0349066F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float par7)
	{
		super.render(entity, f, f1, f2, f3, f4, par7);
		setRotationAngles(f, f1, f2, f3, f4, par7);
		this.head.render(par7);
		this.headaccessory.render(par7);
		this.rightear.render(par7);
		this.leftear.render(par7);
		this.crown.render(par7);
		this.hair1.render(par7);
		this.hair2.render(par7);
		this.mantle.render(par7);
		this.bodytop.render(par7);
		this.bodymid.render(par7);
		this.bodymidbutton.render(par7);
		this.bodybottom.render(par7);
		this.rightchest.render(par7);
		this.leftchest.render(par7);
		this.rightarm.render(par7);
		this.leftarm.render(par7);
		this.rightarmlower.render(par7);
		this.leftarmlower.render(par7);
		this.righthand.render(par7);
		this.leftarmhand.render(par7);
		this.tail.render(par7);
		this.waist.render(par7);
		this.rightleg.render(par7);
		this.leftleg.render(par7);
		this.rightleglower1.render(par7);
		this.leftleglower1.render(par7);
		this.rightleglower2.render(par7);
		this.leftleglower2.render(par7);
		this.rightfoot.render(par7);
		this.leftfoot.render(par7);
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
		this.crown.rotateAngleX = this.head.rotateAngleX;
		this.crown.rotateAngleY = this.head.rotateAngleY;
		this.hair1.rotateAngleY = this.head.rotateAngleY;
		this.hair2.rotateAngleY = this.head.rotateAngleY;
		this.righthand.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.8F * par2 * 0.5F;
		this.leftarmhand.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.8F * par2 * 0.5F;
		this.rightarm.rotateAngleX = this.righthand.rotateAngleX;
		this.leftarm.rotateAngleX = this.leftarmhand.rotateAngleX;
		this.rightarmlower.rotateAngleX = this.righthand.rotateAngleX;
		this.leftarmlower.rotateAngleX = this.leftarmhand.rotateAngleX;
		this.tail.rotateAngleY = MathHelper.cos(par1 * 0.6662F) * 0.5F * par2;
		this.rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.5F * par2;
		this.leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.5F * par2;
		this.rightleglower1.rotateAngleX = this.rightleg.rotateAngleX;
		this.leftleglower1.rotateAngleX = this.leftleg.rotateAngleX;
		this.rightleglower2.rotateAngleX = this.rightleg.rotateAngleX;
		this.leftleglower2.rotateAngleX = this.leftleg.rotateAngleX;
		this.rightfoot.rotateAngleX = this.rightleg.rotateAngleX + 0.0872665F;
		this.leftfoot.rotateAngleX = this.leftleg.rotateAngleX + 0.0872665F;

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
            this.righthand.rotateAngleZ = (MathHelper.sin(this.swingProgress * (float)Math.PI) * -0.4F) + 0.1745329F;
            this.rightarm.rotateAngleZ = this.righthand.rotateAngleZ; 
            this.rightarmlower.rotateAngleZ = this.righthand.rotateAngleZ;
        }
	}
}
