
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thehobbitmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.thehobbitmod.block.MithrilOreBlock;
import net.mcreator.thehobbitmod.block.MallornWoodBlock;
import net.mcreator.thehobbitmod.block.MallornStairsBlock;
import net.mcreator.thehobbitmod.block.MallornSlabBlock;
import net.mcreator.thehobbitmod.block.MallornPressurePlateBlock;
import net.mcreator.thehobbitmod.block.MallornPlanksBlock;
import net.mcreator.thehobbitmod.block.MallornLogBlock;
import net.mcreator.thehobbitmod.block.MallornLeavesBlock;
import net.mcreator.thehobbitmod.block.MallornFenceGateBlock;
import net.mcreator.thehobbitmod.block.MallornFenceBlock;
import net.mcreator.thehobbitmod.block.MallornButtonBlock;
import net.mcreator.thehobbitmod.block.ForgerBlock;
import net.mcreator.thehobbitmod.block.BurningMagmaBlock;
import net.mcreator.thehobbitmod.TheHobbitModMod;

public class TheHobbitModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheHobbitModMod.MODID);
	public static final RegistryObject<Block> BURNING_MAGMA = REGISTRY.register("burning_magma", () -> new BurningMagmaBlock());
	public static final RegistryObject<Block> MITHRIL_ORE = REGISTRY.register("mithril_ore", () -> new MithrilOreBlock());
	public static final RegistryObject<Block> MALLORN_WOOD = REGISTRY.register("mallorn_wood", () -> new MallornWoodBlock());
	public static final RegistryObject<Block> MALLORN_LOG = REGISTRY.register("mallorn_log", () -> new MallornLogBlock());
	public static final RegistryObject<Block> MALLORN_PLANKS = REGISTRY.register("mallorn_planks", () -> new MallornPlanksBlock());
	public static final RegistryObject<Block> MALLORN_LEAVES = REGISTRY.register("mallorn_leaves", () -> new MallornLeavesBlock());
	public static final RegistryObject<Block> MALLORN_STAIRS = REGISTRY.register("mallorn_stairs", () -> new MallornStairsBlock());
	public static final RegistryObject<Block> MALLORN_SLAB = REGISTRY.register("mallorn_slab", () -> new MallornSlabBlock());
	public static final RegistryObject<Block> MALLORN_FENCE = REGISTRY.register("mallorn_fence", () -> new MallornFenceBlock());
	public static final RegistryObject<Block> MALLORN_FENCE_GATE = REGISTRY.register("mallorn_fence_gate", () -> new MallornFenceGateBlock());
	public static final RegistryObject<Block> MALLORN_PRESSURE_PLATE = REGISTRY.register("mallorn_pressure_plate", () -> new MallornPressurePlateBlock());
	public static final RegistryObject<Block> MALLORN_BUTTON = REGISTRY.register("mallorn_button", () -> new MallornButtonBlock());
	public static final RegistryObject<Block> FORGER = REGISTRY.register("forger", () -> new ForgerBlock());
}
