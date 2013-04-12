package me.xflakesid.flakesxpressions;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class LumiaExpressions extends JavaPlugin {
	public final Logger logger = Logger.getLogger("Minecraft");
	public static LumiaExpressions plugin;
	ChatColor darkRed = ChatColor.DARK_RED;
	ChatColor darkBlue = ChatColor.DARK_BLUE;
	ChatColor darkGray = ChatColor.DARK_GRAY;
	ChatColor darkAqua = ChatColor.DARK_AQUA;
	ChatColor darkGreen = ChatColor.DARK_GREEN;
	ChatColor darkPurple = ChatColor.DARK_PURPLE;
	ChatColor red = ChatColor.RED;
	ChatColor blue = ChatColor.BLUE;
	ChatColor black = ChatColor.BLACK;
	ChatColor gray = ChatColor.GRAY;
	ChatColor gold = ChatColor.GOLD;
	ChatColor green = ChatColor.GREEN;
	ChatColor aqua = ChatColor.AQUA;
	ChatColor pink = ChatColor.LIGHT_PURPLE;
	ChatColor yellow = ChatColor.YELLOW;
	ChatColor reset = ChatColor.RESET;
	ChatColor bold = ChatColor.BOLD;
	ChatColor white = ChatColor.WHITE;
	public String frMsg = this.white + "[" + this.green + "Lumia" + this.white + "]";

	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		this.logger.info(pdfFile.getName() + " " + pdfFile.getVersion() + " has been disabled!");
	}

	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		this.logger.info(pdfFile.getName() + " " + pdfFile.getVersion() + " has been enabled!");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player player = (Player) sender;
		if (commandLabel.equalsIgnoreCase("hug")) {
			if (args.length == 0)
				player.getServer().broadcastMessage(player.getDisplayName() + " wants a hug..!");
			else if (args.length == 1) {
				if (player.getServer().getPlayer(args[0]) != null) {
					Player targetplayer = player.getServer().getPlayer(args[0]);
					player.getServer().broadcastMessage(ChatColor.GOLD + player.getDisplayName() + ChatColor.LIGHT_PURPLE + " Hugs " + reset + targetplayer.getDisplayName() + reset);
				} else {
					player.sendMessage(ChatColor.RED + "Error: Player not found.");
				}
			}
		}
		if (commandLabel.equalsIgnoreCase("love")) {
			if (args.length == 0)
				player.getServer().broadcastMessage(player.getDisplayName() + " wants some love..!");
			else if (args.length == 1) {
				if (player.getServer().getPlayer(args[0]) != null) {
					Player targetplayer = player.getServer().getPlayer(args[0]);
					player.getServer().broadcastMessage(ChatColor.GOLD + player.getDisplayName() + ChatColor.RED + " Loves " + reset + targetplayer.getDisplayName() + reset);
				} else {
					player.sendMessage(ChatColor.RED + "Error: Player not found.");
				}
			}
		}
		if (commandLabel.equalsIgnoreCase("kiss")) {
			if (args.length == 0)
				player.getServer().broadcastMessage(player.getDisplayName() + " wants a kiss..!");
			else if (args.length == 1) {
				if (player.getServer().getPlayer(args[0]) != null) {
					Player targetplayer = player.getServer().getPlayer(args[0]);
					player.getServer().broadcastMessage(ChatColor.GOLD + player.getDisplayName() + ChatColor.LIGHT_PURPLE + " Kisses " + reset + targetplayer.getDisplayName() + reset);
				} else {
					player.sendMessage(ChatColor.RED + "Error: Player not found.");
				}
			}
		}
		if (commandLabel.equalsIgnoreCase("flip")) {
			if (args.length == 0)
				player.getServer().broadcastMessage(player.getDisplayName() + " wants to flip someone..!");
			else if (args.length == 1) {
				if (player.getServer().getPlayer(args[0]) != null) {
					Player targetplayer = player.getServer().getPlayer(args[0]);
					player.getServer().broadcastMessage(ChatColor.GOLD + player.getDisplayName() + ChatColor.DARK_BLUE + " Flips " + reset+ targetplayer.getDisplayName() + reset);
					targetplayer.damage(10, null);
				} else {
					player.sendMessage(ChatColor.RED + "Error: Player not found.");
				}
			}
		}
		if (commandLabel.equalsIgnoreCase("Highfive")) {
			if (args.length == 0)
				player.getServer().broadcastMessage(player.getDisplayName() + " wants a highfive!");
			else if (args.length == 1) {
				if (player.getServer().getPlayer(args[0]) != null) {
					Player targetplayer = player.getServer().getPlayer(args[0]);
					player.getServer().broadcastMessage(ChatColor.GOLD + player.getDisplayName() + ChatColor.DARK_BLUE + " highfives with " + reset + targetplayer.getDisplayName() + reset);
					targetplayer.damage(10, null);
				} else {
					player.sendMessage(ChatColor.RED + "Error: Player not found.");
				}
			}
		}
		if (commandLabel.equalsIgnoreCase("murder")) {
			if (args.length == 0)
				player.getServer().broadcastMessage(player.getDisplayName() + " wants to murder someone..!");
			else if (args.length == 1) {
				if (player.getServer().getPlayer(args[0]) != null) {
					Player targetplayer = player.getServer().getPlayer(args[0]);
					player.getServer().broadcastMessage(ChatColor.GOLD + player.getDisplayName() + ChatColor.DARK_RED + " Brutually murders " + reset+ targetplayer.getDisplayName()+ reset);
				} else {
					player.sendMessage(ChatColor.RED + "Error: Player not found.");
				}
			}
		}
		if (commandLabel.equalsIgnoreCase("welcome")) {
			if (args.length == 0)
				player.sendMessage(ChatColor.RED + "You haven't included a member to welcome");
			else if (args.length == 1) {
				if (player.getServer().getPlayer(args[0]) != null) {
					Player targetplayer = player.getServer().getPlayer(args[0]);
					player.getServer().broadcastMessage(player.getDisplayName() + ChatColor.AQUA + " Welcomes " + ChatColor.RESET + targetplayer.getDisplayName() + " to the Server");
				} else {
					player.sendMessage(ChatColor.RED + "Error: Player not found.");
				}
			}
		}
		if (commandLabel.equalsIgnoreCase("stahp")) {
			if (args.length == 0)
				player.getServer().broadcastMessage(ChatColor.RED + "STAHP..!");
			else if (args.length == 1) {
				if (player.getServer().getPlayer(args[0]) != null) {
					Player targetplayer = player.getServer().getPlayer(args[0]);
					player.getServer().broadcastMessage(player.getDisplayName() + ChatColor.RED + " Tells " + targetplayer.getDisplayName() + ChatColor.WHITE + " to " + ChatColor.RED + " STAHP..!"+ reset);
					player.getServer().broadcastMessage(targetplayer.getDisplayName() + ChatColor.RED + " WHAT ARE YOU DOING"+ reset);
					player.getServer().broadcastMessage(targetplayer.getDisplayName() + ChatColor.RED + " STAHP!"+ reset);
				} else {
					player.sendMessage(ChatColor.RED + "Error: Player not found.");
				}
			}
		}
		if (commandLabel.equalsIgnoreCase("cuddle")) {
			if (args.length == 0)
				player.getServer().broadcastMessage(player.getDisplayName() + " wants to cuddle!");
			else if (args.length == 1) {
				if (player.getServer().getPlayer(args[0]) != null) {
					Player targetplayer = player.getServer().getPlayer(args[0]);
					player.getServer().broadcastMessage(player.getDisplayName() + ChatColor.AQUA + " cuddles " + ChatColor.RESET + targetplayer.getDisplayName());
				} else {
					player.sendMessage(ChatColor.RED + "Error: Player not found.");
				}
			}
		}
		if (commandLabel.equalsIgnoreCase("snap")) {
			if (args.length == 0)
				player.getServer().broadcastMessage(player.getDisplayName() + " wants to snap!");
			else if (args.length == 1) {
				if (player.getServer().getPlayer(args[0]) != null) {
					Player targetplayer = player.getServer().getPlayer(args[0]);
					player.getServer().broadcastMessage(player.getDisplayName() + ChatColor.DARK_RED + " snaps at " + ChatColor.RESET + targetplayer.getDisplayName());
				} else {
					player.sendMessage(ChatColor.RED + "Error: Player not found.");
				}
			}
		}

		if (commandLabel.equalsIgnoreCase("slap")) {
			if (args.length == 0)
				player.getServer().broadcastMessage(player.getDisplayName() + " wants to slap someone!");
			else if (args.length == 1) {
				if (player.getServer().getPlayer(args[0]) != null) {
					Player targetplayer = player.getServer().getPlayer(args[0]);
					player.getServer().broadcastMessage(player.getDisplayName() + ChatColor.DARK_PURPLE + " slaps " + ChatColor.RESET + targetplayer.getDisplayName());
				} else {
					player.sendMessage(ChatColor.RED + "Error: Player not found.");
				}
			}
		}

		if (commandLabel.equalsIgnoreCase("bitchslap")) {
			if (args.length == 0)
				player.getServer().broadcastMessage(player.getDisplayName() + " wants to bitchslap!");
			else if (args.length == 1) {
				if (player.getServer().getPlayer(args[0]) != null) {
					Player targetplayer = player.getServer().getPlayer(args[0]);
					player.getServer().broadcastMessage(player.getDisplayName() + ChatColor.DARK_PURPLE + " bitchslaps " + ChatColor.RESET + targetplayer.getDisplayName() + ChatColor.DARK_PURPLE + " in the FACE!");
				} else {
					player.sendMessage(ChatColor.RED + "Error: Player not found.");
				}
			}
		}

		if (commandLabel.equalsIgnoreCase("lumiahelp")) {
			player.sendMessage(ChatColor.GREEN + "LumiaPack" + ChatColor.GOLD + "+" + ChatColor.RED + "-------------------------------------------" + ChatColor.GOLD + "+");
			player.sendMessage(ChatColor.GREEN + "Low" + ChatColor.GOLD + "+");
			player.sendMessage(ChatColor.RED + "/hug <name> - Lets you hug someone out of pure love");
			player.sendMessage(ChatColor.RED + "/kiss <name> - Lets you kiss someone out of pure love");
			player.sendMessage(ChatColor.RED + "/welcome <name> - Lets you welcome someone new to the server");
			player.sendMessage(ChatColor.RED + "/cuddle <name> - Lets you cuddle with someone");
			player.sendMessage(ChatColor.RED + "/created - Shows who created the plugin");
			player.sendMessage(ChatColor.RED + "/love - Show someone some love");
			player.sendMessage(ChatColor.GREEN + "Mid" + ChatColor.GOLD + "+" + ChatColor.RED + "-------------------------------------------" + ChatColor.GOLD + "+");
			player.sendMessage(ChatColor.RED + "/flip <name> - Lets you hug flip someone");
			player.sendMessage(ChatColor.RED + "/highfive <name> - highfives with someone");
			player.sendMessage(ChatColor.RED + "/stahp <name> - makes you stahp someone");
			player.sendMessage(ChatColor.GREEN + "High" + ChatColor.GOLD + "+" + ChatColor.RED + "-------------------------------------------" + ChatColor.GOLD + "+");
			player.sendMessage(ChatColor.RED + "/murder <name> - Lets you murder someone");
			player.sendMessage(ChatColor.RED + "/snap <name> - makes you snap at someone");
			player.sendMessage(ChatColor.RED + "/bitchslap <name> - makes you bitchslap someone");
			player.sendMessage(ChatColor.RED + "/slap <name> - makes you slap someone");
			player.sendMessage(ChatColor.GOLD + "+" + ChatColor.RED + "-------------------------------------------" + ChatColor.GREEN + "LumiaEXP" + ChatColor.GOLD + "+");
		}

		if (commandLabel.equalsIgnoreCase("lumiacreated")) {
			player.sendMessage(ChatColor.RED + "LumiExpressions was created by: xFlakesID" + " @http://michaj.nl");
		}
		
		if (cmd.getName().equalsIgnoreCase("god")) {
			if (player.hasPermission("lumia.chat.god")) {
				String defaultString = gray + "[" + gold + "GOD" + gray + "]" + gold;
				for (int n = 0; n < args.length; n++) {
					if (args[n].length() > 0) {
						defaultString = defaultString + " " + args[n];
					}
				}
				player.getServer().broadcastMessage(defaultString);
			} else {
				player.sendMessage(frMsg + red + " You do not have permissions to be a god..!");

			}
		}
		if (cmd.getName().equalsIgnoreCase("devil")) {
			if (player.hasPermission("lumia.chat.devil")) {
				String defaultString = gray + "[" + darkRed + "Devil" + gray + "]" + darkRed;
				for (int n = 0; n < args.length; n++) {
					if (args[n].length() > 0) {
						defaultString = defaultString + " " + args[n];
					}
				}
				player.getServer().broadcastMessage(defaultString);
			} else {
				player.sendMessage(frMsg + red + " You do not have permissions to be the devil..!");

			}
		}
		
		if (cmd.getName().equalsIgnoreCase("yolo")){
			if(player.hasPermission("lumia.express.admin")){
				
				if(args.length == 0){
					player.sendMessage(ChatColor.RED +  "Please use /yolo <PlayerName>");
				}
				if(args.length == 1){
				
						Player targetPlayer = getServer().getPlayer(args[0]);
						if(targetPlayer.isOnline()){ 
						targetPlayer.kickPlayer(ChatColor.GREEN + "You just got hit by a Yolobatt");
						player.getServer().broadcastMessage(player.getDisplayName()+ reset + " Hit the swag out of " + targetPlayer.getDisplayName()+ reset + " with a " + gold + " YOLOBATT");
						}else{
							sender.sendMessage(frMsg + " " + targetPlayer.getName() + red + " is offline");
						}
				}
			}
		}
		return false;
	}
}