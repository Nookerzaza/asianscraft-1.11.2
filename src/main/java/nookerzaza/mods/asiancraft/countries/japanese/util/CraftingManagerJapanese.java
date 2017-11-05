package nookerzaza.mods.asiancraft.countries.japanese.util;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import nookerzaza.mods.asiancraft.common.init.Asiancraftitems;

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
	}



}
