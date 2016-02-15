package gaia;

import gaia.entity.monster.EntityGaiaAnubis;
import gaia.entity.monster.EntityGaiaCockatrice;
import gaia.entity.monster.EntityGaiaFutakuchiOnna;
import gaia.entity.monster.EntityGaiaKobold;
import gaia.entity.monster.EntityGaiaSummonButler;
import gaia.entity.passive.EntityGaiaNPCCreeperGirl;
import gaia.entity.passive.EntityGaiaNPCEnderGirl;
import gaia.entity.passive.EntityGaiaNPCHolstaurus;
import gaia.entity.passive.EntityGaiaNPCSlimeGirl;
import gaia.entity.passive.EntityGaiaNPCTrader;
import gaia.entity.projectile.EntityGaiaProjectileMagic;
import gaia.entity.projectile.EntityGaiaProjectileSmallFireball;
import gaia.items.GaiaItemHandlerFuel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBase.SpawnListEntry;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
		modid = "GrimoireOfGaia",
		name = "Grimoire of Gaia 3",
		version = "1.0.0"
		)
/*
@NetworkMod(
		clientSideRequired = true,
		serverSideRequired = false
		)
*/

public class Gaia 
{
	public static final String modid = "GrimoireOfGaia";
	@Instance("GrimoireOfGaia")
	public static Gaia instance = new Gaia();
	@SidedProxy(
			clientSide = "gaia.ClientProxyGaia",
			serverSide = "gaia.CommonProxyGaia"
			)
	public static CommonProxyGaia proxy;
	public static CreativeTabs tabGaia = new CreativeTabs("tabGaia") 
	{
		@Override
		public Item getTabIconItem() 
		{
			return GaiaItem.FoodBerryHealth;
		}
	};

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
		cfg.load();
		ConfigGaia.SpawnAnubis = cfg.get("general", "SpawnRateAnubis", ConfigGaia.SpawnAnubis).getInt();
		ConfigGaia.SpawnBanshee = cfg.get("general", "SpawnRateBanshee", ConfigGaia.SpawnBanshee).getInt();
		ConfigGaia.SpawnGryphon = cfg.get("general", "SpawnRateGryphon", ConfigGaia.SpawnGryphon).getInt();
		ConfigGaia.SpawnBaphomet = cfg.get("general", "SpawnRateBaphomet", ConfigGaia.SpawnBaphomet).getInt();
		ConfigGaia.SpawnBoneKnight = cfg.get("general", "SpawnRateBoneKnight", ConfigGaia.SpawnBoneKnight).getInt();
		ConfigGaia.SpawnCentaur = cfg.get("general", "SpawnRateCentaur", ConfigGaia.SpawnCentaur).getInt();
		ConfigGaia.SpawnNineTails = cfg.get("general", "SpawnRateNineTails", ConfigGaia.SpawnNineTails).getInt();
		ConfigGaia.SpawnCobbleGolem = cfg.get("general", "SpawnRateCobbleGolem", ConfigGaia.SpawnCobbleGolem).getInt();
		ConfigGaia.SpawnCobblestoneGolem = cfg.get("general", "SpawnRateCobblestoneGolem", ConfigGaia.SpawnCobblestoneGolem).getInt();
		ConfigGaia.SpawnCockatrice = cfg.get("general", "SpawnRateCockatrice", ConfigGaia.SpawnCockatrice).getInt();
		ConfigGaia.SpawnCreep = cfg.get("general", "SpawnRateCreep", ConfigGaia.SpawnCreep).getInt();
		ConfigGaia.SpawnCyclops = cfg.get("general", "SpawnRateCyclops", ConfigGaia.SpawnCyclops).getInt();
		ConfigGaia.SpawnDhampir = cfg.get("general", "SpawnRateDhampir", ConfigGaia.SpawnDhampir).getInt();
		ConfigGaia.SpawnDryad = cfg.get("general", "SpawnRateDryad", ConfigGaia.SpawnDryad).getInt();
		ConfigGaia.SpawnDullahan = cfg.get("general", "SpawnRateDullahan", ConfigGaia.SpawnDullahan).getInt();
		ConfigGaia.SpawnEnderDragonGirl = cfg.get("general", "SpawnRateEnderDragonGirl", ConfigGaia.SpawnEnderDragonGirl).getInt();
		ConfigGaia.SpawnEnderEye = cfg.get("general", "SpawnRateEnderEye", ConfigGaia.SpawnEnderEye).getInt();
		ConfigGaia.SpawnFleshLich = cfg.get("general", "SpawnRateFleshLich", ConfigGaia.SpawnFleshLich).getInt();
		ConfigGaia.SpawnFutakuchiOnna = cfg.get("general", "SpawnRateFutakuchiOnna", ConfigGaia.SpawnFutakuchiOnna).getInt();
		ConfigGaia.SpawnHarpy = cfg.get("general", "SpawnRateHarpy", ConfigGaia.SpawnHarpy).getInt();
		ConfigGaia.SpawnHunter = cfg.get("general", "SpawnRateHunter", ConfigGaia.SpawnHunter).getInt();
		ConfigGaia.SpawnJorogumo = cfg.get("general", "SpawnRateJorogumo", ConfigGaia.SpawnJorogumo).getInt();
		ConfigGaia.SpawnKobold = cfg.get("general", "SpawnRateSpawnKobold", ConfigGaia.SpawnKobold).getInt();
		ConfigGaia.SpawnMandragora = cfg.get("general", "SpawnRateSpawnMandragora", ConfigGaia.SpawnMandragora).getInt();
		ConfigGaia.SpawnMermaid = cfg.get("general", "SpawnRateMermaid", ConfigGaia.SpawnMermaid).getInt();
		ConfigGaia.SpawnMimic = cfg.get("general", "SpawnRateMimic", ConfigGaia.SpawnMimic).getInt();
		ConfigGaia.SpawnMinotaur = cfg.get("general", "SpawnRateMinotaur", ConfigGaia.SpawnMinotaur).getInt();
		ConfigGaia.SpawnMinotaurus = cfg.get("general", "SpawnRateMinotaurus", ConfigGaia.SpawnMinotaurus).getInt();
		ConfigGaia.SpawnNaga = cfg.get("general", "SpawnRateNaga", ConfigGaia.SpawnNaga).getInt();
		ConfigGaia.SpawnSahuagin = cfg.get("general", "SpawnRateSahuagin", ConfigGaia.SpawnSahuagin).getInt();
		ConfigGaia.SpawnSatyr = cfg.get("general", "SpawnRateSatyr", ConfigGaia.SpawnSatyr).getInt();
		ConfigGaia.SpawnSelkie = cfg.get("general", "SpawnRateSelkie", ConfigGaia.SpawnSelkie).getInt();
		ConfigGaia.SpawnShaman = cfg.get("general", "SpawnRateShaman", ConfigGaia.SpawnShaman).getInt();
		ConfigGaia.SpawnSharko = cfg.get("general", "SpawnRateSharko", ConfigGaia.SpawnSharko).getInt();
		ConfigGaia.SpawnSiren = cfg.get("general", "SpawnRateSiren", ConfigGaia.SpawnSiren).getInt();
		ConfigGaia.SpawnSludgeGirl = cfg.get("general", "SpawnSludgeGirl", ConfigGaia.SpawnSludgeGirl).getInt();
		ConfigGaia.SpawnSphinx = cfg.get("general", "SpawnRateSphinx", ConfigGaia.SpawnSphinx).getInt();
		ConfigGaia.SpawnSpriggan = cfg.get("general", "SpawnRateSpriggan", ConfigGaia.SpawnSpriggan).getInt();
		ConfigGaia.SpawnSuccubus = cfg.get("general", "SpawnRateSuccubus", ConfigGaia.SpawnSuccubus).getInt();
		ConfigGaia.SpawnSwamper = cfg.get("general", "SpawnRateSwamper", ConfigGaia.SpawnSwamper).getInt();
		ConfigGaia.SpawnValkyrie = cfg.get("general", "SpawnRateValkyrie", ConfigGaia.SpawnValkyrie).getInt();
		ConfigGaia.SpawnVampire = cfg.get("general", "SpawnRateVampire", ConfigGaia.SpawnVampire).getInt();
		ConfigGaia.SpawnWerecat = cfg.get("general", "SpawnRateWerecat", ConfigGaia.SpawnWerecat).getInt();
		ConfigGaia.SpawnWitch = cfg.get("general", "SpawnRateWitch", ConfigGaia.SpawnWitch).getInt();
		ConfigGaia.SpawnWitherCow = cfg.get("general", "SpawnRateWitherCow", ConfigGaia.SpawnWitherCow).getInt();
		ConfigGaia.SpawnYeti = cfg.get("general", "SpawnRateYeti", ConfigGaia.SpawnYeti).getInt();
		ConfigGaia.SpawnYukiOnna = cfg.get("general", "SpawnRateYukiOnna", ConfigGaia.SpawnYukiOnna).getInt();
		ConfigGaia.BaseDamage = cfg.get("BASE DAMAGE", "BaseDamage", true).getBoolean(true);
		ConfigGaia.Tier1maxHealth = cfg.get("MODIFIER", "Tier1maxHealth", ConfigGaia.Tier1maxHealth).getInt();
		ConfigGaia.Tier1attackDamage = cfg.get("MODIFIER", "Tier1attackDamage", ConfigGaia.Tier1attackDamage).getInt();
		ConfigGaia.Tier2maxHealth = cfg.get("MODIFIER", "Tier2maxHealth", ConfigGaia.Tier2maxHealth).getInt();
		ConfigGaia.Tier2attackDamage = cfg.get("MODIFIER", "Tier2attackDamage", ConfigGaia.Tier2attackDamage).getInt();
		ConfigGaia.Tier3maxHealth = cfg.get("MODIFIER", "Tier3maxHealth", ConfigGaia.Tier3maxHealth).getInt();
		ConfigGaia.Tier3attackDamage = cfg.get("MODIFIER", "Tier3attackDamage", ConfigGaia.Tier3attackDamage).getInt();

