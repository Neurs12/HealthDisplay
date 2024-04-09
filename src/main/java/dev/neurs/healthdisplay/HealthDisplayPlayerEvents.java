package dev.neurs.healthdisplay;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.*;

import java.util.Objects;

public class HealthDisplayPlayerEvents implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        Scoreboard scoreboard = player.getScoreboard();
        String displayText = ChatColor.RED + "❤";

        if (scoreboard.getObjective("health") == null) {
            Objective healthIndicator = scoreboard.registerNewObjective("health", Criteria.HEALTH, displayText);
            healthIndicator.setDisplaySlot(DisplaySlot.BELOW_NAME);
        }

        // Update the objective display text to the latest one if already created.
        Objects.requireNonNull(scoreboard.getObjective("health")).setDisplayName(displayText);
    }
}
