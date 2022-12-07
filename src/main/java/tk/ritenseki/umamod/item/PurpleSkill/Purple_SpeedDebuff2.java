package tk.ritenseki.umamod.item.PurpleSkill;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import tk.ritenseki.umamod.Group.GroupInitialize;

public class Purple_SpeedDebuff2 extends Item {
    private static final EffectInstance effect = new EffectInstance(
        Effects.SPEED, 32767, -2);
    private static final Food food = (new Food.Builder())
            .effect(effect, 1)
            .build();
    public Purple_SpeedDebuff2() {
        super(new Item.Properties()
                .group(GroupInitialize.itemGroup)
                .food(food)
        );
    }
}
