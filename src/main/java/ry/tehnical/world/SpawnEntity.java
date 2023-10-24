package ry.tehnical.world;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;

public class SpawnEntity {

    public Villager spawnVillager(Player player){
        World world = player.getWorld();
        Location spawnVillager = player.getLocation();
        return (Villager) world.spawnEntity(spawnVillager, EntityType.VILLAGER);
    }
}
