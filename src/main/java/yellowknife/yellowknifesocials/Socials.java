package yellowknife.yellowknifesocials;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Socials implements CommandExecutor {

    Plugin plugin = YellowKnifeSocials.getPlugin(YellowKnifeSocials.class);

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            for (String string : plugin.getConfig().getStringList("Social-Message")) {
                player.sendMessage(string);
            }
        }
        return false;
    }
}