package ry.tehnical.utils;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import ry.tehnical.utils.constants.DescriptionBoss;

import java.util.List;

public abstract class AbstractHelper {

   protected abstract void teleport(Player player, Location location);
   protected abstract void sendMessage(Player player, String msg);

   protected abstract Inventory getInventory(Player player);

   protected abstract ItemMeta getIteMeta(ItemStack itemStack);

   protected abstract ItemStack setLore(String descriptionBoss,ItemStack itemStack);

   protected abstract boolean setItemMeta(ItemMeta itemMeta,ItemStack itemStack);

   protected abstract void setItem(int index, Inventory inventory,ItemStack itemStack);
}
