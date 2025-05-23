package net.j5casey.sadtaco.item;

import net.j5casey.sadtaco.SadTacoMod;
import net.j5casey.sadtaco.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SadTacoMod.MOD_ID);

    //Add creative tabs here

    public static final Supplier<CreativeModeTab> SAD_TACO_TAB = CREATIVE_MODE_TAB.register("sad_taco_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAD_TACO.get()))
                    .title(Component.translatable("creativetab.sadtaco.sadtaco"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SAD_TACO.get());
                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
