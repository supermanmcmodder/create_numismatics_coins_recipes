package net.superman.create_numismatics_coins_recipes.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.superman.create_numismatics_coins_recipes.CreateNumismaticsCoinsRecipes;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateNumismaticsCoinsRecipes.MOD_ID);

    public static final DeferredItem<Item> Spur = ITEMS.register("Spur",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
