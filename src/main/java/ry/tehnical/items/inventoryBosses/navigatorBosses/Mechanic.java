package ry.tehnical.items.inventoryBosses.navigatorBosses;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import ry.tehnical.utils.Helper;
import ry.tehnical.utils.constants.Colors;
import ry.tehnical.utils.constants.DescriptionBoss;
import ry.tehnical.utils.constants.NameEntity;

public class Mechanic {

    private static final Helper helper = new Helper();

    public static ItemStack mechanicHead(){
        ItemStack itemStack = new ItemStack(Material.SKULL);
        itemStack.setDurability((short) 2);
        helper.getIteMeta(itemStack).setDisplayName(Colors.COLOR_WHITE + NameEntity.BOSS_MECHANIC);
        helper.setLore(DescriptionBoss.MECHANIC_DESC,itemStack);
        return itemStack;
    }
}
