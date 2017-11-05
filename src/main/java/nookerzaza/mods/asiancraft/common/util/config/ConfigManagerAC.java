package nookerzaza.mods.asiancraft.common.util.config;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.config.IConfigElement;
import nookerzaza.mods.asiancraft.common.util.Util;

public class ConfigManagerAC
{
    private static Configuration config;
    public static String GENERAL = "configacgen";
    public static String COUNTRIES = "configaccoutries";
    public static String BIOMES = "configacbiomes";
    public static String GUI = "configacgui";

    // General
    public static boolean enableModTabBackground;

    // Countries
    public static int idDimensionDiona;
    public static int idDimensionChalos;
    public static int idDimensionNibiru;
    public static int idDimensionFronos;

    // Biomes
    public static int idBiomeDiona;
    public static int idBiomeChalosPlains;

    //GUI
    public static int idBaseRocketSchematic;


    public static void init(File file)
    {
        ConfigManagerAC.config = new Configuration(file);
        ConfigManagerAC.syncConfig(true);
    }

    public static void syncConfig(boolean load)
    {
        try
        {
            if (!ConfigManagerAC.config.isChild)
            {
                if (load)
                {
                    ConfigManagerAC.config.load();
                }
            }

            ConfigManagerAC.config.setCategoryPropertyOrder(ConfigManagerAC.GENERAL, ConfigManagerAC.addGeneralConfig());
            ConfigManagerAC.config.setCategoryPropertyOrder(ConfigManagerAC.COUNTRIES, ConfigManagerAC.addDimensionIDConfig());
            ConfigManagerAC.config.setCategoryPropertyOrder(ConfigManagerAC.BIOMES, ConfigManagerAC.addBiomeIDConfig());
            ConfigManagerAC.config.setCategoryPropertyOrder(ConfigManagerAC.GUI, ConfigManagerAC.addOtherConfig());

            if (ConfigManagerAC.config.hasChanged())
            {
                ConfigManagerAC.config.save();
            }
        }
        catch (Exception e)
        {
        	Util.getLoger().error("Asians Craft have a problem loading configuration");
        }
    }

    private static ArrayList<String> addGeneralConfig()
    {
        ArrayList<String> propOrder = Lists.newArrayList();
        Property prop;
        prop = ConfigManagerAC.config.get(ConfigManagerAC.GENERAL, "Enable ModTab", true);
        ConfigManagerAC.enableModTabBackground = prop.getBoolean();
        propOrder.add(prop.getName());

       /* prop = ConfigManagerAC.config.get(ConfigManagerAC.GENERAL, "Enable Started Planet", false);
        ConfigManagerAC.enableStartedPlanet = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.GENERAL, "Enable Night Vision Effect while boss fight", false);
        ConfigManagerAC.enableNightVisionEffect = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.GENERAL, "Enable Black Hole Explosion", true);
        ConfigManagerAC.enableBlackHoleExplosion = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.GENERAL, "Use 3D Item Model for Torch", true);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.use3DTorchItemModel = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.GENERAL, "Enable Debug Logging", false);
        ConfigManagerAC.enableDebug = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.GENERAL, "Enable Version Checker", true);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.enableVersionChecker = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.GENERAL, "Enable Change Log in Game", true);
        ConfigManagerAC.enableChangeLogInGame = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.GENERAL, "Network Handler ID", 2542);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idNetworkHandler = prop.getInt();
        propOrder.add(prop.getName());*/
        return propOrder;
    }

    private static ArrayList<String> addDimensionIDConfig()
    {
        ArrayList<String> propOrder = Lists.newArrayList();
        Property prop;
        /*prop = ConfigManagerAC.config.get(ConfigManagerAC.COUNTRIES, "Diona Dimension ID", -2542);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idDimensionDiona = prop.getInt();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.COUNTRIES, "Chalos Dimension ID", -2543);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idDimensionChalos = prop.getInt();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.COUNTRIES, "Nibiru Dimension ID", -2544);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idDimensionNibiru = prop.getInt();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.COUNTRIES, "Fronos Dimension ID", -2545);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idDimensionFronos = prop.getInt();
        propOrder.add(prop.getName());*/
        return propOrder;
    }

