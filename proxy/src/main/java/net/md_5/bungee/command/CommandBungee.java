package net.md_5.bungee.command;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class CommandBungee
extends Command {
    private final String message = ChatColor.translateAlternateColorCodes('&', "&8> &7This server is running &6VietProtectCord &71.0\n&8> &7An optimized &6BungeeCord Fork&7 designed for VietProtect customers.\n&8> &7Website: https://vietprotect.vn");

    public CommandBungee() {
        super("bungee", null, "vcord");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        sender.sendMessage((BaseComponent)new TextComponent(this.message));
    }
}