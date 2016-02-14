package gaia.items;

import gaia.Gaia;

import java.util.List;


import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemWeaponBookEnder extends ItemSword {
	private float weaponDamage;
	private final Item.ToolMaterial toolMaterial;
	String texture;

	public ItemWeaponBookEnder(String texture) {
		super(Item.ToolMaterial.IRON);
		this.toolMaterial = Item.ToolMaterial.IRON;
		this.setMaxDamage((int) (Item.ToolMaterial.IRON.getMaxUses()*3.48F));
		this.weaponDamage = Item.ToolMaterial.IRON.getDamageVsEntity();
		this.texture = texture;
		this.setUnlocalizedName("GrimoireOfGaia.WeaponBookEnder");
		this.setCreativeTab(Gaia.tabGaia);
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack itemstack) {
		return EnumRarity.RARE;
	}

	public void onPlayerStoppedUsing(ItemStack itemstack, World par2World, EntityPlayer par3EntityPlayer, int par4) {
		itemstack.damageItem(5, par3EntityPlayer);
		par3EntityPlayer.addExhaustion(5.0F);
		par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		if(!par2World.isRemote) {
			par2World.spawnEntityInWorld(new EntityEnderPearl(par2World, par3EntityPlayer));
		}
	}

	public void addInformation(ItemStack itemstack, EntityPlayer player, List par3List, boolean par4) {
		par3List.add(StatCollector.translateToLocal("potion.blindness") + " (0:04)");
	}

	public boolean hitEntity(ItemStack itemstack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
		itemstack.damageItem(1, par3EntityLiving);
		par2EntityLiving.addPotionEffect(new PotionEffect(Potion.blindness.id, 80, 0));
		return true;
	}

	public EnumAction getItemUseAction(ItemStack itemstack) {
		return EnumAction.BOW;
	}

	public int getMaxItemUseDuration(ItemStack itemstack) {
		return 72000;
	}

	public ItemStack onItemRightClick(ItemStack itemstack, World par2World, EntityPlayer par3EntityPlayer) {
		par3EntityPlayer.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));
		return itemstack;
	}

	public boolean getIsRepairable(ItemStack itemstack, ItemStack par2ItemStack) {
		return Items.ender_pearl == par2ItemStack.getItem()?true:super.getIsRepairable(itemstack, par2ItemStack);
	}

	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("gaia:" + this.texture);
	}
}
