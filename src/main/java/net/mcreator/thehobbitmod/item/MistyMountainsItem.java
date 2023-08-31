
package net.mcreator.thehobbitmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MistyMountainsItem extends RecordItem {
	public MistyMountainsItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_hobbit_mod:misty_mountains")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3600);
	}
}
