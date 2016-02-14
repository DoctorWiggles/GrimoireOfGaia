package gaia.items;

import gaia.Gaia;
import gaia.GaiaItem;

import java.util.List;
import java.util.Random;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class ItemFoodWitherMeat extends ItemFood {
	String texture;

	public ItemFoodWitherMeat(int par2, float par3, boolean par4, String texture) {
		super(par2, par3, par4);
		this.texture = texture;
		this.maxStackSize = 16;
		this.setUnlocalizedName("GrimoireOfGaia.FoodWitherMeat");
		this.setCreativeTab(Gaia.tabGaia);
	}

	public void addInformation(ItemStack itemstack, EntityPlayer player, List par3List, boolean par4) {
		par3List.add(StatCollector.translateToLocal("potion.hunger") + " (0:30)");
		par3List.add(StatCollector.translateToLocal("potion.wither") + " (0:10)");
	}

	protected void onFoodEaten(ItemStack itemstack, World par2World, EntityPlayer par3EntityPlayer) {
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.hunger.id, 600, 0));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.wither.id, 200, 0));
	}

	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("gaia:" + this.texture);
	}
}
