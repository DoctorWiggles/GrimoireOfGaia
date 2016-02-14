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

public class ItemFragment extends Item {
	String texture;

	public ItemFragment(String texture) {
		this.texture = texture;
		this.setUnlocalizedName("GrimoireOfGaia.Fragment");
		this.setCreativeTab(Gaia.tabGaia);
	}

	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("gaia:" + this.texture);
	}
}
