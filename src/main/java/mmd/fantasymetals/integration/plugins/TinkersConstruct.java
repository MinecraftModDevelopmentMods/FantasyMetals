package mmd.fantasymetals.integration.plugins;

import cyano.basemetals.integration.BaseMetalsPlugin;
import cyano.basemetals.integration.IIntegration;
import mmd.fantasymetals.util.Config.Options;

/**
 *
 * @author Jasmine Iwanek
 *
 */
@BaseMetalsPlugin(TinkersConstruct.PLUGIN_MODID)
public class TinkersConstruct extends cyano.basemetals.integration.plugins.TinkersConstruct implements IIntegration {

	private static boolean initDone = false;

	@Override
	public void init() {
		if (initDone || !cyano.basemetals.util.Config.Options.ENABLE_TINKERS_CONSTRUCT) {
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
