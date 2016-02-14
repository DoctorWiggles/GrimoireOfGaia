package gaia.items;

import gaia.Gaia;

import java.util.List;


import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import com.google.common.collect.Multimap;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemWeaponBookBuff extends Item {
	private float weaponDamage;
	String texture;

	public ItemWeaponBookBuff(String texture) {
		this.setMaxDamage(64);
		this.weaponDamage = 0;
		this.maxStackSize = 1;
		this.texture = texture;
		this.setUnlocalizedName("GrimoireOfGaia.WeaponBookBuff");
		this.setCreativeTab(Gaia.tabGaia);
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack itemstack) {
		return EnumRarity.EPIC;
	}

	public Multimap getItemAttributeModifiers() {
		Multimap multimap = super.getItemAttributeModifiers();
		multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Tool modifier", (double)this.weaponDamage, 0));
		return multimap;
	}

	public void addInformation(ItemStack itemstack, EntityPlayer player, List par3List, boolean par4) {
		par3List.add(StatCollector.translateToLocal("potion.damageBoost") + " (1:00)");
		par3List.add(StatCollector.translateToLocal("potion.resistance") + " (1:00)");
		par3List.add(StatCollector.translateToLocal("potion.regeneration") + " (IV)" + " (0:04)");
	}

	public boolean hitEntity(ItemStack itemstack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
		itemstack.damageItem(1, par3EntityLiving);
		par2EntityLiving.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 600, 0));
		par2EntityLiving.addPotionEffect(new PotionEffect(Potion.resistance.id, 600, 0));
		par2EntityLiving.addPotionEffect(new PotionEffect(Potion.regeneration.id, 80, 3));
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
		return Items.book == par2ItemStack.getItem()?true:super.getIsRepairable(itemstack, par2ItemStack);
	}

	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("gaia:" + this.texture);
	}
}
