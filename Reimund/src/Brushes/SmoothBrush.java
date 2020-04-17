package Brushes;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class SmoothBrush {

	public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
		if (sender instanceof ConsoleCommandSender) return false;
		Player player = (Player) sender;
		Block block = player.getTargetBlock(null,200);
		Location loc = block.getLocation();
		
		return true;
	}

