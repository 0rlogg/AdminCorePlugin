package me.orlogg.admincore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

public class FlyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player player && player.isOp()) {
            if (Objects.requireNonNull(player.getPlayer()).getAllowFlight()) {
                player.getPlayer().setAllowFlight(false);
                player.sendMessage(ChatColor.RED + "Now you can't fly.");

            } else {
                player.getPlayer().setAllowFlight(true);
                player.sendMessage(ChatColor.GREEN + "Now you can fly.");
            }
        }
        return true;
    }
}
