package ru.meedway.corerpg;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.scheduler.BukkitRunnable;



public class Utils implements Listener{
       public int count = 0;
       public void AS(int i){
            Location l = new Location(Bukkit.getWorld(""), 1 , 1 ,1 , 1f, 1f);
            ArmorStand a = (ArmorStand)l.getWorld().spawnEntity(l, EntityType.ARMOR_STAND);
            a.setArms(false);
            a.setCustomName("Test");
            a.setCustomNameVisible(false);a.setVisible(false);a.setCollidable(false);a.setAI(false);a.setGravity(false);
            a.setHelmet(new ItemStack(Material.IRON_BLOCK,1));
            a.resetMaxHealth(); 
    }
       
       public void runAS(){
               new BukkitRunnable() {
                    @Override
                    public void run() {
                        if(count==1){
                            
                        }
                        if(count==2){
                            
                        }
                        if(count==3){
                            
                        }
                        if(count==4){
                            
                        }
                        if(count==5){
                            
                        }
                        if(count==6){
                            cancel();
                        }
                    }
                }.runTaskTimer(Bukkit.getPluginManager().getPlugin("CoreRPG"), 1, 2);
       }
       
       
       @EventHandler
       public void onItemConsume(PlayerItemConsumeEvent e){
           Player p = e.getPlayer();
           if(p.getInventory().getItemInOffHand().getType() == Material.GOLDEN_APPLE||p.getInventory().getItemInMainHand().getType() == Material.GOLDEN_APPLE){
               p.sendTitle("§cНедостаточно навыков", "§cК сожалению вы не Алхимик");
               e.setCancelled(true); 
           }
           if(p.getInventory().getItemInOffHand().getType() == Material.GOLDEN_CARROT||p.getInventory().getItemInMainHand().getType() == Material.GOLDEN_CARROT){
               p.sendTitle("§cНедостаточно навыков", "§cК сожалению вы не Алхимик");
               e.setCancelled(true); 
           }
       }
       
  @EventHandler
  public void onPlayerInteract(PlayerInteractEvent e)
  {
    if ((e.getAction() == Action.PHYSICAL) || (e.getItem() == null) || (e.getItem().getType() == null)) {
      return;
    }
    Player p = e.getPlayer();
    ItemStack itemhand = p.getItemInHand();
    if (itemhand.getType() == Material.PAPER)
    {
      {
          if (itemhand.getItemMeta().getDisplayName().equals("§aБилет #1: §cСпавн")){
              Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "bilet on "+p.getName()+" 1");
              if (itemhand.getAmount() > 1) {p.getInventory().getItemInHand().setAmount(itemhand.getAmount() - 1);
              } else {p.getInventory().removeItem(new ItemStack[] { itemhand });}
          }else if (itemhand.getItemMeta().getDisplayName().equals("§aБилет #2: §cСмертельный лабиринт")){
              Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "bilet on "+p.getName()+" 2");
              if (itemhand.getAmount() > 1) {p.getInventory().getItemInHand().setAmount(itemhand.getAmount() - 1);
              } else {p.getInventory().removeItem(new ItemStack[] { itemhand });}
          }else if (itemhand.getItemMeta().getDisplayName().equals("§aБилет #3: §cМистический лабиринт")){
              Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "bilet on "+p.getName()+" 3");
              if (itemhand.getAmount() > 1) {p.getInventory().getItemInHand().setAmount(itemhand.getAmount() - 1);
              } else {p.getInventory().removeItem(new ItemStack[] { itemhand });}
          }
      }
    }
  }
  
  public static void onTimerReload(String title, String subtitle, int timer, boolean notification){
         Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
         @Override public void run() {
         for(Player p : Bukkit.getOnlinePlayers()){
             if(notification){System.out.println("SERVER RELOAD......SERVER RELOAD");}
             p.sendTitle(title, subtitle);
         }}},timer*20);
    }
  
   public static void Firework(Location l, int speed) {
        org.bukkit.entity.Firework fw = (org.bukkit.entity.Firework) l.getWorld().spawn(l, org.bukkit.entity.Firework.class);
        FireworkMeta meta = fw.getFireworkMeta();
        meta.addEffect(FireworkEffect.builder().withColor(Color.RED).with(FireworkEffect.Type.STAR).build());
        meta.setPower(1);
        fw.setFireworkMeta(meta);
        //fw.setVelocity(l.getDirection().multiply(speed));
    }
}
