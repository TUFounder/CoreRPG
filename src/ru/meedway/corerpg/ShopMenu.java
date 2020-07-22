package ru.meedway.corerpg;

import java.util.HashMap;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;



public class ShopMenu implements Listener
{
 public static HashMap<Player, Player> report = new HashMap<>();   
  public static void onMainMenu(Player p)
   {
      Inventory inv = Bukkit.createInventory(null, 27, "▸ Торговец"); 
      for(int i =0; i<=11;i++){inv.setItem(i, new ItemStack(Material.AIR));}
      inv.setItem(13, new ItemStack(Material.AIR));
      for(int i =15; i<=26;i++){inv.setItem(i, new ItemStack(Material.AIR));}
     /*Продажа*/inv.setItem(11, ShopItems.SIMAIN(1));
     /*Аукцион*/inv.setItem(13, ShopItems.SIMAIN(3));
     /*Покупка*/inv.setItem(15, ShopItems.SIMAIN(2));  
      p.openInventory(inv);
   }
  public static void onTutorial(Player p)
   {
      Inventory inv = Bukkit.createInventory(null, 27, "▸ Обучение"); 
      for(int i =0; i<=11;i++){inv.setItem(i, new ItemStack(Material.AIR));}
      inv.setItem(13, new ItemStack(Material.AIR));
      for(int i =15; i<=26;i++){inv.setItem(i, new ItemStack(Material.AIR));}
     /*Продажа*/inv.setItem(12, ShopItems.SITUTORIAL(1));
     /*Покупка*/inv.setItem(14, ShopItems.SITUTORIAL(2));  
      p.openInventory(inv);
   }
  public static void onLocaion(Player p)
   {
      Inventory inv = Bukkit.createInventory(null, 54, "▸ Локации");
      if(Levels.getArhont(p.getName())){
         inv.setItem(4, ShopItems.SITP(1));
         inv.setItem(13, ShopItems.SITP(2));
         inv.setItem(14, ShopItems.SITP(3));
         inv.setItem(15, ShopItems.SITP(4));
         inv.setItem(16, ShopItems.SITP(5));
         inv.setItem(25, ShopItems.SITP(6));
         inv.setItem(34, ShopItems.SITP(7));
         inv.setItem(33, ShopItems.SITP(8));
         inv.setItem(32, ShopItems.SITP(9));
         inv.setItem(31, ShopItems.SITP(10));
         inv.setItem(30, ShopItems.SITP(11));
         inv.setItem(29, ShopItems.SITP(12));
         inv.setItem(28, ShopItems.SITP(13));
         inv.setItem(37, ShopItems.SITP(14));
         inv.setItem(46, ShopItems.SITP(15));
         inv.setItem(47, ShopItems.SITP(16));
      }
      if(Levels.getLevel(p.getName()) >= 1){inv.setItem(4, ShopItems.SITP(1)); }else{inv.setItem(4, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 2){inv.setItem(13, ShopItems.SITP(2)); }else{inv.setItem(13, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 3){inv.setItem(14, ShopItems.SITP(3)); }else{inv.setItem(14, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 4){inv.setItem(15, ShopItems.SITP(4)); }else{inv.setItem(15, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 5){inv.setItem(16, ShopItems.SITP(5)); }else{inv.setItem(16, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 6){inv.setItem(25, ShopItems.SITP(6)); }else{inv.setItem(25, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 7){inv.setItem(34, ShopItems.SITP(7)); }else{inv.setItem(34, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 8){inv.setItem(33, ShopItems.SITP(8)); }else{inv.setItem(33, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 9){inv.setItem(32, ShopItems.SITP(9)); }else{inv.setItem(32, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 10){inv.setItem(31, ShopItems.SITP(10)); }else{inv.setItem(31, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 11){inv.setItem(30, ShopItems.SITP(11)); }else{inv.setItem(30, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 13){inv.setItem(29, ShopItems.SITP(12)); }else{inv.setItem(29, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 14){inv.setItem(28, ShopItems.SITP(13)); }else{inv.setItem(28, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 15){inv.setItem(37, ShopItems.SITP(14)); }else{inv.setItem(37, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 17){inv.setItem(46, ShopItems.SITP(15)); }else{inv.setItem(46, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 19){inv.setItem(47, ShopItems.SITP(16)); }else{inv.setItem(47, ShopItems.SINONE());}
      inv.setItem(49, ShopItems.SINONE1());
      inv.setItem(10, ShopItems.SITPRUDA(1));
      p.openInventory(inv);
   }
  
  public static void onLocaion2(Player p)
   {
      Inventory inv = Bukkit.createInventory(null, 54, "▸ Измерение");
      if(Levels.getArhont(p.getName())){
        inv.setItem(4, ShopItems.SITP1(1));  
        inv.setItem(13, ShopItems.SITP1(2));
        inv.setItem(14, ShopItems.SITP1(3));
      }
      if(Levels.getLevel(p.getName()) >= 23){inv.setItem(4, ShopItems.SITP1(1)); }else{inv.setItem(4, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 25){inv.setItem(13, ShopItems.SITP1(2)); }else{inv.setItem(13, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 27){inv.setItem(14, ShopItems.SITP1(3)); }else{inv.setItem(14, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 101){inv.setItem(15, ShopItems.SITP1(4)); }else{inv.setItem(15, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 101){inv.setItem(16, ShopItems.SITP1(5)); }else{inv.setItem(16, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 101){inv.setItem(25, ShopItems.SITP1(6)); }else{inv.setItem(25, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 101){inv.setItem(34, ShopItems.SITP1(7)); }else{inv.setItem(34, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 101){inv.setItem(33, ShopItems.SITP1(8)); }else{inv.setItem(33, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 101){inv.setItem(32, ShopItems.SITP1(9)); }else{inv.setItem(32, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 101){inv.setItem(31, ShopItems.SITP1(10)); }else{inv.setItem(31, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 101){inv.setItem(30, ShopItems.SITP1(11)); }else{inv.setItem(30, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 101){inv.setItem(29, ShopItems.SITP1(12)); }else{inv.setItem(29, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 101){inv.setItem(28, ShopItems.SITP1(13)); }else{inv.setItem(28, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 101){inv.setItem(37, ShopItems.SITP1(14)); }else{inv.setItem(37, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 101){inv.setItem(46, ShopItems.SITP1(15)); }else{inv.setItem(46, ShopItems.SINONE());}
      if(Levels.getLevel(p.getName()) >= 101){inv.setItem(47, ShopItems.SITP1(16)); }else{inv.setItem(47, ShopItems.SINONE());}
      inv.setItem(49, ShopItems.SINONE());
      p.openInventory(inv);
   }
  
  public static void onSword(Player p)
   {
      int l = Levels.getLevel(p.getName())-1;
      Inventory inv = Bukkit.createInventory(null, 54, "▸ Мечи"); 
      for(int i =25; i<=51;i++){inv.setItem(i, new ItemStack(Material.AIR));}
      for(int i =52; i<=53;i++){inv.setItem(i, new ItemStack(Material.AIR));}
      for(int i =0; i<=24;i++){
          if(l>=i){
             inv.setItem(i, ShopItems.SISworld(i+1,true)); 
          }
      }
     /*Оружие*/inv.setItem(47, ShopItems.SIMENU(1));
     /*Броня*/inv.setItem(48, ShopItems.SIMENU(2)); 
     /*Щиты*/inv.setItem(49, ShopItems.SIMENU(3));
     /*Прокачка*/inv.setItem(50, ShopItems.SIMENU(4)); 
     /*Донат*/inv.setItem(51, ShopItems.SIMENU(5)); 
      p.openInventory(inv);
   }
  
  public static void onBroni1(Player p)
   {    
      int l = Levels.getLevel(p.getName());
      Inventory inv = Bukkit.createInventory(null, 54, "▸ Броня 1"); 
      for(int i =27; i<=46;i++){inv.setItem(i, new ItemStack(Material.AIR));}
      for(int i =52; i<=53;i++){inv.setItem(i, new ItemStack(Material.AIR));}
      
      for(int i =0; i<=26;i++){
          if(l>=1){
            inv.setItem(0, ShopItems.SIChestPlate(1,true));
            inv.setItem(9, ShopItems.SIPonoji(1,true));
            inv.setItem(18, ShopItems.SIBoots(1,true));}
          if(l>=2){
            inv.setItem(1, ShopItems.SIChestPlate(2,true));
            inv.setItem(10, ShopItems.SIPonoji(2,true));
            inv.setItem(19, ShopItems.SIBoots(2,true));}
          if(l>=3){
            inv.setItem(2, ShopItems.SIChestPlate(3,true));
            inv.setItem(11, ShopItems.SIPonoji(3,true));
            inv.setItem(20, ShopItems.SIBoots(3,true));}
          if(l>=4){
            inv.setItem(3, ShopItems.SIChestPlate(4,true));
            inv.setItem(12, ShopItems.SIPonoji(4,true));
            inv.setItem(21, ShopItems.SIBoots(4,true));}
          if(l>=5){
            inv.setItem(4, ShopItems.SIChestPlate(5,true));
            inv.setItem(13, ShopItems.SIPonoji(5,true));
            inv.setItem(22, ShopItems.SIBoots(5,true));}
          if(l>=6){
            inv.setItem(5, ShopItems.SIChestPlate(6,true));
            inv.setItem(14, ShopItems.SIPonoji(6,true));
            inv.setItem(23, ShopItems.SIBoots(6,true));}
          if(l>=7){
            inv.setItem(6, ShopItems.SIChestPlate(7,true));
            inv.setItem(15, ShopItems.SIPonoji(7,true));
            inv.setItem(24, ShopItems.SIBoots(7,true));}
          if(l>=8){
            inv.setItem(7, ShopItems.SIChestPlate(8,true));
            inv.setItem(16, ShopItems.SIPonoji(8,true));
            inv.setItem(25, ShopItems.SIBoots(8,true));}
          if(l>=9){
            inv.setItem(8, ShopItems.SIChestPlate(9,true));
            inv.setItem(17, ShopItems.SIPonoji(9,true));
            inv.setItem(26, ShopItems.SIBoots(9,true));}
      }
      /*Переход*/inv.setItem(53, ShopItems.SIUPGRADE(3));
      
     /*Оружие*/inv.setItem(47, ShopItems.SIMENU(1));
     /*Броня*/inv.setItem(48, ShopItems.SIMENU(2)); 
     /*Щиты*/inv.setItem(49, ShopItems.SIMENU(3));
     /*Прокачка*/inv.setItem(50, ShopItems.SIMENU(4)); 
     /*Донат*/inv.setItem(51, ShopItems.SIMENU(5)); 
      p.openInventory(inv);
   }
  
  public static void onBroni2(Player p)
   {    
      int l = Levels.getLevel(p.getName());
      Inventory inv = Bukkit.createInventory(null, 54, "▸ Броня 2"); 
      for(int i =27; i<=46;i++){inv.setItem(i, new ItemStack(Material.AIR));}
      for(int i =52; i<=53;i++){inv.setItem(i, new ItemStack(Material.AIR));}
      
      for(int i =0; i<=26;i++){
          if(l>=10){
            inv.setItem(0, ShopItems.SIChestPlate(10,true));
            inv.setItem(9, ShopItems.SIPonoji(10,true));
            inv.setItem(18, ShopItems.SIBoots(10,true));}
          if(l>=11){
            inv.setItem(1, ShopItems.SIChestPlate(11,true));
            inv.setItem(10, ShopItems.SIPonoji(11,true));
            inv.setItem(19, ShopItems.SIBoots(11,true));}
          if(l>=12){
            inv.setItem(2, ShopItems.SIChestPlate(12,true));
            inv.setItem(11, ShopItems.SIPonoji(12,true));
            inv.setItem(20, ShopItems.SIBoots(12,true));}
          if(l>=13){
            inv.setItem(3, ShopItems.SIChestPlate(13,true));
            inv.setItem(12, ShopItems.SIPonoji(13,true));
            inv.setItem(21, ShopItems.SIBoots(13,true));}
          if(l>=14){
            inv.setItem(4, ShopItems.SIChestPlate(14,true));
            inv.setItem(13, ShopItems.SIPonoji(14,true));
            inv.setItem(22, ShopItems.SIBoots(14,true));}
          if(l>=15){
            inv.setItem(5, ShopItems.SIChestPlate(15,true));
            inv.setItem(14, ShopItems.SIPonoji(15,true));
            inv.setItem(23, ShopItems.SIBoots(15,true));}
          if(l>=16){
            inv.setItem(6, ShopItems.SIChestPlate(16,true));
            inv.setItem(15, ShopItems.SIPonoji(16,true));
            inv.setItem(24, ShopItems.SIBoots(16,true));}
          if(l>=17){
            inv.setItem(7, ShopItems.SIChestPlate(17,true));
            inv.setItem(16, ShopItems.SIPonoji(17,true));
            inv.setItem(25, ShopItems.SIBoots(17,true));}
          if(l>=18){
            inv.setItem(8, ShopItems.SIChestPlate(18,true));
            inv.setItem(17, ShopItems.SIPonoji(18,true));
            inv.setItem(26, ShopItems.SIBoots(18,true));}
      }
      /*Переход*/inv.setItem(53, ShopItems.SIUPGRADE(3));

     /*Оружие*/inv.setItem(47, ShopItems.SIMENU(1));
     /*Броня*/inv.setItem(48, ShopItems.SIMENU(2)); 
     /*Щиты*/inv.setItem(49, ShopItems.SIMENU(3));
     /*Прокачка*/inv.setItem(50, ShopItems.SIMENU(4)); 
     /*Донат*/inv.setItem(51, ShopItems.SIMENU(5)); 
      p.openInventory(inv);
   }
  public static void onBroni3(Player p)
   {    
      int l = Levels.getLevel(p.getName());
      Inventory inv = Bukkit.createInventory(null, 54, "▸ Броня 3"); 
      for(int i =27; i<=46;i++){inv.setItem(i, new ItemStack(Material.AIR));}
      for(int i =52; i<=53;i++){inv.setItem(i, new ItemStack(Material.AIR));}
      
      for(int i =0; i<=26;i++){
          if(l>=19){
            inv.setItem(0, ShopItems.SIChestPlate(19,true));
            inv.setItem(9, ShopItems.SIPonoji(19,true));
            inv.setItem(18, ShopItems.SIBoots(19,true));}
          if(l>=20){
            inv.setItem(1, ShopItems.SIChestPlate(20,true));
            inv.setItem(10, ShopItems.SIPonoji(20,true));
            inv.setItem(19, ShopItems.SIBoots(20,true));}
      }


     /*Оружие*/inv.setItem(47, ShopItems.SIMENU(1));
     /*Броня*/inv.setItem(48, ShopItems.SIMENU(2)); 
     /*Щиты*/inv.setItem(49, ShopItems.SIMENU(3));
     /*Прокачка*/inv.setItem(50, ShopItems.SIMENU(4)); 
     /*Донат*/inv.setItem(51, ShopItems.SIMENU(5)); 
      p.openInventory(inv);
   }
  
  public static void onShield(Player p)
   {
      int l = Levels.getLevel(p.getName())-1;
      Inventory inv = Bukkit.createInventory(null, 54, "▸ Щиты"); 
      for(int i =25; i<=46;i++){inv.setItem(i, new ItemStack(Material.AIR));}
      for(int i =52; i<=53;i++){inv.setItem(i, new ItemStack(Material.AIR));}
      for(int i =0; i<=24;i++){
          if(l>=i){
             inv.setItem(i, ShopItems.SIShield(i+1,true)); 
          }
      }
     /*Оружие*/inv.setItem(47, ShopItems.SIMENU(1));
     /*Броня*/inv.setItem(48, ShopItems.SIMENU(2)); 
     /*Щиты*/inv.setItem(49, ShopItems.SIMENU(3));
     /*Прокачка*/inv.setItem(50, ShopItems.SIMENU(4)); 
     /*Донат*/inv.setItem(51, ShopItems.SIMENU(5)); 
      p.openInventory(inv);
   }
  
  public static void onUpgrade(Player p)
   {
      int l = Levels.getLevel(p.getName())-1;
      Inventory inv = Bukkit.createInventory(null, 54, "▸ Прокачка"); 
      for(int i =28; i<=46;i++){inv.setItem(i, new ItemStack(Material.AIR));}
      for(int i =10; i<=17;i++){inv.setItem(i, new ItemStack(Material.AIR));}
      for(int i =52; i<=53;i++){inv.setItem(i, new ItemStack(Material.AIR));}
      for(int i =0; i<=9;i++){
          if(l>=i){
             inv.setItem(i, ShopItems.SIBOOK(i+1,true)); }
      }
      for(int i =18; i<=27;i++){
          if(l>=i-17){
             inv.setItem(i, ShopItems.SIBOOKHP(i-17,true)); }
      }
             
     /*Оружие*/inv.setItem(47, ShopItems.SIMENU(1));
     /*Броня*/inv.setItem(48, ShopItems.SIMENU(2)); 
     /*Щиты*/inv.setItem(49, ShopItems.SIMENU(3));
     /*Прокачка*/inv.setItem(50, ShopItems.SIMENU(4)); 
     /*Донат*/inv.setItem(51, ShopItems.SIMENU(5)); 
      p.openInventory(inv);
   }
  
  public static void onDonate(Player p)
   {
      Inventory inv = Bukkit.createInventory(null, 54, "▸ Донат"); 
      for(int i =0; i<=46;i++){inv.setItem(i, new ItemStack(Material.AIR));}
      for(int i =52; i<=53;i++){inv.setItem(i, new ItemStack(Material.AIR));}

      inv.setItem(0, ShopItems.SIPREMIUM(0, p, true));
      inv.setItem(9, ShopItems.SIPREMIUM(1, p, true));
      inv.setItem(18, ShopItems.SIPREMIUM(2, p, true));
      
      inv.setItem(1, ShopItems.SIPREMIUM(3, p, true));
      inv.setItem(10, ShopItems.SIPREMIUM(4, p, true));
      inv.setItem(19, ShopItems.SIPREMIUM(5, p, true));
      
      inv.setItem(2, ShopItems.SIPREMIUM(6, p, true));
      inv.setItem(11, ShopItems.SIPREMIUM(7, p, true));
      
      inv.setItem(3, ShopItems.SIPREMIUM(8, p, true));
      inv.setItem(12, ShopItems.SIPREMIUM(9, p, true));
      
      inv.setItem(4, ShopItems.SIPREMIUM(10, p, true));
      inv.setItem(13, ShopItems.SIPREMIUM(11, p, true));
      inv.setItem(22, ShopItems.SIPREMIUM(12, p, true));
      
      inv.setItem(5, ShopItems.SIPREMIUM(15, p, true));
      
      inv.setItem(6, ShopItems.SIPREMIUM(13, p, true));
      
      inv.setItem(7, ShopItems.SIPREMIUM(14, p, true));
      
      //inv.setItem(16, ShopItems.SIPREMIUM(20, p, true));
      /*inv.setItem(25, ShopItems.SIPREMIUM(21, p, true));
      inv.setItem(8, ShopItems.SIPREMIUM(22, p, true));
      inv.setItem(34, ShopItems.SIPREMIUM(23, p, true));
      inv.setItem(43, ShopItems.SIPREMIUM(24, p, true));
      inv.setItem(52, ShopItems.SIPREMIUM(25, p, true));
      inv.setItem(17, ShopItems.SIPREMIUM(26, p, true));
      inv.setItem(26, ShopItems.SIPREMIUM(27, p, true));*/
      
      //inv.setItem(8, ShopItems.SIPREMIUM(16, p, true));
      //inv.setItem(17, ShopItems.SIPREMIUM(17, p, true));
      inv.setItem(8, ShopItems.SIPECH(1, true));
      inv.setItem(17, ShopItems.SIPECH(2, true));
      
     /*Оружие*/inv.setItem(47, ShopItems.SIMENU(1));
     /*Броня*/inv.setItem(48, ShopItems.SIMENU(2)); 
     /*Щиты*/inv.setItem(49, ShopItems.SIMENU(3));
     /*Прокачка*/inv.setItem(50, ShopItems.SIMENU(4)); 
     /*Донат*/inv.setItem(51, ShopItems.SIMENU(5)); 
      p.openInventory(inv);
   }
  
  public static void onLvlMenu(Player p)
   {
      Inventory inv = Bukkit.createInventory(null, 54, "▸ Награды"); 
      for(int i =0; i<=9;i++){inv.setItem(i, new ItemStack(Material.AIR));}
      for(int i =22; i<=48;i++){inv.setItem(i, new ItemStack(Material.AIR));}
      for(int i =50; i<=53;i++){inv.setItem(i, new ItemStack(Material.AIR));}
      if(Levels.getLevel(p.getName()) >= 1){inv.setItem(10, ShopItems.SIPRIZE(1,p.getName())); }else{inv.setItem(10, ShopItems.SIPRIZE(0,p.getName()));}
      if(Levels.getLevel(p.getName()) >= 1){inv.setItem(11, ShopItems.SIPRIZE(2,p.getName())); }else{inv.setItem(11, ShopItems.SIPRIZE(0,p.getName()));}
      if(Levels.getLevel(p.getName()) >= 1){inv.setItem(12, ShopItems.SIPRIZE(3,p.getName())); }else{inv.setItem(12, ShopItems.SIPRIZE(0,p.getName()));}
      if(Levels.getLevel(p.getName()) >= 1){inv.setItem(13, ShopItems.SIPRIZE(4,p.getName())); }else{inv.setItem(13, ShopItems.SIPRIZE(0,p.getName()));}
      if(Levels.getLevel(p.getName()) >= 1){inv.setItem(14, ShopItems.SIPRIZE(5,p.getName())); }else{inv.setItem(14, ShopItems.SIPRIZE(0,p.getName()));}
      if(Levels.getLevel(p.getName()) >= 1){inv.setItem(15, ShopItems.SIPRIZE(6,p.getName())); }else{inv.setItem(15, ShopItems.SIPRIZE(0,p.getName()));}
      if(Levels.getLevel(p.getName()) >= 1){inv.setItem(16, ShopItems.SIPRIZE(7,p.getName())); }else{inv.setItem(16, ShopItems.SIPRIZE(0,p.getName()));}
      if(Levels.getLevel(p.getName()) >= 1){inv.setItem(19, ShopItems.SIPRIZE(8,p.getName())); }else{inv.setItem(19, ShopItems.SIPRIZE(0,p.getName()));}
      if(Levels.getLevel(p.getName()) >= 1){inv.setItem(20, ShopItems.SIPRIZE(9,p.getName())); }else{inv.setItem(20, ShopItems.SIPRIZE(0,p.getName()));}
      if(Levels.getLevel(p.getName()) >= 1){inv.setItem(21, ShopItems.SIPRIZE(10,p.getName())); }else{inv.setItem(21, ShopItems.SIPRIZE(0,p.getName()));}
      
      inv.setItem(49, ShopItems.SIPRIZE(-1,p.getName()));
     
      p.openInventory(inv);
   }
  
  public static void YesUpgrade(Player p)
   {
      Inventory inv = Bukkit.createInventory(null, 27, "▸ Улучшение оружия"); 
      
     inv.setItem(11, ShopItems.SIUPGRADE(1));  
     inv.setItem(15, ShopItems.SIUPGRADE(2));
      p.openInventory(inv);
   }
    public static void YesUpgradeHP(Player p)
   {
      Inventory inv = Bukkit.createInventory(null, 27, "▸ Улучшениe брони"); 
      
     inv.setItem(11, ShopItems.SIUPGRADE(1));  
     inv.setItem(15, ShopItems.SIUPGRADE(2));
      p.openInventory(inv);
   }
    
  public static void onQuests(Player p)
   {
      Inventory inv = Bukkit.createInventory(null, 54, "▸ Квесты"); 
       inv.setItem(20, ShopItems.SIQUESTS(1,p));
       inv.setItem(22, ShopItems.SIQUESTS(2,p));
       inv.setItem(24, ShopItems.SIQUESTS(3,p));

      inv.setItem(49, ShopItems.SIQUESTS(0,p));
      p.openInventory(inv);
   }
  
    public static void Village(Player p)
   {
      Inventory inv = Bukkit.createInventory(null, 27, "▸ Деревня"); 
      
     inv.setItem(26, ShopItems.Village(1));  
     inv.setItem(10, ShopItems.Village(2));
     inv.setItem(11, ShopItems.Village(4));
     inv.setItem(13, ShopItems.Village(3));
      p.openInventory(inv);
   }
    public static void onBilet(Player p)
   {
      Inventory inv = Bukkit.createInventory(null, 27, "▸ Билетер"); 
      
     inv.setItem(0, ShopItems.SIBILET(1,true));
     inv.setItem(1, ShopItems.SIBILET(2,true)); 
     inv.setItem(2, ShopItems.SIBILET(3,true)); 
      p.openInventory(inv);
   }
public static void onPlayerInfo(Player p, Player ep)
   {
      Inventory inv = Bukkit.createInventory(null, 54, "▸ Информация");
      ItemStack main;
      if(ep.getInventory().getItemInHand()==null){
          main = new ItemStack(Material.AIR);
      }else{
          main = ep.getInventory().getItemInHand();
      }
      ItemStack off;
      if(ep.getInventory().getItemInOffHand()==null){
          off = new ItemStack(Material.AIR);
      }else{
          off = ep.getInventory().getItemInOffHand();
      }
      inv.setItem(10, ep.getInventory().getHelmet());
      inv.setItem(19, ep.getInventory().getChestplate());
      inv.setItem(28, ep.getInventory().getLeggings());
      inv.setItem(37, ep.getInventory().getBoots());
      inv.setItem(21, main);
      inv.setItem(22, off);
      inv.setItem(24, ShopItems.onPlayerInfo(ep));
      inv.setItem(42, ShopItems.onPlayerReport(ep));
      inv.setItem(43, ShopItems.onPlayerClan(ep));
      report.put(p, ep);
      p.openInventory(inv);
   }

    public static void onSPO(Player p)
   {
      Inventory inv = Bukkit.createInventory(null, 27, "▸ Способности"); 
      
     inv.setItem(0, ShopItems.SISPO(0,p));
     inv.setItem(1, ShopItems.SISPO(1,p));
     inv.setItem(2, ShopItems.SISPO(2,p));
     inv.setItem(3, ShopItems.SISPO(3,p));
     inv.setItem(4, ShopItems.SISPO(4,p));
     inv.setItem(26, ShopItems.SISPO(10,p)); 
      p.openInventory(inv);
   }
    
    public static void onPIT(Player p)
   {
      Inventory inv = Bukkit.createInventory(null, 45, "▸ Боевые питомцы"); 
      
     inv.setItem(19, ShopItems.SIPIT(0,p));
     
     inv.setItem(21, ShopItems.SIPIT(1,p));
     inv.setItem(22, ShopItems.SIPIT(4,p));
     
     inv.setItem(33, ShopItems.SIPIT(2,p));
     inv.setItem(34, ShopItems.SIPIT(3,p));
     
     inv.setItem(15, ShopItems.SIPIT(5,p));
     inv.setItem(16, ShopItems.SIPIT(6,p));
      p.openInventory(inv);
   }
    
    public static void onPITSHOP(Player p)
   {
      Inventory inv = Bukkit.createInventory(null, 27, "▸ Магазин питомцев"); 
      
     inv.setItem(0, ShopItems.SIPIT(7,p));
     inv.setItem(1, ShopItems.SIPIT(8,p));
     inv.setItem(2, ShopItems.SIPIT(9,p));
     inv.setItem(3, ShopItems.SIPIT(10,p));
     inv.setItem(4, ShopItems.SIPIT(11,p));
     inv.setItem(5, ShopItems.SIPIT(12,p));
     inv.setItem(6, ShopItems.SIPIT(13,p));
     inv.setItem(7, ShopItems.SIPIT(14,p));
     inv.setItem(8, ShopItems.SIPIT(15,p));
     inv.setItem(9, ShopItems.SIPIT(16,p));
     inv.setItem(10, ShopItems.SIPIT(17,p));
     inv.setItem(11, ShopItems.SIPIT(18,p));
     inv.setItem(12, ShopItems.SIPIT(19,p));
     inv.setItem(13, ShopItems.SIPIT(20,p));
     inv.setItem(14, ShopItems.SIPIT(21,p));
     inv.setItem(15, ShopItems.SIPIT(22,p));
     inv.setItem(16, ShopItems.SIPIT(23,p));
     inv.setItem(17, ShopItems.SIPIT(24,p));
      p.openInventory(inv);
   }
    public static void onPITPROF(Player p)
   {
      Inventory inv = Bukkit.createInventory(null, 27, "▸ Профессия питомца"); 
      
     inv.setItem(12, ShopItems.SIPIT(25,p));
     inv.setItem(14, ShopItems.SIPIT(26,p));
      p.openInventory(inv);
   }
    
    public static void onNagrada(Player p)
   {
      Inventory inv = Bukkit.createInventory(null, 27, "▸ Награды/Информация"); 
      
     inv.setItem(12, ShopItems.Nagrada(0,p));
     inv.setItem(14, ShopItems.Nagrada(1,p));
      p.openInventory(inv);
   }
    public static void onNagI(Player p)
   {
      Inventory inv = Bukkit.createInventory(null, 27, "▸ Информация"); 
      
     inv.setItem(12, ShopItems.Nagrada(2,p));
      p.openInventory(inv);
   }
}
