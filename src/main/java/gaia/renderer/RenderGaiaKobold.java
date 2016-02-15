package gaia.renderer;

import gaia.entity.monster.EntityGaiaKobold;
import gaia.model.ModelGaiaKobold;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;

import org.lwjgl.opengl.GL11;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGaiaKobold extends RenderLiving {

	private static final ResourceLocation texture01 = new ResourceLocation("gaia", "textures/models/Kobold01.png");
	private static final ResourceLocation texture02 = new ResourceLocation("gaia", "textures/models/alternate/Kobold02.png");

	static RenderManager rend = Minecraft.getMinecraft().getRenderManager();
	public RenderGaiaKobold() {
		super(rend, new ModelGaiaKobold(), 0.5F);
		 this.addLayer(new held_layer(this));
	}


	protected void func_82422_c() {
		GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
	}

	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.getTexture((EntityGaiaKobold) entity);
	}
	
	protected ResourceLocation getTexture(EntityGaiaKobold par1EntityGaiaKobold) {
		switch(par1EntityGaiaKobold.getTextureType()) {
		case 0: return texture01;
		case 1: return texture02;
		default: return texture01;
		}
	}
}
