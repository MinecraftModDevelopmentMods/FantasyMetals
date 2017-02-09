package com.mcmoddev.fantasymetals.integration.plugins;

import com.mcmoddev.fantasymetals.util.Config.Options;
import com.mcmoddev.fantasymetals.integration.FantasyMetalsPlugin;
import com.mcmoddev.lib.integration.IIntegration;

/**
 *
 * @author Jasmine Iwanek
 *
 */
@FantasyMetalsPlugin(TinkersConstruct.PLUGIN_MODID)
public class TinkersConstruct extends com.mcmoddev.lib.integration.plugins.TinkersConstruct implements IIntegration {

	private static boolean initDone = false;

	@Override
	public void init() {
		if (initDone || !com.mcmoddev.basemetals.util.Config.Options.ENABLE_TINKERS_CONSTRUCT) {
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

		initDone = true;
	}
}
