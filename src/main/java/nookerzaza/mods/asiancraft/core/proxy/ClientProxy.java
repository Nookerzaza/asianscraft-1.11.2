package nookerzaza.mods.asiancraft.core.proxy;

import net.minecraftforge.common.util.EnumHelper;
import nookerzaza.mods.asiancraft.common.client.gui.renderer.RenderThings;
import nookerzaza.mods.asiancraft.common.init.Asiancraftitems;
import nookerzaza.mods.asiancraft.common.util.renderer.BlockVariantsRegistry;
import net.minecraft.item.EnumRarity;
import net.minecraft.util.text.TextFormatting;

public class ClientProxy extends CommonProxy
{
	public static EnumRarity asiancraftItem = EnumHelper.addRarity("ACRarity", TextFormatting.LIGHT_PURPLE, "asiancraft");

	
	@Override
	public void registerrender() {
		RenderThings.initRenderer();
		
		BlockVariantsRegistry.registerRender();
	}
}
