package net.acp.astralenergy.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab {
    public static final CreativeModeTab ASTRAL_ENERGY = new CreativeModeTab("astralenergytab") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BoringItems.KENOSITE_INGOT.get());
        }
    };
}