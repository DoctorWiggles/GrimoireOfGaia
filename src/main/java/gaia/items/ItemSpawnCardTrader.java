package gaia.items;

import gaia.Gaia;
import gaia.entity.passive.EntityGaiaNPCTrader;

import java.util.List;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemSpawnCardTrader extends Item {
	String texture;

	public ItemSpawnCardTrader(String texture) {

		this.texture = texture;
		this.setUnlocalizedName("GrimoireOfGaia.SpawnCardTrader");
		this.setCreativeTab(Gaia.tabGaia);
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack itemstack) {
		return EnumRarity.RARE;
	}

	public void addInformation(ItemStack itemstack, EntityPlayer player, List par3List, boolean par4) {
		par3List.add(StatCollector.translateToLocal("item.GrimoireOfGaia.SpawnCardTrader.desc"));
	}

	public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		if(!entityplayer.capabilities.isCreativeMode) {
			--itemstack.stackSize;
		}

		world.playSoundAtEntity(entityplayer, "gaia:book_hit", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		if(!world.isRemote) {
			EntityGaiaNPCTrader entityspawning = new EntityGaiaNPCTrader(world);
			entityspawning.setPosition(entityplayer.posX + 0.0D, entityplayer.posY + 0.0D, entityplayer.posZ + 0.0D);
			world.spawnEntityInWorld(entityspawning);
		}

		return itemstack;
	}

	public int getMaxItemUseDuration(ItemStack itemstack) {
		return 16;
	}

	public EnumAction getItemUseAction(ItemStack itemstack) {
		return EnumAction.BOW;
	}

	public ItemStack onItemRightClick(ItemStack itemstack, World par2World, EntityPlayer par3EntityPlayer) {
		par3EntityPlayer.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));
		return itemstack;
	}

	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("gaia:" + this.texture);
	}
}
