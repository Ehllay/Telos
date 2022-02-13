package net.acp.astralenergy.item;

import net.acp.astralenergy.AstralEnergy;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BoringItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AstralEnergy.MOD_ID);

    public static final RegistryObject<Item> LITHIUM = ITEMS.register("lithium",
            () -> new Item(new Item.Properties().tab(CreativeTab.ASTRAL_ENERGY)));

    public static final RegistryObject<Item> KENOSITE_INGOT = ITEMS.register("kenosite_ingot",
            () -> new Item(new Item.Properties().tab(CreativeTab.ASTRAL_ENERGY)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
