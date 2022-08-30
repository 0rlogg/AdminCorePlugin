package me.orlogg.admincore.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FreezeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player && player.isOp()) {
            String playerName = args[0];
            Player target = Bukkit.getServer().getPlayerExact(playerName);

            if (!target.isOnline()) {
                player.sendMessage("El jugador no esta conectado");

            }else {
                target.setGravity(true);
                target.sendMessage("Estas congelado, no puedes moverte");

            }
        }
        return true;
    }
}
