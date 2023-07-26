
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thehobbitmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheHobbitModModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("the_hobbit_mod", "the_hobbit_mod"),
				builder -> builder.title(Component.translatable("item_group.the_hobbit_mod.the_hobbit_mod")).icon(() -> new ItemStack(TheHobbitModModItems.THE_ONE_RING.get())).displayItems((parameters, tabData) -> {
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
				})

		);
	}
}
