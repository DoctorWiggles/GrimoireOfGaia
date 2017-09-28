package gaia.renderer.entity;

import gaia.GaiaReference;
import gaia.model.ModelGaiaSludgeGirl;
import gaia.renderer.entity.layers.LayerAlpha;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGaiaSludgeGirl extends RenderLiving<EntityLiving> {

    private static final ResourceLocation hairSludgeGirl = new ResourceLocation(GaiaReference.MOD_ID, "textures/models/layer/hair_sludge_girl.png");
    private static final ResourceLocation texture = new ResourceLocation(GaiaReference.MOD_ID, "textures/models/sludge_girl.png");
    static RenderManager rend = Minecraft.getMinecraft()
            .getRenderManager();

    public RenderGaiaSludgeGirl(float shadowSize) {
        super(rend, new ModelGaiaSludgeGirl(), shadowSize);
        this.addLayer(new LayerAlpha(this, hairSludgeGirl));
    }

    protected ResourceLocation getEntityTexture(EntityLiving entity) {
        return texture;
    }
}
