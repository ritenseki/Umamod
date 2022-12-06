package tk.ritenseki.umamod.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tk.ritenseki.umamod.item.GoldSkill.*;
import tk.ritenseki.umamod.item.GreenSkill.*;
import tk.ritenseki.umamod.item.PurpleSkill.*;
import tk.ritenseki.umamod.item.RedSkill.*;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "UmaSkill");
    public static RegistryObject<Item> gold_speed2 = ITEMS.register("gold_speed2", Gold_Speed2::new);
    public static RegistryObject<Item> gold_speed1 = ITEMS.register("gold_speed1", Gold_Speed1::new);
    public static RegistryObject<Item> green_13buff_2 = ITEMS.register("green_13buff_2", Green_13Buff_2::new);
    public static RegistryObject<Item> green_13buff_1 = ITEMS.register("green_13buff_1", Green_13Buff_1::new);
}
