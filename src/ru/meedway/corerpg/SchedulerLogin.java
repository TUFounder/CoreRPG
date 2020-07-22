package ru.meedway.corerpg;


import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class SchedulerLogin extends BukkitRunnable {
    Player p;
    public int login = 0;

    SchedulerLogin(Player p) {
        this.p = p;
    }    

    @Override
    public void run() {
        if(login == 1){
         p.sendTitle("§a[Синхронизация]", "§7Загрузка персонажа: §c••••••••");   
        }
        if(login == 2){
         p.sendTitle("§a[Синхронизация]", "§7Загрузка персонажа: §a•§c•••••••");  
        }
        if(login == 3){
         p.sendTitle("§a[Синхронизация]", "§7Загрузка персонажа: §a••§c••••••");
        }
        if(login == 4){
         p.sendTitle("§a[Синхронизация]", "§7Загрузка персонажа: §a•••§c•••••");
        }
        if(login == 5){
         p.sendTitle("§a[Синхронизация]", "§7Загрузка персонажа: §a••••§c••••");
        }
        if(login == 6){
         p.sendTitle("§a[Синхронизация]", "§7Загрузка персонажа: §a•••••§c•••");
        }
        if(login == 7){
         p.sendTitle("§a[Синхронизация]", "§7Загрузка персонажа: §a••••••§c••");
        }
        if(login == 8){
         p.sendTitle("§a[Синхронизация]", "§7Загрузка персонажа: §a•••••••§c•");
        }
        if(login == 9){
         p.sendTitle("§a[Синхронизация]", "§7Данные загружены: §a••••••••");
        }
        if(login==13) {
            p.sendTitle("§a§l✔", "§7Доступ открыт!");
            login = 0;
            this.cancel();
        }
        login++;
    }
}
