package com.mcmoddev.fantasymetals.util;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

import com.mcmoddev.fantasymetals.FantasyMetals;
import com.mcmoddev.fantasymetals.data.AdditionalLootTables;
import com.mcmoddev.fantasymetals.data.DataConstants;
import com.mcmoddev.lib.registry.CrusherRecipeRegistry;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.MissingModsException;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.versioning.ArtifactVersion;
import net.minecraftforge.fml.common.versioning.DefaultArtifactVersion;

/**
 * @author Jasmine Iwanek
 *
 */
public class Config {

	private static Configuration configuration;
	private static final String CONFIG_FILE = "config/FantasyMetals.cfg";
	private static final String MATERIALS_CAT = "Metals";
	private static final String ALT_CFG_PATH = "config/additional-loot-tables";
	private static final String ORESPAWN_CFG_PATH = "config/orespawn";

	@SubscribeEvent
	public void onConfigChange(ConfigChangedEvent.OnConfigChangedEvent e) {
		if (e.getModID().equals(FantasyMetals.MODID)) {
			init();
		}
	}

	public static void init() {
		if (configuration == null) {
			configuration = new Configuration(new File(CONFIG_FILE));
			MinecraftForge.EVENT_BUS.register(new Config());
		}

		// METALS
		Options.enableEnderium = configuration.getBoolean("EnableAluminum", MATERIALS_CAT, true,
				"Enable Aluminum Items and Materials");
		Options.enableLumium = configuration.getBoolean("EnableAntimony", MATERIALS_CAT, true,
				"Enable Antimony Items and Materials");
		Options.enablePrismarinium = configuration.getBoolean("EnableAquarium", MATERIALS_CAT, true,
				"Enable Aquarium Items and Materials");
		Options.enableSignalum = configuration.getBoolean("EnableBismuth", MATERIALS_CAT, true,
				"Enable Bismuth Items and Materials");

		if (configuration.hasChanged()) {
			configuration.save();
		}

		if (com.mcmoddev.basemetals.util.Config.Options.requireMMDOreSpawn()) {
			if (!Loader.isModLoaded("orespawn")) {
				final HashSet<ArtifactVersion> orespawnMod = new HashSet<>();
				orespawnMod.add(new DefaultArtifactVersion("1.1.0"));
				throw new MissingModsException(orespawnMod, "orespawn", "MMD Ore Spawn Mod");
			}
			final Path oreSpawnFile = Paths.get(ORESPAWN_CFG_PATH, FantasyMetals.MODID + ".json");
			if (!(oreSpawnFile.toFile().exists())) {
				try {
					Files.createDirectories(oreSpawnFile.getParent());
					Files.write(oreSpawnFile, Arrays.asList(DataConstants.DEFAULT_ORESPAWN_JSON.split("\n")),
							Charset.forName("UTF-8"));
				} catch (final IOException ex) {
					FantasyMetals.logger.error("Failed to write file " + oreSpawnFile, ex);
				}
			}
		}

		final Path myLootFolder = Paths.get(ALT_CFG_PATH, FantasyMetals.MODID);
		if (!(myLootFolder.toFile().exists())) {
			try {
				final String chests = "chests";
				Files.createDirectories(myLootFolder.resolve(chests));
				Files.write(myLootFolder.resolve(chests).resolve("abandoned_mineshaft.json"),
						Collections.singletonList(AdditionalLootTables.ABANDONED_MINESHAFT));
				Files.write(myLootFolder.resolve(chests).resolve("desert_pyramid.json"),
						Collections.singletonList(AdditionalLootTables.DESERT_PYRAMID));
				Files.write(myLootFolder.resolve(chests).resolve("end_city_treasure.json"),
						Collections.singletonList(AdditionalLootTables.END_CITY_TREASURE));
				Files.write(myLootFolder.resolve(chests).resolve("jungle_temple.json"),
						Collections.singletonList(AdditionalLootTables.JUNGLE_TEMPLE));
				Files.write(myLootFolder.resolve(chests).resolve("nether_bridge.json"),
						Collections.singletonList(AdditionalLootTables.NETHER_BRIDGE));
				Files.write(myLootFolder.resolve(chests).resolve("simple_dungeon.json"),
						Collections.singletonList(AdditionalLootTables.SIMPLE_DUNGEON));
				Files.write(myLootFolder.resolve(chests).resolve("spawn_bonus_chest.json"),
						Collections.singletonList(AdditionalLootTables.SPAWN_BONUS_CHEST));
				Files.write(myLootFolder.resolve(chests).resolve("stronghold_corridor.json"),
						Collections.singletonList(AdditionalLootTables.STRONGHOLD_CORRIDOR));
				Files.write(myLootFolder.resolve(chests).resolve("stronghold_crossing.json"),
						Collections.singletonList(AdditionalLootTables.STRONGHOLD_CROSSING));
				Files.write(myLootFolder.resolve(chests).resolve("village_blacksmith.json"),
						Collections.singletonList(AdditionalLootTables.VILLAGE_BLACKSMITH));
			} catch (final IOException ex) {
				FantasyMetals.logger.error("Failed to extract additional loot tables", ex);
			}
		}
	}

	public static class Options {

		// MATERIALS
		public static boolean enableAdamantine = true;
		public static boolean enableAquarium = true;
		public static boolean enableColdIron = true;
		public static boolean enableEnderium = true;
		public static boolean enableLumium = true;
		public static boolean enableMithril = true;
		public static boolean enablePrismarinium = true;
		public static boolean enableSignalum = true;
		public static boolean enableStarSteel = true;
		public static boolean enableTeslarium = true;

		// VANILLA
		public static boolean enableRedstone = true;

		private Options() {
			throw new IllegalAccessError("Not a instantiable class");
		}
	}

	public static void postInit() {
		CrusherRecipeRegistry.getInstance().clearCache();
	}
}
