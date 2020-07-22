package ru.meedway.corerpg.menu.vilshop;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import ru.meedway.corerpg.Main;



public class VilClick implements Listener{
    
    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        
        Player p = (Player)e.getWhoClicked();
        ItemStack i = e.getCurrentItem();
        if(e.getCurrentItem() == null){
			return;
		}
        if(e.getInventory().getName().equalsIgnoreCase("▸ Караванщик")){
          if(e.getClickedInventory().getName().equalsIgnoreCase("▸ Караванщик")){
            if(i==null)return;
            if(i.getItemMeta()==null)return;
            String lore = i.getItemMeta().getLore().get(4).toString();
            int price = Integer.parseInt(lore.substring(15));
            String about = (i.getItemMeta().getLore().get(2).toString()).substring(4);
            if(Main.economy.getBalance(p.getName()) >= price){Main.economy.withdrawPlayer(p.getName(), price);
                  p.sendMessage("§a▸ Вы совершили обмен с караванщиком, он дал вам : "+i.getType().name());  
                    p.getInventory().addItem(VilItem.onItem(i.getType(), about, 0));
                    e.setCancelled(true);
                   }else{
             p.closeInventory();
             p.sendMessage("§4▸ Недостаточно монет для покупки");
          }
        }
       }
    }
}
