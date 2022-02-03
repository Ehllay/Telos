package net.acp.endermantech.items;

import net.acp.endermantech.EndermanTech;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BoringItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EndermanTech.MOD_ID);

    public static final RegistryObject<Item> CAESIUM_INGOT = ITEMS.register("caesium_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> RAW_CAESIUM = ITEMS.register("raw_caesium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
