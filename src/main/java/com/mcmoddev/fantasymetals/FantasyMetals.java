package com.mcmoddev.fantasymetals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mcmoddev.fantasymetals.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLMissingMappingsEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * This is the entry point for this Mod.
 *
 * @author Jasmine Iwanek
 *
 */
@Mod(
		modid = FantasyMetals.MODID,
		name = FantasyMetals.NAME,
		version = FantasyMetals.VERSION,
		dependencies = "required-after:Forge@[12.18.3.2185,);required-after:basemetals;before:buildingbricks",
		acceptedMinecraftVersions = "[1.10.2,)",
		updateJSON = FantasyMetals.UPDATEJSON)
public class FantasyMetals {

	@Instance
	public static FantasyMetals instance;

	/** ID of this Mod */
	public static final String MODID = "fantasymetals";

	/** Display name of this Mod */
	public static final String NAME = "Fantasy Metals";

	/**
	 * Version number, in Major.Minor.Build format. The minor number is
	 * increased whenever a change is made that has the potential to break
	 * compatibility with other mods that depend on this one.
	 */
	public static final String VERSION = "2.5.0-beta1";

	public static final String UPDATEJSON = "https://raw.githubusercontent.com/MinecraftModDevelopment/FantasyMetals/master/update.json";

	private static final String PROXY_BASE = "com.mcmoddev." + MODID + ".proxy.";

	@SidedProxy(clientSide = PROXY_BASE + "ClientProxy", serverSide = PROXY_BASE + "ServerProxy")
	public static CommonProxy proxy;

	public static final Logger logger = LogManager.getFormatterLogger(FantasyMetals.MODID);

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

	@EventHandler
	public static void onRemap(FMLMissingMappingsEvent event) {
		proxy.onRemap(event);
	}
}