		Property generalproperty = cfg.get("general", " ", " ");
		generalproperty.comment = "Spawn Rate. Set to 0 to disable mob from spawning. Recommended: 10> Day, <100 Night";
		Property basedamageproperty = cfg.get("BASE DAMAGE", " ", " ");
		basedamageproperty.comment = "If BaseDamage is set to true, all mobs will deal 1.0 piercing damage (ignores armor).";
		Property modifierproperty = cfg.get("MODIFIER", " ", " ");
		modifierproperty.comment = "Percentage amount. Default value: 100";
		cfg.save();
	}

	@EventHandler
	public void load(FMLInitializationEvent event) 
	{
		GaiaItem.init();
		GaiaBlock.init();

		proxy.registerRenderThings();
		proxy.registerSounds();
		GameRegistry.registerFuelHandler(new GaiaItemHandlerFuel());
		byte trackingRange = 64;
		byte updateFrequency = 3;

		EntityRegistry.registerModEntity(EntityGaiaAnubis.class, "Anubis", 1, this, trackingRange, updateFrequency, true, 0x353535, 0xb19534);
		
		EntityRegistry.registerModEntity(EntityGaiaCockatrice.class, "Cockatrice", 8, this, trackingRange, updateFrequency, true, 0x353535, 0xb19534);
		
		EntityRegistry.registerModEntity(EntityGaiaFutakuchiOnna.class, "FutakuchiOnna", 18, this, trackingRange, updateFrequency, true, 0x353535, 0xb19534);
		

		EntityRegistry.registerModEntity(EntityGaiaNPCCreeperGirl.class, "Creeper Girl", 60, this, trackingRange, updateFrequency, true, 0x353535, 0xb19534);
		EntityRegistry.registerModEntity(EntityGaiaNPCEnderGirl.class, "Ender Girl", 63, this, trackingRange, updateFrequency, true, 0x353535, 0xb19534);
		EntityRegistry.registerModEntity(EntityGaiaNPCHolstaurus.class, "Holstaurus", 64, this, trackingRange, updateFrequency, true, 0x353535, 0xb19534);
		EntityRegistry.registerModEntity(EntityGaiaNPCSlimeGirl.class, "Slime Girl", 62, this, trackingRange, updateFrequency, true, 0x353535, 0xb19534);
		EntityRegistry.registerModEntity(EntityGaiaNPCTrader.class, "Trader", 61, this, trackingRange, updateFrequency, true, 0x353535, 0xb19534);
	
		EntityRegistry.registerModEntity(EntityGaiaProjectileSmallFireball.class, "Small Fireball", 100, this, trackingRange, updateFrequency, true, 0x353535, 0xb19534);
		EntityRegistry.registerModEntity(EntityGaiaProjectileMagic.class, "Magic", 101, this, trackingRange, updateFrequency, true, 0x353535, 0xb19534);

		
		EntityRegistry.registerModEntity(EntityGaiaSummonButler.class, "Butler", 81, this, trackingRange, updateFrequency, true, 0x353535, 0xb19534);

		
		EntityRegistry.registerModEntity(EntityGaiaKobold.class, "Kobold", 47, this, trackingRange, updateFrequency, true, 0x73718d, 0xdec89e); //ID
		
		
		
		
		
		
		
		BiomeGenBase[] forest = BiomeDictionary.getBiomesForType(Type.FOREST);
		BiomeGenBase[] sandy = BiomeDictionary.getBiomesForType(Type.SANDY);
		BiomeGenBase[] plains = BiomeDictionary.getBiomesForType(Type.PLAINS);
		BiomeGenBase[] swamp = BiomeDictionary.getBiomesForType(Type.SWAMP);
		BiomeGenBase[] spooky = BiomeDictionary.getBiomesForType(Type.SPOOKY);
		BiomeGenBase[] jungle = BiomeDictionary.getBiomesForType(Type.JUNGLE);
		BiomeGenBase[] snowy = BiomeDictionary.getBiomesForType(Type.SNOWY);
		BiomeGenBase[] mountain = BiomeDictionary.getBiomesForType(Type.MOUNTAIN);

		BiomeGenBase[] water = BiomeDictionary.getBiomesForType(Type.WATER);
		BiomeGenBase[] beach = BiomeDictionary.getBiomesForType(Type.BEACH);

		BiomeGenBase[] hell = BiomeDictionary.getBiomesForType(Type.NETHER);
		BiomeGenBase[] sky = BiomeDictionary.getBiomesForType(Type.END);

	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {}
}
