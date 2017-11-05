package nookerzaza.mods.asiancraft.common.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.common.MinecraftForge;

public class GuiAchivementbook extends GuiScreen
{
	
	public void display() 
	{
		MinecraftForge.EVENT_BUS.register(this);
	}

	

}
