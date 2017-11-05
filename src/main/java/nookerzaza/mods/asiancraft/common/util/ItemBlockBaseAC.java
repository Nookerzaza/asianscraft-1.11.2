package nookerzaza.mods.asiancraft.common.util;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import nookerzaza.mods.asiancraft.core.proxy.ClientProxy;

public class ItemBlockBaseAC extends ItemBlock {

	public ItemBlockBaseAC(Block block) {
		super(block);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return ClientProxy.asiancraftItem;
	}
	
	/*@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		if (playerIn.world.isRemote){
			switch (EnumTypeSection.valuesCached().toString()){
			case NORMAL:
				tooltip.add(TextFormatting.BLUE + I18n.translateToLocal("oridinaly"));
				break;
			case "JAPANESE":
				tooltip.add(TextFormatting.BLUE + I18n.translateToLocal("japanese"));
			break;	
			
		}

	}
	}*/
}


