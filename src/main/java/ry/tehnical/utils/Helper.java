package ry.tehnical.utils;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import ry.tehnical.utils.constants.DescriptionBoss;

import java.util.ArrayList;
import java.util.List;

import static ry.tehnical.utils.constants.Messenger.ERROR_TELEPORT;
import static ry.tehnical.utils.constants.Messenger.TELEPORT;

public class Helper extends AbstractHelper {

    @Override
    public void teleport(Player player, Location location){
        if (player.teleport(location)) {
            sendMessage(player, TELEPORT);
        } else {
            sendMessage(player, ERROR_TELEPORT);
        }
    }
    @Override
    public void sendMessage(Player player, String msg){
        player.sendMessage(msg);
    }

    @Override
    public Inventory getInventory(Player player) {
        return player.getInventory();
    }

    @Override
    public ItemMeta getIteMeta(ItemStack itemStack) {
        return itemStack.getItemMeta();
    }

    public boolean setItemMeta(ItemMeta itemMeta, ItemStack itemStack){
        return itemStack.setItemMeta(itemMeta);
    }

    @Override
    public void setItem(int index, Inventory inventory,ItemStack itemStack) {
        inventory.setItem(index, itemStack);
    }

    @Override
    public ItemStack setLore(String descriptionBoss,ItemStack itemStack)
    {
        List<String> lore = new ArrayList<>();
        lore.add(descriptionBoss);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }


}
