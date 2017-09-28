package gaia.items;

import gaia.CreativeTabGaia;
import gaia.GaiaReference;
import gaia.init.GaiaItems;
import gaia.init.Sounds;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Random;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ItemSpawn extends GaiaLootable {

    public ItemSpawn(String name) {
        this.maxStackSize = 1;
        this.setRegistryName(GaiaReference.MOD_ID, name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabGaia.INSTANCE);
    }

    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.EPIC;
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(I18n.format("text.grimoireofgaia.RightClickUse"));
    }

    @Override
    public @Nonnull ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, @Nonnull EnumHand handIn) {
        final ItemStack stack = player.getHeldItem(handIn);

        player.playSound(Sounds.box_open2, 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);

        Random random = new Random();
        int i = random.nextInt(6);
        switch (i) {
            case 0:
                return loot(GaiaItems.SpawnCreeperGirl);
            case 1:
                return loot(GaiaItems.SpawnEnderGirl);
            case 2:
                return loot(GaiaItems.SpawnHolstaurus);
            case 3:
                return loot(GaiaItems.SpawnSlimeGirl);
            case 4:
                return loot(GaiaItems.SpawnTrader);
            case 5:
                return loot(GaiaItems.SpawnWeresheep);
            default:
                return new ActionResult<>(EnumActionResult.SUCCESS, stack);
        }
    }
}
