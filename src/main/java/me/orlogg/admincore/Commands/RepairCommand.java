package me.orlogg.admincore.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;

public class RepairCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if (sender instanceof Player player) {

            final ItemStack itemToRepair = player.getInventory().getItemInOffHand();
            final Damageable itemDamage = (Damageable) itemToRepair.getItemMeta();
            final int damage = 0;

            if (itemDamage != null) {
                itemDamage.setDamage(damage);
                itemToRepair.setItemMeta(itemDamage);
                player.sendMessage("The damage value is now: " + itemDamage.getDamage());

            } else {
                player.sendMessage("this item is not repairable, the damage is already 0");
            }
        }
        return true;
    }
}