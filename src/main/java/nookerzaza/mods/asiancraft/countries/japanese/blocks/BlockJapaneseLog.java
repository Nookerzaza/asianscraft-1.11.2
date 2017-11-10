package nookerzaza.mods.asiancraft.countries.japanese.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import nookerzaza.mods.asiancraft.common.util.BlockStateHelper;
import nookerzaza.mods.asiancraft.common.util.BlockStateHelper.EnumAxis;
import nookerzaza.mods.asiancraft.common.util.BlockStateHelper.SwitchEnumAxis;
import nookerzaza.mods.asiancraft.common.util.blocks.BlockBaseLog;
import nookerzaza.mods.asiancraft.core.ReferenceAC;

public class BlockJapaneseLog extends BlockBaseLog
{
    public static PropertyEnum VARIANT = PropertyEnum.create("variant", BlockType.class);

    public BlockJapaneseLog(String name)
    {
        super(Material.WOOD);
        this.setDefaultState(this.getDefaultState().withProperty(VARIANT, BlockType.japanese_cherry_log).withProperty(BlockStateHelper.AXIS, EnumAxis.Y));
        this.setUnlocalizedName(name);
		this.setRegistryName(ReferenceAC.MOD_ID, name);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs creativeTabs, NonNullList<ItemStack> list)
    {
        for (int i = 0; i < BlockType.valuesCached().length; ++i)
        {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        IBlockState state = this.getDefaultState().withProperty(VARIANT, BlockType.valuesCached()[meta & 3]);

        switch (meta & 12)
        {
        case 0:
            state = state.withProperty(BlockStateHelper.AXIS, EnumAxis.Y);
            break;
        case 4:
            state = state.withProperty(BlockStateHelper.AXIS, EnumAxis.X);
            break;
        case 8:
            state = state.withProperty(BlockStateHelper.AXIS, EnumAxis.Z);
            break;
        default:
            state = state.withProperty(BlockStateHelper.AXIS, EnumAxis.NONE);
        }
        return state;
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        byte b = 0;
        int i = b | ((BlockType)state.getValue(VARIANT)).ordinal();

        switch (SwitchEnumAxis.AXIS_LOOKUP[((EnumAxis)state.getValue(BlockStateHelper.AXIS)).ordinal()])
        {
        case 1:
            i |= 4;
            break;
        case 2:
            i |= 8;
            break;
        case 3:
            i |= 12;
        }
        return i;
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] { VARIANT, BlockStateHelper.AXIS });
    }

    @Override
    protected ItemStack getSilkTouchDrop(IBlockState state)
    {
        return new ItemStack(this, 1, ((BlockType)state.getValue(VARIANT)).ordinal());
    }

    @Override
    public int damageDropped(IBlockState state)
    {
        return ((BlockType)state.getValue(VARIANT)).ordinal();
    }


    public static enum BlockType implements IStringSerializable
    {
      	japanese_cherry_log,
    	japanese_maple_log,
    	japanese_black_pine_log,
    	japanese_white_lilac_log;

        private static BlockType[] values = BlockType.values();

        public static BlockType[] valuesCached()
        {
            return BlockType.values;
        }

        @Override
        public String toString()
        {
            return this.name().toLowerCase();
        }

        @Override
        public String getName()
        {
            return this.name().toLowerCase();
        }
    }
}