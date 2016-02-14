package gaia.items;

import gaia.Gaia;

import java.util.List;


import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
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

public class ItemWeaponBookFreezing extends ItemSword {
	private float weaponDamage;
	private final Item.ToolMaterial toolMaterial;
	String texture;

	public ItemWeaponBookFreezing(String texture) {
		super(Item.ToolMaterial.IRON);
		this.toolMaterial = Item.ToolMaterial.IRON;
		this.setMaxDamage((int) (Item.ToolMaterial.IRON.getMaxUses()*3.48F));
		this.weaponDamage = Item.ToolMaterial.IRON.getDamageVsEntity();
		this.texture = texture;
		this.setUnlocalizedName("GrimoireOfGaia.WeaponBookFreezing");
		this.setCreativeTab(Gaia.tabGaia);
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack itemstack) {
		return EnumRarity.RARE;
	}

	public void onPlayerStoppedUsing(ItemStack itemstack, World par2World, EntityPlayer par3EntityPlayer, int par4) {
		itemstack.damageItem(1, par3EntityPlayer);
		par3EntityPlayer.addExhaustion(5.0F);
		par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		if(!par2World.isRemote) {
			par2World.spawnEntityInWorld(new EntitySnowball(par2World, par3EntityPlayer));
		}
	}

	public void addInformation(ItemStack itemstack, EntityPlayer player, List par3List, boolean par4) {
		par3List.add(StatCollector.translateToLocal("potion.moveSlowdown") + " II" + " (0:04)");
	}

	public boolean hitEntity(ItemStack itemstack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
		itemstack.damageItem(1, par3EntityLiving);
		par2EntityLiving.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 80, 1));
		return true;
	}

	public EnumAction getItemUseAction(ItemStack itemstack) {
		return EnumAction.BOW;
	}

	public boolean getIsRepairable(ItemStack itemstack, ItemStack par2ItemStack) {
		return Items.book == par2ItemStack.getItem()?true:super.getIsRepairable(itemstack, par2ItemStack);
	}

	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("gaia:" + this.texture);
	}
}
