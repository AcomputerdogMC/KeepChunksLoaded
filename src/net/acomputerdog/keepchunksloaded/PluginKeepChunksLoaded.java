package net.acomputerdog.keepchunksloaded;

import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkUnloadEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginKeepChunksLoaded extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        //register event
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        //unregister event to prevent duplicate firing after /reload
        HandlerList.unregisterAll((JavaPlugin) this);
    }

    /**
     * Traps and cancels the ChunkUnloadEvent.
     *
     * @param e Event object
     */
    @EventHandler
    public void onChunkUnload(ChunkUnloadEvent e) {
        e.setCancelled(true);
    }
}
