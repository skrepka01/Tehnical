package ry.tehnical.utils;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

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


}
