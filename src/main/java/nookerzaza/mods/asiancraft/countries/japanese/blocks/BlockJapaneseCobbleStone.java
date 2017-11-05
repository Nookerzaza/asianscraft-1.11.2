package nookerzaza.mods.asiancraft.countries.japanese.blocks;

import net.minecraft.block.material.Material;
import nookerzaza.mods.asiancraft.common.util.EnumTypeSection;
import nookerzaza.mods.asiancraft.common.util.blocks.BlockBaseAC;
import nookerzaza.mods.asiancraft.core.ReferenceAC;

public class BlockJapaneseCobbleStone extends BlockBaseAC
{
	public BlockJapaneseCobbleStone(String name) {
		super(Material.ROCK);
		this.setUnlocalizedName(name);
		this.setRegistryName(ReferenceAC.MOD_ID, name);
		setHardness(1.5F);
		setResistance(1.0F);
	}
	
	@Override
	public EnumTypeSection gettypeFrom() {
		return EnumTypeSection.JAPANESE;
	}

}
