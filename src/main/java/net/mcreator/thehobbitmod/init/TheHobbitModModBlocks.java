
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thehobbitmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.thehobbitmod.block.MithrilOreBlock;
import net.mcreator.thehobbitmod.block.BurningMagmaBlock;
import net.mcreator.thehobbitmod.TheHobbitModMod;

public class TheHobbitModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheHobbitModMod.MODID);
	public static final RegistryObject<Block> BURNING_MAGMA = REGISTRY.register("burning_magma", () -> new BurningMagmaBlock());
	public static final RegistryObject<Block> MITHRIL_ORE = REGISTRY.register("mithril_ore", () -> new MithrilOreBlock());
}
