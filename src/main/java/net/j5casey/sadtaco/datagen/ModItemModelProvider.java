package net.j5casey.sadtaco.datagen;

import net.j5casey.sadtaco.SadTacoMod;
import net.j5casey.sadtaco.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SadTacoMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Register item models here
    }
}
