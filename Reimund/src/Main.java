
import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	private static Logger logger = Logger.getLogger("Minecraft");
	
	public void onEnable() {
		logger.info("(Reimund has been enabled)");
	}
	
	public void onDisable() {
		logger.info("(Reimund has been disabled)");
	}
}
