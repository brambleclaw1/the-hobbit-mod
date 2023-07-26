
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thehobbitmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.thehobbitmod.TheHobbitModMod;

public class TheHobbitModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TheHobbitModMod.MODID);
	public static final RegistryObject<SoundEvent> DREAMING_OF_BAG_END = REGISTRY.register("dreaming_of_bag_end", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_hobbit_mod", "dreaming_of_bag_end")));
	public static final RegistryObject<SoundEvent> FEAST_OF_STARLIGHT = REGISTRY.register("feast_of_starlight", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_hobbit_mod", "feast_of_starlight")));
	public static final RegistryObject<SoundEvent> SMAUG = REGISTRY.register("smaug", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_hobbit_mod", "smaug")));
	public static final RegistryObject<SoundEvent> MISTY_MOUNTAINS = REGISTRY.register("misty_mountains", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_hobbit_mod", "misty_mountains")));
	public static final RegistryObject<SoundEvent> NAZGUL = REGISTRY.register("nazgul", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_hobbit_mod", "nazgul")));
	public static final RegistryObject<SoundEvent> NAZGUL_DEAD = REGISTRY.register("nazgul_dead", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_hobbit_mod", "nazgul_dead")));
}
