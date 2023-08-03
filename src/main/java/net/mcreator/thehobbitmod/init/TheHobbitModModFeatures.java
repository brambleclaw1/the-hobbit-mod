
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thehobbitmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.thehobbitmod.world.features.ores.MithrilOreFeature;
import net.mcreator.thehobbitmod.world.features.ores.BurningMagmaFeature;
import net.mcreator.thehobbitmod.world.features.OrcTunnelFeature;
import net.mcreator.thehobbitmod.world.features.HobbitHoleFeature;
import net.mcreator.thehobbitmod.world.features.ElvenVillageFeature;
import net.mcreator.thehobbitmod.world.features.DolGuldurFeature;
import net.mcreator.thehobbitmod.world.features.AbandonedDwarfMineFeature;
import net.mcreator.thehobbitmod.TheHobbitModMod;

@Mod.EventBusSubscriber
public class TheHobbitModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TheHobbitModMod.MODID);
	public static final RegistryObject<Feature<?>> BURNING_MAGMA = REGISTRY.register("burning_magma", BurningMagmaFeature::new);
	public static final RegistryObject<Feature<?>> HOBBIT_HOLE = REGISTRY.register("hobbit_hole", HobbitHoleFeature::new);
	public static final RegistryObject<Feature<?>> ORC_TUNNEL = REGISTRY.register("orc_tunnel", OrcTunnelFeature::new);
	public static final RegistryObject<Feature<?>> MITHRIL_ORE = REGISTRY.register("mithril_ore", MithrilOreFeature::new);
	public static final RegistryObject<Feature<?>> ABANDONED_DWARF_MINE = REGISTRY.register("abandoned_dwarf_mine", AbandonedDwarfMineFeature::new);
	public static final RegistryObject<Feature<?>> ELVEN_VILLAGE = REGISTRY.register("elven_village", ElvenVillageFeature::new);
	public static final RegistryObject<Feature<?>> DOL_GULDUR = REGISTRY.register("dol_guldur", DolGuldurFeature::new);
}
