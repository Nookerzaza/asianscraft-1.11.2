package nookerzaza.mods.asiancraft.common.util.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import nookerzaza.mods.asiancraft.core.AsiancraftCore;
import nookerzaza.mods.asiancraft.core.proxy.ClientProxy;

public class ItemBaseAC extends Item
{
 public ItemBaseAC(String name)
 {
	 this.setUnlocalizedName(name);
 }
 
	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return ClientProxy.asiancraftItem;
	}
	
	 @Override
		public CreativeTabs getCreativeTab() {
			return AsiancraftCore.actabitems;
		}
	
}
