package com.dtraptor.coolmod;


//all of our fresh imports
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

//the @Mod annotation, which allows our mod to be recognised by Forge
@Mod(modid = CoolMod.mod_id, name = CoolMod.name, version = CoolMod.version)

public class CoolMod {
	
	//Variables for the @Mod annotation
	
	public static final String mod_id = "cool";
	public static final String name = "Cool Mod";
	public static final String version = "1.0.0";
	public static final String mcVersion = "[1.12.2]";
	
	//Logger, that will log events in the mod.
	
	public static final Logger modLogger = LogManager.getLogger(CoolMod.mod_id);
	
	//eventHandler
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Gives our logger a message when the mod is initializing...
		modLogger.info(CoolMod.name + " is initializing! Hold on to your butts...");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
