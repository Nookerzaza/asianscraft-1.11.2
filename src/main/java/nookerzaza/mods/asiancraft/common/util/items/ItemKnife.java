package nookerzaza.mods.asiancraft.common.util.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.translation.I18n;

public class ItemKnife extends ItemBaseAC 
{
	public ItemKnife(String name, int dubrality) {
		super(name);
		this.setMaxDamage(dubrality);
		setNoRepair();
		this.setRegistryName(name);
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){
		if (par2EntityPlayer.world.isRemote){
				par3List.add(TextFormatting.RED.UNDERLINE +I18n.translateToLocal("*2 Durability"));
			}
		}

}
