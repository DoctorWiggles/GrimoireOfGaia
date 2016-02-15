package gaia.renderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class base_held extends ModelBase{

	
	 public static ModelRenderer righthand;
	 
	public void postRenderArm(float scale)
    {
        this.righthand.postRender(scale);
    }
}
