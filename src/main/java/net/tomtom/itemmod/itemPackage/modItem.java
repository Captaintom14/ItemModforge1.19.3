package net.tomtom.itemmod.itemPackage;

import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tomtom.itemmod.ItemMod;

public class modItem {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ItemMod.MOD_ID);


    public static final RegistryObject<Item> KirbyWand= ITEMS.register("kirby_wand", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Stars = ITEMS.register("stars", () -> new BowItem(new Item.Properties().durability(500)));



    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
