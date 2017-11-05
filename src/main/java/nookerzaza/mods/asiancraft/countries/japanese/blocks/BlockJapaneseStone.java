package nookerzaza.mods.asiancraft.countries.japanese.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import nookerzaza.mods.asiancraft.common.util.EnumTypeSection;
import nookerzaza.mods.asiancraft.common.util.blocks.BlockBaseAC;
import nookerzaza.mods.asiancraft.core.ReferenceAC;
import nookerzaza.mods.asiancraft.countries.japanese.init.JapaneseBlocks;

public class BlockJapaneseStone extends BlockBaseAC
{
	public BlockJapaneseStone(String name) {
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
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(JapaneseBlocks.japanese_cobblestone);
	}

}
