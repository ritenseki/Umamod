package tk.ritenseki.umamod.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tk.ritenseki.umamod.item.GoldSkill.*;
import tk.ritenseki.umamod.item.GreenSkill.*;
import tk.ritenseki.umamod.item.PurpleSkill.*;
//import tk.ritenseki.umamod.item.RedSkill.*;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "umamod");
    public static RegistryObject<Item> gold_speed2 = ITEMS.register("gold_speed2", Gold_Speed2::new);
    public static RegistryObject<Item> gold_speed1 = ITEMS.register("gold_speed1", Gold_Speed1::new);
    public static RegistryObject<Item> green_13buff2 = ITEMS.register("green_13buff2", Green_SpeedBuff2::new);
    public static RegistryObject<Item> green_13buff1 = ITEMS.register("green_13buff1", Green_SpeedBuff1::new);
    public static RegistryObject<Item> green_68buff2 = ITEMS.register("green_68buff2", Green_SpeedBuff2::new);
    public static RegistryObject<Item> green_68buff1 = ITEMS.register("green_68buff1", Green_SpeedBuff1::new);
    public static RegistryObject<Item> green_leftbuff2 = ITEMS.register("green_leftbuff2", Green_SpeedBuff2::new);
    public static RegistryObject<Item> green_leftbuff1 = ITEMS.register("green_leftbuff1", Green_SpeedBuff1::new);

    public static RegistryObject<Item> green_rightbuff2 =ITEMS.register("green_rightbuff2", Green_SpeedBuff2::new);
    public static RegistryObject<Item> green_rightbuff1 =ITEMS.register("green_rightbuff1", Green_SpeedBuff1::new);
    public static RegistryObject<Item> green_sunnybuff2 =ITEMS.register("green_sunnybuff2", Green_SpeedBuff2::new);
    public static RegistryObject<Item> green_sunnybuff1 =ITEMS.register("green_sunnybuff1", Green_SpeedBuff1::new);
    public static RegistryObject<Item> green_snowybuff2 =ITEMS.register("green_snowybuff2", Green_SpeedBuff2::new);
    public static RegistryObject<Item> green_snowybuff1 =ITEMS.register("green_snowybuff1", Green_SpeedBuff1::new);
    public static RegistryObject<Item> green_rainybuff2 =ITEMS.register("green_rainybuff2", Green_SpeedBuff2::new);
    public static RegistryObject<Item> green_rainybuff1 =ITEMS.register("green_rainybuff1", Green_SpeedBuff1::new);
    public static RegistryObject<Item> purple_13debuff =ITEMS.register("purple_13debuff", Purple_SpeedDebuff::new);
    public static RegistryObject<Item> purple_68debuff =ITEMS.register("purple_68debuff", Purple_SpeedDebuff::new);
    public static RegistryObject<Item> purple_leftdebuff =ITEMS.register("purple_leftdebuff", Purple_SpeedDebuff::new);
    public static RegistryObject<Item> purple_rightdebuff =ITEMS.register("purple_rightdebuff", Purple_SpeedDebuff::new);
    public static RegistryObject<Item> purple_sunnydebuff =ITEMS.register("purple_sunnydebuff", Purple_SpeedDebuff::new);;
    public static RegistryObject<Item> purple_snowydebuff =ITEMS.register("purple_snowydebuff", Purple_SpeedDebuff::new);;
    public static RegistryObject<Item> purple_rainydebuff =ITEMS.register("purple_rainydebuff", Purple_SpeedDebuff::new);

}
