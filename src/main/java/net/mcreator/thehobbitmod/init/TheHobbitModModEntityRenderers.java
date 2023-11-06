
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thehobbitmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.thehobbitmod.client.renderer.OrcRenderer;
import net.mcreator.thehobbitmod.client.renderer.NazgulRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheHobbitModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TheHobbitModModEntities.ORC.get(), OrcRenderer::new);
		event.registerEntityRenderer(TheHobbitModModEntities.NAZGUL.get(), NazgulRenderer::new);
	}
}
