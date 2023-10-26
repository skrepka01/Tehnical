package ry.tehnical.listener;

import lombok.val;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import ry.tehnical.items.InventoryBossItem;
import ry.tehnical.items.inventoryBosses.InventoryWithBosses;

public class OpenBosses implements Listener {

    private final InventoryWithBosses inventory = new InventoryWithBosses();
    private final InventoryBossItem item = new InventoryBossItem();
    @EventHandler
    public void openInventory(PlayerInteractEvent event){
        Player player = event.getPlayer();
        val getItemInMainHan = player.getInventory().getItemInMainHand();
        val openInventory = event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR &&
                getItemInMainHan.equals(item.boss());//todo: тут должна быть проверка на предмет который открывает нам );
        if (openInventory){
            inventory.createInventory(player);
            inventory.fillInventory();
        }
    }
}
