package ry.tehnical.items.inventoryBosses.navigatorBosses;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.World;
import org.bukkit.block.Skull;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import ry.tehnical.utils.Helper;
import ry.tehnical.utils.constants.Colors;
import ry.tehnical.utils.constants.DescriptionBoss;
import ry.tehnical.utils.constants.NameEntity;

import java.util.ArrayList;
import java.util.List;

public class Immortelle {

    private final static Helper helper = new Helper();
    public static ItemStack immortelleHead(){
        ItemStack itemStack = new ItemStack(Material.SKULL);
        itemStack.setDurability((short) 2);
        ItemMeta itemMeta =helper.getIteMeta(itemStack);
        itemMeta.setDisplayName(Colors.COLOR_WHITE + NameEntity.BOSS_IMMORTELL);
        helper.setLore(DescriptionBoss.IMMORTELLE_DESC,itemStack);
        helper.setItemMeta(itemMeta,itemStack);
        return itemStack;
    }

}
