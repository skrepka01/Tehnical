package ry.tehnical.listener;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import ry.tehnical.items.InventoryBossItem;
import ry.tehnical.items.TeleportOnArenaItem;
import ry.tehnical.utils.Helper;

public class ResponseConnect implements Listener {

    private final Helper helper = new Helper();
    private final TeleportOnArenaItem teleport = new TeleportOnArenaItem();
    private final InventoryBossItem item =new InventoryBossItem();

    @EventHandler
    public void onPlayerConnect(PlayerJoinEvent event){
        event.setJoinMessage(null);
        Player player = event.getPlayer();
        World world = player.getWorld();
        helper.teleport(player,new Location(world,0,0,0));
        fillInventoryPlayer(player);
    }

    private void fillInventoryPlayer(Player player){
        helper.setItem(8,helper.getInventory(player),teleport.teleportation());
        helper.setItem(7,helper.getInventory(player),item.boss());
    }
}
