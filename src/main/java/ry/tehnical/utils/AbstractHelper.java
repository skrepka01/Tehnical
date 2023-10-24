package ry.tehnical.utils;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public abstract class AbstractHelper {

   protected abstract void teleport(Player player, Location location);
   protected abstract void sendMessage(Player player, String msg);

   protected abstract Inventory getInventory(Player player);
}
