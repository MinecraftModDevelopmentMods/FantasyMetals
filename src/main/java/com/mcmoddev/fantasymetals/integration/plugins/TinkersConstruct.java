package com.mcmoddev.fantasymetals.integration.plugins;

import com.mcmoddev.fantasymetals.FantasyMetals;
import com.mcmoddev.fantasymetals.init.Materials;
import com.mcmoddev.fantasymetals.util.Config.Options;
import com.mcmoddev.lib.integration.MMDPlugin;
import com.mcmoddev.lib.integration.IIntegration;

/**
 *
 * @author Jasmine Iwanek
 *
 */
@MMDPlugin(addonId = FantasyMetals.MODID, pluginId = TinkersConstruct.PLUGIN_MODID)
public class TinkersConstruct extends com.mcmoddev.lib.integration.plugins.TinkersConstructBase implements IIntegration {

	private static boolean initDone = false;

	@Override
	public void init() {
		if (initDone || !com.mcmoddev.basemetals.util.Config.Options.modEnabled("tinkersconstruct")) {
			return;
		}

		if (Options.enableEnderium) {
			registry.getMaterial("enderium", Materials.enderium).setCastable(true).settle();
		}

		if (Options.enableLumium) {
			registry.getMaterial("lumium", Materials.getMaterialByName("lumium")).setCastable(true).settle();
		}

		if (Options.enablePrismarinium) {
			registry.getMaterial("prismarinium", Materials.getMaterialByName("prismarinium")).setCastable(true).settle();
		}

		if (Options.enableSignalum) {
			registry.getMaterial("signalum", Materials.getMaterialByName("signalum")).setCastable(true).settle();
		}

		if (Options.enableTeslarium) {
			registry.getMaterial("teslarium", Materials.getMaterialByName("teslarium")).setCastable(true).settle();
		}

		initDone = true;
	}
}
