package ry.tehnical.listener;

import lombok.val;
import org.bukkit.Location;
import org.bukkit.Warning;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.meta.ItemMeta;
import ry.tehnical.items.TeleportOnArenaItem;
import ry.tehnical.utils.Helper;
import ry.tehnical.utils.constants.Messenger;

public class InteractTeleportator implements Listener {

    private final TeleportOnArenaItem teleport = new TeleportOnArenaItem();
    private final Helper helper = new Helper();

    @EventHandler
    public void interactWithTeleportator(PlayerInteractEvent event){
        Player player = event.getPlayer();
        World world = player.getWorld();
        if (event.getHand() == EquipmentSlot.HAND && event.getAction() == Action.RIGHT_CLICK_BLOCK){
            val teleportatorMeta = teleport.teleportation().getItemMeta();
            if (event.getItem().getItemMeta().equals(teleportatorMeta))
            {
                helper.teleport(player,new Location(world,2000,10,50));
                helper.sendMessage(player, Messenger.TELEPORT_ARENA);
            }
        }
    }
}
