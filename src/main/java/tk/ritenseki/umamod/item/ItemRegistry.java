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
    public static RegistryObject<Item> purple_13debuff2 =ITEMS.register("purple_13debuff2", Purple_SpeedDebuff2::new);
    public static RegistryObject<Item> purple_13debuff1 =ITEMS.register("purple_13debuff1", Purple_SpeedDebuff1::new);
    public static RegistryObject<Item> purple_68debuff2 =ITEMS.register("purple_68debuff2", Purple_SpeedDebuff2::new);
    public static RegistryObject<Item> purple_68debuff1 =ITEMS.register("purple_68debuff1", Purple_SpeedDebuff1::new);
    public static RegistryObject<Item> purple_leftdebuff2 =ITEMS.register("purple_leftdebuff2", Purple_SpeedDebuff2::new);
    public static RegistryObject<Item> purple_leftdebuff1 =ITEMS.register("purple_leftdebuff1", Purple_SpeedDebuff1::new);
    public static RegistryObject<Item> purple_rightdebuff2 =ITEMS.register("purple_rightdebuff2", Purple_SpeedDebuff2::new);
    public static RegistryObject<Item> purple_rightdebuff1 =ITEMS.register("purple_rightdebuff1", Purple_SpeedDebuff1::new);
    public static RegistryObject<Item> purple_sunnydebuff2 =ITEMS.register("purple_sunnydebuff2", Purple_SpeedDebuff2::new);
    public static RegistryObject<Item> purple_sunnydebuff1 =ITEMS.register("purple_sunnydebuff1", Purple_SpeedDebuff1::new);
    public static RegistryObject<Item> purple_snowydebuff2 =ITEMS.register("purple_snowydebuff2", Purple_SpeedDebuff2::new);
    public static RegistryObject<Item> purple_snowydebuff1 =ITEMS.register("purple_snowydebuff1", Purple_SpeedDebuff1::new);
    public static RegistryObject<Item> purple_rainydebuff2 =ITEMS.register("purple_rainydebuff2", Purple_SpeedDebuff2::new);
    public static RegistryObject<Item> purple_rainydebuff1 =ITEMS.register("purple_rainydebuff1", Purple_SpeedDebuff1::new);

}
