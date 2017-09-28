package gaia.proxy;

import gaia.GaiaReference;
import gaia.entity.monster.EntityDebugMob;
import gaia.entity.monster.EntityGaiaAnt;
import gaia.entity.monster.EntityGaiaAnubis;
import gaia.entity.monster.EntityGaiaArachne;
import gaia.entity.monster.EntityGaiaBanshee;
import gaia.entity.monster.EntityGaiaBaphomet;
import gaia.entity.monster.EntityGaiaBoneKnight;
import gaia.entity.monster.EntityGaiaCentaur;
import gaia.entity.monster.EntityGaiaCobbleGolem;
import gaia.entity.monster.EntityGaiaCobblestoneGolem;
import gaia.entity.monster.EntityGaiaCreep;
import gaia.entity.monster.EntityGaiaCyclops;
import gaia.entity.monster.EntityGaiaDhampir;
import gaia.entity.monster.EntityGaiaDryad;
import gaia.entity.monster.EntityGaiaDullahan;
import gaia.entity.monster.EntityGaiaDwarf;
import gaia.entity.monster.EntityGaiaEnderDragonGirl;
import gaia.entity.monster.EntityGaiaEnderEye;
import gaia.entity.monster.EntityGaiaFleshLich;
import gaia.entity.monster.EntityGaiaFutakuchiOnna;
import gaia.entity.monster.EntityGaiaGryphon;
import gaia.entity.monster.EntityGaiaHarpy;
import gaia.entity.monster.EntityGaiaHunter;
import gaia.entity.monster.EntityGaiaKobold;
import gaia.entity.monster.EntityGaiaMandragora;
import gaia.entity.monster.EntityGaiaMatango;
import gaia.entity.monster.EntityGaiaMermaid;
import gaia.entity.monster.EntityGaiaMimic;
import gaia.entity.monster.EntityGaiaMinotaur;
import gaia.entity.monster.EntityGaiaMinotaurus;
import gaia.entity.monster.EntityGaiaMummy;
import gaia.entity.monster.EntityGaiaNaga;
import gaia.entity.monster.EntityGaiaNineTails;
import gaia.entity.monster.EntityGaiaSahuagin;
import gaia.entity.monster.EntityGaiaSatyress;
import gaia.entity.monster.EntityGaiaSelkie;
import gaia.entity.monster.EntityGaiaShaman;
import gaia.entity.monster.EntityGaiaSharko;
import gaia.entity.monster.EntityGaiaSiren;
import gaia.entity.monster.EntityGaiaSludgeGirl;
import gaia.entity.monster.EntityGaiaSphinx;
import gaia.entity.monster.EntityGaiaSpriggan;
import gaia.entity.monster.EntityGaiaSuccubus;
import gaia.entity.monster.EntityGaiaSummonButler;
import gaia.entity.monster.EntityGaiaSummonSporeling;
import gaia.entity.monster.EntityGaiaToad;
import gaia.entity.monster.EntityGaiaValkyrie;
import gaia.entity.monster.EntityGaiaVampire;
import gaia.entity.monster.EntityGaiaWerecat;
import gaia.entity.monster.EntityGaiaWitch;
import gaia.entity.monster.EntityGaiaWitherCow;
import gaia.entity.monster.EntityGaiaYeti;
import gaia.entity.monster.EntityGaiaYukiOnna;
import gaia.entity.passive.EntityGaiaNPCCreeperGirl;
import gaia.entity.passive.EntityGaiaNPCEnderGirl;
import gaia.entity.passive.EntityGaiaNPCHolstaurus;
import gaia.entity.passive.EntityGaiaNPCSlimeGirl;
import gaia.entity.passive.EntityGaiaNPCTrader;
import gaia.entity.passive.EntityGaiaNPCWeresheep;
import gaia.entity.passive.EntityGaiaPropChestMimic;
import gaia.entity.passive.EntityGaiaPropFlowerCyan;
import gaia.entity.projectile.EntityGaiaProjectileMagic;
import gaia.init.GaiaBlocks;
import gaia.init.GaiaItems;
import gaia.renderer.RenderGaiaProjectileMagic;
import gaia.renderer.entity.RenderDebugMob;
import gaia.renderer.entity.RenderGaiaAnt;
import gaia.renderer.entity.RenderGaiaAnubis;
import gaia.renderer.entity.RenderGaiaArachne;
import gaia.renderer.entity.RenderGaiaBanshee;
import gaia.renderer.entity.RenderGaiaBaphomet;
import gaia.renderer.entity.RenderGaiaBoneKnight;
import gaia.renderer.entity.RenderGaiaCentaur;
import gaia.renderer.entity.RenderGaiaCobbleGolem;
import gaia.renderer.entity.RenderGaiaCobblestoneGolem;
import gaia.renderer.entity.RenderGaiaCreep;
import gaia.renderer.entity.RenderGaiaCyclops;
import gaia.renderer.entity.RenderGaiaDhampir;
import gaia.renderer.entity.RenderGaiaDryad;
import gaia.renderer.entity.RenderGaiaDullahan;
import gaia.renderer.entity.RenderGaiaDwarf;
import gaia.renderer.entity.RenderGaiaEnderDragonGirl;
import gaia.renderer.entity.RenderGaiaEnderEye;
import gaia.renderer.entity.RenderGaiaFleshLich;
import gaia.renderer.entity.RenderGaiaFutakuchiOnna;
import gaia.renderer.entity.RenderGaiaGryphon;
import gaia.renderer.entity.RenderGaiaHarpy;
import gaia.renderer.entity.RenderGaiaHunter;
import gaia.renderer.entity.RenderGaiaKobold;
import gaia.renderer.entity.RenderGaiaMandragora;
import gaia.renderer.entity.RenderGaiaMatango;
import gaia.renderer.entity.RenderGaiaMermaid;
import gaia.renderer.entity.RenderGaiaMimic;
import gaia.renderer.entity.RenderGaiaMinotaur;
import gaia.renderer.entity.RenderGaiaMinotaurus;
import gaia.renderer.entity.RenderGaiaMummy;
import gaia.renderer.entity.RenderGaiaNPCCreeperGirl;
import gaia.renderer.entity.RenderGaiaNPCEnderGirl;
import gaia.renderer.entity.RenderGaiaNPCHolstaurus;
import gaia.renderer.entity.RenderGaiaNPCSlimeGirl;
import gaia.renderer.entity.RenderGaiaNPCTrader;
import gaia.renderer.entity.RenderGaiaNPCWeresheep;
import gaia.renderer.entity.RenderGaiaNaga;
import gaia.renderer.entity.RenderGaiaNineTails;
import gaia.renderer.entity.RenderGaiaPropChestMimic;
import gaia.renderer.entity.RenderGaiaPropFlowerCyan;
import gaia.renderer.entity.RenderGaiaSahuagin;
import gaia.renderer.entity.RenderGaiaSatyress;
import gaia.renderer.entity.RenderGaiaSelkie;
import gaia.renderer.entity.RenderGaiaShaman;
import gaia.renderer.entity.RenderGaiaSharko;
import gaia.renderer.entity.RenderGaiaSiren;
import gaia.renderer.entity.RenderGaiaSludgeGirl;
import gaia.renderer.entity.RenderGaiaSphinx;
import gaia.renderer.entity.RenderGaiaSpriggan;
import gaia.renderer.entity.RenderGaiaSuccubus;
import gaia.renderer.entity.RenderGaiaSummonButler;
import gaia.renderer.entity.RenderGaiaSummonSporeling;
import gaia.renderer.entity.RenderGaiaToad;
import gaia.renderer.entity.RenderGaiaValkyrie;
import gaia.renderer.entity.RenderGaiaVampire;
import gaia.renderer.entity.RenderGaiaWerecat;
import gaia.renderer.entity.RenderGaiaWitch;
import gaia.renderer.entity.RenderGaiaWitherCow;
import gaia.renderer.entity.RenderGaiaYeti;
import gaia.renderer.entity.RenderGaiaYukiOnna;
import gaia.renderer.particle.ParticleHandler;
import gaia.renderer.tileentity.TileRenderBustSphinx;
import gaia.renderer.tileentity.TileRenderBustValkyrie;
import gaia.renderer.tileentity.TileRenderBustVampire;
import gaia.renderer.tileentity.TileRenderDollCreeperGirl;
import gaia.renderer.tileentity.TileRenderDollEnderGirl;
import gaia.renderer.tileentity.TileRenderDollMaid;
import gaia.renderer.tileentity.TileRenderDollSlimeGirl;
import gaia.tileentity.TileEntityBustSphinx;
import gaia.tileentity.TileEntityBustValkyrie;
import gaia.tileentity.TileEntityBustVampire;
import gaia.tileentity.TileEntityDollCreeperGirl;
import gaia.tileentity.TileEntityDollEnderGirl;
import gaia.tileentity.TileEntityDollMaid;
import gaia.tileentity.TileEntityDollSlimeGirl;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Locale;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    @Override
    public void registerHandlers() {
        MinecraftForge.EVENT_BUS.register(new ParticleHandler());
    }

    @SuppressWarnings("deprecation")
    @SideOnly(Side.CLIENT)
    public void registerRenders() {
        float tiny = 0.25F;
        float small = 0.4F;
        float med = 0.5F;
        float large = 0.7F;

        // Debug
        RenderingRegistry.registerEntityRenderingHandler(EntityDebugMob.class, new RenderDebugMob(small));
        // Mob
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaAnt.class, new RenderGaiaAnt(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaAnubis.class, new RenderGaiaAnubis(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaArachne.class, new RenderGaiaArachne(large));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaBanshee.class, new RenderGaiaBanshee(med));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaBaphomet.class, new RenderGaiaBaphomet(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaBoneKnight.class, new RenderGaiaBoneKnight(med));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaCreep.class, new RenderGaiaCreep(med));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaCentaur.class, new RenderGaiaCentaur(med));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaCobbleGolem.class, new RenderGaiaCobbleGolem(large));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaCobblestoneGolem.class, new RenderGaiaCobblestoneGolem(large));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaCyclops.class, new RenderGaiaCyclops(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaDhampir.class, new RenderGaiaDhampir(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaDryad.class, new RenderGaiaDryad(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaDullahan.class, new RenderGaiaDullahan(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaDwarf.class, new RenderGaiaDwarf(large));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaEnderDragonGirl.class, new RenderGaiaEnderDragonGirl(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaEnderEye.class, new RenderGaiaEnderEye(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaFleshLich.class, new RenderGaiaFleshLich(med));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaFutakuchiOnna.class, new RenderGaiaFutakuchiOnna(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaGryphon.class, new RenderGaiaGryphon(med));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaHarpy.class, new RenderGaiaHarpy(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaHunter.class, new RenderGaiaHunter(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaKobold.class, new RenderGaiaKobold(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaMandragora.class, new RenderGaiaMandragora(tiny));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaMatango.class, new RenderGaiaMatango(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaMermaid.class, new RenderGaiaMermaid(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaMimic.class, new RenderGaiaMimic(med));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaMinotaur.class, new RenderGaiaMinotaur(large));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaMinotaurus.class, new RenderGaiaMinotaurus(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaMummy.class, new RenderGaiaMummy(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaNaga.class, new RenderGaiaNaga(med));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaNineTails.class, new RenderGaiaNineTails(small));
        // NPC
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaNPCCreeperGirl.class, new RenderGaiaNPCCreeperGirl(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaNPCSlimeGirl.class, new RenderGaiaNPCSlimeGirl(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaNPCEnderGirl.class, new RenderGaiaNPCEnderGirl(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaNPCTrader.class, new RenderGaiaNPCTrader(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaNPCHolstaurus.class, new RenderGaiaNPCHolstaurus(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaNPCWeresheep.class, new RenderGaiaNPCWeresheep(small));
        // Prop
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaPropChestMimic.class, new RenderGaiaPropChestMimic(0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaPropFlowerCyan.class, new RenderGaiaPropFlowerCyan(0.0F));
        // Mob
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaSahuagin.class, new RenderGaiaSahuagin(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaSatyress.class, new RenderGaiaSatyress(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaSelkie.class, new RenderGaiaSelkie(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaShaman.class, new RenderGaiaShaman(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaSharko.class, new RenderGaiaSharko(large));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaSiren.class, new RenderGaiaSiren(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaSludgeGirl.class, new RenderGaiaSludgeGirl(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaSphinx.class, new RenderGaiaSphinx(large));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaSpriggan.class, new RenderGaiaSpriggan(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaSuccubus.class, new RenderGaiaSuccubus(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaSummonButler.class, new RenderGaiaSummonButler(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaSummonSporeling.class, new RenderGaiaSummonSporeling(tiny));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaToad.class, new RenderGaiaToad(med));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaValkyrie.class, new RenderGaiaValkyrie(med));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaVampire.class, new RenderGaiaVampire(med));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaWerecat.class, new RenderGaiaWerecat(small));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaWitch.class, new RenderGaiaWitch(med));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaWitherCow.class, new RenderGaiaWitherCow(med));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaYeti.class, new RenderGaiaYeti(large));
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaYukiOnna.class, new RenderGaiaYukiOnna(small));
        // Projectile
        RenderingRegistry.registerEntityRenderingHandler(EntityGaiaProjectileMagic.class, new RenderGaiaProjectileMagic(GaiaItems.PropWeaponProjectile));
        // Block
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBustSphinx.class, new TileRenderBustSphinx());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBustValkyrie.class, new TileRenderBustValkyrie());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBustVampire.class, new TileRenderBustVampire());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDollCreeperGirl.class, new TileRenderDollCreeperGirl());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDollEnderGirl.class, new TileRenderDollEnderGirl());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDollSlimeGirl.class, new TileRenderDollSlimeGirl());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDollMaid.class, new TileRenderDollMaid());
    }

    @Override
    public void registerBlocksRender() {
        GaiaBlocks.registerRenders();
    }

    @Override
    public void registerItemsRender() {
        item_reg.registerRenders();
        item_reg.registerRenders_meta();
    }

    /**
     * Register default Item Models
     */
    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(GaiaReference.MOD_PREFIX + item.getUnlocalizedName()
                .substring(5)
                .toLowerCase(Locale.US), "inventory"));
    }

    /**
     * Register Item Model for meta data reliant objects <p>Shortcut method
     *
     * @param pathname item filename that is nested in
     *        grimoireofgaia:textures/items/<pathname>
     */
    public static void reg_Meta(Item item, int metadata, String pathname) {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(
                GaiaReference.MOD_PREFIX + pathname.toLowerCase(), "inventory"));
    }

    /**
     * Registry for item models
     */
    public static class item_reg extends GaiaItems {

        public static void registerRenders() {
            registerRender(Shard);
            registerRender(FoodMeat);
            registerRender(FoodRottenHeart);
            registerRender(FoodRoot);
            registerRender(FoodCoalfish);
            registerRender(FoodNetherWart);
            registerRender(FoodSmallAppleGold);
            registerRender(FoodMandrake);
            registerRender(FoodWither);
            registerRender(FoodPieMandrake);
            registerRender(FoodPieMeat);
            registerRender(FoodPieAppleGold);
            registerRender(MiscSoulFire);
            registerRender(MiscSoulFiery);
            registerRender(MiscGigaGear);
            registerRender(MiscFur);
            registerRender(MiscExperience);
            registerRender(MiscBook);
            registerRender(MiscQuill);
            registerRender(MiscRing);
            registerRender(MiscFurnaceFuel);
            registerRender(MiscCurrency);
            registerRender(Spawn);
            registerRender(SpawnCreeperGirl);
            registerRender(SpawnSlimeGirl);
            registerRender(SpawnEnderGirl);
            registerRender(SpawnTrader);
            registerRender(SpawnHolstaurus);
            registerRender(SpawnWeresheep);
            registerRender(SpawnTame);
            registerRender(BoxIron);
            registerRender(BoxGold);
            registerRender(BoxDiamond);
            registerRender(BagOre);
            registerRender(BagBook);
            registerRender(BagRecord);
            registerRender(BagArrow);
            registerRender(BoxOld);
            registerRender(Chest);
            registerRender(PropWeapon);
            registerRender(PropWeaponProjectile);
            registerRender(PropWeaponEnchanted);
            registerRender(PropShield);
            registerRender(FanIce);
            registerRender(FanFire);
            registerRender(BookBase);
            registerRender(BookFreezing);
            registerRender(BookNightmare);
            registerRender(BookMetal);
            registerRender(BookEnder);
            registerRender(BookHunger);
            registerRender(BookBattle);
            registerRender(BookNature);
            registerRender(BookWither);
            registerRender(BookBuff);
            registerRender(Debug);
            registerRender(AccessoryRingSpeed);
            registerRender(AccessoryRingHaste);
            registerRender(AccessoryRingJump);
            registerRender(AccessoryRingNight);
            registerRender(AccessoryTrinketPoison);
            registerRender(AccessoryTrinketWither);
            registerRender(AccessoryTrinketLevitation);
            registerRender(AccessoryCursed);
            registerRender(Card);
        }

        public static void registerRenders_meta() {
            // Shards
            reg_Meta(Shard, 0, "shardiron");
            reg_Meta(Shard, 1, "shardgold");
            reg_Meta(Shard, 2, "sharddiamond");
            reg_Meta(Shard, 3, "shardemerald");
            reg_Meta(Shard, 4, "shardcopper");
            reg_Meta(Shard, 5, "shardsilver");

            // MiscExperience
            reg_Meta(MiscExperience, 0, "miscexperienceiron");
            reg_Meta(MiscExperience, 1, "miscexperiencegold");
            reg_Meta(MiscExperience, 2, "miscexperiencediamond");

            // MiscRing
            reg_Meta(MiscRing, 0, "miscringspeed");
            reg_Meta(MiscRing, 1, "miscringhaste");
            reg_Meta(MiscRing, 2, "miscringjump");
            reg_Meta(MiscRing, 3, "miscringnight");

            // MiscCurrency
            reg_Meta(MiscCurrency, 0, "misccurrency_0");
            reg_Meta(MiscCurrency, 1, "misccurrency_1");
            reg_Meta(MiscCurrency, 2, "misccurrency_2");
            reg_Meta(MiscCurrency, 3, "misccurrency_3");

            // Box
            reg_Meta(Box, 0, "box");
            reg_Meta(Box, 1, "boxnether");
            reg_Meta(Box, 2, "boxend");

            // Chest
            reg_Meta(Chest, 0, "chest");
            reg_Meta(Chest, 1, "chestjungle");
            reg_Meta(Chest, 2, "chestdesert");

            // PropWeapon
            reg_Meta(PropWeapon, 0, "weaponpropender");
            reg_Meta(PropWeapon, 1, "weaponpropblaze");
            reg_Meta(PropWeapon, 2, "weaponpropspear");
            reg_Meta(PropWeapon, 3, "weaponpropdagger");
            reg_Meta(PropWeapon, 4, "weaponpropfan");
            reg_Meta(PropWeapon, 5, "weaponpropaxe");

            // PropWeaponProjectile
            reg_Meta(PropWeaponProjectile, 0, "weaponpropprojectile");

            // PropWeaponShield
            reg_Meta(PropShield, 0, "shieldpropiron");
            reg_Meta(PropShield, 1, "shieldpropgold");

            // AccessoryBauble
//            reg_Meta(AccessoryBauble, 0, "BaubleAccessory");

            // Card
            reg_Meta(Card, 0, "CardNull");
            reg_Meta(Card, 1, "CardChild");
            reg_Meta(Card, 2, "CardAttack");
        }
    }
}
