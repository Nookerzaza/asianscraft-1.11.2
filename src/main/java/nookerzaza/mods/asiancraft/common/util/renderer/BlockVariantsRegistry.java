package nookerzaza.mods.asiancraft.common.util.renderer;

import nookerzaza.mods.asiancraft.common.util.AsiancraftRegistry;
import nookerzaza.mods.asiancraft.countries.japanese.init.JapaneseBlocks;

public class BlockVariantsRegistry 
{
	public static void registerRender()
	{
		registerRenderJapanese();
	}
	
	private static void registerRenderJapanese()
	{
		AsiancraftRegistry.registerVariantName(JapaneseBlocks.japanese_dirt, new String[]{"japanese_dirt","japanese_coarse_dirt"});
		AsiancraftRegistry.registerVariantName(JapaneseBlocks.japanese_wooden_planks, new String[]{"japanese_cherry_planks","japanese_maple_planks","japanese_black_pine_planks","japanese_white_lilac_planks"});
	}

}
