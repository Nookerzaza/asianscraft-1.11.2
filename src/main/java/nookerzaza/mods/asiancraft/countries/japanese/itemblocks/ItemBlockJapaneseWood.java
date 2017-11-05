package nookerzaza.mods.asiancraft.countries.japanese.itemblocks;

import net.minecraft.block.Block;
import nookerzaza.mods.asiancraft.common.util.itemblock.ItemBlockAC;

public class ItemBlockJapaneseWood extends ItemBlockAC
{
    public ItemBlockJapaneseWood(Block block)
    {
        super(block);
    }

    @Override
    protected String[] getBlockVariantsName()
    {
        return new String[] {"japanese_cherry","japanese_maple","japanese_black_pine",
        		"japanese_white_lilac"};
    }
}