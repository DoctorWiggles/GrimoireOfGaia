package gaia.items;

import gaia.Gaia;

import java.util.List;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMiscPage extends Item {
	String texture;

	public ItemMiscPage(String texture) {
		this.texture = texture;
		this.setUnlocalizedName("GrimoireOfGaia.MiscPage");
		this.setCreativeTab(Gaia.tabGaia);
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack itemstack) {
		return EnumRarity.UNCOMMON;
	}
	
	public void addInformation(ItemStack itemstack, EntityPlayer player, List par3List, boolean par4) {
		par3List.add((EnumChatFormatting.ITALIC + StatCollector.translateToLocal("item.GrimoireOfGaia.MiscPage.desc")));
	}

	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("gaia:" + this.texture);
	}
}
