package Brushes;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class BallBrush extends JavaPlugin{
	public boolean onCommand(CommandSender sender, Command cmd, String string, String [] args) {
		if (sender instanceof ConsoleCommandSender) return false;
		if (cmd.getName().equalsIgnoreCase("sphere")) {
			Player player = (Player) sender;
			//alright, now write the rest of your code for the command here (delete this after you read it)
		}
		return true;
	}
};
