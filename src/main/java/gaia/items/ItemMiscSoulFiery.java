package gaia.items;

import gaia.Gaia;

import java.util.List;

import net.minecraft.block.Block;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMiscSoulFiery extends Item {
	String texture;

	public ItemMiscSoulFiery(String texture) {

		this.texture = texture;
		this.setUnlocalizedName("GrimoireOfGaia.MiscSoulFiery");
		this.setCreativeTab(Gaia.tabGaia);
	}

	public void addInformation(ItemStack itemstack, EntityPlayer player, List par3List, boolean par4) {
		par3List.add(StatCollector.translateToLocalFormatted("text.GrimoireOfGaia.FuelForSeconds", new Object[]{Integer.valueOf(1000)}));
		par3List.add(StatCollector.translateToLocal("item.GrimoireOfGaia.MiscSoulFiery.desc"));
	}

	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		if(par7 == 0) {
			--par5;
		}

		if(par7 == 1) {
			++par5;
		}

		if(par7 == 2) {
			--par6;
		}

		if(par7 == 3) {
			++par6;
		}

		if(par7 == 4) {
			--par4;
		}

		if(par7 == 5) {
			++par4;
		}

		if(!player.capabilities.isCreativeMode) {
			--itemstack.stackSize;
		}

		if(!player.canPlayerEdit(par4, par5, par6, par7, itemstack)) {
			return false;
		} else {
			Block i1 = par3World.getBlock(par4, par5, par6);
			if(i1 == Blocks.air) {
				par3World.playSoundEffect((double)par4 + 0.5D, (double)par5 + 0.5D, (double)par6 + 0.5D, "mob.ghast.scream", 0.15F, itemRand.nextFloat() * 0.4F + 0.8F);
				par3World.setBlock(par4, par5, par6, Blocks.flowing_lava);
			}

			itemstack.damageItem(1, player);
			return true;
		}
	}

	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("gaia:" + this.texture);
	}
}
