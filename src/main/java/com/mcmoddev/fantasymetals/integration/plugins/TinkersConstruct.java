package com.mcmoddev.fantasymetals.integration.plugins;

import com.mcmoddev.fantasymetals.util.Config.Options;

import com.mcmoddev.basemetals.integration.BaseMetalsPlugin;
import com.mcmoddev.basemetals.integration.IIntegration;

/**
 *
 * @author Jasmine Iwanek
 *
 */
@BaseMetalsPlugin(TinkersConstruct.PLUGIN_MODID)
public class TinkersConstruct extends com.mcmoddev.basemetals.integration.plugins.TinkersConstruct implements IIntegration {

	private static boolean initDone = false;

	@Override
	public void init() {
		if (initDone || !com.mcmoddev.basemetals.util.Config.Options.ENABLE_TINKERS_CONSTRUCT) {
			return;
		}

		if (Options.ENABLE_ENDERIUM) {
			registerMaterial("enderium", false, true);
		}
		if (Options.ENABLE_LUMIUM) {
			registerMaterial("lumium", false, true);
		}
		if (Options.ENABLE_PRISMARINIUM) {
			registerMaterial("prismarinium", false, true);
		}
		if (Options.ENABLE_SIGNALUM) {
			registerMaterial("signalum", false, true);
		}

		initDone = true;
	}
}
