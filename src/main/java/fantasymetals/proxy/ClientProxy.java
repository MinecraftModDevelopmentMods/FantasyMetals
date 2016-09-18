package fantasymetals.proxy;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import cyano.basemetals.entity.EntityCustomArrow;
import cyano.basemetals.client.renderer.RenderCustomArrow;
import fantasymetals.FantasyMetals;
import fantasymetals.init.Blocks;
import fantasymetals.init.Fluids;
import fantasymetals.init.Items;

/**
 *
 * @author Jasmine Iwanek
 *
 */
public class ClientProxy extends CommonProxy {

	@Override
	public void preInit () {
		Fluids.bakeModels(FantasyMetals.MODID);
		RenderingRegistry.registerEntityRenderingHandler(EntityCustomArrow.class, RenderCustomArrow::new);
	}

	@Override
	public void init () {
		ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
		for (Item item : Items.getItemRegistry().keySet()) {
			itemModelMesher.register(item, 0, new ModelResourceLocation(new ResourceLocation(FantasyMetals.MODID, Items.getItemRegistry().get(item)), "inventory"));
		}

		for (String blockName : Blocks.getBlockRegistry().keySet()) {
			Block block = Blocks.getBlockByName(blockName);
			if (block instanceof BlockDoor)
				continue; // do not add door blocks
			itemModelMesher.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(FantasyMetals.MODID, blockName), "inventory"));
		}
	}
}
