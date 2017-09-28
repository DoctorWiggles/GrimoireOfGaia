package gaia;

import gaia.init.GaiaItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class CreativeTabGaia extends CreativeTabs {

    public static final CreativeTabGaia INSTANCE = new CreativeTabGaia();

    public CreativeTabGaia() {
        super(GaiaReference.MOD_ID);
    }

    @Override
    public @Nonnull ItemStack getTabIconItem() {
        return new ItemStack(GaiaItems.MiscBook, 1, 0);
    }
}
