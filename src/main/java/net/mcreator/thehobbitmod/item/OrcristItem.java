
package net.mcreator.thehobbitmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

public class OrcristItem extends SwordItem {
	public OrcristItem() {
		super(new Tier() {
			public int getUses() {
				return 9076;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 71f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, 0f, new Item.Properties());
	}
}
