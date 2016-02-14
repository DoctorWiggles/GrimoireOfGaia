package gaia.renderer;

import gaia.model.ModelGaiaNPCCreeperGirl;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGaiaNPCCreeperGirl extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation("gaia", "textures/models/Creeper_Girl.png");

	public RenderGaiaNPCCreeperGirl(RenderManager rend) {
		super(rend, new ModelGaiaNPCCreeperGirl(), 0.5F);
	}

	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}
}
