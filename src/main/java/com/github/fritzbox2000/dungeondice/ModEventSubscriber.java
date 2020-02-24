package com.github.fritzbox2000.dungeondice;

// Imports
import com.github.fritzbox2000.dungeondice.init.ModItemGroups;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistryEntry;

@EventBusSubscriber(modid = DungeonDice.MODID, bus = EventBusSubscriber.Bus.MOD)
public final class ModEventSubscriber {

    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        // Register Items into Minecraft, this method allows for dynamic id's (i'm pretty sure) and will add them to Dungeon dice mod group

        event.getRegistry().registerAll(setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)),"example_item"));
        event.getRegistry().registerAll(setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)),"d20"));
    }

    @SubscribeEvent
    public static void onRegisterBlock(RegistryEvent.Register<Block> event){
        /* Register Blocks into Minecraft, this method allows for dynamic id's (i'm pretty sure)

        TODO: Add to Dungeon Dice Group
         */
        event.getRegistry().registerAll(
                setup(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)), "example_ore")
        );
    }

    // This is Cadiboo code that is way too clever for a simpleton such as I
    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
        return setup(entry, new ResourceLocation(DungeonDice.MODID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }
}

