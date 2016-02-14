package gaia.renderer;

import gaia.entity.monster.EntityGaiaGryphon;
import gaia.model.ModelGaiaGryphon;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGaiaGryphon extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation("gaia", "textures/models/Gryphon.png");

	public RenderGaiaGryphon(RenderManager rend) {
		super(rend, new ModelGaiaGryphon(), 0.5F);
		this.setRenderPassModel(new ModelGaiaGryphon());
	}

	protected void scaleGryphon(EntityGaiaGryphon par1EntityGaiaGryphon, float par2) {
		float f1 = par1EntityGaiaGryphon.GryphonScaleAmount();
		GL11.glScalef(f1, f1, f1);
	}

	protected void preRenderCallback(EntityLiving par1EntityLiving, float par2) {
		this.scaleGryphon((EntityGaiaGryphon)par1EntityLiving, par2);
	}

	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}
}
