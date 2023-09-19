
package net.mcreator.thehobbitmod.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.thehobbitmod.procedures.ThreeRingsItemInHandTickProcedure;

public class ThreeRingsItem extends Item {
	public ThreeRingsItem() {
		super(new Item.Properties().durability(3000).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 3f;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			ThreeRingsItemInHandTickProcedure.execute(entity);
	}
}
