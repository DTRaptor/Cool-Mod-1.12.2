package com.dtraptor.coolmod.init;

//again, our fresh imports
import com.dtraptor.coolmod.CoolMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

//Item
@ObjectHolder(CoolMod.mod_id)
public class ModItems {
	
	public static final Item FIRST_ITEM = null;
	
	@EventBusSubscriber(modid = CoolMod.mod_id)
	public static class RegistrationHandler {
		
		@SubscribeEvent
		public static void registerItems(Register<Item> event) {
			final Item[] items = {
					new Item().setRegistryName(CoolMod.mod_id, "first_item").setUnlocalizedName(CoolMod.mod_id + "." + "first_item").setCreativeTab(CreativeTabs.MISC)
			};

			event.getRegistry().registerAll(items);
		}
		
	}
}
