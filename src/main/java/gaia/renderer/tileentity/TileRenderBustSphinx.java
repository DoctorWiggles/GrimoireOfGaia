package gaia.renderer.tileentity;

import org.lwjgl.opengl.GL11;

import gaia.GaiaReference;
import gaia.model.tileentity.TileModelBustSphinx;
import gaia.tileentity.TileEntityBustSphinx;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileRenderBustSphinx extends TileEntitySpecialRenderer {

	public ResourceLocation texture;
	private TileModelBustSphinx model = new TileModelBustSphinx();

	public void renderModel(TileEntityBustSphinx te, double d, double d1, double d2, float f) {
		this.texture = new ResourceLocation(GaiaReference.MOD_ID, "textures/models/blocks/Bust_Sphinx.png");
		GL11.glPushMatrix();
		GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);
		if(te.direction == 0) {
			GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
		}

		if(te.direction == 1) {
			GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
		}

		if(te.direction == 2) {
			GL11.glRotatef(360.0F, 0.0F, 1.0F, 0.0F);
		}

		if(te.direction == 3) {
			GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
		}

		GL11.glScalef(1.0F, -1.0F, -1.0F);
		this.bindTexture(this.texture);
		this.model.renderAll(0.0625F);
		GL11.glPopMatrix();
	}

	public void renderTileEntityAt(TileEntity tileentity, double d0, double d1, double d2, float f, int destroyStage) {
		this.renderModel((TileEntityBustSphinx)tileentity, d0, d1, d2, f);
	}
}
