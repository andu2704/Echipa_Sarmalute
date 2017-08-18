package ro.coderdojo.sarmalele;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftTNTPrimed;

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
    public void expl(EntityExplodeEvent event) {
        System.out.println(event.getEntity().getClass().getCanonicalName());
//        if(event.getEntity() instanceof CraftTNTPrimed) {
//        }
        event.setCancelled(true);
        event.getLocation().getWorld().createExplosion(event.getLocation(), 50);
    }

}
