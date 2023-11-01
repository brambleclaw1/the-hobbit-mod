
package net.mcreator.thehobbitmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.thehobbitmod.init.TheHobbitModModItems;

public class Mithril_ToolsPickaxeItem extends PickaxeItem {
	public Mithril_ToolsPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 5419;
			}

			public float getSpeed() {
				return 22f;
			}

			public float getAttackDamageBonus() {
				return 16f;
			}

			public int getLevel() {
				return 18;
			}

			public int getEnchantmentValue() {
				return 126;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheHobbitModModItems.MITHRIL_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
