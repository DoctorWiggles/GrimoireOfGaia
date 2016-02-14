package gaia.entity.projectile;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityGaiaProjectileSmallFireball extends EntitySmallFireball {

	public EntityGaiaProjectileSmallFireball(World par1World) {
		super(par1World);
        this.setSize(0.3125F, 0.3125F);
	}

	public EntityGaiaProjectileSmallFireball(World par1World, double par2, double par4, double par6, double par8, double par10, double par12) {
		super(par1World, par2, par4, par6, par8, par10, par12);
        this.setSize(0.3125F, 0.3125F);
	}

	public EntityGaiaProjectileSmallFireball(World par1World, EntityLivingBase par2EntityLivingBase, double par3, double par5, double par7) {
		super(par1World, par2EntityLivingBase, par3, par5, par7);
        this.setSize(0.3125F, 0.3125F);
	}

	protected void onImpact(MovingObjectPosition mop) {
		if(!this.worldObj.isRemote) {
			if(mop.entityHit != null) {
				if(!mop.entityHit.isImmuneToFire() && mop.entityHit.attackEntityFrom(DamageSource.causeFireballDamage(this, this.shootingEntity), 5.0F)) {
					mop.entityHit.setFire(4);
				}
			} else {				
				int var2 = mop.getBlockPos().getX();
				int var3 = mop.getBlockPos().getY();
				int var4 = mop.getBlockPos().getZ();
				
				switch(mop.sideHit) {
				case DOWN:
					--var3;
					break;
				case UP:
					++var3;
					break;
				case EAST:
					--var4;
					break;
				case WEST:
					++var4;
					break;
				case NORTH:
					--var2;
					break;
				case SOUTH:
					++var2;
				}
			}

			this.setDead();
		}
	}

	public boolean canBeCollidedWith() {
		return false;
	}

	public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_) {
		return false;
	}
}
