package com.crypticmushroom.candycraft.client.gui;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotSugarFactory extends Slot {
    public SlotSugarFactory(IInventory par2IInventory, int par3, int par4, int par5) {
        super(par2IInventory, par3, par4, par5);
    }

    @Override
    public boolean isItemValid(ItemStack par1ItemStack) {
        return false;
    }
}
