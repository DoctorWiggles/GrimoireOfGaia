package gaia.items;

import gaia.CreativeTabGaia;
import gaia.GaiaReference;
import gaia.entity.passive.EntityGaiaNPCCreeperGirl;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ItemSpawnCreeperGirl extends Item {

    public ItemSpawnCreeperGirl(String name) {
        this.maxStackSize = 16;
        this.setRegistryName(GaiaReference.MOD_ID, name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabGaia.INSTANCE);
    }

    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.RARE;
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(I18n.format("item.grimoireofgaia.SpawnCreeperGirl.desc"));
    }

    @Override
    public @Nonnull EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX,
            float hitY, float hitZ) {
        final ItemStack stack = player.getHeldItem(hand);

        pos = pos.offset(facing);

        if (!player.canPlayerEdit(pos, facing, stack)) {
            return EnumActionResult.FAIL;
        } else {
            if (!player.capabilities.isCreativeMode) {
                stack.shrink(1);
            }

            if (worldIn.isAirBlock(pos)) {
                if (!worldIn.isRemote) {
                    EntityGaiaNPCCreeperGirl spawnEntity = new EntityGaiaNPCCreeperGirl(worldIn);
                    spawnEntity.setLocationAndAngles(player.posX + 0.5, player.posY, player.posZ + 0.5, 0, 0);
                    worldIn.spawnEntity(spawnEntity);
                }
            }

            return EnumActionResult.SUCCESS;
        }
    }
}
