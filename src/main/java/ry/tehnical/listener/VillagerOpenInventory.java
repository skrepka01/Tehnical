package ry.tehnical.listener;

import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.Inventory;
import ry.tehnical.items.item_for_inventory_entity.FoodItems;
import ry.tehnical.utils.constants.NameEntity;

public class VillagerOpenInventory implements Listener {

    public static Inventory foodStall;
    public static Inventory armourer;
    @EventHandler
    public void canselOpenInvent(PlayerInteractEntityEvent event){
        if (event instanceof Villager)
        {
            Player player = event.getPlayer();
            event.setCancelled(true);
            String nameVillager = ((Villager) event).getName();
            if (nameVillager.equals(NameEntity.TRADER))
            {
                foodStall.addItem(FoodItems.apple(),FoodItems.goldenApple(),FoodItems.steak());
            } else if (nameVillager.equals(NameEntity.ARMOURER)) {
                
            }
        }
    }
}
