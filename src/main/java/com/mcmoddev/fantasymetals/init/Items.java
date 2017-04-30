package com.mcmoddev.fantasymetals.init;

import com.mcmoddev.basemetals.init.ItemGroups;
import com.mcmoddev.fantasymetals.util.Config.Options;
import com.mcmoddev.lib.util.TabContainer;

/**
 * This class initializes all items in Fantasy Metals.
 *
 * @author Jasmine Iwanek
 *
 */
public class Items extends com.mcmoddev.lib.init.Items {

	private static boolean initDone = false;
	private static TabContainer myTabs = new TabContainer( ItemGroups.blocksTab, ItemGroups.itemsTab, ItemGroups.toolsTab );

	protected Items() {
		throw new IllegalAccessError("Not a instantiable class");
	}

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		Blocks.init();

		if (Options.enableEnderium) {
			createItemsFull(Materials.enderium, myTabs);
		}

		if (Options.enableLumium) {
			createItemsFull(Materials.lumium, myTabs);
		}

		if (Options.enablePrismarinium) {
			createItemsFull(Materials.prismarinium, myTabs);
		}

		if (Options.enableSignalum) {
			createItemsFull(Materials.signalum, myTabs);
		}

		if (Options.enableTeslarium) {
			createIngot(Materials.teslarium, myTabs.itemsTab);
			createNugget(Materials.teslarium, myTabs.itemsTab);
			createPowder(Materials.teslarium, myTabs.itemsTab);
			createRod(Materials.teslarium, myTabs.itemsTab);
			createSmallPowder(Materials.teslarium, myTabs.itemsTab);
		}

		// addToMetList() // May not be needed, check

		initDone = true;
	}
}
