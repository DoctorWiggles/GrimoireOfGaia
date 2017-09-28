package gaia.items;

import gaia.Gaia;
import gaia.init.Sounds;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

//TODO Remove/Phase out
public class ItemBagOre extends GaiaLootable {

	public ItemBagOre(String name) {
		this.maxStackSize = 1;
		this.setUnlocalizedName(name);
		this.setCreativeTab(Gaia.tabGaia);	
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack stack) {
		return EnumRarity.RARE;
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		tooltip.add(I18n.translateToLocal("text.GrimoireOfGaia.RightClickUse"));
	}

	public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand) {
		player.playSound(Sounds.bag_open, 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
		
		Random random = new Random();
		int i = random.nextInt(7);
		switch(i) {
		case 0:
			return loot(Blocks.COAL_ORE);
		case 1:
			return loot(Blocks.IRON_ORE);
		case 2:
			return loot(Blocks.GOLD_ORE);
		case 3:
			return loot(Blocks.DIAMOND_ORE);
		case 4:
			return loot(Blocks.EMERALD_ORE);
		case 5:
			return loot(Blocks.REDSTONE_ORE);
		case 6:
			return loot(Blocks.LAPIS_ORE);
		default:
			return new ActionResult(EnumActionResult.SUCCESS, stack);
		}
	}
}
