package fantasymetals.init;

import fantasymetals.FantasyMetals;
import fantasymetals.init.Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;
import cyano.basemetals.init.FunctionalCreativeTab;

/**
 * This class initializes all item groups in Fantasy Metals.
 * @author DrCyano
 *
 */
public class ItemGroups {

	public static final java.util.function.BiFunction<ItemStack, ItemStack, Integer> sortingAlgorithm = (ItemStack a,ItemStack b)->{
		int delta = Items.getSortingValue(a) - Items.getSortingValue(b);
		if(delta == 0)
			return a.getItem().getUnlocalizedName().compareToIgnoreCase(b.getItem().getUnlocalizedName());
		return delta;
	};

	public static CreativeTabs tab_blocks;
	public static CreativeTabs tab_items;
	public static CreativeTabs tab_tools;

	@SuppressWarnings("unused")
	private static Item blockItem;
	// private static Item itemItem;
	// private static Item toolItem;

	private static boolean initDone = false;

	/**
	 *
	 */
	public static void init() {
		if(initDone)
			return;

		// placeholders
		blockItem = Items.template_crackhammer;
		// itemItem = Items.template_crackhammer;
		// toolItem = Items.template_crackhammer;

		tab_blocks = new FunctionalCreativeTab(FantasyMetals.MODID.concat(".blocks"))
				.setIconMetadata(3)
				.setIcon(blockItem)
				.setItemSortingAlgorithm(sortingAlgorithm);

		tab_items = tab_blocks;
		tab_tools = tab_items;

		initDone = true;
	}
}

