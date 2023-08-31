
package net.mcreator.thehobbitmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawMithrilItem extends Item {
	public RawMithrilItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
