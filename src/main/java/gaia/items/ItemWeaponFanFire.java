package gaia.items;

import gaia.Gaia;
import gaia.init.GaiaItems;

import java.util.List;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.google.common.collect.Multimap;

/** 
 * @see ItemSword
 */
public class ItemWeaponFanFire extends Item {
	
	private int attackDamage;

	public ItemWeaponFanFire(String name) {
		this.maxStackSize = 1;
		this.setMaxDamage(780);
		this.setCreativeTab(Gaia.tabGaia);
		this.attackDamage = 7;
		this.setUnlocalizedName(name);
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack stack) {
		return EnumRarity.RARE;
	}
	
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase host) {
		stack.damageItem(1, host);
		return true;
	}
	
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
        if ((double)state.getBlockHardness(worldIn, pos) != 0.0D) {
            stack.damageItem(2, entityLiving);
        }

        return true;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
    
	public boolean getIsRepairable(ItemStack stack, ItemStack par2ItemStack) {
		return GaiaItems.MiscSoulFiery == par2ItemStack.getItem()?true:super.getIsRepairable(stack, par2ItemStack);
	}
	
    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

        if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getAttributeUnlocalizedName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)this.attackDamage, 0));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getAttributeUnlocalizedName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -2.4000000953674316D, 0));
        }

        return multimap;
    }
	
	public void onCreated(ItemStack stack, World world, EntityPlayer player) {
		stack.addEnchantment(Enchantment.getEnchantmentByLocation("fire_aspect"), 2);
		stack.addEnchantment(Enchantment.getEnchantmentByLocation("knockback"), 1);
	}

	public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
		ItemStack stack = new ItemStack(par1, 1, 0);
		stack.addEnchantment(Enchantment.getEnchantmentByLocation("fire_aspect"), 2);
		stack.addEnchantment(Enchantment.getEnchantmentByLocation("knockback"), 1);
		par3List.add(stack);
	}
}
