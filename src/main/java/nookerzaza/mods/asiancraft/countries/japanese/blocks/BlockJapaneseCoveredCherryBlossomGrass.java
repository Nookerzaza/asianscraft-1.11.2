package nookerzaza.mods.asiancraft.countries.japanese.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import nookerzaza.mods.asiancraft.common.util.EnumTypeSection;
import nookerzaza.mods.asiancraft.common.util.blocks.BlockBaseAC;
import nookerzaza.mods.asiancraft.core.ReferenceAC;
import nookerzaza.mods.asiancraft.countries.japanese.init.JapaneseBlocks;

public class BlockJapaneseCoveredCherryBlossomGrass extends BlockBaseAC implements IGrowable
{
	public BlockJapaneseCoveredCherryBlossomGrass(String name) {
		super(Material.GRASS);
		this.setUnlocalizedName(name);
		this.setRegistryName(ReferenceAC.MOD_ID, name);
		setHardness(0.6F);
		setSoundType(SoundType.PLANT);
	}
	
	@Override
	public EnumTypeSection gettypeFrom() {
		return EnumTypeSection.JAPANESE;
	}
	
	@Override
    public void onPlantGrow(IBlockState state, World world, BlockPos pos, BlockPos source)
    {
        if (world.getBlockState(pos).getBlock() == JapaneseBlocks.covered_jp_cherryblossom)
        {
            world.setBlockState(pos, JapaneseBlocks.japanese_dirt.getDefaultState(), 2);
        }
    }
	
	 @Override
	    public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction,IPlantable plantable) {
	    	Block block = plantable.getPlant(world, pos).getBlock();
			return block == Blocks.SAPLING || block == Blocks.RED_FLOWER  || block == Blocks.YELLOW_FLOWER ;
	    }

    @Override
    public void updateTick(World world, BlockPos pos, IBlockState state, Random rand)
    {
        if (!world.isRemote)
        {
            if (world.getLightFromNeighbors(pos.up()) < 4 && world.getBlockLightOpacity(pos.up()) > 2)
            {
                world.setBlockState(pos, JapaneseBlocks.japanese_dirt.getDefaultState());
            }
            else if (world.getLightFromNeighbors(pos.up()) >= 9)
            {
                for (int i = 0; i < 4; ++i)
                {
                    BlockPos pos1 = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);

                    if (world.getBlockState(pos1) == JapaneseBlocks.japanese_dirt.getDefaultState())
                    {
                        if (world.getLightFromNeighbors(pos1.up()) >= 4 && world.getBlockState(pos1.up()).getLightOpacity(world, pos1) <= 2)
                        {
                            world.setBlockState(pos1, this.getDefaultState());
                        }
                    }
                }
            }
        }
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(JapaneseBlocks.japanese_dirt);
    }

  
    @Override
    public boolean canGrow(World world, BlockPos pos, IBlockState state, boolean isClient)
    {
        return true;
    }

    @Override
    public boolean canUseBonemeal(World world, Random rand, BlockPos pos, IBlockState state)
    {
        return true;
    }

	@Override
	public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
		// TODO Auto-generated method stub
		
	}

   /* @Override
    public void grow(World world, Random rand, BlockPos pos, IBlockState state)
    {
        BlockPos blockpos = pos.up();

        for (int i = 0; i < 128; ++i)
        {
            BlockPos blockpos1 = blockpos;
            int j = 0;

            while (true)
            {
                if (j >= i / 16)
                {
                    if (world.isAirBlock(blockpos1))
                    {
                        IBlockState iblockstate1 = ChalosBlocks.CHEESE_TALL_GRASS.getDefaultState();

                        if (ChalosBlocks.CHEESE_TALL_GRASS.canBlockStay(world, blockpos1, iblockstate1))
                        {
                            world.setBlockState(blockpos1, iblockstate1, 3);
                        }
                    }
                    break;
                }

                blockpos1 = blockpos1.add(rand.nextInt(3) - 1, (rand.nextInt(3) - 1) * rand.nextInt(3) / 2, rand.nextInt(3) - 1);

                if (world.getBlockState(blockpos1.down()).getBlock() != ChalosBlocks.CHEESE_GRASS || world.getBlockState(blockpos1).isNormalCube())
                {
                    break;
                }
                ++j;
            }
        }
    }
*/
}
