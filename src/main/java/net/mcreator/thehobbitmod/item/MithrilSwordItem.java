
package net.mcreator.thehobbitmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.thehobbitmod.init.TheHobbitModModItems;

public class MithrilSwordItem extends SwordItem {
	public MithrilSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 3021;
			}

			public float getSpeed() {
				return 18f;
			}

			public float getAttackDamageBonus() {
				return 12f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheHobbitModModItems.MITHRIL_INGOT.get()));
			}
		}, 3, 1f, new Item.Properties());
	}
}
