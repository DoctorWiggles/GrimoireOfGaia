package gaia.items;

import gaia.Gaia;
import gaia.GaiaItem;

import java.util.List;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.google.common.collect.Multimap;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemWeaponFanFire extends Item {
	private int weaponDamage;
	String texture;

	public ItemWeaponFanFire(String texture) {
		this.setMaxDamage(780);
		this.weaponDamage = 8;
		this.maxStackSize = 1;
		this.texture = texture;
		this.setUnlocalizedName("GrimoireOfGaia.WeaponFanFire");
		this.setCreativeTab(Gaia.tabGaia);
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack itemstack) {
		return EnumRarity.RARE;
	}

	public Multimap getItemAttributeModifiers() {
		Multimap multimap = super.getItemAttributeModifiers();
		multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Tool modifier", (double)this.weaponDamage, 0));
		return multimap;
	}
	
	public void onCreated(ItemStack itemstack, World par2World, EntityPlayer par3EntityPlayer) {
		itemstack.addEnchantment(Enchantment.fireAspect, 2);
		itemstack.addEnchantment(Enchantment.knockback, 1);
	}

	public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
		ItemStack is = new ItemStack(par1, 1, 0);
		is.addEnchantment(Enchantment.fireAspect, 2);
		is.addEnchantment(Enchantment.knockback, 1);
		par3List.add(is);
	}

	public boolean hitEntity(ItemStack itemstack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
		itemstack.damageItem(1, par3EntityLiving);
		return true;
	}

	public boolean isFull3D() {
		return true;
	}

	public EnumAction getItemUseAction(ItemStack itemstack) {
		return EnumAction.block;
	}

	public int getMaxItemUseDuration(ItemStack itemstack) {
		return 72000;
	}

	public ItemStack onItemRightClick(ItemStack itemstack, World par2World, EntityPlayer par3EntityPlayer) {
		par3EntityPlayer.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));
		return itemstack;
	}

	public boolean getIsRepairable(ItemStack itemstack, ItemStack par2ItemStack) {
		return GaiaItem.MiscSoulFiery == par2ItemStack.getItem()?true:super.getIsRepairable(itemstack, par2ItemStack);
	}

	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("gaia:" + this.texture);
	}
}