    private static ArrayList<String> addBiomeIDConfig()
    {
        ArrayList<String> propOrder = Lists.newArrayList();
        Property prop;
       /* prop = ConfigManagerAC.config.get(ConfigManagerAC.BIOMES, "Diona Biome ID", 180);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idBiomeDiona = prop.getInt();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.BIOMES, "Chalos Plains Biome ID", 181);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idBiomeChalosPlains = prop.getInt();
        propOrder.add(prop.getName());

       /* prop = ConfigManagerAC.config.get(ConfigManagerAC.BIOMES, "Chalos Hills Biome ID", 182);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idBiomeChalosHills = prop.getInt();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.BIOMES, "Slimely Wasteland Biome ID", 183);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idBiomeSlimelyWasteland = prop.getInt();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.BIOMES, "Infected Plains Biome ID", 184);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idBiomeInfectedPlains = prop.getInt();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.BIOMES, "Infected Forest Biome ID", 185);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idBiomeInfectedForest = prop.getInt();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.BIOMES, "Infected Desert Biome ID", 186);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idBiomeInfectedDesert = prop.getInt();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.BIOMES, "Infected River Biome ID", 187);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idBiomeInfectedRiver = prop.getInt();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.BIOMES, "Infected Ocean Biome ID", 188);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idBiomeInfectedOcean = prop.getInt();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.BIOMES, "Infected Deep Ocean Biome ID", 189);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idBiomeInfectedDeepOcean = prop.getInt();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.BIOMES, "Infected Dead Taiga Biome ID", 190);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idBiomeInfectedDeadTaiga = prop.getInt();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.BIOMES, "Infected Swampland Biome ID", 191);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idBiomeInfectedSwampland = prop.getInt();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.BIOMES, "Infected Extreme Hills Biome ID", 192);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idBiomeInfectedExtremeHills = prop.getInt();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.BIOMES, "Infected Dead Roofed Forest Biome ID", 193);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idBiomeInfectedDeadRoofedForest = prop.getInt();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.BIOMES, "Infected Jungle Biome ID", 194);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idBiomeInfectedJungle = prop.getInt();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.BIOMES, "Infected Dead Savanna Biome ID", 195);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idBiomeInfectedDeadSavanna = prop.getInt();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.BIOMES, "Infected Ice Plains Biome ID", 196);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idBiomeInfectedIcePlains = prop.getInt();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.BIOMES, "Green Vein Biome ID", 197);
        prop.setRequiresMcRestart(true);
        ConfigManagerAC.idBiomeGreenVein = prop.getInt();
        propOrder.add(prop.getName());*/
        return propOrder;
    }

    private static ArrayList<String> addOtherConfig()
    {
        ArrayList<String> propOrder = Lists.newArrayList();
        Property prop;
        /*prop = ConfigManagerAC.config.get(ConfigManagerAC.GUI, "Tier 4 Rocket Schematic ID", 800);
        ConfigManagerAC.idBaseRocketSchematic = prop.getInt();
        propOrder.add(prop.getName());

       /* prop = ConfigManagerAC.config.get(ConfigManagerAC.OTHERS, "Base Schematic ID", 850);
        ConfigManagerAC.idBaseSchematic = prop.getInt();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.OTHERS, "Tier 4 Rocket Schematic GUI ID", 500);
        ConfigManagerAC.idBaseRocketSchematicGui = prop.getInt();
        propOrder.add(prop.getName());

        prop = ConfigManagerAC.config.get(ConfigManagerAC.OTHERS, "Base Schematic GUI ID", 550);
        ConfigManagerAC.idBaseSchematicGui = prop.getInt();
        propOrder.add(prop.getName());*/
        return propOrder;
    }

    public static List<IConfigElement> getConfigElements()
    {
        List<IConfigElement> list = Lists.newArrayList();
        ConfigCategory configGeneral = ConfigManagerAC.config.getCategory(ConfigManagerAC.GENERAL);
        configGeneral.setComment(I18n.translateToLocal("config.ac.general"));
        list.add(new ConfigElement(configGeneral));

        ConfigCategory configCounties = ConfigManagerAC.config.getCategory(ConfigManagerAC.COUNTRIES);
        configCounties.setComment(I18n.translateToLocal("config.ac.countries"));
        list.add(new ConfigElement(configCounties));

        ConfigCategory configBiome = ConfigManagerAC.config.getCategory(ConfigManagerAC.BIOMES);
        configBiome.setComment(I18n.translateToLocal("config.ac.biome"));
        list.add(new ConfigElement(configBiome));

        ConfigCategory configSchematic = ConfigManagerAC.config.getCategory(ConfigManagerAC.GUI);
        configSchematic.setComment(I18n.translateToLocal("config.ac.gui"));
        list.add(new ConfigElement(configSchematic));

        return list;
    }
}