package me.orlogg.admincore.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

public class invulnerableCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player && player.isOp()) {

            if (player.isInvulnerable()) {
                Objects.requireNonNull(player.getPlayer()).setInvulnerable(false);
                player.sendMessage(ChatColor.RED + "Now you aren't invulnerable.");

            } else {
                Objects.requireNonNull(player.getPlayer()).setInvulnerable(true);
                player.sendMessage(ChatColor.GREEN + "Now you are invulnerable.");
            }
        }
        return true;
    }
}
