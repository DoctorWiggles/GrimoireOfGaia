package gaia.items;

import gaia.Gaia;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemFoodSmallAppleGold extends ItemFood {

	public ItemFoodSmallAppleGold(int amount, float saturation, boolean isWolfFood, String name) {
		super(amount, saturation, isWolfFood);
		this.maxStackSize = 64;
		this.setUnlocalizedName(name);
		this.setCreativeTab(Gaia.tabGaia);
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack stack) {
		return EnumRarity.UNCOMMON;
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		tooltip.add(I18n.translateToLocal("effect.absorption") + " (2:00)");
		tooltip.add(I18n.translateToLocal("effect.regeneration") + " (IV)" + " (0:04)");
		tooltip.add(I18n.translateToLocal("effect.resistance") + " (0:50)");
		tooltip.add(I18n.translateToLocal("effect.fireResistance") + " (0:50)");
	}

	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 2400, 0));
		player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 80, 4));
		player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 1000, 0));
		player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 1000, 0));
	}
}
