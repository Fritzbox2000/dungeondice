package com.github.fritzbox2000.dungeondice.init;
// Import statements

import com.github.fritzbox2000.dungeondice.DungeonDice;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.function.Supplier;

public class ModItemGroups{
    // The grouping of all the items in the creative menu
    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(DungeonDice.MODID, () -> new ItemStack(ModItems.D20));

    public static class ModItemGroup extends ItemGroup {

        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        @MethodsReturnNonnullByDefault
        public ItemStack createIcon() {
            return iconSupplier.get();
        }

    }
}
