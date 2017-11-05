package nookerzaza.mods.asiancraft.common.client.gui.renderer;

import nookerzaza.mods.asiancraft.common.init.Asiancraftitems;
import nookerzaza.mods.asiancraft.countries.japanese.init.JapaneseBlocks;

public class RenderThings 
{
	
	public static void initRenderer()
	{
		//block
		JapaneseBlocks.registerrenderer();
		
		//items
		Asiancraftitems.registerrenderer();
	}

}
