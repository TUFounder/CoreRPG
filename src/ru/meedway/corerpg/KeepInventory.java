package ru.meedway.corerpg;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;


public class KeepInventory implements Listener{
    
  public Map<UUID, ItemStack[]> inventories = new HashMap();
  public Map<UUID, ItemStack[]> armor = new HashMap();

    
    
  @EventHandler
  public void onDeath(PlayerDeathEvent e) {
    Player p = e.getEntity();
    if (Main.inpvp.contains(p.getName())) {
      this.inventories.put(p.getUniqueId(), p.getInventory().getContents());
      this.armor.put(p.getUniqueId(), p.getInventory().getArmorContents());  
    if ((this.inventories.containsKey(p.getUniqueId())) || (this.armor.containsKey(p.getUniqueId())))
      e.getDrops().clear();}}
  
  @EventHandler
  public void onRespawn(PlayerRespawnEvent e) {
    Player p = e.getPlayer();
    if (Main.inpvp.contains(p.getName())) {
    if (this.inventories.containsKey(e.getPlayer().getUniqueId())) {
      p.getInventory().setContents((ItemStack[])this.inventories.get(p.getUniqueId()));
    }
    if (this.armor.containsKey(p.getUniqueId()))
      p.getInventory().setArmorContents((ItemStack[])this.armor.get(p.getUniqueId()));
  }}
}
