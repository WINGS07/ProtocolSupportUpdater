package io.WINGS.ProtocolSupportUpdater.CMD;

import org.bukkit.command.CommandSender;

import io.WINGS.ProtocolSupportUpdater.storage.SS;
import net.md_5.bungee.api.ChatColor;

public class HelpCmd {

	public HelpCmd(CommandSender s) {
		s.sendMessage(SS.prefix + ChatColor.LIGHT_PURPLE + SS.help1);
	}
}
