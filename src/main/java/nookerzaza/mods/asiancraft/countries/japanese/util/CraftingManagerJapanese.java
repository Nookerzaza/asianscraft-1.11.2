package nookerzaza.mods.asiancraft.countries.japanese.util;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import nookerzaza.mods.asiancraft.common.init.Asiancraftitems;
import nookerzaza.mods.asiancraft.countries.japanese.init.JapaneseBlocks;

public class CraftingManagerJapanese 
{
	public static void initall()
	{
		initcrafting();
		initsmelting();
		initoredictionary();
	}
	
	private static void initcrafting()
	{
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.APPLE, 2, 0), new ItemStack(Items.FISH, 1, 1),"knife"));
		
		GameRegistry.addShapelessRecipe(new ItemStack(JapaneseBlocks.japanese_wooden_planks,4,0), new ItemStack(JapaneseBlocks.japanese_log,1,0));
		GameRegistry.addShapelessRecipe(new ItemStack(JapaneseBlocks.japanese_wooden_planks,4,1), new ItemStack(JapaneseBlocks.japanese_log,1,1));
		GameRegistry.addShapelessRecipe(new ItemStack(JapaneseBlocks.japanese_wooden_planks,4,2), new ItemStack(JapaneseBlocks.japanese_log,1,2));
		GameRegistry.addShapelessRecipe(new ItemStack(JapaneseBlocks.japanese_wooden_planks,4,3), new ItemStack(JapaneseBlocks.japanese_log,1,3));
	
		GameRegistry.addRecipe(new ItemStack(Asiancraftitems.stone_kinfe),new Object[]{"I "," S",Character.valueOf('I'), new ItemStack(Blocks.COBBLESTONE),Character.valueOf('S'), new ItemStack(Items.STICK)});
		GameRegistry.addRecipe(new ItemStack(Asiancraftitems.iron_kinfe),new Object[]{"I "," S",Character.valueOf('I'), new ItemStack(Items.IRON_INGOT),Character.valueOf('S'), new ItemStack(Items.STICK)});
		GameRegistry.addRecipe(new ItemStack(Asiancraftitems.golden_knife),new Object[]{"I "," S",Character.valueOf('I'), new ItemStack(Items.GOLD_INGOT),Character.valueOf('S'), new ItemStack(Items.STICK)});
		GameRegistry.addRecipe(new ItemStack(Asiancraftitems.diamond_kinfe),new Object[]{"I "," S",Character.valueOf('I'), new ItemStack(Items.DIAMOND),Character.valueOf('S'), new ItemStack(Items.STICK)});
		GameRegistry.addRecipe(new ItemStack(Asiancraftitems.emerald_knife),new Object[]{"I "," S",Character.valueOf('I'), new ItemStack(Items.EMERALD),Character.valueOf('S'), new ItemStack(Items.STICK)});
		GameRegistry.addRecipe(new ItemStack(Asiancraftitems.nether_quartz_knife),new Object[]{"I "," S",Character.valueOf('I'), new ItemStack(Items.QUARTZ),Character.valueOf('S'), new ItemStack(Items.STICK)});
		GameRegistry.addRecipe(new ItemStack(Asiancraftitems.obsidian_knife),new Object[]{"I "," S",Character.valueOf('I'), new ItemStack(Blocks.OBSIDIAN),Character.valueOf('S'), new ItemStack(Items.STICK)});
		GameRegistry.addRecipe(new ItemStack(Asiancraftitems.nether_star_knife),new Object[]{"I "," S",Character.valueOf('I'), new ItemStack(Items.NETHER_STAR),Character.valueOf('S'), new ItemStack(Items.STICK)});
	}

	private static void initsmelting()
	{
		
	}
	private static void initoredictionary()
	{
		OreDictionary.registerOre("knife", new ItemStack(Asiancraftitems.stone_kinfe, 1,OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("knife", new ItemStack(Asiancraftitems.iron_kinfe, 1,OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("knife", new ItemStack(Asiancraftitems.golden_knife, 1,OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("knife", new ItemStack(Asiancraftitems.diamond_kinfe, 1,OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("knife", new ItemStack(Asiancraftitems.emerald_knife, 1,OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("knife", new ItemStack(Asiancraftitems.nether_quartz_knife, 1,OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("knife", new ItemStack(Asiancraftitems.nether_star_knife, 1,OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("knife", new ItemStack(Asiancraftitems.obsidian_knife, 1,OreDictionary.WILDCARD_VALUE));
		
		OreDictionary.registerOre("plankWood", new ItemStack(JapaneseBlocks.japanese_wooden_planks));
	}



}
