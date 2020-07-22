package ru.meedway.corerpg;


import java.util.HashMap;
import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.scheduler.BukkitRunnable;


public class ExpDrop implements Listener
{
    private static final HashMap<String, Boolean> thrown = new HashMap();
    private static final HashMap<UUID, Integer> pickup = new HashMap();
    
    @EventHandler(ignoreCancelled=true)
    public void ExpPickUp(PlayerPickupItemEvent e){
        Item i = e.getItem();
        Player p = e.getPlayer();
        if(e.getPlayer().getWorld().getName().equalsIgnoreCase("world")){
            if (i.getItemStack().getItemMeta().hasDisplayName()) {
                String exp = "Опыт-000101";
                String key = "Ключ-000101";

                String pickupName = i.getItemStack().getItemMeta().getDisplayName();
                if(pickupName.equals(exp)){
                    int amount = i.getItemStack().getAmount();
                    ExpDrop.giveEXP(i, p, amount);
                    e.setCancelled(true);
                }else if(pickupName.equals(key)){
                    int amount = i.getItemStack().getAmount();
                    ExpDrop.giveKey(i, p, amount);
                    e.setCancelled(true);
                }
            }
        }
    }
    public static void giveEXP(final Item item, final Player p, int amount) {
        String name = item.getItemStack().getItemMeta().getLore().get(0).toString();
        int sum = Integer.parseInt(name)*amount;
        new BukkitRunnable(){
            @Override
            public void run() {
                this.cancel();
                item.remove();
                   ExpDrop.addXP(p, sum);
                }
            }.runTaskTimer(Bukkit.getPluginManager().getPlugin("CoreRPG"), 2, 0);
    }
    
    
    public static void addXP(Player p, int sum) {
        UUID u = p.getUniqueId();
        pickup.put(u, sum);
        Runnable task = () -> {
            if (pickup.containsKey(u)) {
                if(Levels.getBooster()){
                   int i = sum*2;
                   Levels.addXP(p.getName(), i);
                }else{
                   Levels.addXP(p.getName(), sum);
                }
                
                pickup.remove(u);}};
        Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), task, 10);
        p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1f, 1f);
        
        ActionBar actionbar = new ActionBar("§7Получено: §a"+sum+" §b✩ §eопыта");
        ActionBar actionbar2 = new ActionBar("§7Получено: §a"+(sum*2)+" §b✩ §eопыта (БОНУС х2)");
        if(Levels.getBooster()){
            actionbar2.sendToPlayer(p);    
        }else{
            actionbar.sendToPlayer(p);
        }
        
    }
    
/**/
    public static void giveKey(final Item item, final Player p, int amount) {
        String name = item.getItemStack().getItemMeta().getLore().get(0).toString();
        int sum = Integer.parseInt(name)*amount;
        new BukkitRunnable(){
            @Override
            public void run() {
                this.cancel();
                item.remove();
                   ExpDrop.addKey(p, sum);
                }
            }.runTaskTimer(Bukkit.getPluginManager().getPlugin("CoreRPG"), 2, 0);
    }
    
    
    public static void addKey(Player p, int sum) {
        UUID u = p.getUniqueId();
        pickup.put(u, sum);
        Runnable task = () -> {
            if (pickup.containsKey(u)) {
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "case give "+p.getName()+" 1");
                pickup.remove(u);}};
        Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), task, 10);
        ActionBar actionbar = new ActionBar("§7Найден: §a"+sum+" §eключ");
        p.sendTitle("§b+1 Древний ключ", "§7Открыть сундук можно на спавне");
        p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1f, 1f);
        actionbar.sendToPlayer(p);
    }
    

}
