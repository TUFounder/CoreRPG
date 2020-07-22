package ru.meedway.corerpg;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;




public class Scheduler4 extends BukkitRunnable {
    Player p;

    Scheduler4(Player p) {
        this.p = p;
    }    

    @Override
    public void run() {
        if(Main.count==300) {
                int a = Main.boss1.size();
                 for(int i =0; i<=a;i++){
                  Player p1 = Main.boss1.get(i);
                 p1.teleport(new Location(Bukkit.getWorld("world"),94.5, 88.5, 118.5, -179.1f, 3.9f));
                }
            
            Main.count = 0;
            this.cancel();
        }if(Main.count==500) {
            Main.count = 0;
            this.cancel();
        }
        Main.count++;
    }
}