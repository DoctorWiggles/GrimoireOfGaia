package gaia.entity.passive;

import gaia.entity.EntityMobMerchant;
import gaia.entity.GaiaTrade;
import gaia.init.GaiaItems;
import gaia.init.Sounds;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;

public class EntityGaiaNPCWeresheep extends EntityMobMerchant {

	public EntityGaiaNPCWeresheep(World var1) {
		super(var1);
	}

	public ITextComponent getDisplayName() {
		String s = "entity.grimoireofgaia.Weresheep.name";
		TextComponentTranslation text = new TextComponentTranslation(s);
		return text;
	}

	@Override
	protected SoundEvent getAmbientSound() {
		return Sounds.passive_say;
	}

	@Override
	protected SoundEvent getHurtSound() {
		return Sounds.passive_hurt;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return Sounds.passive_death;
	}
	
	protected void dropFewItems(boolean par1, int par2) {
		if (par1 && (this.rand.nextInt(1) == 0 || this.rand.nextInt(1 + par2) > 0)) {
            this.entityDropItem(new ItemStack(GaiaItems.SpawnWeresheep, 1, 0), 0.0F);
		}
	}

	@Override
	public void addRecipies(MerchantRecipeList recipes) {
		recipes.add(new GaiaTrade(new ItemStack(GaiaItems.MiscCurrency, 1, 0), new ItemStack(GaiaItems.MiscCurrency, 1, 3)));	
		
		//Buy List
		recipes.add(new GaiaTrade(new ItemStack(GaiaItems.MiscCurrency, 1, 3), new ItemStack(Blocks.WOOL, 1, 0)));
		recipes.add(new GaiaTrade(new ItemStack(GaiaItems.MiscCurrency, 1, 3), new ItemStack(Blocks.WOOL, 1, 1)));
		recipes.add(new GaiaTrade(new ItemStack(GaiaItems.MiscCurrency, 1, 3), new ItemStack(Blocks.WOOL, 1, 2)));
		recipes.add(new GaiaTrade(new ItemStack(GaiaItems.MiscCurrency, 1, 3), new ItemStack(Blocks.WOOL, 1, 3)));
		recipes.add(new GaiaTrade(new ItemStack(GaiaItems.MiscCurrency, 1, 3), new ItemStack(Blocks.WOOL, 1, 4)));
		recipes.add(new GaiaTrade(new ItemStack(GaiaItems.MiscCurrency, 1, 3), new ItemStack(Blocks.WOOL, 1, 5)));
		recipes.add(new GaiaTrade(new ItemStack(GaiaItems.MiscCurrency, 1, 3), new ItemStack(Blocks.WOOL, 1, 6)));
		recipes.add(new GaiaTrade(new ItemStack(GaiaItems.MiscCurrency, 1, 3), new ItemStack(Blocks.WOOL, 1, 7)));
		recipes.add(new GaiaTrade(new ItemStack(GaiaItems.MiscCurrency, 1, 3), new ItemStack(Blocks.WOOL, 1, 8)));
		recipes.add(new GaiaTrade(new ItemStack(GaiaItems.MiscCurrency, 1, 3), new ItemStack(Blocks.WOOL, 1, 9)));
		recipes.add(new GaiaTrade(new ItemStack(GaiaItems.MiscCurrency, 1, 3), new ItemStack(Blocks.WOOL, 1, 10)));
		recipes.add(new GaiaTrade(new ItemStack(GaiaItems.MiscCurrency, 1, 3), new ItemStack(Blocks.WOOL, 1, 11)));
		recipes.add(new GaiaTrade(new ItemStack(GaiaItems.MiscCurrency, 1, 3), new ItemStack(Blocks.WOOL, 1, 12)));
		recipes.add(new GaiaTrade(new ItemStack(GaiaItems.MiscCurrency, 1, 3), new ItemStack(Blocks.WOOL, 1, 13)));
		recipes.add(new GaiaTrade(new ItemStack(GaiaItems.MiscCurrency, 1, 3), new ItemStack(Blocks.WOOL, 1, 14)));
		recipes.add(new GaiaTrade(new ItemStack(GaiaItems.MiscCurrency, 1, 3), new ItemStack(Blocks.WOOL, 1, 15)));
		
		//Sell List
		recipes.add(new GaiaTrade(new ItemStack(Blocks.WOOL, 1, 0), new ItemStack(GaiaItems.MiscCurrency, 1, 3)));
		recipes.add(new GaiaTrade(new ItemStack(Blocks.WOOL, 1, 1), new ItemStack(GaiaItems.MiscCurrency, 1, 3)));
		recipes.add(new GaiaTrade(new ItemStack(Blocks.WOOL, 1, 2), new ItemStack(GaiaItems.MiscCurrency, 1, 3)));
		recipes.add(new GaiaTrade(new ItemStack(Blocks.WOOL, 1, 3), new ItemStack(GaiaItems.MiscCurrency, 1, 3)));
		recipes.add(new GaiaTrade(new ItemStack(Blocks.WOOL, 1, 4), new ItemStack(GaiaItems.MiscCurrency, 1, 3)));
		recipes.add(new GaiaTrade(new ItemStack(Blocks.WOOL, 1, 5), new ItemStack(GaiaItems.MiscCurrency, 1, 3)));
		recipes.add(new GaiaTrade(new ItemStack(Blocks.WOOL, 1, 6), new ItemStack(GaiaItems.MiscCurrency, 1, 3)));
		recipes.add(new GaiaTrade(new ItemStack(Blocks.WOOL, 1, 7), new ItemStack(GaiaItems.MiscCurrency, 1, 3)));
		recipes.add(new GaiaTrade(new ItemStack(Blocks.WOOL, 1, 8), new ItemStack(GaiaItems.MiscCurrency, 1, 3)));
		recipes.add(new GaiaTrade(new ItemStack(Blocks.WOOL, 1, 9), new ItemStack(GaiaItems.MiscCurrency, 1, 3)));
		recipes.add(new GaiaTrade(new ItemStack(Blocks.WOOL, 1, 10), new ItemStack(GaiaItems.MiscCurrency, 1, 3)));
		recipes.add(new GaiaTrade(new ItemStack(Blocks.WOOL, 1, 11), new ItemStack(GaiaItems.MiscCurrency, 1, 3)));
		recipes.add(new GaiaTrade(new ItemStack(Blocks.WOOL, 1, 12), new ItemStack(GaiaItems.MiscCurrency, 1, 3)));
		recipes.add(new GaiaTrade(new ItemStack(Blocks.WOOL, 1, 13), new ItemStack(GaiaItems.MiscCurrency, 1, 3)));
		recipes.add(new GaiaTrade(new ItemStack(Blocks.WOOL, 1, 14), new ItemStack(GaiaItems.MiscCurrency, 1, 3)));
		recipes.add(new GaiaTrade(new ItemStack(Blocks.WOOL, 1, 15), new ItemStack(GaiaItems.MiscCurrency, 1, 3)));
	}
}
