
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thehobbitmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.thehobbitmod.TheHobbitModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheHobbitModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheHobbitModMod.MODID);
	public static final RegistryObject<CreativeModeTab> THE_HOBBIT_MOD = REGISTRY.register("the_hobbit_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_hobbit_mod.the_hobbit_mod")).icon(() -> new ItemStack(TheHobbitModModItems.THE_ONE_RING.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheHobbitModModItems.MITHRIL_INGOT.get());
				tabData.accept(TheHobbitModModItems.THE_ONE_RING.get());
				tabData.accept(TheHobbitModModItems.HEATED_MITHRIL.get());
				tabData.accept(TheHobbitModModItems.RAW_MITHRIL.get());
				tabData.accept(TheHobbitModModItems.BURNING_MAGMA_SHARD.get());
				tabData.accept(TheHobbitModModBlocks.BURNING_MAGMA.get().asItem());
				tabData.accept(TheHobbitModModItems.STING.get());
				tabData.accept(TheHobbitModModItems.GLAMDRING.get());
				tabData.accept(TheHobbitModModItems.ORCRIST.get());
				tabData.accept(TheHobbitModModBlocks.MITHRIL_ORE.get().asItem());
				tabData.accept(TheHobbitModModItems.PIPE.get());
				tabData.accept(TheHobbitModModItems.MITHRIL_ARMOR_HELMET.get());
				tabData.accept(TheHobbitModModItems.MITHRIL_ARMOR_CHESTPLATE.get());
				tabData.accept(TheHobbitModModItems.MITHRIL_ARMOR_LEGGINGS.get());
				tabData.accept(TheHobbitModModItems.MITHRIL_ARMOR_BOOTS.get());
				tabData.accept(TheHobbitModModItems.ORC_SPAWN_EGG.get());
				tabData.accept(TheHobbitModModItems.MISTY_MOUNTAINS.get());
				tabData.accept(TheHobbitModModItems.NINE_RINGS.get());
				tabData.accept(TheHobbitModModItems.NAZGUL_SPAWN_EGG.get());
				tabData.accept(TheHobbitModModItems.SEVEN_RINGS.get());
				tabData.accept(TheHobbitModModItems.THREE_RINGS.get());
				tabData.accept(TheHobbitModModItems.TARNISHED_RING.get());
				tabData.accept(TheHobbitModModBlocks.MALLORN_WOOD.get().asItem());
				tabData.accept(TheHobbitModModBlocks.MALLORN_LOG.get().asItem());
				tabData.accept(TheHobbitModModBlocks.MALLORN_PLANKS.get().asItem());
				tabData.accept(TheHobbitModModBlocks.MALLORN_STAIRS.get().asItem());
				tabData.accept(TheHobbitModModBlocks.MALLORN_SLAB.get().asItem());
				tabData.accept(TheHobbitModModBlocks.MALLORN_FENCE.get().asItem());
				tabData.accept(TheHobbitModModBlocks.MALLORN_FENCE_GATE.get().asItem());
				tabData.accept(TheHobbitModModBlocks.MALLORN_BUTTON.get().asItem());
				tabData.accept(TheHobbitModModBlocks.FORGER.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(TheHobbitModModBlocks.MALLORN_PRESSURE_PLATE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(TheHobbitModModItems.MITHRIL_TOOLS_SWORD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(TheHobbitModModBlocks.MALLORN_LEAVES.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(TheHobbitModModItems.MITHRIL_TOOLS_PICKAXE.get());
			tabData.accept(TheHobbitModModItems.MITHRIL_TOOLS_AXE.get());
			tabData.accept(TheHobbitModModItems.MITHRIL_TOOLS_SHOVEL.get());
			tabData.accept(TheHobbitModModItems.MITHRIL_TOOLS_HOE.get());
		}
	}
}
