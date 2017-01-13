package net.poweredbyhate.qol.features;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

/**
 * Created by Lax on 1/10/2017.
 */
public class BloodyHell implements Listener {

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent ev) {
        ev.getEntity().getWorld().playEffect(ev.getEntity().getLocation().add(0,1,0), Effect.STEP_SOUND, Material.REDSTONE_BLOCK);
    }

}
