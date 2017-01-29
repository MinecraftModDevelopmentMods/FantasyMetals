package com.mcmoddev.fantasymetals;

import com.mcmoddev.fantasymetals.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

/**
 * This is the entry point for this mod.
 *
 * @author Jasmine Iwanek
 *
 */
@Mod(modid = FantasyMetals.MODID, name = FantasyMetals.NAME, version = FantasyMetals.VERSION, dependencies = "required-after:Forge@[12.17.0.1976,);required-after:basemetals;before:buildingbricks", acceptedMinecraftVersions = "1.10.2,)", updateJSON = FantasyMetals.UPDATEJSON)
public class FantasyMetals {

	@Instance
	public static FantasyMetals INSTANCE;

	/** ID of this Mod */
	public static final String MODID = "fantasymetals";

	/** Display name of this Mod */
	public static final String NAME = "Fantasy Metals";

	/**
	 * Version number, in Major.Minor.Build format. The minor number is
	 * increased whenever a change is made that has the potential to break
	 * compatibility with other mods that depend on this one.
	 */
	public static final String VERSION = "0.12.0-beta1";

	public static final String UPDATEJSON = "https://raw.githubusercontent.com/MinecraftModDevelopment/FantasyMetals/master/update.json";

	@SidedProxy(clientSide = "com.mcmoddev.fantasymetals.proxy.ClientProxy", serverSide = "com.mcmoddev.fantasymetals.proxy.ServerProxy")
	public static CommonProxy PROXY;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		PROXY.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		PROXY.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		PROXY.postInit(event);
	}

	@EventHandler
	public void onRemap(FMLMissingMappingsEvent event) {
		PROXY.onRemap(event);
	}
}
