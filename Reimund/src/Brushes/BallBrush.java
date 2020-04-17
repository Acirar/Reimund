package Brushes;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class BallBrush extends JavaPlugin{
	public boolean onCommand(CommandSender sender, Command cmd, String string, String [] args) {
		return false;
		
		@Command(
			name = "Sphere",	
			aliases = "s",	
			desc = "Creates a sphere"	
		)
		@CommandPermissions("Reimund.brush.sphere")
	}
	
	
};
