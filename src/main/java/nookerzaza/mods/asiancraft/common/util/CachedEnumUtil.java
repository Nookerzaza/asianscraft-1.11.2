package nookerzaza.mods.asiancraft.common.util;

import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.EnumFacing.Axis;
import net.minecraft.util.EnumHand;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class CachedEnumUtil
{
    private static EnumHand[] handValues = EnumHand.values();
    private static EnumDyeColor[] dyeColorValues = EnumDyeColor.values();
    private static BiomeType[] biomeValues = BiomeType.values();
    private static Axis[] axisValues = Axis.values();

    public static EnumHand[] valuesHandCached()
    {
        return CachedEnumUtil.handValues;
    }

    public static EnumDyeColor[] valuesDyeCached()
    {
        return CachedEnumUtil.dyeColorValues;
    }

    public static BiomeType[] valuesBiomeCached()
    {
        return CachedEnumUtil.biomeValues;
    }

    public static Axis[] valuesAxisCached()
    {
        return CachedEnumUtil.axisValues;
    }
}