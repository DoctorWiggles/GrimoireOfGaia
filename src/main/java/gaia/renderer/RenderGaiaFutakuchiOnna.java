package gaia.renderer;

import gaia.model.ModelGaiaFutakuchiOnna;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGaiaFutakuchiOnna extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation("gaia", "textures/models/Futakuchi_Onna.png");

	public RenderGaiaFutakuchiOnna(RenderManager rend) {
		super(rend, new ModelGaiaFutakuchiOnna(), 0.5F);
	}

	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}
}
