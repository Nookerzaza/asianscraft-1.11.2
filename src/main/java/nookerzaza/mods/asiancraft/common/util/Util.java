package nookerzaza.mods.asiancraft.common.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import nookerzaza.mods.asiancraft.core.ReferenceAC;

public class Util 
{
private static Logger logger;

public static Logger getLoger()
{
	if(logger==null)
	{
		logger = LogManager.getFormatterLogger(ReferenceAC.MOD_ID);
	}
	return logger;
}
}

