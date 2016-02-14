package gaia.renderer;

import gaia.model.ModelGaiaWitherCow;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGaiaWitherCow extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation("gaia", "textures/models/Wither_Cow.png");

	public RenderGaiaWitherCow(RenderManager rend) {
		super(rend, new ModelGaiaWitherCow(), 0.5F);
	}

	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}

}
