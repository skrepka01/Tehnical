package ry.tehnical.world;

import lombok.val;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;
import ry.tehnical.utils.constants.NameEntity;

public class SpawnEntity<T,S extends EntityType> {

    public Villager spawnVillager(Player player){
        World world = player.getWorld();
        Location spawnVillager = player.getLocation();
        return (Villager) world.spawnEntity(spawnVillager, EntityType.VILLAGER);
    }

    public Zombie immortelle(Player player){
        World world = player.getWorld();
        Zombie immortelle = (Zombie) world.spawnEntity(getLocation(player),EntityType.ZOMBIE);
        immortelle.setHealth(40.0);
        immortelle.setCustomNameVisible(true);
        immortelle.setCustomName(NameEntity.BOSS_IMMORTELL);
        return immortelle;
    }

    public Skeleton shooter(Player player)
    {
        World world = player.getWorld();
        Skeleton shooter = (Skeleton) world.spawnEntity(getLocation(player),EntityType.SKELETON);
        shooter.setHealth(60.0);
        shooter.setCustomNameVisible(true);
        shooter.setCustomName(NameEntity.BOSS_SHOOTER);
        return shooter;
    }

    public Zombie mechanic(Player player)
    {
        World world = getLocation(player).getWorld();
        Zombie zombie = (Zombie) boss(player,EntityType.ZOMBIE.getName());
        zombie.setBaby(true);
        zombie.setCustomNameVisible(true);
        zombie.setCustomName(NameEntity.BOSS_MECHANIC);
        return zombie;
    }

    private Location getLocation(Player player){
        World world = player.getWorld();
        Location location = player.getLocation();
        double blockX = location.getBlockX() + 20;
        double blockY = location.getBlockY();
        double blockZ = location.getBlockZ();
        return  new Location(world,blockX,blockY,blockZ);
    }

    private <T extends Entity,S extends EntityType> Entity boss(Player player,String nameEntity){
        World world = player.getWorld();
        return  (T) world.spawnEntity(getLocation(player), S.valueOf(nameEntity));
    }


}
