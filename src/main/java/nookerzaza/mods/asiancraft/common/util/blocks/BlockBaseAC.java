package nookerzaza.mods.asiancraft.common.util.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import nookerzaza.mods.asiancraft.common.util.EnumTypeSection;
import nookerzaza.mods.asiancraft.core.AsiancraftCore;

public class BlockBaseAC extends Block
{

	public BlockBaseAC(Material materialIn) {
		super(materialIn);
	}
	
	@Override
	public CreativeTabs getCreativeTabToDisplayOn() {
	 	return AsiancraftCore.actabblock;
	}
	
	public EnumTypeSection gettypeFrom()
	{
		return EnumTypeSection.NORMAL;	
	}
	

}
