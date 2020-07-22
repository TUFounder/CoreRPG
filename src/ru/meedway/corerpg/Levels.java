package ru.meedway.corerpg;

import es.darkhorizon.dev.main;
import java.io.File;
import java.io.IOException;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;



public class Levels{
    private File file;
    public static int[] getl = new int[]{0,10,244,499,1001,2018,4321,7900,16500,27500,44500,72000,144000,300000,483000,790000,1000000,1500000,2348000,3300000,5252000,8252000,17311000,36511000,61511000,110511000,200511000,999999999};
    //public static long[] getx = new long[]{0,10,50,150,400,1000,2500,5000,13000,28000,49000,90500,150000,250000,400000,560000,680000,780000,895000,990000,1100000,1400000,1800000,2400000,3200000,4500000,7100000,8900000,11500000,20900000,35100000,49100000,67500000,89700000,109200000,130500000,180100000,291900000,475200000,766600000,1100000000,2300000000L,5600000000L,13800000000L,20100000000L,34400000000L,55500000000L,80300000000L,120200000000L,155500000000L,180600000000L,279100000000L,386600000000L,449100000000L,530100000000L,599900000000L,640100000000L,710200000000L,760300000000L,800000000000L,850700000000L,911100000000L,967700000000L,1000000000000L,1100000000000L,1300000000000L,1500000000000L,1700000000000L,2000000000000L,2400000000000L,2900000000000L,3500000000000L,4200000000000L,5000000000000L,6000000000000L,7500000000000L,10000000000000L,15000000000000L,23100000000000L,30200000000000L,40000000000000L,55100000000000L,69000000000000L,80000000000000L,99900000000000L,125000000000000L,160000000000000L,190100000000000L,260700000000000L,340000000000000L,460500000000000L,560100000000000L,699900000000000L,867100000000000L,1100000000000000L,1900000000000000L,2700000000000000L,6900000000000000L,14100000000000000L,12500000000000000L,25800000000000000L,50500000000000000L,999900000000000000L};
    public static int[] getclvl= new int[]{0,0,0,0,0,0,0,0,0,0,1,5,20,75,50,100,400,800,1400,2500,4000,6500,10500,16100,30000,58000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000,100000};
    public static YamlConfiguration config;
    static void newConfig(YamlConfiguration conf) {
        config = conf;
    }
    public static int l2 = 10;
    public static int l3 = 244;
    public static int l4 = 499;
    public static int l5 = 1001;
    public static int l6 = 2048;
    public static int l7 = 4321;
    public static int l8 = 7900;
    public static int l9 = 16500;
    public static int l10 = 27500;
    public static int l11 = 44500;
    public static int l12 = 72000;
    public static int l13 = 144000;
    public static int l14 = 300000;
    public static int l15 = 483000;
    public static int l16 = 790000;
    public static int l17 = 1000000;
    public static int l18 = 1500000;
    public static int l19 = 2348000;
    public static int l20 = 3300000;
    static int lmax = 99999999;
            
    
    public static int getXP(String pl){
        int xp = Main.c.getInt("player."+pl.toLowerCase()+".xp");
        if(xp==0){
            return 0;
        }
        return xp; 
    }
    
