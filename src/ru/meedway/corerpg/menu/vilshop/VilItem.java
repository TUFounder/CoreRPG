package ru.meedway.corerpg.menu.vilshop;

import java.util.ArrayList;
import java.util.Random;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class VilItem {
    public static ItemStack onItem(Material m, String about, int price){
            ItemStack i= new ItemStack(m,1);
            ItemMeta im = i.getItemMeta();
            ArrayList<String> l = new ArrayList<>();
            l.add("");
            l.add("§7Описание:");
            l.add("§7- "+about);
            if(price != 0){l.add("");l.add("§aСтоимость: §6"+price);}
            im.setLore(l);
            i.setItemMeta(im);
        return i;
    }
    
    public static Material onMaterial(){
        Material m = Material.ACACIA_STAIRS;
        Random r = new Random();   
        int rt = r.nextInt(20);  
            if (rt == 1) return Material.ACACIA_DOOR;
            if (rt == 2) return Material.OBSIDIAN;
            if (rt == 3) return Material.ORANGE_GLAZED_TERRACOTTA;
            if (rt == 4) return Material.ENDER_STONE;
            if (rt == 5) return Material.WEB;
            if (rt == 6) return Material.SILVER_GLAZED_TERRACOTTA;
            if (rt == 7) return Material.GLOWSTONE;
            if (rt == 8) return Material.CHEST;
            if (rt == 9) return Material.QUARTZ_BLOCK;
            if (rt == 10) return Material.ICE;
            if (rt == 11) return Material.BANNER;
            if (rt == 12) return Material.BLACK_GLAZED_TERRACOTTA;
            if (rt == 13) return Material.BLUE_GLAZED_TERRACOTTA;
            if (rt == 14) return Material.BROWN_GLAZED_TERRACOTTA;
            if (rt == 15) return Material.COBBLESTONE;
            if (rt == 16) return Material.MAGENTA_GLAZED_TERRACOTTA;
            if (rt == 17) return Material.WATER_LILY;
            if (rt == 18) return Material.GOLD_PLATE;
            if (rt == 19) return Material.JUKEBOX;
            if (rt == 20) return Material.BIRCH_DOOR;
        return m;
    }
    
    public static String onAbout(){
        Random r = new Random();   
        int rt = r.nextInt(10) + 1; 
        if (rt == 1) return "Слегка необычный предмет";
        if (rt == 2) return "Поставь меня куда нибудь";
        if (rt == 3) return "Кстати этот предмет еще сможет многое";
        if (rt == 4) return "О, да меня сейчас купят";
        if (rt == 5) return "Купи меня";
        if (rt == 6) return "Я сломан, пачини";
        if (rt == 7) return "Я хочу жить не бери меня";
        if (rt == 8) return "Нам будет интересно";
        if (rt == 9) return "Я тучка тучка тучка";
        if (rt == 10) return "НЕ промахнись, а то я обижусь";
        if (rt == 11) return "Как бы тебе так тонко намекнуть, КУПИ МЕНЯ!";
        return "Я сломан, пачини";
    }
    
    public static int onPrice(){
        Random r = new Random();   
        int rt = r.nextInt(100) + 1; 
        return rt;
    }
    
   public static ItemStack onItemConstructor(){
        return onItem(onMaterial(), onAbout(), onPrice());
   }
   
   public static void onLoadItem(){
       VilMenu.vilinventory.clear();
       for(int i =0; i<=26;i++){VilMenu.vilinventory.put(i, onItemConstructor());}
   }
   
}
