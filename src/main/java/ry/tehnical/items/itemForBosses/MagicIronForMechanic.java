package ry.tehnical.items.itemForBosses;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import ry.tehnical.utils.constants.Colors;
import ry.tehnical.utils.constants.NameItems;

public class MagicIronForMechanic {

    public ItemStack MagicIron(){
        ItemStack itemStack = new ItemStack(Material.IRON_INGOT);
        itemStack.addEnchantment(Enchantment.DAMAGE_ALL, 2);
        setDisplayName(itemStack);
        return itemStack;
    }

    private ItemMeta getItemMeta(ItemStack itemStack){
        return itemStack.getItemMeta();
    }

    private void setDisplayName(ItemStack itemStack){
        getItemMeta(itemStack).setDisplayName(Colors.COLOR_WHITE + NameItems.MAGIC_IRON);
    }
}
