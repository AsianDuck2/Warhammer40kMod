package net.AsianDuck2.warhammer40k.item;

import net.AsianDuck2.warhammer40k.Warhammer40k_items;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Warhammer40k_items.MOD_ID);

    public static final RegistryObject<Item> barbwire = ITEMS.register("barbwire",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
