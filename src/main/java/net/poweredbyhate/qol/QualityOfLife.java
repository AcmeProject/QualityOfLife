package net.poweredbyhate.qol;

import net.poweredbyhate.qol.features.BloodyHell;
import net.poweredbyhate.qol.features.KnockKnockListener;
import net.poweredbyhate.qol.features.LetItSnow;
import net.poweredbyhate.qol.features.PickMeUp;
import net.poweredbyhate.qol.features.WitchHunts;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Lax on 1/10/2017.
 */
public class QualityOfLife extends JavaPlugin {

    public static QualityOfLife instance;

    public void onEnable() {
        instance = this;
        saveDefaultConfig();
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
        if (getConfig().getBoolean("boiling-cauldrons.enabled")) {
            Bukkit.getPluginManager().registerEvents(new WitchHunts(), this);
        }
        //System.out.println("Version: " + Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3]);
    }
}
