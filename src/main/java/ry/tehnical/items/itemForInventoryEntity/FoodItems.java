package ry.tehnical.items.itemForInventoryEntity;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class FoodItems {

    public static ItemStack apple(){
        return new ItemStack(Material.APPLE);
    }

    public static ItemStack goldenApple(){
        return new ItemStack(Material.GOLDEN_APPLE);
    }

    public static ItemStack steak(){
        return new ItemStack(Material.COOKED_BEEF);
    }
}
