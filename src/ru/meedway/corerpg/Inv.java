package ru.meedway.corerpg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class Inv implements Listener{
    private static final Map<Player, ItemStack[]> INVENTORIES = new HashMap<>();
    private static final Map<Player, ItemStack[]> ARMORS = new HashMap<>();
    HashMap<Player, ArrayList<ItemStack>> itemHash = new HashMap();

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerDeath(PlayerDeathEvent e) {
        Player p = e.getEntity();
        List<ItemStack> contents = new ArrayList<>();
        for (ItemStack drop : new ArrayList<>(e.getDrops())) {

            if (drop.getItemMeta().hasEnchant(Enchantment.OXYGEN)) {
                contents.add(drop);
                e.getDrops().remove(drop);
            }
        }
        INVENTORIES.put(p, contents.toArray(new ItemStack[contents.size()]));
    }

    @EventHandler(priority = EventPriority.LOW)
    public void onPlayerRespawn(PlayerRespawnEvent e) {
        Player p = e.getPlayer();
        if(INVENTORIES.get(p)!=null){
         p.getInventory().addItem(INVENTORIES.get(p));
         INVENTORIES.remove(p);   
        }
        
    }
    
    /*@EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        ArrayList<ItemStack> items = new ArrayList<ItemStack>();
        for (ItemStack item : event.getDrops()) {
            if (!item.getItemMeta().getDisplayName().endsWith("§b [Ⓢ]")) continue;
            items.add(item);
        }
        event.getDrops().removeAll(items);
        this.itemHash.put(event.getEntity(), items);
    }
    
    @EventHandler
    public void onSoulboundRespawn(PlayerRespawnEvent event) {
        this.itemHash.get((Object)event.getPlayer()).stream().forEach(item -> {
            HashMap hashMap = event.getPlayer().getInventory().addItem(new ItemStack[]{item});
        });
        this.itemHash.remove((Object)event.getPlayer());
    }*/
    
    
  @EventHandler
  public void onPech(InventoryClickEvent e)
  {
    if ((e.getAction() == InventoryAction.SWAP_WITH_CURSOR) && 
      ((e.getWhoClicked() instanceof Player)))
    {
      Player plr = (Player)e.getWhoClicked();
      /*Например звезда визера*/
      if ((e.getCursor().getType() == Material.NETHER_STAR) && 
        (e.getCursor().hasItemMeta()) && 
        (e.getCursor().getItemMeta().hasLore()) && 
        (e.getCursor().getItemMeta().getDisplayName().contains("§bПечать стойкости")||
              e.getCursor().getItemMeta().getDisplayName().contains("§bПечать нерушимости")))
      {
        /*Печать стойкости*/
        if(e.getCursor().getItemMeta().getDisplayName().contains("§bПечать стойкости")){
           if(!e.getCurrentItem().getItemMeta().getDisplayName().endsWith("§b [Ⓝ]")){
              if(!e.getCurrentItem().getItemMeta().getDisplayName().endsWith("§b [Ⓢ]")){
                e.setCancelled(true);  
                ItemMeta meta = e.getCurrentItem().getItemMeta();
                meta.setDisplayName(meta.getDisplayName()+"§b [Ⓢ]");
                meta.addEnchant(Enchantment.OXYGEN, 1, false);
                meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                e.getCurrentItem().setItemMeta(meta);
                ItemStack cursor = e.getCursor();
                cursor.setAmount(cursor.getAmount() - 1);
                plr.setItemOnCursor(cursor);
                plr.updateInventory();
              }
           }else{
               e.setCancelled(true);
               plr.sendMessage("§cНа данном предмете установлена печать нерушимости, прокачайте предмет для удаления данной печати");
           }
        }
        /*Печать нерушимости*/
        else if(e.getCursor().getItemMeta().getDisplayName().contains("§bПечать нерушимости")){
          if(!e.getCurrentItem().getItemMeta().getDisplayName().endsWith("§b [Ⓢ]")){
              if(!e.getCurrentItem().getItemMeta().getDisplayName().endsWith("§b [Ⓝ]")){
                e.setCancelled(true);  
                ItemMeta meta = e.getCurrentItem().getItemMeta();
                meta.setDisplayName(meta.getDisplayName()+"§b [Ⓝ]");
                e.getCurrentItem().setItemMeta(meta);
                ItemStack cursor = e.getCursor();
                cursor.setAmount(cursor.getAmount() - 1);
                plr.setItemOnCursor(cursor);
                plr.updateInventory();
              }
           }else{
               
               e.setCancelled(true);
               plr.sendMessage("§cНа данном предмете установлена печать стойкости, на данный предмет запрещено накладывать 2 печати");
           }  
        }
      }
    }
  }
}
