package ru.meedway.corerpg;

import es.darkhorizon.dev.main;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import static ru.meedway.corerpg.Main.addAttr;
import static ru.meedway.corerpg.ShopItems.getboss;
import static ru.meedway.corerpg.ShopItems.getmob;
import org.bukkit.Material;
import static ru.meedway.corerpg.Main.onKit;
import static ru.meedway.corerpg.ShopItems.getdun;
import static ru.meedway.donatelog.Main.DonateLog;


public class ShopMenuClick implements Listener{
   public static String site = "§ameedway.ru";
    
  @EventHandler
   public static void onMainMenu(InventoryClickEvent event) throws SQLException {
    String in = event.getInventory().getName();
    Inventory inv = event.getInventory();
    final Player p = (Player) event.getWhoClicked();
    String ps = p.getName();
    int l = Levels.getLevel(p.getName());
    if(in.equalsIgnoreCase("▸ Торговец")) {
        event.setCancelled(true);        
        switch(event.getRawSlot()){
            case 11:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onSword(p);}},1);break;}
            case 13:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {p.chat("/ah");}},1);break;}
            case 15:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {p.chat("/sell");}},1);break;}
        }
    }else if(in.equalsIgnoreCase("▸ Обучение")) {
        event.setCancelled(true);        
        switch(event.getRawSlot()){
            case 12:{p.closeInventory();
                 Main.onTutorials(p);
                 break;}
            case 14:{p.closeInventory();break;}
        }
    }else if(in.equalsIgnoreCase("▸ Мечи")) {
        if (event.getCurrentItem().getType() == Material.AIR) {
                return;
            }
        event.setCancelled(true);       
        switch(event.getRawSlot()){
            case 0:{if(Main.economy.getBalance(ps) >= 10){Main.economy.withdrawPlayer(ps, 10);
                   addAttr(p, "DAMAGE", "2", "mainhand", ShopItems.SISworld(1,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 1:{if(Main.economy.getBalance(ps) >= 20){Main.economy.withdrawPlayer(ps, 20);
                   addAttr(p, "DAMAGE", "4", "mainhand", ShopItems.SISworld(2,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 2:{if(Main.economy.getBalance(ps) >= 30){Main.economy.withdrawPlayer(ps, 30);
                   addAttr(p, "DAMAGE", "4", "mainhand", ShopItems.SISworld(3,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 3:{if(Main.economy.getBalance(ps) >= 40){Main.economy.withdrawPlayer(ps, 40);
                   addAttr(p, "DAMAGE", "7", "mainhand", ShopItems.SISworld(4,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 4:{if(Main.economy.getBalance(ps) >= 50){Main.economy.withdrawPlayer(ps, 50);
                   addAttr(p, "DAMAGE", "9", "mainhand", ShopItems.SISworld(5,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 5:{if(Main.economy.getBalance(ps) >= 60){Main.economy.withdrawPlayer(ps, 60);
                   addAttr(p, "DAMAGE", "10", "mainhand", ShopItems.SISworld(6,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 6:{if(Main.economy.getBalance(ps) >= 70){Main.economy.withdrawPlayer(ps, 70);
                   addAttr(p, "DAMAGE", "12", "mainhand", ShopItems.SISworld(7,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 7:{if(Main.economy.getBalance(ps) >= 80){Main.economy.withdrawPlayer(ps, 80);
                   addAttr(p, "DAMAGE", "13", "mainhand", ShopItems.SISworld(8,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 8:{if(Main.economy.getBalance(ps) >= 90){Main.economy.withdrawPlayer(ps, 90);
                   addAttr(p, "DAMAGE", "15", "mainhand", ShopItems.SISworld(9,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 9:{if(Main.economy.getBalance(ps) >= 100){Main.economy.withdrawPlayer(ps, 100);
                   addAttr(p, "DAMAGE", "16", "mainhand", ShopItems.SISworld(10,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 10:{if(Main.economy.getBalance(ps) >= 110){Main.economy.withdrawPlayer(ps, 110);
                   addAttr(p, "DAMAGE", "18", "mainhand", ShopItems.SISworld(11,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 11:{if(Main.economy.getBalance(ps) >= 120){Main.economy.withdrawPlayer(ps, 120);
                   addAttr(p, "DAMAGE", "19", "mainhand", ShopItems.SISworld(12,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 12:{if(Main.economy.getBalance(ps) >= 130){Main.economy.withdrawPlayer(ps, 130);
                   addAttr(p, "DAMAGE", "21", "mainhand", ShopItems.SISworld(13,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 13:{if(Main.economy.getBalance(ps) >= 140){Main.economy.withdrawPlayer(ps, 140);
                   addAttr(p, "DAMAGE", "23", "mainhand", ShopItems.SISworld(14,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 14:{if(Main.economy.getBalance(ps) >= 150){Main.economy.withdrawPlayer(ps, 150);
                   addAttr(p, "DAMAGE", "24", "mainhand", ShopItems.SISworld(15,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 15:{if(Main.economy.getBalance(ps) >= 160){Main.economy.withdrawPlayer(ps, 160);
                   addAttr(p, "DAMAGE", "26", "mainhand", ShopItems.SISworld(16,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 16:{if(Main.economy.getBalance(ps) >= 170){Main.economy.withdrawPlayer(ps, 170);
                   addAttr(p, "DAMAGE", "27", "mainhand", ShopItems.SISworld(17,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 17:{if(Main.economy.getBalance(ps) >= 180){Main.economy.withdrawPlayer(ps, 180);
                   addAttr(p, "DAMAGE", "29", "mainhand", ShopItems.SISworld(18,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 18:{if(Main.economy.getBalance(ps) >= 190){Main.economy.withdrawPlayer(ps, 190);
                   addAttr(p, "DAMAGE", "31", "mainhand", ShopItems.SISworld(19,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 19:{if(Main.economy.getBalance(ps) >= 200){Main.economy.withdrawPlayer(ps, 200);
                   addAttr(p, "DAMAGE", "33", "mainhand", ShopItems.SISworld(20,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 20:{if(Main.economy.getBalance(ps) >= 210){Main.economy.withdrawPlayer(ps, 210);
                   addAttr(p, "DAMAGE", "35", "mainhand", ShopItems.SISworld(21,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 21:{if(Main.economy.getBalance(ps) >= 220){Main.economy.withdrawPlayer(ps, 220);
                   addAttr(p, "DAMAGE", "37", "mainhand", ShopItems.SISworld(22,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 22:{if(Main.economy.getBalance(ps) >= 230){Main.economy.withdrawPlayer(ps, 230);
                   addAttr(p, "DAMAGE", "39", "mainhand", ShopItems.SISworld(23,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 23:{if(Main.economy.getBalance(ps) >= 250){Main.economy.withdrawPlayer(ps, 250);
                   addAttr(p, "DAMAGE", "41", "mainhand", ShopItems.SISworld(24,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 24:{if(Main.economy.getBalance(ps) >= 280){Main.economy.withdrawPlayer(ps, 280);
                   addAttr(p, "DAMAGE", "43", "mainhand", ShopItems.SISworld(25,false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 47:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {
                    ShopMenu.onSword(p);
                    }},1);break;}
            case 48:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onBroni1(p);}},1);break;}
            case 49:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onShield(p);}},1);break;}
            case 50:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onUpgrade(p);}},1);break;}
            case 51:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onDonate(p);}},1);break;}
        }
    }else if(in.equalsIgnoreCase("▸ Броня 1")) {
        if (event.getCurrentItem().getType() == Material.AIR) {
                return;
            }
        event.setCancelled(true);        
        switch(event.getRawSlot()){
            /**/
            case 0:{if(Main.economy.getBalance(ps) >= 1){Main.economy.withdrawPlayer(ps, 1);
                   addAttr(p, "MAX_HEALTH", "1", "chest", ShopItems.SIChestPlate(1, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 9:{if(Main.economy.getBalance(ps) >= 1){Main.economy.withdrawPlayer(ps, 1);
                   addAttr(p, "MAX_HEALTH", "1", "legs", ShopItems.SIPonoji(1, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 18:{if(Main.economy.getBalance(ps) >= 1){Main.economy.withdrawPlayer(ps, 1);
                   addAttr(p, "MAX_HEALTH", "0", "feet", ShopItems.SIBoots(1, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            /**/
            case 1:{if(Main.economy.getBalance(ps) >= 2){Main.economy.withdrawPlayer(ps, 2);
                   addAttr(p, "MAX_HEALTH", "2", "chest", ShopItems.SIChestPlate(2, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 10:{if(Main.economy.getBalance(ps) >= 2){Main.economy.withdrawPlayer(ps, 2);
                   addAttr(p, "MAX_HEALTH", "2", "legs", ShopItems.SIPonoji(2, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 19:{if(Main.economy.getBalance(ps) >= 2){Main.economy.withdrawPlayer(ps, 2);
                   addAttr(p, "MAX_HEALTH", "1", "feet", ShopItems.SIBoots(2, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            /**/
            case 2:{if(Main.economy.getBalance(ps) >= 3){Main.economy.withdrawPlayer(ps, 3);
                   addAttr(p, "MAX_HEALTH", "3", "chest", ShopItems.SIChestPlate(3, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 11:{if(Main.economy.getBalance(ps) >= 3){Main.economy.withdrawPlayer(ps, 3);
                   addAttr(p, "MAX_HEALTH", "3", "legs", ShopItems.SIPonoji(3, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 20:{if(Main.economy.getBalance(ps) >= 3){Main.economy.withdrawPlayer(ps, 3);
                   addAttr(p, "MAX_HEALTH", "1", "feet", ShopItems.SIBoots(3, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            /**/
            case 3:{if(Main.economy.getBalance(ps) >= 4){Main.economy.withdrawPlayer(ps, 4);
                   addAttr(p, "MAX_HEALTH", "4", "chest", ShopItems.SIChestPlate(4, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 12:{if(Main.economy.getBalance(ps) >= 4){Main.economy.withdrawPlayer(ps, 4);
                   addAttr(p, "MAX_HEALTH", "3", "legs", ShopItems.SIPonoji(4, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 21:{if(Main.economy.getBalance(ps) >= 4){Main.economy.withdrawPlayer(ps, 4);
                   addAttr(p, "MAX_HEALTH", "2", "feet", ShopItems.SIBoots(4, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            /**/
            case 4:{if(Main.economy.getBalance(ps) >= 5){Main.economy.withdrawPlayer(ps, 5);
                   addAttr(p, "MAX_HEALTH", "5", "chest", ShopItems.SIChestPlate(5, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 13:{if(Main.economy.getBalance(ps) >= 5){Main.economy.withdrawPlayer(ps, 5);
                   addAttr(p, "MAX_HEALTH", "4", "legs", ShopItems.SIPonoji(5, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 22:{if(Main.economy.getBalance(ps) >= 5){Main.economy.withdrawPlayer(ps, 5);
                   addAttr(p, "MAX_HEALTH", "3", "feet", ShopItems.SIBoots(5, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            /**/
            case 5:{if(Main.economy.getBalance(ps) >= 6){Main.economy.withdrawPlayer(ps, 6);
                   addAttr(p, "MAX_HEALTH", "6", "chest", ShopItems.SIChestPlate(6, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 14:{if(Main.economy.getBalance(ps) >= 6){Main.economy.withdrawPlayer(ps, 6);
                   addAttr(p, "MAX_HEALTH", "5", "legs", ShopItems.SIPonoji(6, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 23:{if(Main.economy.getBalance(ps) >= 6){Main.economy.withdrawPlayer(ps, 6);
                   addAttr(p, "MAX_HEALTH", "4", "feet", ShopItems.SIBoots(6, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            /**/
            case 6:{if(Main.economy.getBalance(ps) >= 7){Main.economy.withdrawPlayer(ps, 7);
                   addAttr(p, "MAX_HEALTH", "8", "chest", ShopItems.SIChestPlate(7, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 15:{if(Main.economy.getBalance(ps) >= 7){Main.economy.withdrawPlayer(ps, 7);
                   addAttr(p, "MAX_HEALTH", "6", "legs", ShopItems.SIPonoji(7, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 24:{if(Main.economy.getBalance(ps) >= 7){Main.economy.withdrawPlayer(ps, 7);
                   addAttr(p, "MAX_HEALTH", "5", "feet", ShopItems.SIBoots(7, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            /**/
            case 7:{if(Main.economy.getBalance(ps) >= 8){Main.economy.withdrawPlayer(ps, 8);
                   addAttr(p, "MAX_HEALTH", "9", "chest", ShopItems.SIChestPlate(8, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 16:{if(Main.economy.getBalance(ps) >= 8){Main.economy.withdrawPlayer(ps, 8);
                   addAttr(p, "MAX_HEALTH", "7", "legs", ShopItems.SIPonoji(8, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 25:{if(Main.economy.getBalance(ps) >= 8){Main.economy.withdrawPlayer(ps, 8);
                   addAttr(p, "MAX_HEALTH", "4", "feet", ShopItems.SIBoots(8, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            /**/
            case 8:{if(Main.economy.getBalance(ps) >= 9){Main.economy.withdrawPlayer(ps, 9);
                   addAttr(p, "MAX_HEALTH", "10", "chest", ShopItems.SIChestPlate(9, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 17:{if(Main.economy.getBalance(ps) >= 9){Main.economy.withdrawPlayer(ps, 9);
                   addAttr(p, "MAX_HEALTH", "7", "legs", ShopItems.SIPonoji(9, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 26:{if(Main.economy.getBalance(ps) >= 9){Main.economy.withdrawPlayer(ps, 9);
                   addAttr(p, "MAX_HEALTH", "5", "feet", ShopItems.SIBoots(9, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            /**/
            case 53:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onBroni2(p);}},1);break;}
            /**/
            case 47:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onSword(p);}},1);break;}
            case 48:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onBroni1(p);}},1);break;}
            case 49:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onShield(p);}},1);break;}
            case 50:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onUpgrade(p);}},1);break;}
            case 51:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onDonate(p);}},1);break;}
        }
    }else if(in.equalsIgnoreCase("▸ Броня 2")) {
         if (event.getCurrentItem().getType() == Material.AIR) {
                return;
            }
        event.setCancelled(true);        
        switch(event.getRawSlot()){
                        /**/
            case 0:{if(Main.economy.getBalance(ps) >= 10){Main.economy.withdrawPlayer(ps, 10);
                   addAttr(p, "MAX_HEALTH", "13", "chest", ShopItems.SIChestPlate(10, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 9:{if(Main.economy.getBalance(ps) >= 10){Main.economy.withdrawPlayer(ps, 10);
                   addAttr(p, "MAX_HEALTH", "6", "legs", ShopItems.SIPonoji(10, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 18:{if(Main.economy.getBalance(ps) >= 10){Main.economy.withdrawPlayer(ps, 10);
                   addAttr(p, "MAX_HEALTH", "7", "feet", ShopItems.SIBoots(10, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            /**/
            case 1:{if(Main.economy.getBalance(ps) >= 11){Main.economy.withdrawPlayer(ps, 11);
                   addAttr(p, "MAX_HEALTH", "16", "chest", ShopItems.SIChestPlate(11, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 10:{if(Main.economy.getBalance(ps) >= 11){Main.economy.withdrawPlayer(ps, 11);
                   addAttr(p, "MAX_HEALTH", "10", "legs", ShopItems.SIPonoji(11, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 19:{if(Main.economy.getBalance(ps) >= 11){Main.economy.withdrawPlayer(ps, 11);
                   addAttr(p, "MAX_HEALTH", "4", "feet", ShopItems.SIBoots(11, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            /**/
            case 2:{if(Main.economy.getBalance(ps) >= 12){Main.economy.withdrawPlayer(ps, 12);
                   addAttr(p, "MAX_HEALTH", "17", "chest", ShopItems.SIChestPlate(12, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 11:{if(Main.economy.getBalance(ps) >= 12){Main.economy.withdrawPlayer(ps, 12);
                   addAttr(p, "MAX_HEALTH", "12", "legs", ShopItems.SIPonoji(12, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 20:{if(Main.economy.getBalance(ps) >= 12){Main.economy.withdrawPlayer(ps, 12);
                   addAttr(p, "MAX_HEALTH", "5", "feet", ShopItems.SIBoots(12, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            /**/
            case 3:{if(Main.economy.getBalance(ps) >= 13){Main.economy.withdrawPlayer(ps, 13);
                   addAttr(p, "MAX_HEALTH", "10", "chest", ShopItems.SIChestPlate(13, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 12:{if(Main.economy.getBalance(ps) >= 13){Main.economy.withdrawPlayer(ps, 13);
                   addAttr(p, "MAX_HEALTH", "8", "legs", ShopItems.SIPonoji(13, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 21:{if(Main.economy.getBalance(ps) >= 13){Main.economy.withdrawPlayer(ps, 13);
                   addAttr(p, "MAX_HEALTH", "12", "feet", ShopItems.SIBoots(13, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            /**/
            case 4:{if(Main.economy.getBalance(ps) >= 14){Main.economy.withdrawPlayer(ps, 14);
                   addAttr(p, "MAX_HEALTH", "12", "chest", ShopItems.SIChestPlate(14, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 13:{if(Main.economy.getBalance(ps) >= 14){Main.economy.withdrawPlayer(ps, 41);
                   addAttr(p, "MAX_HEALTH", "15", "legs", ShopItems.SIPonoji(14, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 22:{if(Main.economy.getBalance(ps) >= 14){Main.economy.withdrawPlayer(ps, 14);
                   addAttr(p, "MAX_HEALTH", "6", "feet", ShopItems.SIBoots(14, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            /**/
            case 5:{if(Main.economy.getBalance(ps) >= 15){Main.economy.withdrawPlayer(ps, 15);
                   addAttr(p, "MAX_HEALTH", "22", "chest", ShopItems.SIChestPlate(15, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 14:{if(Main.economy.getBalance(ps) >= 15){Main.economy.withdrawPlayer(ps, 15);
                   addAttr(p, "MAX_HEALTH", "6", "legs", ShopItems.SIPonoji(15, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 23:{if(Main.economy.getBalance(ps) >= 15){Main.economy.withdrawPlayer(ps, 15);
                   addAttr(p, "MAX_HEALTH", "8", "feet", ShopItems.SIBoots(15, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            /**/
            case 6:{if(Main.economy.getBalance(ps) >= 16){Main.economy.withdrawPlayer(ps, 16);
                   addAttr(p, "MAX_HEALTH", "13", "chest", ShopItems.SIChestPlate(16, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 15:{if(Main.economy.getBalance(ps) >= 16){Main.economy.withdrawPlayer(ps, 16);
                   addAttr(p, "MAX_HEALTH", "10", "legs", ShopItems.SIPonoji(16, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 24:{if(Main.economy.getBalance(ps) >= 16){Main.economy.withdrawPlayer(ps, 16);
                   addAttr(p, "MAX_HEALTH", "15", "feet", ShopItems.SIBoots(16, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            /**/
            case 7:{if(Main.economy.getBalance(ps) >= 17){Main.economy.withdrawPlayer(ps, 17);
                   addAttr(p, "MAX_HEALTH", "18", "chest", ShopItems.SIChestPlate(17, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 16:{if(Main.economy.getBalance(ps) >= 17){Main.economy.withdrawPlayer(ps, 17);
                   addAttr(p, "MAX_HEALTH", "11", "legs", ShopItems.SIPonoji(17, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 25:{if(Main.economy.getBalance(ps) >= 17){Main.economy.withdrawPlayer(ps, 17);
                   addAttr(p, "MAX_HEALTH", "12", "feet", ShopItems.SIBoots(17, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            /**/
            case 8:{if(Main.economy.getBalance(ps) >= 18){Main.economy.withdrawPlayer(ps, 18);
                   addAttr(p, "MAX_HEALTH", "23", "chest", ShopItems.SIChestPlate(18, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 17:{if(Main.economy.getBalance(ps) >= 18){Main.economy.withdrawPlayer(ps, 18);
                   addAttr(p, "MAX_HEALTH", "9", "legs", ShopItems.SIPonoji(18, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 26:{if(Main.economy.getBalance(ps) >= 18){Main.economy.withdrawPlayer(ps, 18);
                   addAttr(p, "MAX_HEALTH", "13", "feet", ShopItems.SIBoots(18, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            /**/
            case 53:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onBroni3(p);}},1);break;}
            /**/
            case 47:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onSword(p);}},1);break;}
            case 48:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onBroni1(p);}},1);break;}
            case 49:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onShield(p);}},1);break;}
            case 50:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onUpgrade(p);}},1);break;}
            case 51:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onDonate(p);}},1);break;}
        }
    }else if(in.equalsIgnoreCase("▸ Броня 3")) {
        if (event.getCurrentItem().getType() == Material.AIR) {
                return;
            }
        event.setCancelled(true);        
        switch(event.getRawSlot()){
                        /**/
            case 0:{if(Main.economy.getBalance(ps) >= 19){Main.economy.withdrawPlayer(ps, 19);
                   addAttr(p, "MAX_HEALTH", "20", "chest", ShopItems.SIChestPlate(19, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 9:{if(Main.economy.getBalance(ps) >= 19){Main.economy.withdrawPlayer(ps, 19);
                   addAttr(p, "MAX_HEALTH", "13", "legs", ShopItems.SIPonoji(19, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 18:{if(Main.economy.getBalance(ps) >= 19){Main.economy.withdrawPlayer(ps, 19);
                   addAttr(p, "MAX_HEALTH", "12", "feet", ShopItems.SIBoots(19, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            /**/
            case 1:{if(Main.economy.getBalance(ps) >= 20){Main.economy.withdrawPlayer(ps, 20);
                   addAttr(p, "MAX_HEALTH", "25", "chest", ShopItems.SIChestPlate(20, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 10:{if(Main.economy.getBalance(ps) >= 20){Main.economy.withdrawPlayer(ps, 20);
                   addAttr(p, "MAX_HEALTH", "14", "legs", ShopItems.SIPonoji(20, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 19:{if(Main.economy.getBalance(ps) >= 20){Main.economy.withdrawPlayer(ps, 20);
                   addAttr(p, "MAX_HEALTH", "15", "feet", ShopItems.SIBoots(20, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            /**/

            case 47:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onSword(p);}},1);break;}
            case 48:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onBroni1(p);}},1);break;}
            case 49:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onShield(p);}},1);break;}
            case 50:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onUpgrade(p);}},1);break;}
            case 51:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onDonate(p);}},1);break;}
        }
    }else if(in.equalsIgnoreCase("▸ Щиты")) {
        if (event.getCurrentItem().getType() == Material.AIR||event.getCurrentItem()==null) {
                return;
            }
        event.setCancelled(true);        
        switch(event.getRawSlot()){
            case 0:{if(Main.economy.getBalance(ps) >= 9){Main.economy.withdrawPlayer(ps, 9);
                   addAttr(p, "MAX_HEALTH", "4", "offhand", ShopItems.SIShield(1, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 1:{if(Main.economy.getBalance(ps) >= 18){Main.economy.withdrawPlayer(ps, 18);
                   addAttr(p, "MAX_HEALTH", "8", "offhand", ShopItems.SIShield(2, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 2:{if(Main.economy.getBalance(ps) >= 27){Main.economy.withdrawPlayer(ps, 27);
                   addAttr(p, "MAX_HEALTH", "12", "offhand", ShopItems.SIShield(3, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 3:{if(Main.economy.getBalance(ps) >= 36){Main.economy.withdrawPlayer(ps, 36);
                   addAttr(p, "MAX_HEALTH", "16", "offhand", ShopItems.SIShield(4, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 4:{if(Main.economy.getBalance(ps) >= 45){Main.economy.withdrawPlayer(ps, 45);
                   addAttr(p, "MAX_HEALTH", "20", "offhand", ShopItems.SIShield(5, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 5:{if(Main.economy.getBalance(ps) >= 54){Main.economy.withdrawPlayer(ps, 54);
                   addAttr(p, "MAX_HEALTH", "24", "offhand", ShopItems.SIShield(6, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 6:{if(Main.economy.getBalance(ps) >= 63){Main.economy.withdrawPlayer(ps, 63);
                   addAttr(p, "MAX_HEALTH", "28", "offhand", ShopItems.SIShield(7, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 7:{if(Main.economy.getBalance(ps) >= 72){Main.economy.withdrawPlayer(ps, 72);
                   addAttr(p, "MAX_HEALTH", "32", "offhand", ShopItems.SIShield(8, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 8:{if(Main.economy.getBalance(ps) >= 81){Main.economy.withdrawPlayer(ps, 81);
                   addAttr(p, "MAX_HEALTH", "36", "offhand", ShopItems.SIShield(9, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 9:{if(Main.economy.getBalance(ps) >= 90){Main.economy.withdrawPlayer(ps, 90);
                   addAttr(p, "MAX_HEALTH", "40", "offhand", ShopItems.SIShield(10, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 10:{if(Main.economy.getBalance(ps) >= 99){Main.economy.withdrawPlayer(ps, 99);
                   addAttr(p, "MAX_HEALTH", "44", "offhand", ShopItems.SIShield(11, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 11:{if(Main.economy.getBalance(ps) >= 108){Main.economy.withdrawPlayer(ps, 108);
                   addAttr(p, "MAX_HEALTH", "48", "offhand", ShopItems.SIShield(12, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 12:{if(Main.economy.getBalance(ps) >= 117){Main.economy.withdrawPlayer(ps, 117);
                   addAttr(p, "MAX_HEALTH", "52", "offhand", ShopItems.SIShield(13, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 13:{if(Main.economy.getBalance(ps) >= 126){Main.economy.withdrawPlayer(ps, 126);
                   addAttr(p, "MAX_HEALTH", "56", "offhand", ShopItems.SIShield(14, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 14:{if(Main.economy.getBalance(ps) >= 135){Main.economy.withdrawPlayer(ps, 135);
                   addAttr(p, "MAX_HEALTH", "60", "offhand", ShopItems.SIShield(15, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 15:{if(Main.economy.getBalance(ps) >= 144){Main.economy.withdrawPlayer(ps, 144);
                   addAttr(p, "MAX_HEALTH", "64", "offhand", ShopItems.SIShield(16, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 16:{if(Main.economy.getBalance(ps) >= 153){Main.economy.withdrawPlayer(ps, 153);
                   addAttr(p, "MAX_HEALTH", "68", "offhand", ShopItems.SIShield(17, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 17:{if(Main.economy.getBalance(ps) >= 162){Main.economy.withdrawPlayer(ps, 162);
                   addAttr(p, "MAX_HEALTH", "72", "offhand", ShopItems.SIShield(18, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 18:{if(Main.economy.getBalance(ps) >= 171){Main.economy.withdrawPlayer(ps, 171);
                   addAttr(p, "MAX_HEALTH", "76", "offhand", ShopItems.SIShield(19, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 19:{if(Main.economy.getBalance(ps) >= 180){Main.economy.withdrawPlayer(ps, 180);
                   addAttr(p, "MAX_HEALTH", "80", "offhand", ShopItems.SIShield(20, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 20:{if(Main.economy.getBalance(ps) >= 190){Main.economy.withdrawPlayer(ps, 190);
                   addAttr(p, "MAX_HEALTH", "82", "offhand", ShopItems.SIShield(21, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 21:{if(Main.economy.getBalance(ps) >= 200){Main.economy.withdrawPlayer(ps, 200);
                   addAttr(p, "MAX_HEALTH", "85", "offhand", ShopItems.SIShield(22, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 22:{if(Main.economy.getBalance(ps) >= 230){Main.economy.withdrawPlayer(ps, 230);
                   addAttr(p, "MAX_HEALTH", "88", "offhand", ShopItems.SIShield(23, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 23:{if(Main.economy.getBalance(ps) >= 250){Main.economy.withdrawPlayer(ps, 250);
                   addAttr(p, "MAX_HEALTH", "90", "offhand", ShopItems.SIShield(24, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 24:{if(Main.economy.getBalance(ps) >= 280){Main.economy.withdrawPlayer(ps, 280);
                   addAttr(p, "MAX_HEALTH", "93", "offhand", ShopItems.SIShield(25, false));}else{
                      p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 47:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onSword(p);}},1);break;}
            case 48:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onBroni1(p);}},1);break;}
            case 49:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onShield(p);}},1);break;}
            case 50:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onUpgrade(p);}},1);break;}
            case 51:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onDonate(p);}},1);break;}
        }
    }else if(in.equalsIgnoreCase("▸ Донат")) {
        event.setCancelled(true);      
        switch(event.getRawSlot()){
            
            case 0:{if(Main.sB(p, 20)){
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aприобрел §bпремиум нагрудник!");
                            DonateLog(p.getName(), 20, "Нагрудник");
                   addAttr(p, "MAX_HEALTH", "115", "chest", ShopItems.SIPREMIUM(0, p, false));}else{
                      p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 9:{if(Main.sB(p, 15)){
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aприобрел §bпремиум поножи!");
                            DonateLog(p.getName(), 15, "Поножи");
                   addAttr(p, "MAX_HEALTH", "95", "legs", ShopItems.SIPREMIUM(1, p, false));}else{
                      p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 18:{if(Main.sB(p, 9)){
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aприобрел §bпремиум ботинки!");
                            DonateLog(p.getName(), 9, "Ботинки");
                   addAttr(p, "MAX_HEALTH", "87", "feet", ShopItems.SIPREMIUM(2, p, false));}else{
                      p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 1:{if(Main.sB(p, 17)){
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aприобрел §bпремиум меч!");
                            DonateLog(p.getName(), 17, "меч");
                  addAttr(p, "DAMAGE", "102", "mainhand", ShopItems.SIPREMIUM(3, p, false));}else{
                      p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 10:{if(Main.sB(p, 17)){
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aприобрел §bпремиум топор!");
                            DonateLog(p.getName(), 17, "топор");
                   addAttr(p, "DAMAGE", "100", "mainhand", ShopItems.SIPREMIUM(4, p, false));}else{
                      p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 19:{if(Main.sB(p, 17)){
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aприобрел §bпремиум щит!");
                            DonateLog(p.getName(), 17, "щит");
                   addAttr(p, "MAX_HEALTH", "175", "offhand", ShopItems.SIPREMIUM(5, p, false));}else{
                      p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 2:{if(Main.sB(p, 5)){
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aприобрел §b500000 опыта!");
                            DonateLog(p.getName(), 5, "опыт");
                    Levels.addXP(p.getName(), 500000);
                   }else{
                      p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 11:{if(Main.sB(p, 9)){
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aприобрел §b1000000 опыта!");
                            DonateLog(p.getName(), 9, "опыт");
                    Levels.addXP(p.getName(), 1000000);
                   }else{
                      p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            
           case 3:{if(Main.sB(p, 10)){
           Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aприобрел §b1000 опыта гильдии!");
                            DonateLog(p.getName(), 10, "опыт ги");
                    main.ClanSetEXPint(main.ClanName(p), 1000);
                   }else{
                      p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 12:{if(Main.sB(p, 19)){
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aприобрел §b5000 опыта гильдии!");
                            DonateLog(p.getName(), 19, "опыт ги");
                    main.ClanSetEXPint(main.ClanName(p), 5000);
                   }else{
                      p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            
           case 4:{if(Main.sB(p, 9)){
           Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aприобрел §b10000 монет!");
                            DonateLog(p.getName(), 9, "монеты");
                    Main.economy.depositPlayer(p.getName(), 10000);
                   }else{
                      p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 13:{if(Main.sB(p, 19)){
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aприобрел §b50000 монет!");
                            DonateLog(p.getName(), 19, "монеты");
                    Main.economy.depositPlayer(p.getName(), 50000);
                   }else{
                      p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 22:{if(Main.sB(p, 29)){
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aприобрел §b100000 монет!");
                            DonateLog(p.getName(), 29, "монеты");
                    Main.economy.depositPlayer(p.getName(), 100000);
                   }else{
                      p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 5:{if(Main.sB(p, 17)){
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aприобрел §bпремиум меч (элитный)!");
                            DonateLog(p.getName(), 17, "меч эл");
                  addAttr(p, "DAMAGE", "90", "mainhand", ShopItems.SIPREMIUM(15, p, false));}else{
                      p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 6:{p.closeInventory();if(Main.sB(p, 5)){
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aактивировал §bглобальный ускоритель опыта х2§a!");
            Bukkit.broadcastMessage("§aТеперь весь получаемый опыт увеличен в §b2 §aраза на целый §eчас§a! Время пошло!");
            Levels.setBoosterYES();
            Main.BoosterTimer();
            for(Player pl: Bukkit.getOnlinePlayers()){
                pl.sendTitle("§6Ускоритель опытa х2", "§aАктивированно игроком: "+p.getName());
            }
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline booster 1 &aАктивен: §6Бустер опыта х2");
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline booster 2 &aАктивировал: §6"+p.getName());
            }else{
            p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 7:{p.closeInventory();if(Main.sB(p, 1)){
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aпризвал §bИМПЕРСКОГО РАЗРУШИТЕЛЯ§a!");
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "mm mobs spawn imp 1 world,94,87,107");
            for(Player pl: Bukkit.getOnlinePlayers()){
                pl.sendTitle("§cНападение на СПАВН", "§aПризван Имперский разрушитель!");
            }
            }else{
            p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            /*case 16:{p.closeInventory();if(coins >= 1){Coins.setCoins(ps, coins-1);
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aпризвал босса: §bКороль скелет - Аларон§a!");
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "mm mobs spawn nb20 1 world,94,87,107");
            for(Player pl: Bukkit.getOnlinePlayers()){
                pl.sendTitle("§cНападение на СПАВН", "§aКороль скелет - Аларон!");
            }
            }else{
            p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 25:{p.closeInventory();if(coins >= 1){Coins.setCoins(ps, coins-1);
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aпризвал босса: §bУтер Святой§a!");
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "mm mobs spawn nb21 1 world,94,87,107");
            for(Player pl: Bukkit.getOnlinePlayers()){
                pl.sendTitle("§cНападение на СПАВН", "§aУтер Святой!");
            }
            }else{
            p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 8:{p.closeInventory();if(coins >= 2){Coins.setCoins(ps, coins-2);
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aпризвал босса: §bДревний дракон - Нефам§a!");
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "mm mobs spawn nb22 1 world,94,87,107");
            for(Player pl: Bukkit.getOnlinePlayers()){
                pl.sendTitle("§cНападение на СПАВН", "§aДревний дракон - Нефам!");
            }
            }else{
            p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 34:{p.closeInventory();if(coins >= 1){Coins.setCoins(ps, coins-1);
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aпризвал босса: §bНекромант - Зул§a!");
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "mm mobs spawn nb23 1 world,94,87,107");
            for(Player pl: Bukkit.getOnlinePlayers()){
                pl.sendTitle("§cНападение на СПАВН", "§aНекромант - Зул!");
            }
            }else{
            p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 43:{p.closeInventory();if(coins >= 1){Coins.setCoins(ps, coins-1);
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aпризвал босса: §bАрхангел - Тэмуэрбиель§a!");
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "mm mobs spawn nb24 1 world,94,87,107");
            for(Player pl: Bukkit.getOnlinePlayers()){
                pl.sendTitle("§cНападение на СПАВН", "§aАрхангел - Тэмуэрбиель!");
            }
            }else{
            p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 52:{p.closeInventory();if(coins >= 1){Coins.setCoins(ps, coins-1);
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aпризвал босса: §bЯгай§a!");
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "mm mobs spawn nb25 1 world,94,87,107");
            for(Player pl: Bukkit.getOnlinePlayers()){
                pl.sendTitle("§cНападение на СПАВН", "§aЯгай!");
            }
            }else{
            p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 17:{p.closeInventory();if(coins >= 2){Coins.setCoins(ps, coins-2);
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aпризвал босса: §bНелтарион§a!");
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "mm mobs spawn nb26 1 world,94,87,107");
            for(Player pl: Bukkit.getOnlinePlayers()){
                pl.sendTitle("§cНападение на СПАВН", "§aНелтарион!");
            }
            }else{
            p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 26:{p.closeInventory();if(coins >= 5){Coins.setCoins(ps, coins-5);
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aпризвал босса: §4АГРАИЛ§a!");
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "mm mobs spawn nb27 1 world,94,87,107");
            for(Player pl: Bukkit.getOnlinePlayers()){
                pl.sendTitle("§cНападение на СПАВН", "§4АГРАИЛ!");
            }
            }else{
            p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            /*case 8:{p.closeInventory();if(coins >= 2000){Coins.setCoins(ps, coins-3000);
            p.sendMessage("§aПриобретено: СБОРКА СЕРВЕРА MEEDWAY");
            Levels.setSLink(p.getName());
            }else{
            p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 17:{p.closeInventory();if(coins >= 2000){Coins.setCoins(ps, coins-3000);
            p.sendMessage("§aПриобретено: ИСХОДНИКИ ПЛАГИНОВ ИЗ СБОРКИ СЕРВЕРА MEEDWAY");
            Levels.setRLink(p.getName());
            }else{
            p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}*/
            case 8:{p.closeInventory();if(Main.sB(p, 50)){
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aприобрел §bПечать нерушимости§a!");
            p.getInventory().addItem(ShopItems.SIPECH(1, false));
            }else{
            p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 17:{p.closeInventory();if(Main.sB(p, 50)){
            Bukkit.broadcastMessage("§a▸ Игрок §l"+p.getName()+" §aприобрел §bПечать стойкости§a!");
            p.getInventory().addItem(ShopItems.SIPECH(2, false));
            }else{
            p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            
            case 47:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onSword(p);}},1);break;}
            case 48:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onBroni1(p);}},1);break;}
            case 49:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onShield(p);}},1);break;}
            case 50:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onUpgrade(p);}},1);break;}
            case 51:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {ShopMenu.onDonate(p);}},1);break;}
        }
    }else if(in.equalsIgnoreCase("▸ Улучшение оружия")) {
        event.setCancelled(true);        
        switch(event.getRawSlot()){
            case 11:{p.closeInventory();break;}
            case 15:{p.closeInventory();
                Main.sUpgrade(p);
                break;}
        }
    }else if(in.equalsIgnoreCase("▸ Улучшениe брони")) {
        event.setCancelled(true);        
        switch(event.getRawSlot()){
            case 11:{p.closeInventory();break;}
            case 15:{p.closeInventory();
                Main.sUpgradeHP(p);
                break;}
        }
    }else if(in.equalsIgnoreCase("▸ Прокачка")) {
        if (event.getCurrentItem().getType() == Material.AIR) {
                return;
            }
        event.setCancelled(true);        
        switch(event.getRawSlot()){
            
            case 0:{if(Main.economy.getBalance(ps) >= 10){Main.economy.withdrawPlayer(ps, 10);
            p.getInventory().addItem((ItemStack)ShopItems.SIBOOK(1,false));
                   }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 1:{if(Main.economy.getBalance(ps) >= 20){Main.economy.withdrawPlayer(ps, 20);
            p.getInventory().addItem((ItemStack)ShopItems.SIBOOK(2,false));
                   }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 2:{if(Main.economy.getBalance(ps) >= 30){Main.economy.withdrawPlayer(ps, 30);
            p.getInventory().addItem((ItemStack)ShopItems.SIBOOK(3,false));
                   }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 3:{if(Main.economy.getBalance(ps) >= 40){Main.economy.withdrawPlayer(ps, 40);
            p.getInventory().addItem((ItemStack)ShopItems.SIBOOK(4,false));
                   }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 4:{if(Main.economy.getBalance(ps) >= 50){Main.economy.withdrawPlayer(ps, 50);
            p.getInventory().addItem((ItemStack)ShopItems.SIBOOK(5,false));
                   }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 5:{if(Main.economy.getBalance(ps) >= 60){Main.economy.withdrawPlayer(ps, 60);
            p.getInventory().addItem((ItemStack)ShopItems.SIBOOK(6,false));
                   }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 6:{if(Main.economy.getBalance(ps) >= 70){Main.economy.withdrawPlayer(ps, 70);
            p.getInventory().addItem((ItemStack)ShopItems.SIBOOK(7,false));
                   }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 7:{if(Main.economy.getBalance(ps) >= 80){Main.economy.withdrawPlayer(ps, 80);
            p.getInventory().addItem((ItemStack)ShopItems.SIBOOK(8,false));
                   }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 8:{if(Main.economy.getBalance(ps) >= 90){Main.economy.withdrawPlayer(ps, 90);
            p.getInventory().addItem((ItemStack)ShopItems.SIBOOK(9,false));
                   }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 9:{if(Main.economy.getBalance(ps) >= 100){Main.economy.withdrawPlayer(ps, 100);
            p.getInventory().addItem((ItemStack)ShopItems.SIBOOK(10,false));
                   }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 18:{if(Main.economy.getBalance(ps) >= 10){Main.economy.withdrawPlayer(ps, 10);
            p.getInventory().addItem((ItemStack)ShopItems.SIBOOKHP(1,false));
                   }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 19:{if(Main.economy.getBalance(ps) >= 20){Main.economy.withdrawPlayer(ps, 20);
            p.getInventory().addItem((ItemStack)ShopItems.SIBOOKHP(2,false));
                   }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 20:{if(Main.economy.getBalance(ps) >= 30){Main.economy.withdrawPlayer(ps, 30);
            p.getInventory().addItem((ItemStack)ShopItems.SIBOOKHP(3,false));
                   }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 21:{if(Main.economy.getBalance(ps) >= 40){Main.economy.withdrawPlayer(ps, 40);
            p.getInventory().addItem((ItemStack)ShopItems.SIBOOKHP(4,false));
                   }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 22:{if(Main.economy.getBalance(ps) >= 50){Main.economy.withdrawPlayer(ps, 50);
            p.getInventory().addItem((ItemStack)ShopItems.SIBOOKHP(5,false));
                   }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 23:{if(Main.economy.getBalance(ps) >= 60){Main.economy.withdrawPlayer(ps, 60);
            p.getInventory().addItem((ItemStack)ShopItems.SIBOOKHP(6,false));
                   }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 24:{if(Main.economy.getBalance(ps) >= 70){Main.economy.withdrawPlayer(ps, 70);
            p.getInventory().addItem((ItemStack)ShopItems.SIBOOKHP(7,false));
                   }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 25:{if(Main.economy.getBalance(ps) >= 80){Main.economy.withdrawPlayer(ps, 80);
            p.getInventory().addItem((ItemStack)ShopItems.SIBOOKHP(8,false));
                   }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 26:{if(Main.economy.getBalance(ps) >= 90){Main.economy.withdrawPlayer(ps, 90);
            p.getInventory().addItem((ItemStack)ShopItems.SIBOOKHP(9,false));
                   }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 27:{if(Main.economy.getBalance(ps) >= 100){Main.economy.withdrawPlayer(ps, 100);
            p.getInventory().addItem((ItemStack)ShopItems.SIBOOKHP(10,false));
                   }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            
            
            
            case 47:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {
                    ShopMenu.onSword(p);
                    }},1);break;}
            case 48:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {
                    ShopMenu.onBroni1(p);
                    }},1);break;}
            case 49:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {
                    ShopMenu.onShield(p);
                    }},1);break;}
            case 50:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {
                    ShopMenu.onUpgrade(p);
                    }},1);break;}
            case 51:{p.closeInventory();
                Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {
                    ShopMenu.onDonate(p);
                    }},1);break;}
        }
    }else if(in.equalsIgnoreCase("▸ Квесты")) {
        event.setCancelled(true);    
       int lgetmob = Levels.getPrizeMob(p.getName());
       int lgetboss = Levels.getPrizeBoss(p.getName());
       int lgetdun = Levels.getPrizeDung(p.getName());
       int lgetbossget = getboss[lgetboss];
       int lgetmobget = getmob[lgetmob];
       int lgetdunget = getdun[lgetdun];
       
          switch(event.getRawSlot()){
            case 20:{p.closeInventory();
            if(Levels.getMobs(p.getName())>=lgetmobget){
               Main.economy.depositPlayer(p.getName(), (lgetmob+20));
               Levels.addXP(p.getName(), (lgetmob*50));
               Levels.addPrizeMob(p.getName());
               p.sendTitle("§aКвест §e#"+lgetmob+" §aвыполнен!", "");
               p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_YES, 1f, 1f);
            }else{
                p.sendTitle("§cОшибка!", "§aНедостаточно убитых мобов!");}
            break;}
            case 22:{p.closeInventory();
            if(Levels.getBoss(p.getName())>=lgetbossget){
               Main.economy.depositPlayer(p.getName(), (lgetboss+30));
               Levels.addXP(p.getName(), (lgetboss*60));
               Levels.addPrizeBoss(p.getName());
               p.sendTitle("§aКвест §e#"+lgetboss+" §aвыполнен!", "");
               p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_YES, 1f, 1f);
            }else{
                p.sendTitle("§cОшибка!", "§aНедостаточно убитых босов!");}
            break;}
            case 24:{p.closeInventory();
            if(Levels.getDung(p.getName())>=lgetdunget){
               Main.economy.depositPlayer(p.getName(), (lgetdun+50));
               Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "case give "+p.getName()+" 1");
               Levels.addXP(p.getName(), (lgetdun*100));
               Levels.addPrizeDung(p.getName());
               p.sendTitle("§aКвест §e#"+lgetdun+" §aвыполнен!", "");
               p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_YES, 1f, 1f);
            }else{
                p.sendTitle("§cОшибка!", "§aНедостаточно убитых босов в данжах!");}
            break;}
         }
    }else if(in.equalsIgnoreCase("▸ Деревня")) {
        event.setCancelled(true);        
        switch(event.getRawSlot()){
            case 10:{p.closeInventory();
            p.chat("/village create");
            break;}
            case 11:{p.closeInventory();
            p.chat("/village home");
            
            break;}
            case 26:{p.closeInventory();
            p.chat("/village delete");
            break;}
        }
    }else if(in.equalsIgnoreCase("▸ Билетер")) {
        event.setCancelled(true);        
        switch(event.getRawSlot()){
            case 0:{if(Main.economy.getBalance(ps) >= 1){Main.economy.withdrawPlayer(ps, 1);
            p.sendMessage("§aВы приобрели билет на шатл. Пункт назначения : §eСпавн");
            p.getInventory().addItem(ShopItems.SIBILET(1, false));
            }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 1:{if(Main.economy.getBalance(ps) >= 800){Main.economy.withdrawPlayer(ps, 800);
            p.sendMessage("§aВы приобрели билет на шатл. Пункт назначения : §cСмертельный лабиринт");
            p.getInventory().addItem(ShopItems.SIBILET(2, false));
            }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 2:{if(Main.economy.getBalance(ps) >= 1000){Main.economy.withdrawPlayer(ps, 1000);
            p.sendMessage("§aВы приобрели билет на шатл. Пункт назначения : §cМистический лабиринт");
            p.getInventory().addItem(ShopItems.SIBILET(3, false));
            }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
        }
    }else if(in.equalsIgnoreCase("▸ Способности")) {
        event.setCancelled(true);
        switch(event.getRawSlot()){
            case 0:{p.closeInventory();
             if(Levels.getSPOPay(p.getName(), "inv")){
               Levels.setSpo(p.getName(), "inv");
               p.sendMessage("§4▸ Способность выбрана");
                }else{
               if(Main.economy.getBalance(ps) >= 10000){Main.economy.withdrawPlayer(ps, 10000);
               Levels.setSPOPay(p.getName(), "inv");
                p.sendMessage("§4▸ Способность приобретена");
                }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}  
             }
              break;}
            case 1:{p.closeInventory();
             if(Levels.getSPOPay(p.getName(), "reg")){
               Levels.setSpo(p.getName(), "reg");
               p.sendMessage("§4▸ Способность выбрана");
                }else{
               if(Main.economy.getBalance(ps) >= 10000){Main.economy.withdrawPlayer(ps, 10000);
               Levels.setSPOPay(p.getName(), "reg");
                p.sendMessage("§4▸ Способность приобретена");
                }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}
             }
              break;}
             case 2:{p.closeInventory();
             if(Levels.getSPOPay(p.getName(), "bomba")){
               Levels.setSpo(p.getName(), "bomba");
               p.sendMessage("§4▸ Способность выбрана");
                }else{
               if(Main.economy.getBalance(ps) >= 10000){Main.economy.withdrawPlayer(ps, 10000);
               Levels.setSPOPay(p.getName(), "bomba");
                p.sendMessage("§4▸ Способность приобретена");
                }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}  
             }
              break;}
              case 3:{p.closeInventory();
             if(Levels.getSPOPay(p.getName(), "rivok")){
               Levels.setSpo(p.getName(), "rivok");
               p.sendMessage("§4▸ Способность выбрана");
                }else{
               if(Main.economy.getBalance(ps) >= 10000){Main.economy.withdrawPlayer(ps, 10000);
               Levels.setSPOPay(p.getName(), "rivok");
                p.sendMessage("§4▸ Способность приобретена");
                }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}  
             }
              break;}
              case 4:{p.closeInventory();
             if(Levels.getSPOPay(p.getName(), "hil")){
               Levels.setSpo(p.getName(), "hil");
               p.sendMessage("§4▸ Способность выбрана");
                }else{
               if(Main.economy.getBalance(ps) >= 10000){Main.economy.withdrawPlayer(ps, 10000);
               Levels.setSPOPay(p.getName(), "hil");
                p.sendMessage("§4▸ Способность приобретена");
                }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}  
             }
              break;}
              case 26:{p.closeInventory();
               Levels.setSpo(p.getName(), "null");
               p.sendMessage("§4▸ Все способности отключены");
              break;}
        }
    }else if(in.equalsIgnoreCase("▸ Боевые питомцы")) {
        event.setCancelled(true);        
        switch(event.getRawSlot()){
            case 19:{p.closeInventory();
              Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {
                    ShopMenu.onPITSHOP(p);
                    }},1);
              break;}
            case 33:{p.closeInventory();
              Bukkit.getScheduler().runTaskLater(Bukkit.getPluginManager().getPlugin("CoreRPG"), new Runnable(){ 
                @Override public void run() {
                    ShopMenu.onPITPROF(p);
                    }},1);
              break;}
            case 34:{p.closeInventory();
                p.chat("/petb");
              break;}
            case 15:{p.closeInventory();
                p.chat("/petswitch");
              break;}
            case 16:{p.closeInventory();
                p.chat("/petsa");
              break;}
        }
    }else if(in.equalsIgnoreCase("▸ Профессия питомца")) {
        event.setCancelled(true);        
        switch(event.getRawSlot()){
            case 12:{p.closeInventory();
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "petadmin skilltree "+ps+" Combat");
              break;}
            case 14:{p.closeInventory();
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "petadmin skilltree "+ps+" PvP");
              break;}
        }
    }else if(in.equalsIgnoreCase("▸ Информация")) {
        switch(event.getRawSlot()){
            case 42:{p.closeInventory();
                ItemStack i = event.getCurrentItem();
                String s = (i.getItemMeta().getDisplayName()).substring(28);
                
                p.chat("/report "+s);
              break;}
            case 43:{p.closeInventory();
                ItemStack i = event.getCurrentItem();
                String s = (i.getItemMeta().getDisplayName()).substring(30);
                
                p.chat("/clan invite "+s);
              break;}
        }
        event.setCancelled(true);
    }else if(in.equalsIgnoreCase("▸ Награды/Информация")) {
        switch(event.getRawSlot()){
            case 12:{p.closeInventory();
                if(Cooldown.hasCooldown(p.getName(), "kit")){
                long time = ((Cooldown.getCooldown(p.getName(), "kit")) /1000/60/60);
                int timeformat = (int)time;
                p.sendMessage("§e[Награда дня] §aДля повторного получения, ожидайте " + timeformat + "§a час(ов)");
                    }else{
                onKit(p);
                Utils.Firework(p.getLocation(), 1);
                Cooldown.setCooldown(p.getName(), 86400 * 1000L, "kit");             
                }    
              break;}
            case 14:{p.closeInventory();
                  ShopMenu.onNagI(p);
              break;}
        }
        event.setCancelled(true);
    }else if(in.equalsIgnoreCase("▸ Магазин питомцев")) {
        event.setCancelled(true);
        switch(event.getRawSlot()){
            case 0:{p.closeInventory();
              if(Main.economy.getBalance(ps) >= 5000){Main.economy.withdrawPlayer(ps, 5000);
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "petadmin create "+ps+" Wolf baby");p.sendMessage("§a▸ Вы приобрели питомцa");
              }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 1:{p.closeInventory();
              if(Main.economy.getBalance(ps) >= 10000){Main.economy.withdrawPlayer(ps, 10000);
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "petadmin create "+ps+" CaveSpider baby");p.sendMessage("§a▸ Вы приобрели питомцa");
              }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 2:{p.closeInventory();
              if(Main.economy.getBalance(ps) >= 10000){Main.economy.withdrawPlayer(ps, 10000);
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "petadmin create "+ps+" Ocelot baby");p.sendMessage("§a▸ Вы приобрели питомцa");
              }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 3:{p.closeInventory();
              if(Main.economy.getBalance(ps) >= 10000){Main.economy.withdrawPlayer(ps, 10000);
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "petadmin create "+ps+" Cow baby");p.sendMessage("§a▸ Вы приобрели питомцa");
              }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 4:{p.closeInventory();
              if(Main.economy.getBalance(ps) >= 10000){Main.economy.withdrawPlayer(ps, 10000);
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "petadmin create "+ps+" Sheep baby");p.sendMessage("§a▸ Вы приобрели питомцa");
              }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 5:{p.closeInventory();
              if(Main.economy.getBalance(ps) >= 10000){Main.economy.withdrawPlayer(ps, 10000);
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "petadmin create "+ps+" Mooshroom baby");p.sendMessage("§a▸ Вы приобрели питомцa");
              }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 6:{p.closeInventory();
              if(Main.economy.getBalance(ps) >= 20000){Main.economy.withdrawPlayer(ps, 20000);
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "petadmin create "+ps+" Slime baby");p.sendMessage("§a▸ Вы приобрели питомцa");
              }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 7:{p.closeInventory();
              if(Main.economy.getBalance(ps) >= 20000){Main.economy.withdrawPlayer(ps, 20000);
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "petadmin create "+ps+" MagmaCube baby");p.sendMessage("§a▸ Вы приобрели питомцa");
              }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 8:{p.closeInventory();
              if(Main.economy.getBalance(ps) >= 20000){Main.economy.withdrawPlayer(ps, 20000);
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "petadmin create "+ps+" Endermite");p.sendMessage("§a▸ Вы приобрели питомцa");
              }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 9:{p.closeInventory();
              if(Main.economy.getBalance(ps) >= 20000){Main.economy.withdrawPlayer(ps, 20000);
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "petadmin create "+ps+" Horse baby");p.sendMessage("§a▸ Вы приобрели питомцa");
              }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 10:{p.closeInventory();
              if(Main.economy.getBalance(ps) >= 20000){Main.economy.withdrawPlayer(ps, 20000);
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "petadmin create "+ps+" Parrot");p.sendMessage("§a▸ Вы приобрели питомцa");
              }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 11:{p.closeInventory();
              if(Main.economy.getBalance(ps) >= 20000){Main.economy.withdrawPlayer(ps, 20000);
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "petadmin create "+ps+" Chicken baby");p.sendMessage("§a▸ Вы приобрели питомцa");
              }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 12:{p.closeInventory();
              if(Main.economy.getBalance(ps) >= 20000){Main.economy.withdrawPlayer(ps, 20000);
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "petadmin create "+ps+" PigZombie baby");p.sendMessage("§a▸ Вы приобрели питомцa");
              }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 13:{p.closeInventory();
              if(Main.economy.getBalance(ps) >= 20000){Main.economy.withdrawPlayer(ps, 20000);
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "petadmin create "+ps+" Rabbit baby");p.sendMessage("§a▸ Вы приобрели питомцa");
              }else{p.sendMessage("§4▸ Недостаточно монет для покупки");}break;}
            case 14:{p.closeInventory();if(Main.sB(p, 10)){//Coins.setCoins(ps, coins-10);
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "petadmin create "+ps+" Bat");p.sendMessage("§a▸ Вы приобрели питомца");
            }else{p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 15:{p.closeInventory();if(Main.sB(p, 10)){//Coins.setCoins(ps, coins-10);
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "petadmin create "+ps+" Llama baby");p.sendMessage("§a▸ Вы приобрели питомца");
            }else{p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 16:{p.closeInventory();if(Main.sB(p, 10)){//Coins.setCoins(ps, coins-10);
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "petadmin create "+ps+" PolarBear baby");p.sendMessage("§a▸ Вы приобрели питомца");
            }else{p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
            case 17:{p.closeInventory();if(Main.sB(p, 10)){//Coins.setCoins(ps, coins-10);
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "petadmin create "+ps+" Vex");p.sendMessage("§a▸ Вы приобрели питомца");
            }else{p.sendMessage("§4▸ Недостаточно коинов для покупки, пополнение "+site);}break;}
        }
    }
  }
  public static ItemStack changeLore(ItemStack item, int index, String lore)
  { 
    ItemMeta meta = item.getItemMeta();
    List<String> lores = new ArrayList(meta.getLore());lores.set(index - 1, lore);
    meta.setLore(lores);
    item.setItemMeta(meta);
    return item;
  }
  

}
