package gaia.renderer;

import gaia.entity.monster.EntityGaiaYeti;
import gaia.model.ModelGaiaYeti;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGaiaYeti extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation("gaia", "textures/models/Yeti.png");

	public RenderGaiaYeti(RenderManager rend) {
		super(rend, new ModelGaiaYeti(), 0.5F);
		this.setRenderPassModel(new ModelGaiaYeti());
	}

	protected void scaleYeti(EntityGaiaYeti par1EntityGaiaYeti, float par2) {
		float f1 = par1EntityGaiaYeti.YetiScaleAmount();
		GL11.glScalef(f1, f1, f1);
	}

	protected void preRenderCallback(EntityLivingBase par1EntityLiving, float par2) {
		this.scaleYeti((EntityGaiaYeti)par1EntityLiving, par2);
	}

	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}
}
