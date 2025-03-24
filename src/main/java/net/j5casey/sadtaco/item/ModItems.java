package net.j5casey.sadtaco.item;

import net.j5casey.sadtaco.SadTacoMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SadTacoMod.MOD_ID);

    //Add Items Here

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
