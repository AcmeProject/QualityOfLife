package net.poweredbyhate.qol.features;

import net.poweredbyhate.qol.QualityOfLife;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.CauldronLevelChangeEvent;
import org.bukkit.scheduler.BukkitRunnable;

/**
 * Created by Lax on 1/13/2017.
 */
public class WitchHunts implements Listener {

    @EventHandler
    public void onChange(CauldronLevelChangeEvent ev) {
        if (ev.getNewLevel() == 0) {
            return;
        }
        if (ev.getBlock().getRelative(BlockFace.DOWN).getType() != Material.FIRE) {
            return;
        }
        playEffect(ev.getBlock().getLocation().add(0.5, 0.8, 0.5), QualityOfLife.instance.getConfig().getString("boiling-cauldrons.type"));
    }

    public void playEffect(final Location loc, final String type) {
        new BukkitRunnable() {
            int i = 0;
            @Override
            public void run() {
                if (i == 10) {
                    this.cancel();
                }
                i++;
                loc.getWorld().spawnParticle(Particle.valueOf(type), loc.getX(),loc.getY(),loc.getZ(), 20);
            }
        }.runTaskTimer(QualityOfLife.instance,10,15);
    }

}
