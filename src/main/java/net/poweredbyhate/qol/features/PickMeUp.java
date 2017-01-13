package net.poweredbyhate.qol.features;

import net.minecraft.server.v1_11_R1.EntityArrow;
import org.bukkit.craftbukkit.v1_11_R1.entity.CraftArrow;
import org.bukkit.entity.Arrow;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

/**
 * Created by Lax on 1/10/2017.
 */
public class PickMeUp implements Listener {

    @EventHandler
    public void onHit(ProjectileHitEvent ev) {
        if (ev.getEntity() instanceof Arrow) {
            Arrow a = (Arrow) ev.getEntity();
            ((CraftArrow)a).getHandle().fromPlayer = EntityArrow.PickupStatus.ALLOWED;
        }
    }

}
