package ry.tehnical.items.inventoryBosses;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import ry.tehnical.items.inventoryBosses.navigatorBosses.Immortelle;
import ry.tehnical.items.inventoryBosses.navigatorBosses.Mechanic;
import ry.tehnical.items.inventoryBosses.navigatorBosses.Shooter;

import java.util.HashMap;
import java.util.Map;

import static ry.tehnical.items.inventoryBosses.navigatorBosses.Immortelle.immortelleHead;
import static ry.tehnical.items.inventoryBosses.navigatorBosses.Mechanic.mechanicHead;
import static ry.tehnical.items.inventoryBosses.navigatorBosses.Shooter.shooterHead;

@Getter
public class InventoryWithBosses {

    private Inventory bosses;

    private final Map<Integer, ItemStack> allBoss = new HashMap<>();

    public Inventory createInventory(Player player){
        bosses = Bukkit.createInventory(player, 9);
      return bosses;
    }

    public void fillInventory(){
        allBoss.put(0,immortelleHead());
        allBoss.put(1,shooterHead());
        allBoss.put(2, mechanicHead());
        allBoss.values().forEach(items -> bosses.addItem(items));
    }
}
