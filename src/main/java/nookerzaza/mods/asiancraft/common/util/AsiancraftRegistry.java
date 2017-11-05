package nookerzaza.mods.asiancraft.common.util;

import com.ibm.icu.impl.duration.impl.Utils;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import nookerzaza.mods.asiancraft.core.ReferenceAC;

public class AsiancraftRegistry {
	public static void registerRender(Item items) 
	{
		ModelLoader.setCustomModelResourceLocation(items, 0, new ModelResourceLocation(new ResourceLocation(ReferenceAC.MOD_ID, items.getUnlocalizedName().substring(5)), "inventory"));
		Util.getLoger().info("Register render for " + items.getUnlocalizedName().substring(5));
	}

	public static void registerRenderAsMetadata(Item items, int metadata) 
	{
		ModelLoader.setCustomModelResourceLocation(items, metadata, new ModelResourceLocation(new ResourceLocation(ReferenceAC.MOD_ID, items.getUnlocalizedName().substring(5)), "inventory"));
		Util.getLoger().info("Register render for " + items.getUnlocalizedName().substring(5) + " With metadata " + metadata);
	}
	
	public static void registerRender(Block block) 
	{
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(ReferenceAC.MOD_ID, block.getUnlocalizedName().substring(5)), "inventory"));
		Util.getLoger().info("Register render for " + block.getUnlocalizedName().substring(5));
	}

	public static void registerRenderAsMetadata(Block block, int metadata) 
	{
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), metadata, new ModelResourceLocation(new ResourceLocation(ReferenceAC.MOD_ID, block.getUnlocalizedName().substring(5)), "inventory"));
		Util.getLoger().info("Register render for " + block.getUnlocalizedName().substring(5) + " With metadata " + metadata);
	}
	
	public static void registeritems(Item items)
	{
		GameRegistry.register(items);
		Util.getLoger().info("register item " + items.getUnlocalizedName().substring(5));
	}
	
	public static void registerblocks(Block block)
	{
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlockBaseAC(block).setRegistryName(block.getRegistryName()));
		Util.getLoger().info("register block " + block.getUnlocalizedName().substring(5));
	}
	public static void registerblocks(Block block,ItemBlock itemclass)
	{
		GameRegistry.register(block);
		GameRegistry.register(itemclass.setRegistryName(block.getRegistryName()));
		Util.getLoger().info("register block " + block.getUnlocalizedName().substring(5));
	}
	
	 public static void registerVariantName(Item item, String[] variant)
	 {
		 for (String name : variant)
	        {
	            ModelBakery.registerItemVariants(item, new ModelResourceLocation("asianscraft:" + name, "inventory"));
	        }
	 }
	
	 public static void registerVariantName(Block block, String[] variant)
	 {
		 for (String name : variant)
	        {
	            ModelBakery.registerItemVariants(Item.getItemFromBlock(block), new ModelResourceLocation("asianscraft:" + name, "inventory"));
	        }
	 }
}
