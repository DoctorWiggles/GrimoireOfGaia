package gaia.entity.monster;

import gaia.GaiaBlock;
import gaia.GaiaItem;
import gaia.entity.EntityAttributes;
import gaia.entity.EntityMobDay;
import gaia.entity.ai.EntityAIGaiaAttackOnCollide;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityGaiaValkyrie extends EntityMobDay {

	public EntityGaiaValkyrie(World par1World) {
		super(par1World);
		this.setSize(1.0F, 2.0F);
		this.experienceValue = EntityAttributes.experienceValue3;
		this.stepHeight = 6.0F;
		this.isImmuneToFire = true;
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIGaiaAttackOnCollide(this, 1.0D, true));
		this.tasks.addTask(2, new EntityAIWander(this, 0.8D));
		this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 3.0F, 1.0F));
		this.tasks.addTask(3, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class,  true));
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue((double)EntityAttributes.maxHealth3);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue((double)EntityAttributes.moveSpeed3);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue((double)EntityAttributes.attackDamage3);
	}

	public int getTotalArmorValue() {
		return EntityAttributes.rateArmor3;
	}

	public boolean attackEntityAsMob(Entity par1Entity) {
		if(super.attackEntityAsMob(par1Entity)) {
			if(par1Entity instanceof EntityLivingBase) {
                byte byte0 = 0;

                if (this.worldObj.getDifficulty() == EnumDifficulty.NORMAL){
                	byte0 = 7;
                } else if (this.worldObj.getDifficulty() == EnumDifficulty.HARD) {
                	byte0 = 15;
                }

				if(byte0 > 0) {
					((EntityLivingBase)par1Entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, byte0 * 60, 0));
					((EntityLivingBase)par1Entity).addPotionEffect(new PotionEffect(Potion.weakness.id, byte0 * 30, 0));
				}
			}

			return true;
		} else {
			return false;
		}
	}

	public boolean isAIEnabled() {
		return true;
	}

	public void onLivingUpdate() {
		if(!this.swingProgress && this.motionY < 0.0D) {
			this.motionY *= 0.8D;
		}

		if(this.motionX * this.motionX + this.motionZ * this.motionZ > 2.500000277905201E-7D && this.rand.nextInt(5) == 0) {
			int var1 = MathHelper.floor_double(this.posX);
			int var2 = MathHelper.floor_double(this.posY - 0.20000000298023224D - (double)this.yOffset);
			int var3 = MathHelper.floor_double(this.posZ);
			Block var4 = this.worldObj.getBlock(var1, var2, var3);
			if(var4 != Blocks.air) {
				this.worldObj.spawnParticle("blockcrack_" + Block.getIdFromBlock(var4) + "_" + this.worldObj.getBlockMetadata(var1, var2, var3), this.posX + ((double)this.rand.nextFloat() - 0.5D) * (double)this.width, this.getEntityBoundingBox().minY + 0.1D, this.posZ + ((double)this.rand.nextFloat() - 0.5D) * (double)this.width, 4.0D * ((double)this.rand.nextFloat() - 0.5D), 0.5D, ((double)this.rand.nextFloat() - 0.5D) * 4.0D);
			}
		}

		if(this.getHealth() <= EntityAttributes.maxHealth3 * 0.25F && this.getHealth() > 0.0F) {
			this.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 100, 0));
			this.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 100, 0));
			for(int i = 0; i < 2; ++i) {
				this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width, this.posY + this.rand.nextDouble() * (double)this.height, this.posZ + (this.rand.nextDouble() - 0.5D) * (double)this.width, 0.0D, 0.0D, 0.0D);
			}
		}

		if(this.getHealth() <= 0.0F) {
			for(int i = 0; i < 2; ++i) {
				this.worldObj.spawnParticle("largeexplode", this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width, this.posY + this.rand.nextDouble() * (double)this.height, this.posZ + (this.rand.nextDouble() - 0.5D) * (double)this.width, 0.0D, 0.0D, 0.0D);
			}
		} else {
			super.onLivingUpdate();
		}
	}

	protected String getLivingSound() {
		return "gaia:aggressive_say";
	}

	protected String getHurtSound() {
		return "gaia:aggressive_hurt";
	}

	protected String getDeathSound() {
		return "gaia:aggressive_death";
	}

	protected void playStepSound(int par1, int par2, int par3, int par4) {
		this.worldObj.playSoundAtEntity(this, "none", 1.0F, 1.0F);
	}

	protected void dropFewItems(boolean par1, int par2) {
		if(par1 && (this.rand.nextInt(2) == 0 || this.rand.nextInt(1 + par2) > 0)) {
            this.entityDropItem(new ItemStack(GaiaItem.Shard, 1, 2), 0.0F);
		}

		if(par1 && (this.rand.nextInt(4) == 0 || this.rand.nextInt(1 + par2) > 0)) {
			this.dropItem(GaiaItem.FoodSmallAppleGold,1);
		}
		
		if(par1 && (this.rand.nextInt(2) == 0 || this.rand.nextInt(1 + par2) > 0)) {
            this.entityDropItem(new ItemStack(GaiaItem.Shard, 1, 3), 0.0F);
		}
	}

	protected void dropRareDrop(int par1) {
		switch(this.rand.nextInt(3)) {
		case 0:
			this.dropItem(GaiaItem.BoxDiamond,1);
			break;
		case 1:
			this.dropItem(Item.getItemFromBlock(GaiaBlock.BustValkyrie), 1);
			break;
		case 2:
            this.entityDropItem(new ItemStack(GaiaItem.MiscRing, 1, 0), 0.0F);
		}
	}
	
	@Override
    protected void dropEquipment(boolean p_82160_1_, int p_82160_2_) {
    }
	
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData par1IEntityLivingData) {
		par1IEntityLivingData = super.onSpawnWithEgg(par1IEntityLivingData);
		this.setCurrentItemOrArmor(0, new ItemStack(GaiaItem.PropWeapon, 1, 2));
		return par1IEntityLivingData;
	}

	protected void fall(float f) {
	}

	public void setInWeb() {
	}

	public boolean attackEntityFrom(DamageSource par1DamageSource, int par2) {
		return par1DamageSource instanceof EntityDamageSourceIndirect?false:super.attackEntityFrom(par1DamageSource, (float)par2);
	}

	public void knockBack(Entity par1Entity, float par2, double par3, double par5) {
		if(this.rand.nextDouble() >= this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).getAttributeValue()) {
			this.isAirBorne = true;
			float f1 = MathHelper.sqrt_double(par3 * par3 + par5 * par5);
			float f2 = 0.4F;
			this.motionX /= 2.0D;
			this.motionY /= 2.0D;
			this.motionZ /= 2.0D;
			this.motionX -= par3 / (double)f1 * (double)f2;
			this.motionY += (double)f2;
			this.motionZ -= par5 / (double)f1 * (double)f2;
			if(this.motionY > EntityAttributes.knockback3) {
				this.motionY = EntityAttributes.knockback3;
			}
		}
	}

	public int getMaxSpawnedInChunk() {
		return 1;
	}

	public boolean getCanSpawnHere() {
		return this.posY > 80.0D && super.getCanSpawnHere();
	}
}
