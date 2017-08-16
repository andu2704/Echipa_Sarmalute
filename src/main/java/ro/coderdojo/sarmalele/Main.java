package ro.coderdojo.sarmalele;

import java.util.logging.Level;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;
import ro.coderdojo.sarmalele.CoderDojoCommand;
import ro.coderdojo.sarmalele.EventsListener;

public class Main extends JavaPlugin {
    

    @Override
    public void onEnable() {
		//Register Event Listeners
		getServer().getPluginManager().registerEvents(new EventsListener(this), this);
		
		//Register Command Executors
		this.getCommand("CoderDojo").setExecutor(new CoderDojoCommand());
    }

}
