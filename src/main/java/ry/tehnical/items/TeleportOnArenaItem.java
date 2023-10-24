package ry.tehnical.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import ry.tehnical.utils.constants.Colors;
import ry.tehnical.utils.constants.Messenger;

public class TeleportOnArenaItem {

    public ItemStack teleportation(){
        ItemStack itemStack = new ItemStack(Material.STICK);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(Colors.COLOR_WHITE + Messenger.TELEPORT_ON_ARENA);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
}
