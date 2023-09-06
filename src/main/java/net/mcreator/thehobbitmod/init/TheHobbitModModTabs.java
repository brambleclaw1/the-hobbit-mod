
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thehobbitmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.thehobbitmod.TheHobbitModMod;

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
				tabData.accept(TheHobbitModModItems.MITHRIL_PICKAXE.get());
				tabData.accept(TheHobbitModModItems.MITHRIL_SWORD.get());
				tabData.accept(TheHobbitModModItems.STING.get());
				tabData.accept(TheHobbitModModItems.GLAMDRING.get());
				tabData.accept(TheHobbitModModItems.ORCRIST.get());
				tabData.accept(TheHobbitModModBlocks.MITHRIL_ORE.get().asItem());
				tabData.accept(TheHobbitModModItems.MITHRIL_AXE.get());
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
			})

					.build());
}
