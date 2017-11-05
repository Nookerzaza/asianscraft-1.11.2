package nookerzaza.mods.asiancraft.common.util;

public enum EnumTypeSection 
{
NORMAL,
JAPANESE;

private static EnumTypeSection[] values = EnumTypeSection.values();

public static EnumTypeSection[] valuesCached()
{
    return EnumTypeSection.values;
}
}
