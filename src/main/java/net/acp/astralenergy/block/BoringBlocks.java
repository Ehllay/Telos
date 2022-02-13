package net.acp.astralenergy.block;

import net.acp.astralenergy.AstralEnergy;
import net.acp.astralenergy.item.BoringItems;
import net.acp.astralenergy.item.CreativeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BoringBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AstralEnergy.MOD_ID);

    public static final RegistryObject<Block> LITHIUM_ORE = registerBlock("lithium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), CreativeTab.ASTRAL_ENERGY);
    public static final RegistryObject<Block> DEEPSLATE_LITHIUM_ORE = registerBlock("deepslate_lithium_ore", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), CreativeTab.ASTRAL_ENERGY);
    public static final RegistryObject<Block> LITHIUM_BLOCK = registerBlock("lithium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), CreativeTab.ASTRAL_ENERGY);
    public static final RegistryObject<Block> KENOSITE_BLOCK = registerBlock("kenosite_block", () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(5f).requiresCorrectToolForDrops()), CreativeTab.ASTRAL_ENERGY);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends  Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return BoringItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
