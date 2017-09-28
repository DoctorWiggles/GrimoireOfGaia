package gaia.renderer.entity;

import gaia.GaiaReference;
import gaia.model.ModelGaiaDhampir;
import gaia.renderer.entity.layers.LayerGaiaHeldItem;
import gaia.renderer.entity.layers.LayerGlowing;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderGaiaDhampir extends RenderLiving<EntityLiving> {

    private static final ResourceLocation dhampirEyesTexture = new ResourceLocation(GaiaReference.MOD_ID, "textures/models/layer/eyes_dhampir.png");
    private static final ResourceLocation texture = new ResourceLocation(GaiaReference.MOD_ID, "textures/models/dhampir.png");
    static RenderManager rend = Minecraft.getMinecraft()
            .getRenderManager();

    public RenderGaiaDhampir(float shadowSize) {
        super(rend, new ModelGaiaDhampir(), shadowSize);
        this.addLayer(LayerGaiaHeldItem.Right(this, ModelGaiaDhampir.rightarm));
        this.addLayer(new LayerGlowing(this, dhampirEyesTexture));
    }

    public void transformHeldFull3DItemLayer() {
        GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityLiving entity) {
        return texture;
    }
}