    public static void setXP(String pl,int i){
        Main.c.set("player."+pl.toLowerCase()+".xp", i);
        Main.m.saveConfig();
    }
    
    
    public static void addXP(String pl, int i){
        String name=pl.toLowerCase();
        int l = getXP(pl);
        Main.c.set("player."+name+".xp", l+i);
        Main.m.saveConfig();Main.m.reloadConfig();
        int lvl = Levels.getLevel(pl);
        int getxp = Levels.getXP(pl);
        int getxpclan = main.ClanEXP(Bukkit.getPlayer(pl));
        int xpto = getl[lvl];
        int xpcto = getclvl[lvl];
        
        if(getxp>=xpto){
            if(getxpclan>=xpcto){
                Levels.addLevel(pl, 1);
                onLevelUP(Bukkit.getPlayer(pl), lvl);
                Main.m.saveConfig();Main.m.reloadConfig();
            }
        }
        
        
        /*if(l>l2 && l<l3){if(Levels.getLevel(pl) <= 1){Levels.addLevel(pl, 1);onLevelUP(Bukkit.getPlayer(pl), 2);Main.m.saveConfig();Main.m.reloadConfig();}}
        if(l>l3 && l<l4){if(Levels.getLevel(pl) <= 2){Levels.addLevel(pl, 1);onLevelUP(Bukkit.getPlayer(pl), 3);Main.m.saveConfig();Main.m.reloadConfig();}}
        if(l>l4 && l<l5){if(Levels.getLevel(pl) <= 3){Levels.addLevel(pl, 1);onLevelUP(Bukkit.getPlayer(pl), 4);Main.m.saveConfig();Main.m.reloadConfig();}}
        if(l>l5 && l<l6){if(Levels.getLevel(pl) <= 4){Levels.addLevel(pl, 1);onLevelUP(Bukkit.getPlayer(pl), 5);Main.m.saveConfig();Main.m.reloadConfig();}}
        if(l>l6 && l<l7){if(Levels.getLevel(pl) <= 5){Levels.addLevel(pl, 1);onLevelUP(Bukkit.getPlayer(pl), 6);Main.m.saveConfig();Main.m.reloadConfig();}}
        if(l>l7 && l<l8){if(Levels.getLevel(pl) <= 6){Levels.addLevel(pl, 1);onLevelUP(Bukkit.getPlayer(pl), 7);Main.m.saveConfig();Main.m.reloadConfig();}}
        if(l>l8 && l<l9){if(Levels.getLevel(pl) <= 7){Levels.addLevel(pl, 1);onLevelUP(Bukkit.getPlayer(pl), 8);Main.m.saveConfig();Main.m.reloadConfig();}}
        if(l>l9 && l<l10){if(Levels.getLevel(pl) <= 8){Levels.addLevel(pl, 1);onLevelUP(Bukkit.getPlayer(pl), 9);Main.m.saveConfig();Main.m.reloadConfig();}}
        if(l>l10 && l<l11){if(Levels.getLevel(pl) <= 9){Levels.addLevel(pl, 1);onLevelUP(Bukkit.getPlayer(pl), 10);Main.m.saveConfig();Main.m.reloadConfig();}}
        if(l>l11 && l<l12){if(Levels.getLevel(pl) <= 10){Levels.addLevel(pl, 1);onLevelUP(Bukkit.getPlayer(pl), 11);Main.m.saveConfig();Main.m.reloadConfig();}}
        if(l>l12 && l<l13){if(Levels.getLevel(pl) <= 11){Levels.addLevel(pl, 1);onLevelUP(Bukkit.getPlayer(pl), 12);Main.m.saveConfig();Main.m.reloadConfig();}}
        if(l>l13 && l<l14){if(Levels.getLevel(pl) <= 12){Levels.addLevel(pl, 1);onLevelUP(Bukkit.getPlayer(pl), 13);Main.m.saveConfig();Main.m.reloadConfig();}}
        if(l>l14 && l<l15){if(Levels.getLevel(pl) <= 13){Levels.addLevel(pl, 1);onLevelUP(Bukkit.getPlayer(pl), 14);Main.m.saveConfig();Main.m.reloadConfig();}}
        if(l>l15 && l<l16){if(Levels.getLevel(pl) <= 14){Levels.addLevel(pl, 1);onLevelUP(Bukkit.getPlayer(pl), 15);Main.m.saveConfig();Main.m.reloadConfig();}}
        if(l>l16 && l<l17){if(Levels.getLevel(pl) <= 15){Levels.addLevel(pl, 1);onLevelUP(Bukkit.getPlayer(pl), 16);Main.m.saveConfig();Main.m.reloadConfig();}}
        if(l>l17 && l<l18){if(Levels.getLevel(pl) <= 16){Levels.addLevel(pl, 1);onLevelUP(Bukkit.getPlayer(pl), 17);Main.m.saveConfig();Main.m.reloadConfig();}}
        if(l>l18 && l<l19){if(Levels.getLevel(pl) <= 17){Levels.addLevel(pl, 1);onLevelUP(Bukkit.getPlayer(pl), 18);Main.m.saveConfig();Main.m.reloadConfig();}}
        if(l>l19 && l<l20){if(Levels.getLevel(pl) <= 18){Levels.addLevel(pl, 1);onLevelUP(Bukkit.getPlayer(pl), 19);Main.m.saveConfig();Main.m.reloadConfig();}}
        if(l>l20 && l<lmax){if(Levels.getLevel(pl) <= 19){Levels.addLevel(pl, 1);onLevelUP(Bukkit.getPlayer(pl), 20);Main.m.saveConfig();Main.m.reloadConfig();}}
        if(l>0){Main.m.saveConfig();}*/
        saveConfigs(Main.c);
        
    }
    
public static void onLevelUP(Player p, int level){
       Firework.Fireworkrun(p);
       int l = level+1;
       Main.lvlUP(p.getName(), l);
       p.sendTitle("§d§lУРОВЕНЬ ПОВЫШЕН!", "§aПоздравляю, теперь твой уровень: §e"+l);
       if(l==10){
       p.sendTitle("§c§lВНИМАНИЕ!", "§bС 11 уровня, требуется опыт клана!");
       }
       if(l==12){
       p.sendTitle("§d§lВНИМАНИЕ", "§aТеперь локации открываются через 2 уровня!");    
       }
       if(l==20){
       p.sendTitle("§d§lВНИМАНИЕ!", "§a5е измерение откроется на 23м уровне!");    
       }
       p.playSound(p.getLocation(), Sound.ITEM_TOTEM_USE, 1f, 1f);
       Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "ad say 276 global &aИгрок §e"+p.getName()+" &aполучил §e"+l+" уровень!");
}
    
    
    public static int getLevel(String pl){
        int xp = Main.c.getInt("player."+pl.toLowerCase()+".level");
        if(xp==0){
            return 1;
        }
        return xp; 
    }
    
    
    public static void setLevel(String pl,int i){
        Main.c.set("player."+pl.toLowerCase()+".level", i);
    }
    
    
    public static void addLevel(String pl, int i){
        String name=pl.toLowerCase();
        Main.c.set("player."+name+".level", Levels.getLevel(pl)+i);
        if(Levels.getLevel(pl)>1)
        Main.m.saveConfig();Main.m.reloadConfig();
    }
    
    public static void saveConfigs(FileConfiguration c){
         try {
            c.save(new File("plugins/CoreRPG","config.yml"));
        } catch (IOException ex) {
            
        }
    }
  /**/  
    public static void addMobs(String pl){
        String name=pl.toLowerCase();
        
        Main.c.set("player."+name+".mobs", Levels.getMobs(pl)+1);
        if(Levels.getMobs(pl)>1)
            Main.m.saveConfig();
            saveConfigs(Main.c);
    }
    public static void addBoss(String pl){
        String name=pl.toLowerCase();
        
        Main.c.set("player."+name+".boss", Levels.getBoss(pl)+1);
        if(Levels.getBoss(pl)>1)
            Main.m.saveConfig();
            saveConfigs(Main.c);
    }
    
    public static void addDung(String pl){
        String name=pl.toLowerCase();
        
        Main.c.set("player."+name+".dung", Levels.getDung(pl)+1);
        if(Levels.getBoss(pl)>1)
            Main.m.saveConfig();
            saveConfigs(Main.c);
    }
    
    public static int getMobs(String pl){
        int xp = Main.c.getInt("player."+pl.toLowerCase()+".mobs");
        if(xp==0){
            return 0;
        }
        return xp; 
    }
    public static int getBoss(String pl){
        int xp = Main.c.getInt("player."+pl.toLowerCase()+".boss");
        if(xp==0){
            return 0;
        }
        return xp; 
    }
    public static int getDung(String pl){
        int xp = Main.c.getInt("player."+pl.toLowerCase()+".dung");
        if(xp==0){
            return 0;
        }
        return xp; 
    }
    /**/
    public static void addPrizeMob(String pl){
        String name=pl.toLowerCase();
        
        Main.c.set("player."+name+".prizemob", Levels.getPrizeMob(pl)+1);
        if(Levels.getPrizeMob(pl)>1)
            Main.m.saveConfig();
            saveConfigs(Main.c);
    } 
    public static int getPrizeMob(String pl){
        int xp = Main.c.getInt("player."+pl.toLowerCase()+".prizemob");
        if(xp==0){
            return 0;
        }
        return xp; 
    }
    /**/
    public static void addPrizeBoss(String pl){
        String name=pl.toLowerCase();
        
        Main.c.set("player."+name+".prizeboss", Levels.getPrizeBoss(pl)+1);
        if(Levels.getPrizeBoss(pl)>1)
            Main.m.saveConfig();
            saveConfigs(Main.c);
    } 
    public static int getPrizeBoss(String pl){
        int xp = Main.c.getInt("player."+pl.toLowerCase()+".prizeboss");
        if(xp==0){
            return 0;
        }
        return xp; 
    }
    /**/
    public static void addPrizeDung(String pl){
        String name=pl.toLowerCase();
        
        Main.c.set("player."+name+".prizedung", Levels.getPrizeDung(pl)+1);
        if(Levels.getPrizeMob(pl)>1)
            Main.m.saveConfig();
            saveConfigs(Main.c);
    } 
    public static int getPrizeDung(String pl){
        int xp = Main.c.getInt("player."+pl.toLowerCase()+".prizedung");
        if(xp==0){
            return 0;
        }
        return xp; 
    }
    /**/
    /**/
    public static void setBonusYT(String p){
        String name=p.toLowerCase();
        Main.c.set("player."+name+".bonusyt", true);
        Main.m.saveConfig();saveConfigs(Main.c);
    }
    public static boolean getBonusYT(String pl){
        boolean xp = Main.c.getBoolean("player."+pl.toLowerCase()+".bonusyt");
        return xp; 
    }
    /**/
    public static void addSub(){
        Main.c.set("subscribe.sub", getSub()+1);
            Main.m.saveConfig();
            saveConfigs(Main.c);
    } 
    public static int getSub(){
        int xp = Main.c.getInt("subscribe.sub");
        if(xp==0){return 0;}
        return xp; 
    }
    /**/
    /**/
    public static void setBoosterYES(){
        Main.c.set("booster", true);
        Main.m.saveConfig();saveConfigs(Main.c);
    }
    public static void setBoosterNO(){
        Main.c.set("booster", false);
        Main.m.saveConfig();saveConfigs(Main.c);
    }
    public static boolean getBooster(){
        boolean booster = Main.c.getBoolean("booster");
        return booster;
    }
    /**/
    /**/
    public static String slink = "http://yadi.sk/sborka";
    public static String rlink = "http://yadi.sk/resource";
    
    public static void setSLink(String p){
        String name=p.toLowerCase();
        Main.c.set("player."+name+".slink", true);
        Main.m.saveConfig();saveConfigs(Main.c);
    }
    public static boolean getSLink(String pl){
        boolean xp = Main.c.getBoolean("player."+pl.toLowerCase()+".slink");
        return xp; 
    }
    
    public static void setRLink(String p){
        String name=p.toLowerCase();
        Main.c.set("player."+name+".rlink", true);
        Main.m.saveConfig();saveConfigs(Main.c);
    }
    public static boolean getRLink(String pl){
        boolean xp = Main.c.getBoolean("player."+pl.toLowerCase()+".rlink");
        return xp; 
    }
    /**/
    /**/
    public static void setSpo(String p,String spo){
        String name=p.toLowerCase();
        Main.c.set("player."+name+".spo", spo);
        Main.m.saveConfig();saveConfigs(Main.c);
    }
    public static String getSpo(String pl){
        String xp = Main.c.getString("player."+pl.toLowerCase()+".spo");
        if(xp==null){
            return "null";
        }
        return xp;
    }
    /**/
    public static void setSPOPay(String p,String spo){
        String name=p.toLowerCase();
        Main.c.set("player."+name+"."+spo, true);
        Main.m.saveConfig();saveConfigs(Main.c);
    }
    public static boolean getSPOPay(String pl,String spo){
        boolean xp = Main.c.getBoolean("player."+pl.toLowerCase()+"."+spo);
        return xp; 
    }
    
   /**/
    public static String getTab(int i){
        String xp = Main.c.getString("settings.tab."+i);
        return xp; 
    }
   /**/
    public static void setArhont(String p){
        String name=p.toLowerCase();
        Main.c.set("player."+name+".arhont", true);
        Main.m.saveConfig();saveConfigs(Main.c);
    }
    public static boolean getArhont(String pl){
        boolean xp = Main.c.getBoolean("player."+pl.toLowerCase()+".arhont");
        return xp;
    }
    
    /**/
    
    public static void setupArhont(String p){
        String name=p.toLowerCase();
        Main.c.set("settings.arhont", name);
        Main.m.saveConfig();saveConfigs(Main.c);
    }

    public static void nullArhont(){
        Main.c.set("settings.arhont", null);
        Main.m.saveConfig();saveConfigs(Main.c);
    }
    
    public static int getCoins(Player p){
        int i = (int) Main.getBal(p);
        return i;
    }
    
    public static int getMoney(Player p){
        int i = (int) Main.economy.getBalance(p);
        return i;
    }
/*"§cMEEDWAY RPG\n§7Онлайн:§e "+online+"\n\n§8§l§m                     ", "§8§l§m                     \n\n§7Сайт сервера: §eMW-RPG.RU\n§7Полезная информация: §c/help"*/
}