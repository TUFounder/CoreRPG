package ru.meedway.corerpg;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;




public class Scheduler2 extends BukkitRunnable {
    Player p;

    Scheduler2(Player p) {
        this.p = p;
    }    

    @Override
    public void run() {
        
        if(Main.count == 1){p.sendTitle("§a|§f|||||||||||||||   10%", "§7Прокачка предмета...");
          p.getWorld().playSound(p.getLocation(), Sound.ITEM_ARMOR_EQUIP_LEATHER, 1.0f, 1.0f);}
        if(Main.count == 2){p.sendTitle("§a||§f||||||||||||||   15%", "§7Прокачка предмета...");
          p.getWorld().playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);}
        if(Main.count == 3){p.sendTitle("§a|||§f|||||||||||||   26%", "§7Прокачка предмета...");
          p.getWorld().playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);}
        if(Main.count == 4){p.sendTitle("§a||||§f||||||||||||   33%", "§7Прокачка предмета...");
          p.getWorld().playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);}
        if(Main.count == 5){p.sendTitle("§a||||||§f||||||||||   41%", "§7Прокачка предмета...");
          p.getWorld().playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);}
        if(Main.count == 6){p.sendTitle("§a|||||||§f|||||||||   50%", "§7Прокачка предмета...");
          p.getWorld().playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);}
        if(Main.count == 7){p.sendTitle("§a|||||||||§f|||||||   66%", "§7Прокачка предмета...");
          p.getWorld().playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);}
        if(Main.count == 8){p.sendTitle("§a|||||||||||§f|||||   73%", "§7Прокачка предмета...");
          p.getWorld().playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);}
        if(Main.count == 9){p.sendTitle("§a|||||||||||||§f|||   88%", "§7Прокачка предмета...");
          p.getWorld().playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);}
        if(Main.count == 10){p.sendTitle("§a||||||||||||||§f||   91%", "§7Прокачка предмета...");
          p.getWorld().playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);}
        if(Main.count == 11){p.sendTitle("§a|||||||||||||||§f|  99%", "§7Прокачка предмета...");
          p.getWorld().playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);}
        if(Main.count==12) {
            p.sendTitle("§c|||||||||||||||§c|  99%", "§cПредмет разрушен!");
            p.getWorld().playSound(p.getLocation(), Sound.BLOCK_ANVIL_BREAK, 1.0f, 1.0f);
            Main.count = 0;
            this.cancel();
        }
        Main.count++;
    }
}