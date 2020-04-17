package main;

import java.util.logging.Logger;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin{
	
	private static Logger logger = Logger.getLogger("Minecraft");
	
	public void onEnable() {
		logger.info("(Reimund has been enabled)");
		
	}
	
	public void onDisable() {
		logger.info("(Reimund has been disabled)");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
		if (cmd.getName().equalsIgnoreCase("smooth")) {
			Player player = (Player) sender;
			Block block = player.getTargetBlock(null,200);
			block.setType(Material.AIR);
			player.sendMessage("test");
		} else if (cmd.getName().equalsIgnoreCase("sphere")) {
			//code for /sphere command goes here
		}
		return true;
	}
	
}
