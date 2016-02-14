package gaia.items;

import gaia.Gaia;

import java.util.List;
import java.util.Random;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBagOre extends Item {
	String texture;

	public ItemBagOre(String texture) {
		this.texture = texture;
		this.maxStackSize = 1;
		this.setUnlocalizedName("GrimoireOfGaia.BagOre");
		this.setCreativeTab(Gaia.tabGaia);
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack itemstack) {
		return EnumRarity.RARE;
	}

	public void addInformation(ItemStack itemstack, EntityPlayer player, List par3List, boolean par4) {
		par3List.add(StatCollector.translateToLocal("text.GrimoireOfGaia.RightClickUse.desc"));
	}

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		world.playSoundAtEntity(entityplayer, "gaia:bag_open", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
		
		Random random = new Random();
		int i = random.nextInt(7);
		switch(i) {
		case 0:
			return new ItemStack(Blocks.coal_ore);
		case 1:
			return new ItemStack(Blocks.iron_ore);
		case 2:
			return new ItemStack(Blocks.gold_ore);
		case 3:
			return new ItemStack(Blocks.diamond_ore);
		case 4:
			return new ItemStack(Blocks.emerald_ore);
		case 5:
			return new ItemStack(Blocks.redstone_ore);
		case 6:
			return new ItemStack(Blocks.lapis_ore);
		default:
			return itemstack;
		}
	}
	
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("gaia:" + this.texture);
	}
	
}
