package com.mcmoddev.fantasymetals.init;

import com.mcmoddev.fantasymetals.util.Config.Options;
import com.mcmoddev.lib.data.Names;

import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.fml.common.Loader;

/** initializer for achievements */
public class Achievements extends com.mcmoddev.lib.init.Achievements {

	/** Make Enderium Blend */
	public static Achievement enderiumMaker;
	/** Make Lumium Blend */
	public static Achievement lumiumMaker;
	/** Make Prismarinium Blend */
	public static Achievement prismariniumMaker;
	/** Make Signalum Blend */
	public static Achievement signalumMaker;

	private static boolean initDone = false;

	private Achievements() {
		throw new IllegalAccessError("Not a instantiable class");
	}

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		if (com.mcmoddev.basemetals.util.Config.Options.enableAchievements()) {
			AchievementPage page = new AchievementPage(Loader.instance().activeModContainer().getModId());
			AchievementPage.registerAchievementPage(page);

			if (Options.enableEnderium) {
				enderiumMaker = makeAchievement("enderium_maker", com.mcmoddev.basemetals.init.Achievements.getAchievementByName("metallurgy"), 0, 0, Materials.getMaterialByName("enderium").getItem(Names.INGOT), page);
			}

			if (Options.enableLumium) {
				lumiumMaker = makeAchievement("lumium_maker", com.mcmoddev.basemetals.init.Achievements.getAchievementByName("metallurgy"), 0, 1, Materials.getMaterialByName("lumium").getItem(Names.INGOT), page);
			}

			if (Options.enablePrismarinium) {
				prismariniumMaker = makeAchievement("prismarinium_maker", com.mcmoddev.basemetals.init.Achievements.getAchievementByName("metallurgy"), 0, 2, Materials.getMaterialByName("prismarinium").getItem(Names.INGOT), page);
			}

			if (Options.enableSignalum) {
				signalumMaker = makeAchievement("signalum_maker", com.mcmoddev.basemetals.init.Achievements.getAchievementByName("metallurgy"), 0, 3, Materials.getMaterialByName("signalum").getItem(Names.INGOT), page);
			}
		}

		initDone = true;
	}
}
