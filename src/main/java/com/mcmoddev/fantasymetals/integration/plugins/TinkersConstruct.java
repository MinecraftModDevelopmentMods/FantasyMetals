package com.mcmoddev.fantasymetals.integration.plugins;

import com.mcmoddev.fantasymetals.FantasyMetals;
import com.mcmoddev.fantasymetals.util.Config.Options;
import com.mcmoddev.lib.integration.MMDPlugin;
import com.mcmoddev.lib.integration.IIntegration;

/**
 *
 * @author Jasmine Iwanek
 *
 */
@MMDPlugin(addonId = FantasyMetals.MODID, pluginId = TinkersConstruct.PLUGIN_MODID)
public class TinkersConstruct extends com.mcmoddev.lib.integration.plugins.TinkersConstruct implements IIntegration {

	private static boolean initDone = false;

	@Override
	public void init() {
		if (initDone || !com.mcmoddev.basemetals.util.Config.Options.enableTinkersConstruct) {
			return;
		}

		if (Options.enableEnderium) {
			registerMaterial("enderium", false, true);
		}

		if (Options.enableLumium) {
			registerMaterial("lumium", false, true);
		}

		if (Options.enablePrismarinium) {
			registerMaterial("prismarinium", false, true);
		}

		if (Options.enableSignalum) {
			registerMaterial("signalum", false, true);
		}

		if (Options.enableTeslarium) {
			registerMaterial("teslarium", false, true);
		}

		initDone = true;
	}
}
