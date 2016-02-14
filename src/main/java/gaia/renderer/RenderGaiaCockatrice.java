package gaia.renderer;

import gaia.model.ModelGaiaCockatrice;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGaiaCockatrice extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation("gaia", "textures/models/Cockatrice.png");

	public RenderGaiaCockatrice(RenderManager rend) {
		super(rend, new ModelGaiaCockatrice(), 0.5F);
	}

	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}
}
