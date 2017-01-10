package net.poweredbyhate.qol;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Lax on 1/10/2017.
 */
public class QualityOfLife extends JavaPlugin {

    public void onEnable() {
        if (getConfig().getBoolean("door-knock.enabled")) {
            Bukkit.getPluginManager().registerEvents(new KnockKnockListener(), this);
        }
        if (getConfig().getBoolean("blood.enabled")) {
            Bukkit.getPluginManager().registerEvents(new BloodyHell(), this);
        }
        if (getConfig().getBoolean("arrow-pickup.enabled")) {
            Bukkit.getPluginManager().registerEvents(new PickMeUp(), this);
        }
        if (getConfig().getBoolean("snow-layer-remover.enabled")) {
            Bukkit.getPluginManager().registerEvents(new LetItSnow(), this);
        }
        //System.out.println("Version: " + Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3]);
    }
}
