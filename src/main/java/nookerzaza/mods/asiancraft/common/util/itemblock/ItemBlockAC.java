package nookerzaza.mods.asiancraft.common.util.itemblock;

import net.minecraft.block.Block;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import nookerzaza.mods.asiancraft.core.proxy.ClientProxy;

public abstract class ItemBlockAC extends ItemBlock
{
    public ItemBlockAC(Block block)
    {
        super(block);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int meta)
    {
        return meta;
    }
    
    @Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return ClientProxy.asiancraftItem;
	}

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        int meta = itemStack.getItemDamage();
        return meta >= this.getBlockVariantsName().length ? super.getUnlocalizedName(itemStack) + "." + this.getBlockVariantsName()[0] : super.getUnlocalizedName(itemStack) + "." + this.getBlockVariantsName()[meta];
    }

    protected abstract String[] getBlockVariantsName();
}