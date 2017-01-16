package com.mcmoddev.fantasymetals.init;

import cyano.basemetals.util.Config.Options;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.fml.common.Loader;

/** initializer for achievements */
public class Achievements extends cyano.basemetals.init.Achievements {

	public static Achievement enderium_maker; // make blend
	public static Achievement lumium_maker; // make blend
	public static Achievement prismarinium_maker; // make blend
	public static Achievement signalum_maker; // make blend

	private static boolean initDone = false;

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		if (Options.ENABLE_ACHIEVEMENTS) {
			AchievementPage page = new AchievementPage(Loader.instance().activeModContainer().getModId());
			AchievementPage.registerAchievementPage(page);

			enderium_maker = makeAchievement("enderium_maker", metallurgy, 0, 0, Materials.enderium.ingot, page);
			lumium_maker = makeAchievement("lumium_maker", metallurgy, 0, 0, Materials.lumium.ingot, page);
			prismarinium_maker = makeAchievement("prismarinium_maker", metallurgy, 0, 0, Materials.prismarinium.ingot, page);
			signalum_maker = makeAchievement("signalum_maker", metallurgy, 0, 0, Materials.signalum.ingot, page);
		}

		initDone = true;
	}
}
