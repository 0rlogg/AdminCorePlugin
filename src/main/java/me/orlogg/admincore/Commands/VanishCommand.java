package me.orlogg.admincore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VanishCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player player && player.isOp()) {

            if (player.isInvisible()) {
                player.setInvisible(false);
                player.sendMessage(ChatColor.RED + "Now you're visible.");

            } else {
                player.setInvisible(true);
                player.sendMessage(ChatColor.GREEN + "Now you're invisible.");
            }
        }
        return true;
    }
}