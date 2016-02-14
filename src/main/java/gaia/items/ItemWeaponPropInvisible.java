package gaia.items;

import gaia.Gaia;

import java.util.List;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemWeaponPropInvisible extends Item {
	String texture;

	public ItemWeaponPropInvisible(String texture) {
		this.texture = texture;
		this.setUnlocalizedName("GrimoireOfGaia.WeaponPropInvisible");
		this.setCreativeTab(Gaia.tabGaia);
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack itemstack) {
		return EnumRarity.UNCOMMON;
	}

	public void addInformation(ItemStack itemstack, EntityPlayer player, List par3List, boolean par4) {
		par3List.add(StatCollector.translateToLocal("item.GrimoireOfGaia.WeaponProp.desc"));
		par3List.add(StatCollector.translateToLocal("item.GrimoireOfGaia.WeaponPropInvisible.desc"));
	}

	public boolean isFull3D() {
		return true;
	}

	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("gaia:" + this.texture);
	}
}
