package nookerzaza.mods.asiancraft.common.util;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import nookerzaza.mods.asiancraft.common.init.Asiancraftitems;

public class AsiancraftEvent 
{
	
	@SubscribeEvent
	public void onCrafting(ItemCraftedEvent event){
		
		final IInventory craftMatrix = null;
		for(int i = 0; i < event.craftMatrix.getSizeInventory(); i++){
			if(event.craftMatrix.getStackInSlot(i) != null){
				
				ItemStack item1 = event.craftMatrix.getStackInSlot(i);
				if(item1 != null && item1.getItem() == Asiancraftitems.stone_kinfe){
					ItemStack k = new ItemStack(Asiancraftitems.stone_kinfe, 2,(item1.getItemDamage() + 1));
					
					if(k.getItemDamage() >= k.getMaxDamage()){
						k.isStackable();
						
					}
				event.craftMatrix.setInventorySlotContents(i, k);
				}
			}
		}
	}

}
