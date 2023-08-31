package net.mcreator.thehobbitmod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.thehobbitmod.TheHobbitModMod;

public class SevenRingsItemInHandTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TheHobbitModMod.queueServerWork(100, () -> {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.GOLD_INGOT);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		});
	}
}
