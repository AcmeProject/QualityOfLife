package net.poweredbyhate.qol;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

/**
 * Created by Lax on 1/10/2017.
 */
public class LetItSnow implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent ev) {
        if (ev.getBlock().getType() == Material.SNOW) {
            byte b = ev.getBlock().getData();
            if (b==0) {
                return;
            }
            ev.getBlock().setData((byte) (b-1));
            ev.setCancelled(true);
        }
    }
}
