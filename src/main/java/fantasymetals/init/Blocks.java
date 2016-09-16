package fantasymetals.init;

import fantasymetals.FantasyMetals;
import cyano.basemetals.blocks.*;
import cyano.basemetals.material.MetalMaterial;
import cyano.basemetals.registry.IOreDictionaryEntry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockSlab;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import java.util.HashMap;
import java.util.Map;

/**
 * This class initializes all blocks in Fantasy Metals and provides some utility
 * methods for looking up blocks.
 *
 * @author DrCyano
 *
 */
public abstract class Blocks {

	public static Block template_bars;
	public static Block template_block;
	public static Block template_plate;
	public static BlockDoor template_door;
	public static Block template_ore;
	public static Block template_trapdoor;

	public static Block template_button;
	public static BlockSlab template_slab;
	public static BlockSlab double_template_slab;
	public static Block template_lever;
	public static Block template_pressure_plate;
	public static Block template_stairs;
	public static Block template_wall;

	private static boolean initDone = false;

	// private static Map<Block, String> blockRegistry = new HashMap<>();
	private static final Map<String, Block> blockRegistry = new HashMap<>();
	// private static Map<MetalMaterial, List<Block>> blocksByMetal = new HashMap<>();

	/**
	 * Gets an block by its name. The name is the name as it is registered in
	 * the GameRegistry, not its unlocalized name (the unlocalized name is the
	 * registered name plus the prefix "fantasymetals.")
	 * @param name The name of the block in question
	 * @return The block matching that name, or null if there isn't one
	 */
	public static Block getBlockByName(String name) {
		return blockRegistry.get(name);
	}

	/**
	 *
	 */
	public static void init() {
		if(initDone)
			return;

		fantasymetals.init.Materials.init();
		fantasymetals.init.ItemGroups.init();

		template_block = createBlock(Materials.template);
		template_plate = createPlate(Materials.template);
		template_ore = createOre(Materials.template);
		template_bars = createBars(Materials.template);
		template_door = createDoor(Materials.template);
		template_trapdoor = createTrapDoor(Materials.template);

		template_button = createButton(Materials.template);
		template_slab = createSlab(Materials.template);
		double_template_slab = createDoubleSlab(Materials.template);
		template_lever = createLever(Materials.template);
		template_pressure_plate = createPressurePlate(Materials.template);
		template_stairs = createStairs(Materials.template);
		template_wall = createWall(Materials.template);

		// TODO: Make this support multiple oredicts
		// final block settings
		for(final Block b : blockRegistry.values()) {
			if(b instanceof IOreDictionaryEntry)
				OreDictionary.registerOre(((IOreDictionaryEntry)b).getOreDictionaryName(), b);
			if(!(b instanceof BlockMetalDoor))
				b.setCreativeTab(ItemGroups.tab_blocks);
		}

		initDone = true;
	}

	private static Block addBlock(Block block, String name) {
		final ResourceLocation location = new ResourceLocation(FantasyMetals.MODID, name);
		block.setRegistryName(location);
		block.setUnlocalizedName(location.toString());
		GameRegistry.register(block);

		if (!(block instanceof BlockMetalDoor) && !(block instanceof BlockMetalSlab)) {
			final ItemBlock itemBlock = new ItemBlock(block);
			itemBlock.setRegistryName(location);
			itemBlock.setUnlocalizedName(location.toString());
			GameRegistry.register(itemBlock);
		}

		blockRegistry.put(name, block);
		return block;
	}

	private static Block createPlate(MetalMaterial metal) {
		return addBlock(new BlockMetalPlate(metal), metal.getName() + "_plate");
	}

	private static Block createBars(MetalMaterial metal) {
		return addBlock(new BlockMetalBars(metal), metal.getName() + "_bars");
	}

	private static Block createBlock(MetalMaterial metal) {
		return createBlock(metal, false);
	}

	private static Block createBlock(MetalMaterial metal, boolean glow) {
		return addBlock(new BlockMetalBlock(metal, glow), metal.getName() + "_block");
	}

	private static Block createButton(MetalMaterial metal) {
		return addBlock(new BlockButtonMetal(metal), metal.getName() + "_button");
	}

	private static Block createLever(MetalMaterial metal) {
		return addBlock(new BlockMetalLever(metal), metal.getName() + "_lever");
	}

	private static Block createPressurePlate(MetalMaterial metal) {
		return addBlock(new BlockMetalPressurePlate(metal), metal.getName() + "_pressure_plate");
	}

	private static BlockSlab createSlab(MetalMaterial metal) {
		return (BlockSlab)addBlock(new BlockHalfMetalSlab(metal), metal.getName() + "_slab");
	}

	private static BlockSlab createDoubleSlab(MetalMaterial metal) {
		return (BlockSlab)addBlock(new BlockDoubleMetalSlab(metal), "double_" + metal.getName() + "_slab");
	}

	private static Block createStairs(MetalMaterial metal) {
		return addBlock(new BlockMetalStairs(metal, Blocks.getBlockByName(metal.getName() + "_block")), metal.getName() + "_stairs");
	}

	private static Block createWall(MetalMaterial metal) {
		return addBlock(new BlockMetalWall(metal, Blocks.getBlockByName(metal.getName() + "_block")), metal.getName() + "_wall");
	}

	private static Block createOre(MetalMaterial metal) {
		return addBlock(new BlockMetalOre(metal), metal.getName() + "_ore");
	}

	private static BlockDoor createDoor(MetalMaterial metal) {
		return (BlockDoor)addBlock(new fantasymetals.blocks.BlockMetalDoor(metal), metal.getName() + "_door");
	}

	private static Block createTrapDoor(MetalMaterial metal) {
		return addBlock(new BlockMetalTrapDoor(metal), metal.getName() + "_trapdoor");
	}

	/**
	 * 
	 * @param event
	 */
	@SideOnly(Side.CLIENT)
	public static void registerItemRenders(FMLInitializationEvent event) {
		for(final String name : blockRegistry.keySet()) {
			if(blockRegistry.get(name) instanceof BlockDoor)
				continue; // do not add door blocks
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(net.minecraft.item.Item.getItemFromBlock(blockRegistry.get(name)), 0,
				new ModelResourceLocation(new ResourceLocation(FantasyMetals.MODID, name), "inventory"));
		}
	}

	public static Map<String, Block> getBlockRegistry() {
		return blockRegistry;
	}
}
