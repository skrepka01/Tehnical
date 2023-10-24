package ry.tehnical.listener;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import ry.tehnical.items.TeleportOnArenaItem;
import ry.tehnical.utils.Helper;

public class ResponseConnect implements Listener {

    private final Helper helper = new Helper();
    private final TeleportOnArenaItem teleport = new TeleportOnArenaItem();

    @EventHandler
    public void onPlayerConnect(PlayerJoinEvent event){
        event.setJoinMessage(null);
        Player player = event.getPlayer();
        World world = player.getWorld();
        double locationX =player.getLocation().getX();
        double locationY =player.getLocation().getY();
        double locationZ =player.getLocation().getZ();
        helper.teleport(player,new Location(world,locationX,locationY,locationZ));
        helper.getInventory(player).setItem(8, teleport.teleportation());
    }
}
