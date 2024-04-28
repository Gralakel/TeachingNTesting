package net.gralakel.learingmod.item;

import net.gralakel.learingmod.LearningMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LearningMod.MODID);

    public static final RegistryObject<Item> LAPOFERRITE = ITEMS.register("lapoferrite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INFUSEDLAPIS = ITEMS.register("infused_lapis", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
