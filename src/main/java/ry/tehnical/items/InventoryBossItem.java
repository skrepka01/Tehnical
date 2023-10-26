package ry.tehnical.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import ry.tehnical.utils.Helper;
import ry.tehnical.utils.constants.Colors;
import ry.tehnical.utils.constants.NameItems;

public class InventoryBossItem {

    private final Helper helper = new Helper();

    public ItemStack boss(){
        ItemStack itemStack = new ItemStack(Material.BOOK);
        ItemMeta itemMeta =helper.getIteMeta(itemStack);
        itemMeta.setDisplayName(Colors.COLOR_WHITE + NameItems.INVENTORY_BOSSES);
        helper.setItemMeta(itemMeta,itemStack);
        return itemStack;
    }
}
