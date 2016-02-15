package gaia.renderer;

import gaia.entity.passive.EntityGaiaNPCEnderGirl;
import gaia.model.ModelGaiaNPCEnderGirl;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderEnderman;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerEndermanEyes;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGaiaNPCEnderGirl extends RenderLiving {

	//private static final ResourceLocation endergirlEyesTexture = new ResourceLocation("gaia", "textures/models/eyes/Eyes_Ender_Girl.png");
	private static final ResourceLocation texture = new ResourceLocation("gaia", "textures/models/Ender_Girl.png");

	static RenderManager rend = Minecraft.getMinecraft().getRenderManager();
	public RenderGaiaNPCEnderGirl() {
		super(rend, new ModelGaiaNPCEnderGirl(), 0.5F);
		//this.setRenderPassModel(new ModelGaiaNPCEnderGirl());
		this.addLayer(new LayerEndergirlEyes(this));
	}
	

	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}
	
	@SideOnly(Side.CLIENT)
	public class LayerEndergirlEyes implements LayerRenderer<EntityGaiaNPCEnderGirl>
	{
		private final ResourceLocation endergirlEyesTexture = new ResourceLocation("gaia", "textures/models/eyes/Eyes_Ender_Girl.png");
	    private final RenderGaiaNPCEnderGirl endermanRenderer;

	    public LayerEndergirlEyes(RenderGaiaNPCEnderGirl endermanRendererIn)
	    {
	        this.endermanRenderer = endermanRendererIn;
	    }
	    
	    public void doRenderLayer(EntityGaiaNPCEnderGirl entity, float f1, float f2, float partialTicks, float f4, float f5, float f6, float scale)
	    {
	        this.endermanRenderer.bindTexture(endergirlEyesTexture);
	        GlStateManager.enableBlend();
	        GlStateManager.disableAlpha();
	        GlStateManager.blendFunc(1, 1);
	        GlStateManager.disableLighting();
	        GlStateManager.depthMask(!entity.isInvisible());
	        int i = 61680;
	        int j = i % 65536;
	        int k = i / 65536;
	        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j / 1.0F, (float)k / 1.0F);
	        GlStateManager.enableLighting();
	        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
	        this.endermanRenderer.getMainModel().render(entity, f1, f2, f4, f5, f6, scale);
	        this.endermanRenderer.func_177105_a(entity, partialTicks);
	        GlStateManager.depthMask(true);
	        GlStateManager.disableBlend();
	        GlStateManager.enableAlpha();
	    }
	    
	    
	    /*
	    public void doRenderLayer(EntityGaiaNPCEnderGirl endergrill, float f1, float f2, float partialTicks, float f4, float f5, float f6, float scale) {
			if (endergrill.isInvisible()) {
				return;
			} 
			 else {
				this.endermanRenderer.bindTexture(endergirlEyesTexture);
				GL11.glEnable(GL11.GL_BLEND);
				GL11.glDisable(GL11.GL_ALPHA_TEST);
				GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE);
				
	            if (endergrill.isInvisible())
	            {
	                GL11.glDepthMask(false);
	            }
	            else
	            {
	                GL11.glDepthMask(true);
	            }

	            char c0 = 61680;
	            int j = c0 % 65536;
	            int k = c0 / 65536;
	            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j / 1.0F, (float)k / 1.0F);
	            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	            return;
			}
		}
	     */
	    public boolean shouldCombineTextures()
	    {
	        return true;
	    }
	}
}
