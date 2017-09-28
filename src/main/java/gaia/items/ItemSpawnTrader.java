package gaia.items;

import gaia.Gaia;
import gaia.entity.passive.EntityGaiaNPCTrader;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemSpawnTrader extends Item {

	public ItemSpawnTrader(String name) {
		this.maxStackSize = 16;
		this.setUnlocalizedName(name);
		this.setCreativeTab(Gaia.tabGaia);
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack stack) {
		return EnumRarity.RARE;
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		tooltip.add(I18n.translateToLocal("item.GrimoireOfGaia.SpawnTrader.desc"));
	}
	
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		pos = pos.offset(facing);

		if (!playerIn.canPlayerEdit(pos, facing, stack)) {
			return EnumActionResult.FAIL;
		} else {
			if (!playerIn.capabilities.isCreativeMode) {
				--stack.stackSize;
			}
			
			if (worldIn.isAirBlock(pos)) {
				if (!worldIn.isRemote) {
					EntityGaiaNPCTrader spawnEntity = new EntityGaiaNPCTrader(worldIn);
					spawnEntity.setLocationAndAngles(playerIn.posX + 0.5, playerIn.posY, playerIn.posZ + 0.5, 0,0); 
					worldIn.spawnEntityInWorld(spawnEntity);
				}
			}

			return EnumActionResult.SUCCESS;
		}
	}
}
