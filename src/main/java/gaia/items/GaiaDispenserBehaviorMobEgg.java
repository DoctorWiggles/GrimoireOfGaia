package gaia.items;

import net.minecraft.block.BlockDispenser;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;

public class GaiaDispenserBehaviorMobEgg extends BehaviorDefaultDispenseItem 
{
	public ItemStack dispenseStack(IBlockSource par1IBlockSource, ItemStack par2ItemStack) 
	{
		EnumFacing enumfacing = BlockDispenser.getFacing(par1IBlockSource.getBlockMetadata());
		double d0 = par1IBlockSource.getX() + (double)enumfacing.getFrontOffsetX();
		double d1 = (double)((float)par1IBlockSource.getY() + 0.2F);//getYInt
		double d2 = par1IBlockSource.getZ() + (double)enumfacing.getFrontOffsetZ();
		Entity entity = ItemGaiaSpawnEgg.spawnCreature(par1IBlockSource.getWorld(), par2ItemStack.getItemDamage(), d0, d1, d2);

		if(entity instanceof EntityLivingBase && par2ItemStack.hasDisplayName()) 
		{
			((EntityLiving)entity).setCustomNameTag(par2ItemStack.getDisplayName());
		}

		par2ItemStack.splitStack(1);
		return par2ItemStack;
	}
}
