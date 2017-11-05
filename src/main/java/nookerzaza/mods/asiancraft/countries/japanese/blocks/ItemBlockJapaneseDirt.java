package nookerzaza.mods.asiancraft.countries.japanese.blocks;

import net.minecraft.block.Block;
import nookerzaza.mods.asiancraft.common.util.itemblock.ItemBlockAC;

public class ItemBlockJapaneseDirt extends ItemBlockAC
{
    public ItemBlockJapaneseDirt(Block block)
    {
        super(block);
    }

    @Override
    protected String[] getBlockVariantsName()
    {
        return new String[] {"dirt","coarse"};
    }
}