package net.mcreator.thehobbitmod.procedures;

import org.joml.Matrix4f;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderLevelStageEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Camera;

import javax.annotation.Nullable;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.BufferUploader;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class CustomSkySunriseProcedure {
	@SubscribeEvent
	public static void renderSky(RenderLevelStageEvent event) {
		try {
			if (event.getStage() == RenderLevelStageEvent.Stage.AFTER_SKY) {
				Minecraft minecraft = Minecraft.getInstance();
				ClientLevel clientLevel = minecraft.level;
				PoseStack poseStack = event.getPoseStack();
				Camera camera = event.getCamera();
				Entity entity = camera.getEntity();
				Vec3 cameraPos = camera.getPosition();
				Vec3 entityPos = entity.getPosition(minecraft.getPartialTick());
				RenderSystem.depthMask(false);
				RenderSystem.enableBlend();
				RenderSystem.defaultBlendFunc();
				RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
				RenderSystem.setShaderTexture(0, new ResourceLocation("minecraft", "textures/block/grass_block_side.png"));
				poseStack.pushPose();
				execute(null, clientLevel, poseStack);
				poseStack.popPose();
				RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
				RenderSystem.disableBlend();
				RenderSystem.enableCull();
				RenderSystem.enableDepthTest();
				RenderSystem.depthMask(true);
			}
		} catch (Exception e) {
		}
	}

	public static void execute(LevelAccessor world, PoseStack pose) {
		execute(null, world, pose);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, PoseStack pose) {
		if (pose == null)
			return;
		RenderSystem.enableBlend();
		RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
		{
			int _color = (int) (255 << 24 | 255 << 16 | 255 << 8 | 255);
			float _red = (_color >> 16 & 255) / 255.0F;
			float _green = (_color >> 8 & 255) / 255.0F;
			float _blue = (_color & 255) / 255.0F;
			float _alpha = (_color >>> 24) / 255.0F;
			RenderSystem.setShaderColor(_red, _green, _blue, _alpha);
		}
		RenderSystem.setShaderTexture(0, new ResourceLocation(("the_hobbit)mod" + ":textures/" + "sunrise" + ".png")));
		if (world instanceof ClientLevel _clientLevel) {
			boolean _b0 = true;
			if (_b0) {
				RenderSystem.setShader(GameRenderer::getPositionTexColorShader);
				BufferBuilder _bufferBuilder = Tesselator.getInstance().getBuilder();
				_bufferBuilder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
				pose.popPose();
				pose.pushPose();
				float _u0 = 0.0F;
				float _v0 = 0.0F;
				float _u1 = 1.0F;
				float _v1 = 1.0F;
				for (int _i = 0; _i < 6; ++_i) {
					if (_i == 0) {
						pose.mulPose(Axis.YP.rotationDegrees(180.0F));
						_u0 = 0.0F;
						_v0 = 0.0F;
						_u1 = 1.0F / 3.0F;
						_v1 = 0.5F;
					} else if (_i == 1) {
						pose.mulPose(Axis.XP.rotationDegrees(180.0F));
						_u0 = 1.0F / 3.0F;
						_v0 = 0.0F;
						_u1 = 2.0F / 3.0F;
						_v1 = 0.5F;
					} else if (_i == 2) {
						pose.mulPose(Axis.YP.rotationDegrees(-180.0F));
						pose.mulPose(Axis.XP.rotationDegrees(-90.0F));
						_u0 = 2.0F / 3.0F;
						_v0 = 0.0F;
						_u1 = 1.0F;
						_v1 = 0.5F;
					} else if (_i == 3) {
						pose.mulPose(Axis.ZP.rotationDegrees(90.0F));
						_u0 = 0.0F;
						_v0 = 0.5F;
						_u1 = 1.0F / 3.0F;
						_v1 = 1.0F;
					} else if (_i == 4) {
						pose.mulPose(Axis.ZP.rotationDegrees(90.0F));
						_u0 = 1.0F / 3.0F;
						_v0 = 0.5F;
						_u1 = 2.0F / 3.0F;
						_v1 = 1.0F;
					} else if (_i == 5) {
						pose.mulPose(Axis.ZP.rotationDegrees(90.0F));
						_u0 = 2.0F / 3.0F;
						_v0 = 0.5F;
						_u1 = 1.0F;
						_v1 = 1.0F;
					}
					Matrix4f _matrix4f = pose.last().pose();
					_bufferBuilder.vertex(_matrix4f, -100.0F, -100.0F, -100.0F).uv(_u0, _v0).color(255, 255, 255, 255).endVertex();
					_bufferBuilder.vertex(_matrix4f, -100.0F, -100.0F, 100.0F).uv(_u0, _v1).color(255, 255, 255, 255).endVertex();
					_bufferBuilder.vertex(_matrix4f, 100.0F, -100.0F, 100.0F).uv(_u1, _v1).color(255, 255, 255, 255).endVertex();
					_bufferBuilder.vertex(_matrix4f, 100.0F, -100.0F, -100.0F).uv(_u1, _v0).color(255, 255, 255, 255).endVertex();
				}
				BufferUploader.drawWithShader(_bufferBuilder.end());
				pose.popPose();
				pose.pushPose();
			}
		}
	}
}
