package ru.meedway.corerpg.menu.location;

import java.sql.SQLException;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import ru.meedway.corerpg.Levels;
import ru.meedway.corerpg.ShopMenu;


public class LocationClick implements Listener{
   @EventHandler
   public static void onMainMenu(InventoryClickEvent event) throws SQLException {
    String in = event.getInventory().getName();
    Inventory inv = event.getInventory();
    final Player p = (Player) event.getWhoClicked();
    String ps = p.getName();
    int l = Levels.getLevel(p.getName());
      if(in.equalsIgnoreCase("▸ Локации")) {
        
        event.setCancelled(true);        
        switch(event.getRawSlot()){
            case 4:{
                if(Levels.getArhont(p.getName())){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 21.5, 69, 125.5, 28.8f, -1.9f));}
                if(l>=1){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 21.5, 69, 125.5, 28.8f, -1.9f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 10:{
                if(Levels.getArhont(p.getName())){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -656.5, 56, 79.5, 179.6f, 7.2f));}
                if(l>=1){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -656.5, 56, 79.5, 179.6f, 7.2f));
                p.sendTitle("§aЛокация: §eГородское поселение", "§cВнимание, пвп включено!");
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 13:{
                if(Levels.getArhont(p.getName())){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -12.7, 69, 122.2, 136.7f, -2.5f));}
                if(l>=2){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -12.7, 69, 122.2, 136.7f, -2.5f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 14:{
                if(Levels.getArhont(p.getName())){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 4.4, 68, 67.3, 179.7f, -0.9f));}
                if(l>=3){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 4.4, 68, 67.3, 179.7f, -0.9f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 15:{
                if(Levels.getArhont(p.getName())){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 24.5, 68, 60.5, -94.8f, -1));}
                if(l>=4){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 24.5, 68, 60.5, -94.8f, -1));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 16:{
                if(Levels.getArhont(p.getName())){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 19, 68, 8, 179.3f, -8.4f));}
                if(l>=5){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 19, 68, 8, 179.3f, -8.4f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 25:{
                if(Levels.getArhont(p.getName())){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 33.5, 68, -25.5, 178.3f, 0.4f));}
                if(l>=6){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 33.5, 68, -25.5, 178.3f, 0.4f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 34:{
                if(Levels.getArhont(p.getName())){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -8.5, 68, -23.5, 143.8f, 2.7f));}
                if(l>=7){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -8.5, 68, -23.5, 143.8f, 2.7f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 33:{
                if(Levels.getArhont(p.getName())){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -38.5, 67, -46.5, 103.3f, 3.3f));}
                if(l>=8){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -38.5, 67, -46.5, 103.3f, 3.3f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 32:{
                if(Levels.getArhont(p.getName())){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -71.5, 71, -77.5, 113.5f, -3));}
                if(l>=9){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -71.5, 71, -77.5, 113.5f, -3));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 31:{
                if(Levels.getArhont(p.getName())){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -119, 72, -26.5, -6.3f, -2.1f));}
                if(l>=10){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -119, 72, -26.5, -6.3f, -2.1f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 30:{
                if(Levels.getArhont(p.getName())){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -151.5, 68, -2.5, -1.7f, -2.1f));}
                if(l>=11){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -151.5, 68, -2.5, -1.7f, -2.1f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 29:{
                if(Levels.getArhont(p.getName())){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -31.5, 67, -68.5, 136.7f, -11.9f));}
                if(l>=13){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -31.5, 67, -68.5, 136.7f, -11.9f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 28:{
                if(Levels.getArhont(p.getName())){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 23.5, 72, -66.5, -155.1f, -0.8f));}
                if(l>=14){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 23.5, 72, -66.5, -155.1f, -0.8f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 37:{
                if(Levels.getArhont(p.getName())){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 4.5, 72, -110.5, -178.4f, 0.9f));}
                if(l>=15){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 4.5, 72, -110.5, -178.4f, 0.9f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 46:{
                if(Levels.getArhont(p.getName())){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 54.5, 68, -122.5, -57, -1.2f));}
                if(l>=17){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 54.5, 68, -122.5, -57, -1.2f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 47:{
                if(Levels.getArhont(p.getName())){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 102.5, 71, -76.5, -87.6f, -4.5f));}
                if(l>=19){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 102.5, 71, -76.5, -87.6f, -4.5f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 49:{
                if(Levels.getArhont(p.getName())){
                    p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {
                    ShopMenu.onLocaion2(p);
                    }},1);break;
                }
                if(l>=23){
                p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {
                    ShopMenu.onLocaion2(p);
                    }},1);break;
                
                }else{p.closeInventory();p.sendTitle("", "§cДля открытия недостаточно уровня");}break;}
        }
    }else if(in.equalsIgnoreCase("▸ Измерение")) {
        
        event.setCancelled(true);        
        switch(event.getRawSlot()){
            case 4:{
                if(Levels.getArhont(p.getName())){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 137.5, 45, 1230.5, 94.8f, 90f));}
                if(l>=23){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 137.5, 45, 1230.5, 94.8f, 90f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 13:{
                if(Levels.getArhont(p.getName())){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 77.7, 29, 1209.2, 93.6f, 0.2f));}
                if(l>=25){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 77.7, 29, 1209.2, 93.6f, 0.2f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 14:{
                if(Levels.getArhont(p.getName())){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 34.4, 29, 1193.3, 117.2f, 0.3f));}
                if(l>=27){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 34.4, 29, 1193.3, 117.2f, 0.3f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 15:{
                if(l>=40){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 24.5, 68, 60.5, -94.8f, -1));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 16:{
                if(l>=40){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 19, 68, 8, 179.3f, -8.4f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 25:{
                if(l>=40){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 33.5, 68, -25.5, 178.3f, 0.4f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 34:{
                if(l>=40){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -8.5, 68, -23.5, 143.8f, 2.7f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 33:{
                if(l>=40){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -38.5, 67, -46.5, 103.3f, 3.3f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 32:{
                if(l>=40){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -71.5, 71, -77.5, 113.5f, -3));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 31:{
                if(l>=40){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -119, 72, -26.5, -6.3f, -2.1f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 30:{
                if(l>=40){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -151.5, 68, -2.5, -1.7f, -2.1f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 29:{
                if(l>=40){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), -31.5, 67, -68.5, 136.7f, -11.9f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 28:{
                if(l>=40){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 23.5, 72, -66.5, -155.1f, -0.8f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 37:{
                if(l>=40){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 4.5, 72, -110.5, -178.4f, 0.9f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 46:{
                if(l>=40){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 54.5, 68, -122.5, -57, -1.2f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
            case 47:{
                if(l>=40){p.closeInventory();p.teleport(new Location(Bukkit.getWorld("world"), 102.5, 71, -76.5, -87.6f, -4.5f));
                }else{p.closeInventory();p.sendTitle("", "§cДля перемещения недостаточно уровня");}break;}
        }
       }
    }
}
