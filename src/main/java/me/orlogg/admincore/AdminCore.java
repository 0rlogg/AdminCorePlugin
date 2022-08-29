package me.orlogg.admincore;

import me.orlogg.admincore.Commands.FlyCommand;
import me.orlogg.admincore.Commands.RepairCommand;
import me.orlogg.admincore.Commands.VanishCommand;
import me.orlogg.admincore.Commands.invulnerableCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class AdminCore extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("Vanish").setExecutor(new VanishCommand());
        getCommand("Repair").setExecutor(new RepairCommand());
        getCommand("Fly").setExecutor(new FlyCommand());
        getCommand("Invulnerable").setExecutor(new invulnerableCommand());

    }
}
