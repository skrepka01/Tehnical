package ry.tehnical.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import ry.tehnical.utils.constants.Colors;
import ry.tehnical.utils.constants.Messenger;
import ry.tehnical.utils.constants.NameItems;

public class TeleportOnArenaItem {

    public ItemStack teleportation(){
        ItemStack itemStack = new ItemStack(Material.STICK);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(Colors.COLOR_WHITE + NameItems.TELEPORT_ON_ARENA);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
}
