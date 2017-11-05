package nookerzaza.mods.asiancraft.common.util.tab;

import java.util.Collections;
import java.util.Comparator;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import nookerzaza.mods.asiancraft.common.util.config.ConfigManagerAC;

public class ACCreativeTab extends CreativeTabs 
{
  private ItemStack stack;
  private Comparator<ItemStack> tabSorter;
  
	public ACCreativeTab(String label,String texture) {
		super(CreativeTabs.getNextID(),label);
		if(ConfigManagerAC.enableModTabBackground == true)
		{
			this.setBackgroundImageName(texture + ".png");
		}
		
	}

	@Override
	 @SideOnly(Side.CLIENT)
	public ItemStack getTabIconItem() {
		return stack;
	}
	

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getIconItemStack()
    {
        return this.stack;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void displayAllRelevantItems(NonNullList<ItemStack> list)
    {
        super.displayAllRelevantItems(list);

        if (this.tabSorter != null)
        {
            Collections.sort(list, this.tabSorter);
        }
    }

    public void setTabSorter(Comparator<ItemStack> tabSorter)
    {
        this.tabSorter = tabSorter;
    }

    public void setDisplayItemStack(ItemStack itemStack)
    {
        this.stack = itemStack;
    }

}
