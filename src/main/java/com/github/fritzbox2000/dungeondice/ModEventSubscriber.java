package com.github.fritzbox2000.dungeondice;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistryEntry;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

@EventBusSubscriber(modid = DungeonDice.MODID, bus = EventBusSubscriber.Bus.MOD)
public final class ModEventSubscriber {

    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(setup(new Item(new Item.Properties()),"example_item"));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
        return setup(entry, new ResourceLocation(DungeonDice.MODID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }
}

