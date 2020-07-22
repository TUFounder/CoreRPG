package ru.meedway.corerpg;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import net.minecraft.server.v1_12_R1.EntityCreature;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftEntity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;


public class War implements Listener{
    public static ArrayList<Player> warplayer = new ArrayList<>();
      public Map<UUID, ItemStack[]> inventories = new HashMap();
      public Map<UUID, ItemStack[]> armor = new HashMap();
      public static boolean war = false;
    
    public static void Notification(){        
        for(Player p : Bukkit.getOnlinePlayers()){
            p.sendTitle("§cРЕЙД", "§cВнимание, началась война за шахту!");
            p.playSound(p.getLocation(), Sound.ENTITY_ENDERDRAGON_HURT, 5.0F, 4.0F);
            YesWAR(p);
        }
        Bukkit.broadcastMessage("--------------------------------------------");
        Bukkit.broadcastMessage("Война за шахту это сражение за территорию");
        Bukkit.broadcastMessage("в которых имеется огромное количество ценных ресурсов.");
        Bukkit.broadcastMessage("Вам следует войти на войну нажав на НПС - Патрульный/Рейд");
        Bukkit.broadcastMessage("и защищать энергетический кристал от монстров!");
        Bukkit.broadcastMessage("--------------------------------------------");
    }
    
    public static void onStart(){
        Notification();
        Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {
            onStartNPC();
        }},20*30);
        
    }
    
      @EventHandler
  public void onDeath(PlayerDeathEvent e) {
    Player p = e.getEntity();
    if(warplayer.contains(null))return;
    if (warplayer.contains(p.getName())) {
      this.inventories.put(p.getUniqueId(), p.getInventory().getContents());
      this.armor.put(p.getUniqueId(), p.getInventory().getArmorContents());  
    if ((this.inventories.containsKey(p.getUniqueId())) || (this.armor.containsKey(p.getUniqueId())))
      e.getDrops().clear();}}
  
  @EventHandler
  public void onRespawn(PlayerRespawnEvent e){
    Player p = e.getPlayer();
    if(warplayer.contains(null))return;
    if (warplayer.contains(p.getName())) {
    if (this.inventories.containsKey(e.getPlayer().getUniqueId())) {
      p.getInventory().setContents((ItemStack[])this.inventories.get(p.getUniqueId()));
    }
    if (this.armor.containsKey(p.getUniqueId()))
      p.getInventory().setArmorContents((ItemStack[])this.armor.get(p.getUniqueId()));
  }}

    
    public static void onStartNPC(){
            Location l = new Location(Bukkit.getWorld("world"), 102.5, 88.5, 96.5, 179.7f, 8f);
            Villager v = (Villager)l.getWorld().spawnEntity(l, EntityType.VILLAGER);
            v.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 999999999, 10, true, false));
            v.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 999999999, 5, true, false));
            v.setCustomNameVisible(true);
            v.setCustomName("Патрульный");
            v.setCollidable(false);
            v.setAI(false);
            v.resetMaxHealth();
            v.setGravity(false);
            v.setSilent(false);
            
            v.setVelocity(new Vector(0, 0, 0));
            
        new BukkitRunnable(){
            @Override
            public void run() {
            Material m = v.getLocation().subtract(0, 0, 0).getBlock().getType();
            Location l2 = new Location(Bukkit.getWorld("world"), 0, -0.2, 0);
            if(m == Material.AIR){
             v.teleport(l.add(l2));
                Utils.Firework(l, 1);
            }else{
                cancel();
            }
                 }
            }.runTaskTimer(Bukkit.getPluginManager().getPlugin("CoreRPG"), 0L, (long)(5)); 
    }
    
  public static void YesWAR(Player p)
   {
      Inventory inv = Bukkit.createInventory(null, 27, "▸ Рейд"); 
      
     inv.setItem(11, ShopItems.SIUPGRADE(2));  
     inv.setItem(15, ShopItems.SIUPGRADE(1));
      p.openInventory(inv);
   }
  
    public static ItemStack SIUPGRADE(int num){
        if(num == 1){
            ItemStack i= new ItemStack(Material.BARRIER,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§cНе пойду, я мирный");
            i.setItemMeta(im); 
           return i;
        }else if(num == 2){
            ItemStack i= new ItemStack(Material.EMERALD,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПринять участие в рейде?");
            i.setItemMeta(im); 
           return i;
        }
        return null;
    }
    
  @EventHandler
   public static void onMainMenu(InventoryClickEvent event) throws SQLException {
    String in = event.getInventory().getName();
    Inventory inv = event.getInventory();
    final Player p = (Player) event.getWhoClicked();
    String ps = p.getName();
    int l = Levels.getLevel(p.getName());
    if(in.equalsIgnoreCase("▸ Рейд")) {
        event.setCancelled(true);        
        switch(event.getRawSlot()){
            case 11:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {
                    //Перемещение
                    p.sendMessage("Отправляемся в шахты");
                    }},1);break;}
            case 15:{p.closeInventory();break;}
        }
     }
   }
    
   public static void JustMob(){
       //Установить координаты
          Location l = new Location(Bukkit.getWorld("world"), 0, -0.2, 0);
          LivingEntity e= l.getWorld().spawn(l, Zombie.class);
          
           new BukkitRunnable(){
            @Override
            public void run() {
              ((EntityCreature) ((CraftEntity) e).getHandle()).getNavigation().a(22, 87, 12, 1D); 
               }
            }.runTaskTimer(Bukkit.getPluginManager().getPlugin("CoreRPG"), 0L, (long)(5));
   }
   
   public static String getTimeWeek(){       
       Date now = new Date();
       SimpleDateFormat format = new SimpleDateFormat("EEEE");
       //Bukkit.broadcastMessage("День недели "+format.format(now));
        return format.format(now);
   }
   
   public static int getTimeHour(){
       Calendar c = new GregorianCalendar();
       //Bukkit.broadcastMessage("Часы: "+c.get(Calendar.HOUR));
        return c.get(Calendar.HOUR);
   }
}
