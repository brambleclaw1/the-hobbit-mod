
package net.mcreator.thehobbitmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

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
		}, 3, -2.6f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
