package com.gildedgames.the_aether.addon.containers;

import com.gildedgames.the_aether.addon.blocks.BlocksAetherAddon;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ContainerSkyrootWorkbench extends ContainerWorkbench {
	private World world;
	private BlockPos pos;
	
	public ContainerSkyrootWorkbench(InventoryPlayer playerInventory, World worldIn, BlockPos posIn) {
		super(playerInventory, worldIn, posIn);
		world = worldIn;
		pos = posIn;
	}

	
	/**
     * Determines whether supplied player can use this container
     */
    public boolean canInteractWith(EntityPlayer playerIn)
    {
        if (this.world.getBlockState(this.pos).getBlock() != BlocksAetherAddon.skyroot_workbench)
        {
            return false;
        }
        else
        {
            return playerIn.getDistanceSq((double)this.pos.getX() + 0.5D, (double)this.pos.getY() + 0.5D, (double)this.pos.getZ() + 0.5D) <= 64.0D;
        }
    }
}
