package me.orlogg.admincore.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FrozenCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player player && player.isOp()){

            String playerName = args[0];
            Player target = Bukkit.getServer().getPlayerExact(playerName);
            if (target == null || !target.isOnline()){
                player.sendMessage("El jugador no esta conectado");

            }else {
                target.setWalkSpeed(0);
            }


        }
        return true;
    }
}
