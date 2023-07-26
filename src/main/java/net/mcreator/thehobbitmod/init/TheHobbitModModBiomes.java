
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thehobbitmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.FeatureSorter;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import java.util.List;
import java.util.ArrayList;

import com.mojang.datafixers.util.Pair;

import com.google.common.base.Suppliers;

@Mod.EventBusSubscriber
public class TheHobbitModModBiomes {
	@SubscribeEvent
	public static void onServerAboutToStart(ServerAboutToStartEvent event) {
		MinecraftServer server = event.getServer();
		Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registries.DIMENSION_TYPE);
		Registry<LevelStem> levelStemTypeRegistry = server.registryAccess().registryOrThrow(Registries.LEVEL_STEM);
		Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registries.BIOME);
		for (LevelStem levelStem : levelStemTypeRegistry.stream().toList()) {
			DimensionType dimensionType = levelStem.type().value();
			if (dimensionType == dimensionTypeRegistry.getOrThrow(BuiltinDimensionTypes.OVERWORLD)) {
				ChunkGenerator chunkGenerator = levelStem.generator();
				// Inject biomes to biome source
				if (chunkGenerator.getBiomeSource() instanceof MultiNoiseBiomeSource noiseSource) {
					List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters().values());
					parameters.add(new Pair<>(
							new Climate.ParameterPoint(Climate.Parameter.span(-0.7333333333f, 0.4666666667f), Climate.Parameter.span(-0.4f, 0.8f), Climate.Parameter.span(-0.06f, 1.14f), Climate.Parameter.span(0.3f, 1.5f),
									Climate.Parameter.point(0.0f), Climate.Parameter.span(0.0489123482f, 1.2489123482f), 0),
							biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("the_hobbit_mod", "elven_forest")))));
					parameters.add(new Pair<>(
							new Climate.ParameterPoint(Climate.Parameter.span(-0.7333333333f, 0.4666666667f), Climate.Parameter.span(-0.4f, 0.8f), Climate.Parameter.span(-0.06f, 1.14f), Climate.Parameter.span(0.3f, 1.5f),
									Climate.Parameter.point(1.0f), Climate.Parameter.span(0.0489123482f, 1.2489123482f), 0),
							biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("the_hobbit_mod", "elven_forest")))));
					parameters.add(new Pair<>(
							new Climate.ParameterPoint(Climate.Parameter.span(0.1066666667f, 1.2266666667f), Climate.Parameter.span(-1.16f, -0.04f), Climate.Parameter.span(-0.05f, 1.07f), Climate.Parameter.span(0.04f, 1.16f),
									Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.8018289305f, 0.3181710695f), 0),
							biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("the_hobbit_mod", "dragon_burned_field")))));
					parameters.add(new Pair<>(
							new Climate.ParameterPoint(Climate.Parameter.span(0.1066666667f, 1.2266666667f), Climate.Parameter.span(-1.16f, -0.04f), Climate.Parameter.span(-0.05f, 1.07f), Climate.Parameter.span(0.04f, 1.16f),
									Climate.Parameter.point(1.0f), Climate.Parameter.span(-0.8018289305f, 0.3181710695f), 0),
							biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("the_hobbit_mod", "dragon_burned_field")))));
					chunkGenerator.biomeSource = MultiNoiseBiomeSource.createFromList(new Climate.ParameterList<>(parameters));
					chunkGenerator.featuresPerStep = Suppliers
							.memoize(() -> FeatureSorter.buildFeaturesPerStep(List.copyOf(chunkGenerator.biomeSource.possibleBiomes()), biome -> chunkGenerator.generationSettingsGetter.apply(biome).features(), true));
				}
				// Inject surface rules
				if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
					NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
					SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
					if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
						List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(sequenceRuleSource.sequence());
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("the_hobbit_mod", "elven_forest")), Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState(),
								Blocks.DIRT.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("the_hobbit_mod", "dragon_burned_field")), Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.STONE.defaultBlockState(),
								Blocks.STONE.defaultBlockState()));
						NoiseGeneratorSettings moddedNoiseGeneratorSettings = new NoiseGeneratorSettings(noiseGeneratorSettings.noiseSettings(), noiseGeneratorSettings.defaultBlock(), noiseGeneratorSettings.defaultFluid(),
								noiseGeneratorSettings.noiseRouter(), SurfaceRules.sequence(surfaceRules.toArray(SurfaceRules.RuleSource[]::new)), noiseGeneratorSettings.spawnTarget(), noiseGeneratorSettings.seaLevel(),
								noiseGeneratorSettings.disableMobGeneration(), noiseGeneratorSettings.aquifersEnabled(), noiseGeneratorSettings.oreVeinsEnabled(), noiseGeneratorSettings.useLegacyRandomSource());
						noiseGenerator.settings = new Holder.Direct<>(moddedNoiseGeneratorSettings);
					}
				}
			}
		}
	}

	private static SurfaceRules.RuleSource preliminarySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock, BlockState underwaterBlock) {
		return SurfaceRules.ifTrue(SurfaceRules.isBiome(biomeKey),
				SurfaceRules.ifTrue(SurfaceRules.abovePreliminarySurface(),
						SurfaceRules.sequence(
								SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
										SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock))),
								SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), SurfaceRules.state(undergroundBlock)))));
	}
}
