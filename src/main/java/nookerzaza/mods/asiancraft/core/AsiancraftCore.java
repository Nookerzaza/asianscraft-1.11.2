package nookerzaza.mods.asiancraft.core;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import nookerzaza.mods.asiancraft.common.client.gui.renderer.GuiHandler;
import nookerzaza.mods.asiancraft.common.init.Asiancraftblocks;
import nookerzaza.mods.asiancraft.common.init.Asiancraftitems;
import nookerzaza.mods.asiancraft.common.util.AsiancraftEvent;
import nookerzaza.mods.asiancraft.common.util.Util;
import nookerzaza.mods.asiancraft.common.util.config.ConfigManagerAC;
import nookerzaza.mods.asiancraft.common.util.tab.ACCreativeTab;
import nookerzaza.mods.asiancraft.core.proxy.CommonProxy;
import nookerzaza.mods.asiancraft.countries.japanese.init.JapaneseBlocks;
import nookerzaza.mods.asiancraft.countries.japanese.util.CraftingManagerJapanese;

@Mod(name=ReferenceAC.Name,modid=ReferenceAC.MOD_ID,version=ReferenceAC.VERSION, dependencies = ReferenceAC.FORGE_VERSION, guiFactory = ReferenceAC.GUIFactories)
public class AsiancraftCore 
{
	@SidedProxy(clientSide= ReferenceAC.CLIENTSIDE, serverSide = ReferenceAC.SERVERSIDE)
	public static CommonProxy proxy;
	@Instance(ReferenceAC.MOD_ID)
	public static AsiancraftCore instance;
	public static ACCreativeTab actabblock;
	public static ACCreativeTab actabitems;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigManagerAC.init(new File(event.getModConfigurationDirectory(), "Asianscraft.cfg"));
		actabblock = new ACCreativeTab("ac_tabblock", "block_ac");
		actabitems = new ACCreativeTab("ac_tabitems", "items_ac");
		Asiancraftitems.initall();
		Asiancraftblocks.initall();
		CraftingManagerJapanese.initall();
		FMLCommonHandler.instance().bus().register(new AsiancraftEvent());
		MinecraftForge.EVENT_BUS.register(new AsiancraftEvent());
		proxy.registerrender();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		actabblock.setDisplayItemStack(new ItemStack(JapaneseBlocks.covered_jp_cherryblossom));
		actabitems.setDisplayItemStack(new ItemStack(Asiancraftitems.diamond_kinfe));
		
		NetworkRegistry.INSTANCE.registerGuiHandler(this,new GuiHandler());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
	}
}
