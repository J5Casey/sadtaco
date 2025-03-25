package net.j5casey.sadtaco.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SadTacoItem extends Item {
    public SadTacoItem(Properties properties) {
        // Set food properties if this is a food item
        super(properties
                .food(new FoodProperties.Builder()
                        .nutrition(4)  // Fills 2 hunger bars
                        .saturationModifier(0.3f)  // Low saturation
                        .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 2), 1.0f)
                        .effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 300, 1), 1.0f)
                        .alwaysEdible() // Can eat even when not hungry
                        .build()
                )
        );
    }


    public void appendHoverText(ItemStack stack, @Nullable TooltipContext context,
                                List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.translatable("tooltip.sadtaco.sad_taco"));

        super.appendHoverText(stack, context, tooltip, flag);
    }
}