package ru.meedway.corerpg;

import java.util.HashMap;

public class Cooldown {
    private final String player;
    private final long cooldown;
    private final String key;
    public static HashMap<String, Cooldown> cooldowns = new HashMap();
    
    public Cooldown(String player, long cooldown, String key){
        this.player = player;
        this.cooldown = cooldown;
        this.key = key;
    }
    
    public String getPlayer(){
        return this.player;
    }
    
    public long getCooldown(){
        return this.cooldown;
        
    }
    
    public String getKey(){
        return this.key;
    }
    
    public static void setCooldown(String player, long cooldown, String title){
        cooldowns.put(player + title, new Cooldown(player, System.currentTimeMillis()+ cooldown, title));
    }
    
    public static boolean hasCooldown(String player, String title){
        if(cooldowns.get(player + title) == null){
            return false;
        }
        return ((Cooldown)cooldowns.get(player + title)).getCooldown() > System.currentTimeMillis();
    }
    
    public static long getCooldown(String player, String title){
        return ((Cooldown)cooldowns.get(player + title)).getCooldown() - System.currentTimeMillis();
    }
}

