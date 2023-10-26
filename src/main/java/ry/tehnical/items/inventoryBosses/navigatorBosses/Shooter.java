package ry.tehnical.items.inventoryBosses.navigatorBosses;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import ry.tehnical.utils.Helper;
import ry.tehnical.utils.constants.DescriptionBoss;

public class Shooter {

    private static final Helper helper = new Helper();

    public static ItemStack shooterHead(){
        ItemStack itemStack = new ItemStack(Material.SKULL);
        itemStack.setDurability((short) 0);
        helper.setLore(DescriptionBoss.SHOOTER_DESC,itemStack);
        return itemStack;
    }
}
