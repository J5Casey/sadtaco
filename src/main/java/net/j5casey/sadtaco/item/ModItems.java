package net.j5casey.sadtaco.item;

import net.j5casey.sadtaco.SadTacoMod;
import net.j5casey.sadtaco.item.custom.SadTacoItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SadTacoMod.MOD_ID);

    //Add Items Here

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final DeferredItem<Item> SAD_TACO = ITEMS.register("sad_taco", () -> new SadTacoItem(new Item.Properties()));

}
