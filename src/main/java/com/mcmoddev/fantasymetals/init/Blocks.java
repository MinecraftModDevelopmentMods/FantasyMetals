package com.mcmoddev.fantasymetals.init;

import com.mcmoddev.basemetals.init.ItemGroups;
import com.mcmoddev.fantasymetals.util.Config.Options;
import com.mcmoddev.lib.util.TabContainer;

/**
 * This class initializes all blocks in Fantasy Metals.
 *
 * @author Jasmine Iwanek
 *
 */
public class Blocks extends com.mcmoddev.lib.init.Blocks {

	private static boolean initDone = false;
	private static TabContainer myTabs = new TabContainer( ItemGroups.blocksTab, ItemGroups.itemsTab, ItemGroups.toolsTab );

	protected Blocks() {
		throw new IllegalAccessError("Not a instantiable class");
	}

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		Materials.init();
		ItemGroups.init();

		if (Options.enableEnderium) {
			createBlocksFull(Materials.enderium, myTabs);
		}

		if (Options.enableLumium) {
			createBlocksFull(Materials.lumium, myTabs);
		}

		if (Options.enablePrismarinium) {
			createBlocksFull(Materials.prismarinium, myTabs);
		}

		if (Options.enableSignalum) {
			createBlocksFull(Materials.signalum, myTabs);
		}

		if (Options.enableTeslarium) {
			createBlocksFull(Materials.teslarium, myTabs);
		}

		initDone = true;
	}
}
