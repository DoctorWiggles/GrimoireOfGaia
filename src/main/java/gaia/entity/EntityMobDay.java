package gaia.entity;

import gaia.BlockStateHelper;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import com.google.common.collect.Sets;

public abstract class EntityMobDay extends EntityMobBase {

	static Set<Block> spawnBlocks = Sets.newHashSet(new Block[] {
			Blocks.grass, Blocks.dirt, Blocks.gravel, Blocks.sand, Blocks.snow_layer
	});
	public EntityMobDay(World par1World) {
		super(par1World);
	}

	
	@Override
	public boolean getCanSpawnHere() {
		int i = MathHelper.floor_double(this.posX);
		int j = MathHelper.floor_double(this.getEntityBoundingBox().minY);
		int k = MathHelper.floor_double(this.posZ);

		//Block var1 = this.worldObj.getBlock(i, j - 1, k);
		BlockPos pos2 = new BlockPos(i, j - 1, k);
		BlockPos pos = new BlockPos(i, j, k);
		Block var1 = BlockStateHelper.getBlockfromState(this.worldObj, pos2);
		if (spawnBlocks.contains(var1)) {
			// also reorder this part, getCollidingBoundingBoxes and checkNoEntityCollisions and isAnyLiquid are really expensive
			//return this.posY > 60.0D && this.worldObj.getBlockLightValue(i, j, k) >= 7
			return this.posY > 60.0D && var1.getLightValue() >= 7
					
					//TODO Lighting code?
					//&& this.worldObj.getChunkFromChunkCoords(i, k).getBlockLightValue(i & 15, j, k & 15, 15) < 7 //what does this achieve, there are methods on world to get the block light level without timed daylight
					&& this.worldObj.checkNoEntityCollision(this.getEntityBoundingBox()) && this.worldObj.getCollidingBoundingBoxes(this, this.getEntityBoundingBox()).isEmpty()
					&& !this.worldObj.isAnyLiquid(this.getEntityBoundingBox());
		}
		return false;
	}
}
