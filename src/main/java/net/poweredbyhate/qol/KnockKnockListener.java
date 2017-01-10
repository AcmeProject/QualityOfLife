package net.poweredbyhate.qol;

import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * Created by Lax on 1/10/2017.
 */
public class KnockKnockListener implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent ev) {
        if (ev.getAction() == Action.LEFT_CLICK_BLOCK) {
            if (ev.getClickedBlock().getType().toString().contains("IRON_DOOR")) {
                ev.getClickedBlock().getWorld().playSound(ev.getClickedBlock().getLocation(), Sound.ENTITY_ZOMBIE_ATTACK_IRON_DOOR,1,1);
            }
            if (ev.getClickedBlock().getType().toString().contains("WOODEN_DOOR")) {
                ev.getClickedBlock().getWorld().playSound(ev.getClickedBlock().getLocation(), Sound.ENTITY_ZOMBIE_ATTACK_DOOR_WOOD,1,1);
            }
        }
    }
}
