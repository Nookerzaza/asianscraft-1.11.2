package nookerzaza.mods.asiancraft.common.init;

import net.minecraft.item.Item;
import nookerzaza.mods.asiancraft.common.items.ItemAchivementbook;
import nookerzaza.mods.asiancraft.common.util.AsiancraftRegistry;
import nookerzaza.mods.asiancraft.common.util.items.ItemKnife;

public class Asiancraftitems 
{
	
	public static Item achivement_book_ac;
	
	public static Item stone_kinfe;
	public static Item iron_kinfe;
	public static Item diamond_kinfe;
	public static Item nether_quartz_knife;
	public static Item emerald_knife;
	public static Item obsidian_knife;
    public static Item nether_star_knife;
    public static Item golden_knife;
	
	public static void initall()
	{
		inititems();
		register();
	}
	
	public static void inititems()
	{
		//achivement_book_ac = new ItemAchivementbook("achivement_book_ac");
		stone_kinfe = new ItemKnife("stone_kinfe", 131);
		iron_kinfe= new ItemKnife("iron_kinfe", 250);
		diamond_kinfe= new ItemKnife("diamond_kinfe", 1561);
		nether_quartz_knife= new ItemKnife("nether_quartz_knife", 1684);
		emerald_knife= new ItemKnife("emerald_knife", 1704);
		obsidian_knife= new ItemKnife("obsidian_knife", 1798);
	    nether_star_knife= new ItemKnife("nether_star_knife", 10458);
	    golden_knife= new ItemKnife("golden_knife", 32);
	}
	
	public static void register()
	{
		//AsiancraftRegistry.registeritems(achivement_book_ac);
		AsiancraftRegistry.registeritems(stone_kinfe);
		AsiancraftRegistry.registeritems(iron_kinfe);
		AsiancraftRegistry.registeritems(diamond_kinfe);
		AsiancraftRegistry.registeritems(nether_quartz_knife);
		AsiancraftRegistry.registeritems(emerald_knife);
		AsiancraftRegistry.registeritems(obsidian_knife);
		AsiancraftRegistry.registeritems(nether_star_knife);
		AsiancraftRegistry.registeritems(golden_knife);
	}
	
	public static void registerrenderer()
	{
		//AsiancraftRegistry.registerRender(achivement_book_ac);
		AsiancraftRegistry.registerRender(stone_kinfe);
		AsiancraftRegistry.registerRender(iron_kinfe);
		AsiancraftRegistry.registerRender(diamond_kinfe);
		AsiancraftRegistry.registerRender(nether_quartz_knife);
		AsiancraftRegistry.registerRender(emerald_knife);
		AsiancraftRegistry.registerRender(obsidian_knife);
		AsiancraftRegistry.registerRender(nether_star_knife);
		AsiancraftRegistry.registerRender(golden_knife);
	}
}
