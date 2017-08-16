package ro.coderdojo.sarmalele;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;

@SuppressWarnings("empty-statement")
public final class EventsListener implements Listener {
    Main plugin;

    public EventsListener(Main plugin) {
        this.plugin = plugin;
    }
    
    
    @EventHandler
    public void onLogin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage("Salut" + ChatColor.DARK_GREEN + player.getName() + ChatColor.WHITE + "! Felicitări pentru primul pluggin de Minecraft!");
    }

    @EventHandler
    public void wall(PlayerInteractEvent event) {
        event.getPlayer().getLocation().getBlock().setType(Material.AIR);
    }

    @EventHandler
    public void expl(EntityExplodeEvent event) {
        event.setCancelled(true);
        event.getLocation().getWorld().createExplosion(event.getLocation(), 50);
        
    }

}
