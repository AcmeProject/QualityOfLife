package net.poweredbyhate.qol.features;

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
            String s = ev.getClickedBlock().getType().toString();
            if (s.contains("IRON_DOOR") || s.contains("IRON_TRAPDOOR")) {
                ev.getClickedBlock().getWorld().playSound(ev.getClickedBlock().getLocation(), Sound.ENTITY_ZOMBIE_ATTACK_IRON_DOOR,1,1);
            }
            if (s.contains("WOODEN_DOOR") || s.contains("ACACIA_DOOR") || s.contains("BIRCH_DOOR") || s.contains("JUNGLE_DOOR") || s.contains("SPRUCE_DOOR") || s.contains("JUNGLE_DOOR") || s.contains("DARK_OAK_DOOR") || s.contains("TRAP_DOOR")) {
                ev.getClickedBlock().getWorld().playSound(ev.getClickedBlock().getLocation(), Sound.ENTITY_ZOMBIE_ATTACK_DOOR_WOOD,1,1);
            }
        }
    }
}
