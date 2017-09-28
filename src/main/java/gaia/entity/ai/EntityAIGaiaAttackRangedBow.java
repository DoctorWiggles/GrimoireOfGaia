package gaia.entity.ai;

import gaia.GaiaConfig;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBow;
import net.minecraft.util.EnumHand;

/**
 * @see EntityAIGaiaAttackRangedBow
 */
public class EntityAIGaiaAttackRangedBow extends EntityAIBase {

    private GaiaIRangedAttackMob archer;
    private EntityLiving entity;
    private final double moveSpeedAmp;
    private int attackCooldown;
    private final float maxAttackDistance;
    private int attackTime = -1;
    private int seeTime;
    private boolean strafingClockwise;
    private boolean strafingBackwards;
    private int strafingTime = -1;

    public EntityAIGaiaAttackRangedBow(GaiaIRangedAttackMob entity, double speedAmplifier, int delay, float maxDistance) {
        this.entity = (EntityLiving) entity;
        this.archer = entity;
        this.moveSpeedAmp = speedAmplifier;
        this.attackCooldown = delay;
        this.maxAttackDistance = maxDistance * maxDistance;
        this.setMutexBits(3);
    }

    public void setAttackCooldown(int p_189428_1_) {
        this.attackCooldown = p_189428_1_;
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute() {
        return this.entity.getAttackTarget() == null
                ? false
                : this.isBowInMainhand();
    }

    protected boolean isBowInMainhand() {
        return this.entity.getHeldItemMainhand() != null && this.entity.getHeldItemMainhand()
                .getItem() == Items.BOW;
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean shouldContinueExecuting() {
        if (this.seeTime == -60) {
            return false;
        }
        return (this.shouldExecute() || !this.entity.getNavigator()
                .noPath()) && this.isBowInMainhand();
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting() {
        super.startExecuting();
        this.archer.setHoldingBow(true);
    }

    /**
     * Resets the task
     */
    public void resetTask() {
        super.resetTask();
        this.archer.setHoldingBow(false);
        this.seeTime = 0;
        this.attackTime = -1;
        this.entity.resetActiveHand();
    }

    /**
     * Updates the task
     */
    public void updateTask() {
        EntityLivingBase entitylivingbase = this.entity.getAttackTarget();

        if (entitylivingbase != null) {
            double d0 = this.entity.getDistanceSq(entitylivingbase.posX, entitylivingbase.getEntityBoundingBox().minY, entitylivingbase.posZ);
            boolean flag = this.entity.getEntitySenses()
                    .canSee(entitylivingbase);
            boolean flag1 = this.seeTime > 0;

            if (flag != flag1) {
                this.seeTime = 0;
            }

            if (flag) {
                ++this.seeTime;
            } else {
                --this.seeTime;
            }

            if (d0 <= (double) this.maxAttackDistance && this.seeTime >= 20) {
                this.entity.getNavigator()
                        .clearPathEntity();
                ++this.strafingTime;
            } else {
                this.entity.getNavigator()
                        .tryMoveToEntityLiving(entitylivingbase, this.moveSpeedAmp * 0.8);
                this.strafingTime = -1;
            }

            if (this.strafingTime >= 20) {
                if ((double) this.entity.getRNG()
                        .nextFloat() < 0.3D) {
                    this.strafingClockwise = !this.strafingClockwise;
                }

                if ((double) this.entity.getRNG()
                        .nextFloat() < 0.3D) {
                    this.strafingBackwards = !this.strafingBackwards;
                }

                this.strafingTime = 0;
            }

            if (this.strafingTime > -1) {
                if (d0 > (double) (this.maxAttackDistance * 0.75F)) {
                    this.strafingBackwards = false;
                } else if (d0 < (double) (this.maxAttackDistance * 0.25F)) {
                    this.strafingBackwards = true;
                }

                if (GaiaConfig.StrafingArchers) {
                    this.entity.getMoveHelper()
                            .strafe(this.strafingBackwards
                                    ? -0.4F
                                    : 0.4F, this.strafingClockwise
                                            ? 0.4F
                                            : -0.4F);
                } else {
                    this.entity.getMoveHelper()
                            .strafe(0.01F, 0.01F);
                }
                this.entity.faceEntity(entitylivingbase, 10.0F, 10.0F);
            } else {
                this.entity.getLookHelper()
                        .setLookPositionWithEntity(entitylivingbase, 30.0F, 30.0F);
            }

            if (this.entity.isHandActive()) {
                if (!flag && this.seeTime < -60) {
                    this.entity.resetActiveHand();
                } else if (flag) {
                    int i = this.entity.getItemInUseMaxCount();

                    if (i >= 20) {
                        this.entity.resetActiveHand();
                        this.archer.attackEntityWithRangedAttack(entitylivingbase, ItemBow.getArrowVelocity(i));
                        this.attackTime = this.attackCooldown;
                    }
                }
            } else if (--this.attackTime <= 0 && this.seeTime >= -60) {
                this.entity.setActiveHand(EnumHand.MAIN_HAND);
            }
        }
    }
}
