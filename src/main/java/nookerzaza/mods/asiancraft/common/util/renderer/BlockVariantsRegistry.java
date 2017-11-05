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
		AsiancraftRegistry.registerVariantName(JapaneseBlocks.japanese_dirt, new String[]{"asiancraft:japanese_dirt","asiancraft:japanese_coarse_dirt"});
	}

}
