package gaia.renderer;

import gaia.entity.passive.EntityGaiaNPCEnderGirl;
import gaia.entity.passive.EntityGaiaNPCSlimeGirl;
import gaia.model.ModelGaiaNPCSlimeGirl;
import gaia.renderer.RenderGaiaNPCEnderGirl.LayerEndergirlEyes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGaiaNPCSlimeGirl extends RenderLiving {

	private static final ResourceLocation hairSlimeGirl = new ResourceLocation("gaia", "textures/models/Slime_Girl_Hair.png");
	private static final ResourceLocation texture = new ResourceLocation("gaia", "textures/models/Slime_Girl.png");

	static RenderManager rend = Minecraft.getMinecraft().getRenderManager();
	public RenderGaiaNPCSlimeGirl() {
		super(rend, new ModelGaiaNPCSlimeGirl(), 0.5F);
		//this.setRenderPassModel(new ModelGaiaNPCSlimeGirl());
		//this.addLayer(new Slime_layer(this));
	}
	
	

	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}
	
	@SideOnly(Side.CLIENT)
	public class Slime_layer implements LayerRenderer<EntityGaiaNPCSlimeGirl>
	{
		private final ResourceLocation endergirlEyesTexture = new ResourceLocation("gaia", "textures/models/eyes/Eyes_Ender_Girl.png");
	    private final RenderGaiaNPCSlimeGirl endermanRenderer;

	    public Slime_layer(RenderGaiaNPCSlimeGirl endermanRendererIn)
	    {
	        this.endermanRenderer = endermanRendererIn;
	    }
	    
	   
	    /**
	    public void doRenderLayer(EntityGaiaNPCSlimeGirl entity, float f1, float f2, float partialTicks, float f4, float f5, float f6, float scale)
	    {
	    	if (entity.isInvisible()) {
				return;}
			else {
				this.endermanRenderer.bindTexture(hairSlimeGirl);
	            GL11.glEnable(GL11.GL_NORMALIZE);
	            GL11.glEnable(GL11.GL_BLEND);
	            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
	            return;
			}
	    }
	    */
	    public void doRenderLayer(EntityGaiaNPCSlimeGirl entity, float f1, float f2, float partialTicks, float f4, float f5, float f6, float scale)
	    {
	    	if (entity.isInvisible()) {
				return;}
			else {
				 GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		            GlStateManager.enableNormalize();
		            GlStateManager.enableBlend();
		            GlStateManager.blendFunc(770, 771);
				this.endermanRenderer.bindTexture(hairSlimeGirl);
	           
	            
	            GlStateManager.disableBlend();
	            GlStateManager.disableNormalize();
	            return;
			}
	    }
	    
	    
	    public boolean shouldCombineTextures()
	    {
	        return false;
	    }
	}
}
