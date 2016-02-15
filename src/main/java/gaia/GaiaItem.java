package gaia;

import gaia.items.ItemAccessoryDollCursed;
import gaia.items.ItemAccessoryRingHaste;
import gaia.items.ItemAccessoryRingJump;
import gaia.items.ItemAccessoryRingNight;
import gaia.items.ItemAccessoryRingSpeed;
import gaia.items.ItemBagBook;
import gaia.items.ItemBagOre;
import gaia.items.ItemBagRecord;
import gaia.items.ItemBoxDiamond;
import gaia.items.ItemBoxGold;
import gaia.items.ItemBoxIron;
import gaia.items.ItemBoxOld;
import gaia.items.ItemWeaponFanFire;
import gaia.items.ItemWeaponFanIce;
import gaia.items.ItemWeaponProp;
import gaia.items.ItemWeaponPropInvisible;
import net.minecraft.block.BlockDispenser;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class GaiaItem {
	public static Item Shard;
	public static Item Fragment;
	public static Item FoodMeatMorsel;
	public static Item FoodMeat;
	public static Item FoodCoalfish;
	public static Item FoodWitherMeat;
	public static Item FoodSmallAppleGold;
	public static Item FoodBerryHealth;
	public static Item FoodBerryCure;
	public static Item FoodBerryIce;
	public static Item FoodBerryFire;
	public static Item FoodDriedNetherWart;
	public static Item FoodMandrake;
	public static Item FoodPieMandrake;
	public static Item FoodPieMeat;
	public static Item FoodPieBerry;
	public static Item MiscSoulFire;
	public static Item MiscSoulFiery;
	public static Item MiscGigaGear;
	public static Item MiscPage;
	public static Item MiscBook;
	public static Item MiscRing;
	public static Item MiscFurnaceFuel;
	public static Item MiscCurrency;
	public static Item MiscWeaponEnchanted;
	public static Item SpawnCard;
	public static Item SpawnCardCreeperGirl;
	public static Item SpawnCardEnderGirl;
	public static Item SpawnCardHolstaurus;
	public static Item SpawnCardSlimeGirl;
	public static Item SpawnCardTrader;
	public static Item BoxIron;
	public static Item BoxGold;
	public static Item BoxDiamond;
	public static Item BagOre;
	public static Item BagBook;
	public static Item BagRecord;
	public static Item BoxOld;
	public static Item PropWeapon;
	public static Item PropWeaponInvisible;
	public static Item FanIce;
	public static Item FanFire;
	public static Item BookFreezing;
	public static Item BookNightmare;
	public static Item BookMetal;
	public static Item BookEnder;
	public static Item BookHunger;
	public static Item BookBattle;
	public static Item BookNature;
	public static Item BookWither;
	public static Item BookBuff;
	public static Item AccessoryRingSpeed;
	public static Item AccessoryRingHaste;
	public static Item AccessoryRingJump;
	public static Item AccessoryRingNight;
	public static Item AccessoryDollCursed;
	public static Item SpawnEgg;

	public static void init() {
		addItems();
		addNames();
		addRecipes();
		oreRegistration();
	}

	public static void addItems() {
		BoxIron = new ItemBoxIron("BoxIron");
		BoxGold = new ItemBoxGold("BoxGold");
		BoxDiamond = new ItemBoxDiamond("BoxDiamond");
		BagOre = new ItemBagOre("BagOre");
		BagBook = new ItemBagBook("BagBook");
		BagRecord = new ItemBagRecord("BagRecord");
		BoxOld = new ItemBoxOld("BoxOld");
		PropWeapon = new ItemWeaponProp("WeaponProp");
		PropWeaponInvisible = new ItemWeaponPropInvisible("WeaponPropInvisible");
		FanIce = new ItemWeaponFanIce("WeaponFanIce");
		FanFire = new ItemWeaponFanFire("WeaponFanFire");

		AccessoryRingSpeed = new ItemAccessoryRingSpeed("AccessoryRingSpeed");
		AccessoryRingHaste = new ItemAccessoryRingHaste("AccessoryRingHaste");
		AccessoryRingJump = new ItemAccessoryRingJump("AccessoryRingJump");
		AccessoryRingNight = new ItemAccessoryRingNight("AccessoryRingNight");
		AccessoryDollCursed = new ItemAccessoryDollCursed("AccessoryDollCursed");

		Item[] items = new Item[] { 
				Shard, 
				Fragment,
				FoodMeatMorsel, 
				FoodMeat, 
				FoodCoalfish, 
				FoodWitherMeat,
				FoodSmallAppleGold, 
				FoodBerryHealth, 
				FoodBerryCure, 
				FoodBerryIce, 
				FoodBerryFire,
				FoodDriedNetherWart, 
				FoodMandrake, 
				FoodPieMandrake, 
				FoodPieMeat,
				FoodPieBerry,
				MiscSoulFire, 
				MiscSoulFiery, 
				MiscGigaGear, 
				MiscPage,
				MiscBook, 
				MiscRing, 
				MiscFurnaceFuel,
				MiscCurrency,
				MiscWeaponEnchanted,
				SpawnCard, 
				SpawnCardCreeperGirl, 
				SpawnCardEnderGirl, 
				SpawnCardHolstaurus,
				SpawnCardSlimeGirl,
				SpawnCardTrader, 
				BoxIron, 
				BoxGold, 
				BoxDiamond, 
				BagOre, 
				BagBook, 
				BagRecord, 
				BoxOld, 
				PropWeapon, 
				PropWeaponInvisible,
				FanIce, 
				FanFire, 
				BookFreezing, 
				BookNightmare, 
				BookMetal, 
				BookEnder, 
				BookHunger,
				BookBattle, 
				BookNature,
				BookWither, 
				BookBuff,
				AccessoryRingSpeed, 
				AccessoryRingHaste, 
				AccessoryRingJump, 
				AccessoryRingNight,
				AccessoryDollCursed,
				SpawnEgg 
		};
		GameRegistry.registerItem(PropWeapon, "WeaponProp");

		
	}
    
	public static void addRecipes() {
	}
	
    public static void oreRegistration() {
    }

	public static void addNames() {}
}
