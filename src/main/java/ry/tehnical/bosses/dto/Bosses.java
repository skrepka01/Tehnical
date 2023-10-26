package ry.tehnical.bosses.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bukkit.EntityEffect;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.entity.*;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;
import ry.tehnical.world.SpawnEntity;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
public class Bosses {
    private SpawnEntity spawnEntity = new SpawnEntity();

    public LivingEntity immortelle(Player player){
        return spawnEntity.immortelle(player);
    }
    public LivingEntity shooter(Player player){
        return spawnEntity.shooter(player);
    }

    public LivingEntity mechanic(Player player){
        return spawnEntity.mechanic(player);
    }

    public double getHp(Player player){
        return immortelle(player).getHealth();
    }
}
