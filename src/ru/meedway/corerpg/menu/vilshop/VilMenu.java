package ru.meedway.corerpg.menu.vilshop;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public class VilMenu {
      public static Map<Integer, ItemStack> vilinventory = new HashMap();
      public static void onMenu(Player p)
   {
      Inventory inv = Bukkit.createInventory(null, 27, "▸ Караванщик"); 
      for(int i =0; i<=26;i++){inv.setItem(i, vilinventory.get(i));}
      
      
      p.openInventory(inv);
   }
}
