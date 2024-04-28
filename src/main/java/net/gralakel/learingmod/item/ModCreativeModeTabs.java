package net.gralakel.learingmod.item;

import net.gralakel.learingmod.LearningMod;
import net.gralakel.learingmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LearningMod.MODID);

    public static final RegistryObject<CreativeModeTab> LEARNINGMODTAB = CREATIVE_MODE_TABS.register("learningmod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.INFUSEDLAPIS.get()))
                    .title(Component.translatable("creativetab.learningmod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.INFUSEDLAPIS.get());
                        output.accept(ModItems.LAPOFERRITE.get());
                        output.accept(ModBlocks.LAPOFERRITE_BLOCK.get());
                    })
                    .build());

    public static void  register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
