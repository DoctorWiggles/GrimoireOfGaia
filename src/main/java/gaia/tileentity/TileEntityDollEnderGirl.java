package gaia.tileentity;

import javax.annotation.Nullable;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityDollEnderGirl extends TileEntity {

	public int direction;

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public boolean canUpdate() {
		return true;
	}

	public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
		this.readFromNBT(pkt.getNbtCompound());
	}

	public Packet getDescriptionPacket() {
		SPacketUpdateTileEntity datapacket = null;
		NBTTagCompound blockinfo = new NBTTagCompound();
		if (blockinfo.toString() != "") {
			this.writeToNBT(blockinfo);
		}

		datapacket = new SPacketUpdateTileEntity(this.getPos(), 5, blockinfo);
		return datapacket;
	}

	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		this.direction = nbt.getInteger("direction");
	}

	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		new NBTTagList();
		nbt.setInteger("direction", this.direction);
		return nbt;
	}
	
	@Nullable
    public SPacketUpdateTileEntity getUpdatePacket() {
        return new SPacketUpdateTileEntity(this.pos, 5, this.getUpdateTag());
    }

    public NBTTagCompound getUpdateTag() {
        return this.writeToNBT(new NBTTagCompound());
    }
}
