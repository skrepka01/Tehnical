package ry.tehnical.registration;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import ry.tehnical.BuildYourCity;
import ry.tehnical.listener.InteractTeleportator;
import ry.tehnical.listener.OpenBosses;
import ry.tehnical.listener.ResponseConnect;
import ry.tehnical.listener.VillagerOpenInventory;

import static org.bukkit.Bukkit.getServer;
import static ry.tehnical.BuildYourCity.instance;

public class Registration extends AbstractRegister{
    @Override
    public void registerEvents() {
        BukkitGetPluginManager().registerEvents(new ResponseConnect(),instance);
        BukkitGetPluginManager().registerEvents(new VillagerOpenInventory(),instance);
        BukkitGetPluginManager().registerEvents(new InteractTeleportator(),instance);
        BukkitGetPluginManager().registerEvents(new OpenBosses(),instance);
    }

    private PluginManager BukkitGetPluginManager(){
      return  Bukkit.getServer().getPluginManager();
    }
}
