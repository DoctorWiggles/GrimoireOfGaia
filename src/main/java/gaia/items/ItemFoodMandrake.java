package gaia.items;

import gaia.Gaia;

import java.util.List;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class ItemFoodMandrake extends ItemFood {
	String texture;

	public ItemFoodMandrake(int par2, float par3, boolean par4, String texture) {
		super(par2, par3, par4);
		this.texture = texture;
		this.maxStackSize = 16;
		this.setUnlocalizedName("GrimoireOfGaia.FoodMandrake");
		this.setCreativeTab(Gaia.tabGaia);
	}

	public void addInformation(ItemStack itemstack, EntityPlayer player, List par3List, boolean par4) {
		par3List.add(StatCollector.translateToLocalFormatted("text.GrimoireOfGaia.RecoverHearts", new Object[]{Integer.valueOf(2)}));
		par3List.add(StatCollector.translateToLocalFormatted("text.GrimoireOfGaia.LoseHunger", new Object[]{Integer.valueOf(4)}));
		par3List.add(StatCollector.translateToLocal("potion.confusion") + " (0:20)");
	}

	protected void onFoodEaten(ItemStack itemstack, World par2World, EntityPlayer par3EntityPlayer) {
		par3EntityPlayer.heal(4.0F);
		par3EntityPlayer.addExhaustion(40.0F);
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 400, 0));
	}

	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("gaia:" + this.texture);
	}
}
