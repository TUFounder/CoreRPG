package ru.meedway.corerpg;

import com.mewin.WGRegionEvents.events.RegionEnterEvent;
import com.mewin.WGRegionEvents.events.RegionLeaveEvent;
import de.Keyle.MyPet.MyPetApi;
import de.Keyle.MyPet.api.entity.MyPet;
import es.darkhorizon.dev.main;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import mw.TravoQur.caseq.ConfigBox;
import mw.donate.lyamour.Coins;
import net.milkbowl.vault.economy.Economy;
import net.minecraft.server.v1_12_R1.BlockPosition;
import net.minecraft.server.v1_12_R1.IChatBaseComponent;
import net.minecraft.server.v1_12_R1.NBTBase;
import net.minecraft.server.v1_12_R1.NBTTagCompound;
import net.minecraft.server.v1_12_R1.NBTTagDouble;
import net.minecraft.server.v1_12_R1.NBTTagInt;
import net.minecraft.server.v1_12_R1.NBTTagList;
import net.minecraft.server.v1_12_R1.NBTTagLong;
import net.minecraft.server.v1_12_R1.NBTTagString;
import net.minecraft.server.v1_12_R1.PacketPlayOutPlayerListHeaderFooter;
import net.minecraft.server.v1_12_R1.PlayerConnection;
import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.craftbukkit.v1_12_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.craftbukkit.v1_12_R1.inventory.CraftItemStack;
import org.bukkit.craftbukkit.v1_12_R1.util.CraftMagicNumbers;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Evoker;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;
import org.bukkit.util.Vector;
import ru.meedway.corerpg.menu.location.LocationClick;
import ru.meedway.corerpg.menu.vilshop.VilClick;
import ru.meedway.corerpg.menu.vilshop.VilItem;
import ru.meedway.corerpg.menu.vilshop.VilMenu;
import ru.meedway.lvltop.Mainlvl;
import ru.meedway.warnrpg.WarnRPG;

public class Main extends JavaPlugin implements Listener{

    public ArrayList<String> inportal = new ArrayList();
    private final Map<Player, Long> lastSneak = new HashMap<>();
    
    HashMap<Integer, String> point = new HashMap<>();
    HashMap<Integer, String> bos = new HashMap<>();
    ArrayList<Player> list = new ArrayList<>();
    public static ArrayList<Player> boss1 = new ArrayList<>();
    public static ArrayList<Player> boss2 = new ArrayList<>();
    public static ArrayList<Player> boss3 = new ArrayList<>();
    public static ArrayList<String> inpvp = new ArrayList();
    
    public static ArrayList<Player> arenalab = new ArrayList<>();
    public static ArrayList<Player> arenalog = new ArrayList<>();
    
    Set<String> antispam = new HashSet();
    boolean b1 = false; 
    
    private static final HashMap<String, Integer> expclan = new HashMap();
    public static String kit;
    public static int count = 0;
    public static int login = 0;
    public static int bosslevels = 0;
    public static int counts = 0;
    private static Main plugin;
    public static Main instance = null;
    public static Main m;
    public static FileConfiguration c;
    public static Economy economy = null;
    public static Main getPlugin() {return plugin;}
    public static Main getInstance() {
        return instance;
    }
    
    @Override
    public void onEnable(){  
    plugin = this;
    m=this;
    setupEconomy();
    c = getConfig();
    c.options().copyDefaults(true);
    Bukkit.getPluginManager().registerEvents(new ExpDrop(), this);
    Bukkit.getPluginManager().registerEvents(new ChatEvents(), this);
    Bukkit.getPluginManager().registerEvents(new KeepInventory(), this);
    Bukkit.getPluginManager().registerEvents(new ShopMenuClick(), this);
    Bukkit.getPluginManager().registerEvents(new LocationClick(), this);
    Bukkit.getPluginManager().registerEvents(new VilClick(), this);
    Bukkit.getPluginManager().registerEvents(new Inv(), this);
    Bukkit.getPluginManager().registerEvents(new Utils(), this);
    Bukkit.getPluginManager().registerEvents(this, this);
    saveConfig();

     new BukkitRunnable(){
            @Override
            public void run() {
                    refresh();
                    refresh2();
                    refreshclan();
                    removepoint();
                    randomEvent();
            }
        }.runTaskLater(this, 60L);
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
       
       if (cmd.getName().equalsIgnoreCase("levels")) {
           Player p =(Player) sender;
       if(p.hasPermission("meedway.admin")){
       if(args.length > 0){
                if(args[0].equalsIgnoreCase("get")){
                String a = args[1];    
                sender.sendMessage("§6:"+Levels.getXP(a));
                }
                if(args[0].equalsIgnoreCase("set")){
                    String a = args[1];
                    String b = args[2];
                    int c = Integer.parseInt(b);
                    Levels.setXP(a, c);
                    saveConfig();
                }
                if(args[0].equalsIgnoreCase("add")){
                    String a = args[1];
                    String b = args[2];
                    int c = Integer.parseInt(b);
                    Levels.addXP(a, c);
                    saveConfig();
                }if(args[0].equalsIgnoreCase("npc")){
                    spawnVillagers();
                }
                if(args[0].equalsIgnoreCase("chest")){
                    openChest();
                }if(args[0].equalsIgnoreCase("s")){
                    ShopMenu.onSPO(p);
                }if(args[0].equalsIgnoreCase("p")){
                    ShopMenu.onPIT(p);
                }if(args[0].equalsIgnoreCase("chances")){
                    onChances(p);
                }if(args[0].equalsIgnoreCase("g")){
                    p.sendMessage(""+p.getFoodLevel());
                }if(args[0].equalsIgnoreCase("size")){
                   int size = bos.size();
                   p.sendMessage(""+size);
                }if(args[0].equalsIgnoreCase("clan")){
                    SignsUtil.setSign(p, "setName");
                }if(args[0].equalsIgnoreCase("random")){
                    onRandomEvent(p);
                }
                if(args[0].equalsIgnoreCase("addcoins")){
                    String a = args[1];
                    String b = args[2];
                    int c = Integer.parseInt(b);
                    
                }
                if(args[0].equalsIgnoreCase("getcoins")){
                String a = args[1];    
                }
                if(args[0].equalsIgnoreCase("getplayerinfo")){
                    ShopMenu.onPlayerInfo(p, p);
                }
                if(args[0].equalsIgnoreCase("setvil")){
                    VilItem.onLoadItem();
                }
                if(args[0].equalsIgnoreCase("getvil")){
                    VilMenu.onMenu(p);
                }
       }
       }else{}
       return true;
     }else if (cmd.getName().equalsIgnoreCase("kit")){
         Player p =(Player) sender;
         if(Cooldown.hasCooldown(p.getName(), "kit")){
         long time = ((Cooldown.getCooldown(p.getName(), "kit")) /1000/60/60);
         int timeformat = (int)time;
         p.sendMessage("§aДля повторного получения, ожидайте " + timeformat + "§a час(ов)");
        }else{
            onKit(p);
            Cooldown.setCooldown(p.getName(), 86400 * 1000L, "kit");             
         }
         return false;
     }else if (cmd.getName().equalsIgnoreCase("shop")){
         Player p =(Player) sender;
         p.sendMessage("§7▸ §aВзаимодействуйте с НПС на спавне для открытия меню торговца!");
         return false;
     }else if (cmd.getName().equalsIgnoreCase("donate")){
         Player p =(Player) sender;
         if(p.getWorld().equals(Bukkit.getWorld("world"))){
          ShopMenu.onDonate(p);   
         }else{
             p.sendMessage("§7▸ §aЭта команда работает только в РПГ мире!");
         }
         
         return false;
     }else if (cmd.getName().equalsIgnoreCase("store-money")) {
       if(Bukkit.getConsoleSender() == sender){
       if(args.length > 0){
                if(args[0].equalsIgnoreCase("get")){
                String a = args[1];
                }
                if(args[0].equalsIgnoreCase("add")){
                    String a = args[1];
                    String b = args[2];
                    int c = Integer.parseInt(b);

                    economy.depositPlayer(Bukkit.getPlayer(a), c);

                }
         }
       }else{}
       return true;
     }else if (cmd.getName().equalsIgnoreCase("spawn")){
         Player p =(Player) sender;
         p.teleport(new Location(Bukkit.getWorld("world"),94.5, 88.5, 118.5, -179.1f, 3.9f)); 
         p.setGameMode(GameMode.ADVENTURE);
         return false; 
     }else if (cmd.getName().equalsIgnoreCase("help")){
         Player p =(Player) sender;
         p.sendMessage("§eПомощь по командам:");
         p.sendMessage("§e/money send Ник 10 - передать монеты");
         p.sendMessage("§e/coins send Ник 10 - передать коины");
         p.sendMessage("§e/spawn - переместится на спавн");
     }else if (cmd.getName().equalsIgnoreCase("skyblock")){
         Player p =(Player) sender;
         p.teleport(new Location(Bukkit.getWorld("world"),-1317, 90.5, 112, 178.9f, 88.9f));
     }else if (cmd.getName().equalsIgnoreCase("youtube")){
         Player p =(Player) sender;
         p.sendMessage("§aСсылка на ютуб канал THIS : §ehttps://www.youtube.com/channel/UCKK20mhGEkWQZ0aiWMa3AYQ");
     }else if (cmd.getName().equalsIgnoreCase("vk")){
         Player p =(Player) sender;
         p.sendMessage("§aСсылка на вк группу: §ehttp://vk.com/meedway");
     }else if (cmd.getName().equalsIgnoreCase("discord")){
         Player p =(Player) sender;
         p.sendMessage("§aСсылка на дискорд: §ehttps://discord.gg/jcbsZs2");
     }else if (cmd.getName().equalsIgnoreCase("pvp")){
         Player p =(Player) sender;
         p.sendTitle("§aВы на пвп врене!", "§bВ данной локации вещи не выпадают!");
         p.sendMessage("§aВы перемещены на локацию с ПВП ареной, на которой отсутсвует выпадение вещей!");
         p.teleport(new Location(Bukkit.getWorld("world"),94.5, 88.5, 118.5, -179.1f, 3.9f));
     }else if (cmd.getName().equalsIgnoreCase("this")){
         Player p =(Player) sender;
         boolean bonus = Levels.getBonusYT(p.getName());
         if(!bonus){
             Levels.setBonusYT(p.getName());
             Bukkit.broadcastMessage("§aК нам зашел §e"+p.getName()+"§a новый подписчик канала §6THIS §c(/youtube)");
             p.sendMessage("§7▸ Бонус подписчику:");
             p.sendMessage("§a+ §e300 монет!");
             p.sendMessage("§a+ §bБесплатный набор: Нагрудник, Поножи, Ботинки, Оружие.");
             economy.depositPlayer(p.getName(), 300);
             addAttr(p, "DAMAGE", "2", "mainhand", ShopItems.SISworld(1,false));
             addAttr(p, "MAX_HEALTH", "1", "chest", ShopItems.SIChestPlate(1, false));
             addAttr(p, "MAX_HEALTH", "1", "legs", ShopItems.SIPonoji(1, false));
             addAttr(p, "MAX_HEALTH", "0", "feet", ShopItems.SIBoots(1, false));
             Levels.addSub();
             Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline lastsub 2 &aПоследний подписчик: &6"+p.getName());
             Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline lastsub 3 &aВсего зашло: &6"+Levels.getSub()+" &aподписчиков");
         }else{
             p.sendMessage("§7▸ §cБонусный набор уже выдан!");
         }
         return false; 
     }
       if (cmd.getName().equalsIgnoreCase("bilet")) {
       if(Bukkit.getConsoleSender() == sender){
       if(args.length > 0){
                if(args[0].equalsIgnoreCase("get")){
                String a = args[1];
                
                }
                if(args[0].equalsIgnoreCase("on")){
                    String a = args[1];
                    String b = args[2];
                    int c = Integer.parseInt(b);
                    /*/bilet on Nick 1*/
                    onBulet(a, c);
                }
         }
       }else{}
       return true;
     }//-------------
       if (cmd.getName().equalsIgnoreCase("admincase")) {
       if(Bukkit.getConsoleSender() == sender){
       if(args[0].equalsIgnoreCase("addcoins")){
                    String a = args[1];
                    String b = args[2];
                    int c = Integer.parseInt(b);
                    
                }
       }else{}
       return true;
     }//-------------Restart
       if (cmd.getName().equalsIgnoreCase("adminreload")) {
       if(Bukkit.getConsoleSender() == sender){
            Utils.onTimerReload("§cВнимание ПЕРЕЗАГРУЗКА", "§cЧерез 60 секунд сервер отключится", 0,false);
            Utils.onTimerReload("§cВнимание ПЕРЕЗАГРУЗКА", "§cЧерез 30 секунд сервер отключится", 30,false);
            Utils.onTimerReload("§cВнимание ПЕРЕЗАГРУЗКА", "§cЧерез 5 секунд сервер отключится", 55,false);
       }else{}
       return true;
     }
       //
       if (cmd.getName().equalsIgnoreCase("tainik")) {
       if(Bukkit.getConsoleSender() == sender){
                if(args.length > 0){
                if(args[0].equalsIgnoreCase("give")){
                    String a = args[1];
                Player p = Bukkit.getPlayer(a);    
                    onChances(p);
                }
         }  
       }else{}
       return true;
     }
       if (cmd.getName().equalsIgnoreCase("tutorial")) {
       if(Bukkit.getConsoleSender() == sender){
       if(args.length > 0){
                if(args[0].equalsIgnoreCase("on")){
                    String a = args[1];
                Player p = Bukkit.getPlayer(a);    
                p.teleport(new Location(Bukkit.getWorld("world"),852.5, 54, 97.5, -98.9f, 9.6f)); 
                p.sendTitle("§aОбучение начато!", "§eСледуйте указаниям...");
                
                }
         }
       }else{}
       return true;
     }
       if (cmd.getName().equalsIgnoreCase("sys-tutorial")){
       if(Bukkit.getConsoleSender() == sender){
       if(args.length > 0){
            if(args[0].equalsIgnoreCase("on")){
            String a = args[1];
            Player p = Bukkit.getPlayer(a);
            ShopMenu.onTutorial(p);
            }
         }
       }else{}
       return true;
     }
        return false;
    }
    
    public static void onTutorials(Player p){
       p.teleport(new Location(Bukkit.getWorld("world"),852.5, 54, 97.5, -98.9f, 9.6f)); 
       p.sendTitle("§aОбучение начато!", "§eСледуйте указаниям..."); 
    }


    public void onBulet(String player, int c){
      Player p = Bukkit.getPlayer(player);
      p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 10, 5));
      p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 10, 5));
      p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 10, 10, true, false));
      p.sendTitle("§aБилет принят!", "§сПристегните ремни, отправляемся!");
      /*Тп на шатл*/
      p.teleport(new Location(Bukkit.getWorld("world"),48.5, 86, 103.5,180f, -2.6f)); 
      
      Bukkit.getScheduler().runTaskLater(m, () -> {
      if(c==1){
      /*тп в первый данж*/
      p.sendTitle("§aВнимание, высадка!", "§eПункт назначения: §cСпавн");
      p.teleport(new Location(Bukkit.getWorld("world"),94.5, 88.5, 118.5, -179.1f, 3.9f)); 
      }  
      if(c==2){
      /*тп во второй данж*/
      p.sendTitle("§aВнимание, высадка!", "§eПункт назначения: §cСмертельный лабиринт");
          onBrand2(p);
      }
      if(c==3){
      /*тп в третий данж*/
      p.sendTitle("§aВнимание, высадка!", "§eПункт назначения: §cМистический лабиринт");
          onBrand1(p);
      }},3*20);
    }
    
    public void onBrand1(Player p){
        Random r = new Random();   
        int rt = r.nextInt(8) + 1;      
            if (rt == 1) p.teleport(new Location(Bukkit.getWorld("world"),-900.5, 61.5, 128.5, 1.2f, 6f)); 
            if (rt == 2) p.teleport(new Location(Bukkit.getWorld("world"),-898.5, 61.5, 118.5, -87.3f, 2.7f)); 
            if (rt == 3) p.teleport(new Location(Bukkit.getWorld("world"),-898.5, 61.5, 116.5, -177.3f, 0.8f)); 
            if (rt == 4) p.teleport(new Location(Bukkit.getWorld("world"),-906.5, 61.5, 118.5, -179.7f, 1.6f)); 
            if (rt == 5) p.teleport(new Location(Bukkit.getWorld("world"),-960.5, 61.5, 34.5, 91f, 1.9f)); 
            if (rt == 6) p.teleport(new Location(Bukkit.getWorld("world"),-956.5, 61.5, 42.5, 0.9f, 2f)); 
            if (rt == 7) p.teleport(new Location(Bukkit.getWorld("world"),-948.5, 61.5, 42.5, -91.8f, 2.3f)); 
            if (rt == 8) p.teleport(new Location(Bukkit.getWorld("world"),-972.5, 61.5, 58.5, 89.4f, 1.5f)); 
}
    public void onBrand2(Player p){
        Random r = new Random();   
        int rt = r.nextInt(8) + 1;      
            if (rt == 1) p.teleport(new Location(Bukkit.getWorld("world"),-900.5, 81.5, 128.5, 1.2f, 6f)); 
            if (rt == 2) p.teleport(new Location(Bukkit.getWorld("world"),-898.5, 81.5, 118.5, -87.3f, 2.7f)); 
            if (rt == 3) p.teleport(new Location(Bukkit.getWorld("world"),-898.5, 81.5, 116.5, -177.3f, 0.8f)); 
            if (rt == 4) p.teleport(new Location(Bukkit.getWorld("world"),-906.5, 81.5, 118.5, -179.7f, 1.6f)); 
            if (rt == 5) p.teleport(new Location(Bukkit.getWorld("world"),-960.5, 81.5, 34.5, 91f, 1.9f)); 
            if (rt == 6) p.teleport(new Location(Bukkit.getWorld("world"),-956.5, 81.5, 42.5, 0.9f, 2f)); 
            if (rt == 7) p.teleport(new Location(Bukkit.getWorld("world"),-948.5, 81.5, 42.5, -91.8f, 2.3f)); 
            if (rt == 8) p.teleport(new Location(Bukkit.getWorld("world"),-972.5, 81.5, 58.5, 89.4f, 1.5f)); 
}
    
      @EventHandler(priority=EventPriority.HIGHEST)
    public void AsyncPlayerChatEvent(AsyncPlayerChatEvent event){
        if((event.getMessage().toLowerCase().contains("!level!"))){
        }else{
            event.setFormat(event.getFormat().replace("!level!","§8[§b"+Levels.getXP(event.getPlayer().getName())+"§8]"));
        }
  }
    
    public static void onKit(Player p){
        Random r = new Random();   
        int rt = r.nextInt(12) + 1;      
            if (rt == 1) ot(p, true, 100, 0);
            if (rt == 2) ot(p, true, 200, 0);
            if (rt == 3) ot(p, true, 300, 0);
            if (rt == 4) ot(p, true, 400, 0);
            if (rt == 5) ot(p, true, 500, 0);
            if (rt == 6) ot(p, true, 600, 0);
            if (rt == 7) ot(p, true, 700, 0);
            if (rt == 8) ot(p, true, 800, 0);
            if (rt == 9) ot(p, true, 900, 0);
            if (rt == 10) ot(p, true, 1000, 0);
            if (rt == 11) ot(p, true, 1100, 0);
            if (rt == 12) ot(p, true, 1200, 0);
            if (rt == 13) ot(p, false, 0, 3);
}
    
    
    public static void ot(Player p, boolean c, int money, int coins){
        if(c){
         p.sendTitle("§aПоздравляю", "§eВы получили:§c "+money+" монет");
         Bukkit.broadcastMessage("§a[Награда дня] §e"+p.getName()+" получил ежедневную награду §c"+money+" монет!§e");
         economy.depositPlayer(p.getName(), money);
        }else{
         p.sendTitle("§aПоздравляю", "§eВы получили:§c "+coins+" коина");
         Bukkit.broadcastMessage("§a[Награда дня] §e"+p.getName()+" получил ежедневную награду §c"+coins+" коинов§e!");
         //Coins.addCoins(p.getName(), coins);
         Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "geco give "+p.getName()+" coins 3"); 
        }
    }
  
    private boolean setupEconomy()
    {
        RegisteredServiceProvider economyProvider = getServer().getServicesManager().getRegistration(Economy.class);
        if (economyProvider != null) {
            economy = (Economy)economyProvider.getProvider();
        }return economy != null;
  }

    
    public static void createBoard(Player player) {
        Scoreboard scoreboard = Bukkit.getServer().getScoreboardManager().getNewScoreboard();
        Objective objective = scoreboard.registerNewObjective("stats", "dummy");
        setScore(objective, player);
        setPrefix(scoreboard);
        player.setScoreboard(scoreboard);
     }
@SuppressWarnings("deprecation")
    public static void refresh() {
        new BukkitRunnable(){
            @Override
            public void run() {
                for (Player player : Bukkit.getServer().getOnlinePlayers()) {
                    Scoreboard scoreboard = player.getScoreboard();
                    if(scoreboard == null){
                        createBoard(player);
                    }else{
                       scoreboard.getObjective("stats").unregister();  
                        Objective objective = scoreboard.registerNewObjective("stats", "dummy");
                        setScore(objective, player);
                        
                        player.setScoreboard(scoreboard);  
                    }
                 
                }
            }
        }.runTaskTimerAsynchronously(m, 0L, (long)(80));
    }
    public static void refresh2() {
        new BukkitRunnable(){

            @Override
            public void run() {
                updatePrefix();
                onEffectArhont();
            }
        }.runTaskTimerAsynchronously(m, 0L, (long)(81));
    }
    
	public static void onEffectArhont(){
		for(Player p : Bukkit.getOnlinePlayers()){
		  if(Levels.getArhont(p.getName())){
		  p.getLocation().getWorld().playEffect(p.getLocation().add(0.0D, 2.0D, 0.0D), Effect.HAPPY_VILLAGER, 1);  
		  }
		}
	}

    public static void setPrefix(Scoreboard scoreboard) {
        
        
        
        for (Player player : Bukkit.getServer().getOnlinePlayers()) {
            String string = "#" + player.getName();
            
        String preo;
        if(string.length() > 16) {
             
             preo = string.substring(0, 16);
         }else{
             preo = string;
        }
            
            String prefix;
            String suffix;
            if(player.getName().equalsIgnoreCase("TravoQur")){
             prefix = "§fY§cT§e| §c";
             suffix = " §e"+main.clanGetTag(player)+" §4"+main.ClanName(player).replaceAll("&", "§");
            }else{ 
                if(player.toString().equalsIgnoreCase(main.ClanOwner(player))){
                  prefix = "§c"+Levels.getLevel(player.getName())+"ур §e| §6";   
                  suffix = " §6"+main.clanGetTag(player)+" "+main.ClanName(player).replaceAll("&", "§");  
                }else{
                  prefix = "§c"+Levels.getLevel(player.getName())+"ур §e| §c"; 
                  suffix = " §e"+main.clanGetTag(player)+" "+main.ClanName(player).replaceAll("&", "§");   
                }
            }
            
            
        Team team = scoreboard.getTeam(preo);
     
        if (team == null) {
 
            team = scoreboard.registerNewTeam(preo);
            team.addPlayer((OfflinePlayer)player);

                
                team.setPrefix(prefix);
                team.setSuffix(suffix);    

                                
            }else{
            team.addEntry(player.getName());
            }
        }  
    }

    public static void updatePrefix() {
        for (Player player : Bukkit.getServer().getOnlinePlayers()) {
            for (Team team : player.getScoreboard().getTeams()) {
                team.unregister();
            }
        }
        for (Player player : Bukkit.getServer().getOnlinePlayers()) {
            
            setPrefix(player.getScoreboard());
        }
    }


    public static void setScore(Objective objective, Player player) {
        int level = Levels.getLevel(player.getName());
        int getl = Levels.getl[level];
        int getEXP = Levels.getXP(player.getName());
        int getc = main.getclvl[level];
        //int coins = Coins.getCoins(player.getName());
        int coins = (int)getBal(player);
        int key = ConfigBox.getKey(player);
        String nuznoexp = formatValue(getl);
        String estexp = formatValue(getEXP);
        String cx = formatValue(main.ClanEXP(player));
        String cn = formatValue(getc);
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.setDisplayName("§e§lMeedWay.RU");
        objective.getScore(" ").setScore(13);
        objective.getScore("§fУровень: §a"+scorelevel(player)).setScore(12);
        objective.getScore("§fОпыт: §e"+estexp+"§7/§e"+nuznoexp).setScore(11);
        objective.getScore("  ").setScore(10);
        objective.getScore("§fКлан: §e"+main.ClanName(player).replaceAll("&", "§")).setScore(9);
        objective.getScore("§fОпыт клана: §b"+cx+"§7/§b"+cn).setScore(8);
        objective.getScore("   ").setScore(7);
        objective.getScore("§fКоины: §6"+coins).setScore(6);
        objective.getScore("§fМонеты: §a"+Main.economy.getBalance(player)).setScore(5);
        objective.getScore("§fКлючи: §b"+key).setScore(4);
        objective.getScore("    ").setScore(3);
        objective.getScore(pet(player)).setScore(2);
        objective.getScore("     ").setScore(1);
        objective.getScore("§6vk.com/meedway").setScore(0);
    }
    
public static String scorelevel(Player p){
    int level = Levels.getLevel(p.getName());
    if(level==27){
        return level+"§c (MAX)";
    }
        return level+"";
}
    
public static String pet(Player p){
         //String pet;
        if(MyPetApi.getPlugin().getPlayerManager().getMyPetPlayer(p)!=null){
            MyPet pit = MyPetApi.getPlugin().getPlayerManager().getMyPetPlayer(p).getMyPet();
          if(pit!=null){
            int exp = (int)pit.getExperience().getExp();
            return "§fПитомец: §e"+pit.getExperience().getLevel()+"ур §a("+exp+"/"+pit.getExperience().getExpByLevel(pit.getExperience().getLevel()+1)+")";  
          }else{return "§7Питомец: §cне приручен";}}else{return "§7Питомец: §cне приручен";}
}
    
    
public static String formatValue(float value) {
    String arr[] = {"", "k", "M", "T", "B", "C", "E"};
    int index = 0;
    while ((value / 1000) >= 1) {
        value = value / 1000;
        index++;
    }
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    return String.format("%s%s", decimalFormat.format(value), arr[index]);
}

    public int RandInt(){
       int i = 0;
       Random r = new Random();
       int rt = r.nextInt(3) + 1;
       if (rt == 1){return 1;}
       if (rt == 2){return 2;}
       if (rt == 3){return 3;}
        return 1;
    }
    
@EventHandler(priority = EventPriority.NORMAL)    
public void onNeedPoint(RegionEnterEvent e){
    Player p = e.getPlayer();
    int bossgame = boss1.size();
        if (e.getRegion().getId().equals("bos")){
           if(bossgame==0){
            inportal.add(p.getName());
            int sizep = inportal.size();
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline bos 3 &eИгроков: "+sizep+"/3");
             if(sizep>=3){
               int l = RandInt();
               BossStart(l);
             }
            }else{
              Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline bos 3 &cИдет сражение с монстром!");  
            }
    }
    if (e.getRegion().getId().equals("pvp")){
       inpvp.add(p.getName());
    }
    if (e.getRegion().getId().equals("boss1")){
       boss1.add(p);
       Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "mm mobs spawn BossGET1 1 world,-122,68,95");
    }
    if (e.getRegion().getId().equals("boss2")){
       boss1.add(p);
       for(int i=1;i<=2;i++){
       Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "mm mobs spawn BossGET2 1 world,-71,76,-137");    
       }
       
    }
    if (e.getRegion().getId().equals("boss3")){
       boss1.add(p);
       Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "mm mobs spawn BossGET3 1 world,159,63,22");
    }
    if (e.getRegion().getId().equals("tutorpoint")){
        p.teleport(new Location(Bukkit.getWorld("world"),852.5, 52, 142.5, 91.2f, 3.0f));
        addAttr(p, "DAMAGE", "10", "mainhand", ShopItems.SISworld(6,false));
        p.getInventory().addItem((ItemStack)ShopItems.SIBOOK(1,false));
    }
    if (e.getRegion().getId().equals("tutorend")){
        p.teleport(new Location(Bukkit.getWorld("world"),94.5, 88.5, 118.5, -179.1f, 3.9f));
        p.sendTitle("§aОбучение пройдено!", "§eОстальное найдете в: §c/help");
    }
    if(e.getRegion().getId().equals("arenalab")){
       int a = arenalab.size();
       if(a==0){
         arenalab.add(p);
         for(int is=1;is<=2;is++){
         Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "mm mobs spawn BossLab 1 world,140,50,1640");   
         }

       }
    }
    if(e.getRegion().getId().equals("arenalog")){
       int a = arenalog.size();
       if(a==0){
         arenalog.add(p);
          Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "mm mobs spawn BossLog 1 world,-931,94,82");    
       }
    }
    if(!main.ClanName(p).equals("")){
    if (e.getRegion().getId().equals("1")){
         if(point.get(0) != main.ClanName(p)){
           Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline 1 2 &cЗахвачена кланом: §e"+main.ClanName(p)+"");
           Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "ad say 276 global &b&lЗимний замок &bзахвачен кланом: §e"+main.ClanName(p)+"");
           point.replace(0, main.ClanName(p));
         }
    }
    else if (e.getRegion().getId().equals("2")){
         if(point.get(1) != main.ClanName(p)){
           Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline 2 2 &cЗахвачена кланом: §e"+main.ClanName(p)+"");
           Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "ad say 276 global &a&lКоварное поселение &aзахвачено кланом: §e"+main.ClanName(p)+"");
           point.replace(1, main.ClanName(p));
         }
    }
    else if (e.getRegion().getId().equals("3")){
         if(point.get(2) != main.ClanName(p)){
           Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline 3 2 &cЗахвачена кланом: §e"+main.ClanName(p)+"");
           Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "ad say 276 global &4&lПиратский корабль &4захвачен кланом: §e"+main.ClanName(p)+"");
           point.replace(2, main.ClanName(p));
         }
      }
    else if (e.getRegion().getId().equals("4")){
         if(point.get(3) != main.ClanName(p)){
           Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline 4 2 &cЗахвачена кланом: §e"+main.ClanName(p)+"");
           Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "ad say 276 global &e&lМирное поселение &aзахвачено кланом: §e"+main.ClanName(p)+"");
           point.replace(3, main.ClanName(p));
         }
      }
    /*else if (e.getRegion().getId().equals("resourcepoint")){
         if(point.get(3) != main.ClanName(p)){
           Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline resourcepoint 2 &cЗахвачена кланом: §e"+main.ClanName(p)+"");
           Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "ad say 276 global &4&lГородское поселение &4захвачено кланом: §e"+main.ClanName(p)+"");
           p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 130, 5));
           point.replace(2, main.ClanName(p));
         }
      }*/
    } 
}
@EventHandler(priority = EventPriority.NORMAL)
public void noNeedPoint(RegionLeaveEvent e){
    Player p = e.getPlayer();
    if(e.getRegion().getId().equals("bos")){
           Bukkit.getScheduler().runTaskLater(m, new Runnable(){
                 @Override
           public void run() {
            inportal.remove(p.getName());
            int i = inportal.size();
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline bos 3 &eИгроков: "+i+"/3");
                }       
            },5);
    }
    if(e.getRegion().getId().equals("boss1")){ boss1.remove(p);}
    if(e.getRegion().getId().equals("boss2")){ boss1.remove(p);}
    if(e.getRegion().getId().equals("boss3")){ boss1.remove(p);}
    if (e.getRegion().getId().equals("pvp")){inpvp.remove(p.getName());}
    
    if(e.getRegion().getId().equals("arenalab")){arenalab.remove(p);}
    if(e.getRegion().getId().equals("arenalog")){arenalog.remove(p);}
}

    public void removepoint(){
      new BukkitRunnable(){
            @Override
            public void run() {
             Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline 1 2 &cГотова к захвату!");
             Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline 2 2 &cГотова к захвату!"); 
             Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline 3 2 &cГотова к захвату!");
             Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline 4 2 &cГотова к захвату!");
             //Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline 4 2 &cГотова к захвату!");
             Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline bos 3 &eИгроков: 0/3");
             Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline booster 1 &r");
             Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline booster 2 &r");
             spawnVillagers();
             Levels.setBoosterNO();
             point.put(0, null);
             point.put(1, null);
             point.put(2, null);
             point.put(3, null);
            }
        }.runTaskLater(this, 5*60L);
    }

    public void refreshclan() {
        new BukkitRunnable(){
            @Override
            public void run() {
              if(point.get(0) != null){
                String clan = point.get(0).toString();	
		  for (Player p : Bukkit.getOnlinePlayers()) {
			if (main.ClanName(p).equals(clan)) {
                            int cl = main.ClanLVLint(p);
                            p.sendMessage("§7▸ За удержание §bЗимнего замка §7начисленно: §b+1 опыт клана §7и §e"+(cl+1)+" монет(ы)");
                            economy.depositPlayer(p.getName(), cl+1);
                            // ActionBar actionbar = new ActionBar("§a§lВашему клану начислен опыт");actionbar.sendToPlayer(p);
                         }					
		   }
                  main.ClanSetEXP(clan);
              }
              if(point.get(1) != null){
                String clan = point.get(1).toString();	
		  for (Player p : Bukkit.getOnlinePlayers()) {
			if (main.ClanName(p).equals(clan)) {
                            int cl = main.ClanLVLint(p);
                            p.sendMessage("§7▸ За удержание §aКоварного поселения §7начисленно: §b+1 опыт клана §7и §e"+(cl+1)+" монет(ы)");
                            economy.depositPlayer(p.getName(), cl+1);
                            //ActionBar actionbar = new ActionBar("§a§lВашему клану начислен опыт");actionbar.sendToPlayer(p);  
                         }					
		   }
                  main.ClanSetEXP(clan);
              }
              if(point.get(2) != null){
                String clan = point.get(2).toString();	
		  for (Player p : Bukkit.getOnlinePlayers()) {
			if (main.ClanName(p).equals(clan)) {
                            int cl = main.ClanLVLint(p);
                            p.sendMessage("§7▸ За удержание §cПиратского корабля §7начисленно: §b+1 опыт клана §7и §e"+(cl+1)+" монет(ы)");
                            economy.depositPlayer(p.getName(), cl+1);
                            //ActionBar actionbar = new ActionBar("§a§lВашему клану начислен опыт");actionbar.sendToPlayer(p);  
                         }					
		   }
                  main.ClanSetEXP(clan);
              }
              if(point.get(3) != null){
                String clan = point.get(3).toString();	
		  for (Player p : Bukkit.getOnlinePlayers()) {
			if (main.ClanName(p).equals(clan)) {
                            int cl = main.ClanLVLint(p);
                            p.sendMessage("§7▸ За удержание §eМирной деревни §7начисленно: §b+1 опыт клана §7и §e"+(cl+1)+" монет(ы)");
                            economy.depositPlayer(p.getName(), cl+3);
                            //ActionBar actionbar = new ActionBar("§a§lВашему клану начислен опыт");actionbar.sendToPlayer(p);  
                         }					
		   }
                  main.ClanSetEXP(clan);
              }
              /*if(point.get(3) != null){
                String clan = point.get(2).toString();	
		  for (Player p : Bukkit.getOnlinePlayers()) {
			if (main.ClanName(p).equals(clan)) {
                            p.sendMessage("§7▸ За удержание §bГородского поселения §7продлено свойство: ускорение!");
                            p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 130, 5));
                            //ActionBar actionbar = new ActionBar("§a§lВашему клану начислен опыт");actionbar.sendToPlayer(p);  
                         }					
		   }
                  main.ClanSetEXP(clan);
              }*/
            }
        }.runTaskTimerAsynchronously(m, 0L, (long)(120*20));
    }

    public static void spawnVillagers(){
        {
          Location loc = new Location(Bukkit.getWorld("world"), 94.5, 87, 101.5, 1, 0);
            Evoker king = (Evoker)loc.getWorld().spawnEntity(loc, EntityType.EVOKER);
            king.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 999999999, 10, true, false));
            king.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 999999999, 5, true, false));
            king.setCustomNameVisible(true);
            king.setCustomName("§eНачать игру");
            king.setCollidable(false);
            king.setAI(false);
            king.resetMaxHealth();
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "gamerule sendCommandFeedback false");
            //Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "entitydata @e[type=evocation_illager] {Silent:1b}");
        }
        {
          Location loc = new Location(Bukkit.getWorld("world"), 91.5, 87, 101.5, 1, 0);
            Villager king = (Villager)loc.getWorld().spawnEntity(loc, EntityType.VILLAGER);
            king.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 999999999, 10, true, false));
            king.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 999999999, 5, true, false));
            king.setCustomNameVisible(true);
            king.setCustomName("§bСпособности");
            king.setCollidable(false);
            king.setAI(false);
            king.resetMaxHealth();
        }
        {
          Location loc = new Location(Bukkit.getWorld("world"), 99.5, 87, 97.5, 1, 0);
            Villager king = (Villager)loc.getWorld().spawnEntity(loc, EntityType.VILLAGER);
            king.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 999999999, 10, true, false));
            king.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 999999999, 5, true, false));
            king.setCustomNameVisible(true);
            king.setCustomName("§bКланы/Деревни");
            king.setCollidable(false);
            king.setAI(false);
            king.resetMaxHealth();
        }
        {
          Location loc = new Location(Bukkit.getWorld("world"), 107.5, 87, 107.5, 90, 0);
            Villager king = (Villager)loc.getWorld().spawnEntity(loc, EntityType.VILLAGER);
            king.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 999999999, 10, true, false));
            king.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 999999999, 5, true, false));
            king.setCustomNameVisible(true);
            king.setCustomName("§eТорговец");
            king.setCollidable(false);
            king.setAI(false);
            king.resetMaxHealth();
        }
        {
          Location loc = new Location(Bukkit.getWorld("world"), 899.5, 55, 112.5, 94.1f, 8.0f);
            Villager king = (Villager)loc.getWorld().spawnEntity(loc, EntityType.VILLAGER);
            king.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 999999999, 10, true, false));
            king.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 999999999, 5, true, false));
            king.setCustomNameVisible(true);
            king.setCustomName("§eТорговец");
            king.setCollidable(false);
            king.setAI(false);
            king.resetMaxHealth();
        }
        {
          Location loc = new Location(Bukkit.getWorld("world"), 107.5, 87, 97.5, 49.2f, -2);
            Villager king = (Villager)loc.getWorld().spawnEntity(loc, EntityType.VILLAGER);
            king.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 999999999, 10, true, false));
            king.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 999999999, 5, true, false));
            king.setCustomNameVisible(true);
            king.setCustomName("§eКвестер");
            king.setCollidable(false);
            king.setAI(false);
            king.resetMaxHealth();
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "gamerule sendCommandFeedback false");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "gamerule announceadvancements false");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "gamerule doWeatherCycle false");
            //Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "entitydata @e[type=villager] {Silent:1b}");
        }
         {
          Location loc = new Location(Bukkit.getWorld("world"), 107.5, 87, 99.5, 49.2f, -2);
            Sheep king = (Sheep)loc.getWorld().spawnEntity(loc, EntityType.SHEEP);
            king.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 999999999, 10, true, false));
            king.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 999999999, 5, true, false));
            king.setCustomNameVisible(true);
            king.setCustomName("§eНаграда дня");
            king.setCollidable(false);
            king.setAI(false);
            king.resetMaxHealth();
            //Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "entitydata @e[type=sheep] {Silent:1b}");
        }
         
         {
          Location loc = new Location(Bukkit.getWorld("world"), 65.5, 87, 102.5, -83.7f, -5.4f);
            Pig king = (Pig)loc.getWorld().spawnEntity(loc, EntityType.PIG);
            king.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 999999999, 10, true, false));
            king.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 999999999, 5, true, false));
            king.setCustomNameVisible(true);
            king.setCustomName("§bБилетер");
            king.setCollidable(false);
            king.setAI(false);
            king.resetMaxHealth();
            //Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "entitydata @e[type=pig] {Silent:1b}");
        }
         
         {
          Location loc = new Location(Bukkit.getWorld("world"), 82.5, 88.5, 112.5, 179.7f, 8f);
            Wolf king = (Wolf)loc.getWorld().spawnEntity(loc, EntityType.WOLF);
            king.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 999999999, 10, true, false));
            king.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 999999999, 5, true, false));
            king.setCustomNameVisible(true);
            king.setCustomName("§cБоевые питомцы");
            king.setCollidable(false);
            king.setAI(false);
            king.resetMaxHealth();
            //Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "entitydata @e[type=wolf] {Silent:1b}");
        }
    }
  
  @EventHandler
  public void onPlayerInteractEntity(PlayerInteractEntityEvent e)
  {
    if (!(e.getRightClicked() instanceof Evoker || e.getRightClicked() instanceof Villager || e.getRightClicked() instanceof Sheep|| e.getRightClicked() instanceof Pig|| e.getRightClicked() instanceof Wolf)) return; 
    Entity ent = e.getRightClicked();
    if ((ent instanceof Evoker)) {
      Player p = e.getPlayer();
      if(ent.getCustomName() == null)return;
      if (ent.getCustomName().equalsIgnoreCase("§eНачать игру"))
      {
        e.setCancelled(true);
        ShopMenu.onLocaion(p);
    }
   }
    if ((ent instanceof Villager)) {
      Player p = e.getPlayer();
      if(ent.getCustomName() == null)return;
      if (ent.getCustomName().equalsIgnoreCase("§bКланы/Деревни"))
      {
        e.setCancelled(true);
        p.chat("/clan open");
    }else if (ent.getCustomName().equalsIgnoreCase("§eТорговец"))
      {
        e.setCancelled(true);
        ShopMenu.onMainMenu(p);
    }else if (ent.getCustomName().equalsIgnoreCase("§eКвестер"))
      {
        e.setCancelled(true);
        ShopMenu.onQuests(p);
    }else if (ent.getCustomName().equalsIgnoreCase("§bСпособности"))
      {
          ShopMenu.onSPO(p);
        e.setCancelled(true);  
    }
   }if ((ent instanceof Sheep)) {
      Player p = e.getPlayer();
      if(ent.getCustomName() == null)return;
      if (ent.getCustomName().equalsIgnoreCase("§eНаграда дня"))
      {
        /*if(Cooldown.hasCooldown(p.getName(), "kit")){
         long time = ((Cooldown.getCooldown(p.getName(), "kit")) /1000/60/60);
         int timeformat = (int)time;
         p.sendMessage("§e[Награда дня] §aДля повторного получения, ожидайте " + timeformat + "§a час(ов)");
        }else{
            onKit(p);
            Cooldown.setCooldown(p.getName(), 86400 * 1000L, "kit");             
       }*/
        ShopMenu.onNagrada(p);
        e.setCancelled(true);  
    }
   }if ((ent instanceof Pig)) {
      Player p = e.getPlayer();
      if(ent.getCustomName() == null)return;
      if (ent.getCustomName().equalsIgnoreCase("§bБилетер"))
      {
        ShopMenu.onBilet(p);
        e.setCancelled(true);  
    }
   }if ((ent instanceof Wolf)) {
      Player p = e.getPlayer();
      if(ent.getCustomName() == null)return;
      if (ent.getCustomName().equalsIgnoreCase("§cБоевые питомцы"))
      {
        ShopMenu.onPIT(p);
        e.setCancelled(true);  
    }
      
   }/*if((ent instanceof EntityPlayer)){
       Player p = e.getPlayer();
       if(p.isSneaking()){
           Player ep = Bukkit.getPlayer(ent.getCustomName());
           ShopMenu.onPlayerInfo(p,ep);
       }
   }*/
  }
  

	@EventHandler
	public void playerChat(AsyncPlayerChatEvent event){
		File s = new File(Bukkit.getServer().getPluginManager().getPlugin("Clans").getDataFolder(), "settings.yml");	
		FileConfiguration sfile = YamlConfiguration.loadConfiguration(s);
		Player p = event.getPlayer();
                int l = Levels.getLevel(p.getName());
                String pl = p.getName();
		if (!(main.ClanChatBoolean(p))) {
                    event.setCancelled(true);
                    for (Player player : Bukkit.getOnlinePlayers()) { 	
                          player.sendMessage("§c"+l+"ур §e["+main.ClanName(p)+"§e] §c"+pl+"§e : §7"+event.getMessage());
			}
		} else {
			event.setCancelled(true);
			String clan = main.ClanName(p);	
			for (Player player : Bukkit.getOnlinePlayers()) {
				if (main.ClanName(player).equals(clan)) {
					player.sendMessage(sfile.getString("clan_chat.format").replaceAll("&", "§").replaceAll("%clan%", clan).replaceAll("%player%", p.getName()).replaceAll("%message%", event.getMessage()));
				}					
			}
		}			
    }
   @EventHandler
   public void onPlayerQuit(PlayerQuitEvent e) {
    e.setQuitMessage(null);
    Player p = e.getPlayer();
    this.lastSneak.remove(p);
    ActionBar actionbar = new ActionBar("§c- §a"+p.getName()+" §eвышел с сервера");
    int online = Bukkit.getOnlinePlayers().size();
    for(Player pl:Bukkit.getOnlinePlayers()){
     actionbar.sendToPlayer(pl);
     createTabInfo(pl, Levels.getTab(1)+online+Levels.getTab(2), Levels.getTab(3));
    }
   }
   
      @EventHandler
      public void onPlayerKick(PlayerKickEvent event) {
      Player p = event.getPlayer();    
      ActionBar actionbar = new ActionBar("§c- §a"+p.getName()+" §eвышел с сервера");
      int online = Bukkit.getOnlinePlayers().size();
        for(Player pl:Bukkit.getOnlinePlayers()){
        actionbar.sendToPlayer(pl);   
        createTabInfo(pl, Levels.getTab(1)+online+Levels.getTab(2), Levels.getTab(3));
        }
      event.setLeaveMessage(null);
        try {
      if(p.isBanned())
        event.setLeaveMessage(null);
        }catch (NullPointerException e1) {
      event.setLeaveMessage(null);
    }
  }
  @EventHandler(priority=EventPriority.HIGHEST)
  public void onLoginEvent(PlayerLoginEvent e){
      Player player = e.getPlayer();
      String name = player.getName().toLowerCase();
          if ((player == null)) {return;}
      
           if ((name.length() > 16) || (name.length() < 3)) {
        e.disallow(PlayerLoginEvent.Result.KICK_OTHER, "Придумайте другой ник, от 3 до 16 символов");
      return;
    }
    if (!(player.getName().matches("[a-zA-Z0-9_]*")) || (name.equalsIgnoreCase("Player"))) {
        e.disallow(PlayerLoginEvent.Result.KICK_OTHER, "Некоретный ник, разрешенные символы a-z A-Z 0-9 _");
      return;
    }
  }
      
  @EventHandler
  public void changeworld(PlayerChangedWorldEvent e){
    World w = e.getPlayer().getLocation().getWorld();
    Player p = e.getPlayer();
    if(w == Bukkit.getWorld("world")){
     p.setGameMode(GameMode.ADVENTURE);
    }else if(w == Bukkit.getWorld("world_skyblock")){
     p.setGameMode(GameMode.SURVIVAL);   
    }
  }
      
    @EventHandler
  public void onPlayerJoin(PlayerJoinEvent event) {
    event.setJoinMessage(null);
    Player p = event.getPlayer();
    p.setGameMode(GameMode.ADVENTURE);
    String name = p.getName();
    createBoard(p);
    new SchedulerLogin(p).runTaskTimer(this, 0, 5);
    //onLoginMsg(p);
     
    if(WarnRPG.statichasGameOver(p)){
       p.teleport(new Location(Bukkit.getWorld("world"),1053.5, 64.5, 325.5, 179.5f, 8.7f)); 
    }else{
       p.teleport(new Location(Bukkit.getWorld("world"),94.5, 88, 118.5, -179.1f, 3.9f)); 
    }
    
    ActionBar actionbar = new ActionBar("§c+ §a"+p.getName()+" §eзашел на сервер");
    int online = Bukkit.getOnlinePlayers().size();
    for(Player pl:Bukkit.getOnlinePlayers()){
    actionbar.sendToPlayer(pl);    
    createTabInfo(pl, Levels.getTab(1)+online+Levels.getTab(2), Levels.getTab(3));
    }
        if (!p.hasPlayedBefore()){
             Bukkit.getScheduler().runTaskLater(this, () -> {
                         //Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "sys-tutorial on "+p.getName());
                        ShopMenu.onTutorial(p);
             },7*20);
            //p.sendMessage("новичек");
            addAttr(p, "DAMAGE", "1", "mainhand", ShopItems.SISworld(0,false));
            }else{
        }
  }
  public void onLoginMsg(Player p){
            p.getWorld().playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1f, 1f);
            p.sendMessage("              §e§lСинхронизация");
            p.sendMessage("   ");
            p.sendMessage("§aОбновление от 13.07.19");
            p.sendMessage("§7- Шифт + ПКМ по игроку, просмотреть информацию");
            p.sendMessage("§7- В магазин добавлена печать нерушимости и стойкости");
            p.sendMessage(" "); 
  }
  
  public void createTabInfo(Player p, String header, String footer){
  {
    CraftPlayer craftplayer = (CraftPlayer)p;
    PlayerConnection connection = craftplayer.getHandle().playerConnection;
    IChatBaseComponent headerJSON = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + header + "\"}");
    IChatBaseComponent footerJSON = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + footer + "\"}");
    PacketPlayOutPlayerListHeaderFooter packet = new PacketPlayOutPlayerListHeaderFooter();
    try
    {
      Field headerField = packet.getClass().getDeclaredField("a");
      headerField.setAccessible(true);
      headerField.set(packet, headerJSON);
      headerField.setAccessible(!headerField.isAccessible());
      
      Field footerField = packet.getClass().getDeclaredField("b");
      footerField.setAccessible(true);
      footerField.set(packet, footerJSON);
      footerField.setAccessible(!footerField.isAccessible());
    }
    catch (Exception localException) {}
    connection.sendPacket(packet);
    }
  }
    
    @Override
    public void onDisable(){
     saveConfig();
        saveConfigs((YamlConfiguration) c);
    }
    
    
    
    static NBTTagList getAttrList(net.minecraft.server.v1_12_R1.ItemStack stack) {
        NBTTagList attrmod;
        if (stack.getTag() == null) {
            stack.setTag(new NBTTagCompound());
        }
        if ((attrmod = stack.getTag().getList("AttributeModifiers", 10)) == null) {
            stack.getTag().set("AttributeModifiers", (NBTBase)new NBTTagList());
        }
        return stack.getTag().getList("AttributeModifiers", 10);
    }

    static void addAttr(Player player, String name, String num, String mesto, ItemStack item) {
        int op = -1;
        Attributes a = Attributes.get(name);
        if (a == null) {
            player.sendMessage("\"\u00a74" + name + "\" is not a valid attribute type.");
            return;
        }
        double amount = 0.0;
        try {
            amount = Double.parseDouble(num);
        }
        catch (NumberFormatException nfe) {
            player.sendMessage("\"\u00a74" + num + "\" is not a valid number.");
            return;
        }
        net.minecraft.server.v1_12_R1.ItemStack nms = CraftItemStack.asNMSCopy(item);
        NBTTagList attrmod = getAttrList(nms);
        int i = 0;
        while (i < attrmod.size()) {
            NBTTagCompound c = attrmod.get(i);
            if (c.getString("Name").equals(name)) {
                player.sendMessage("\u00a74An attribute with the name \"\u00a7f" + name + "\"\u00a74 already exists!");
                return;
            }
            ++i;
        }
        NBTTagCompound c = new NBTTagCompound();
        c.set("Name", (NBTBase)new NBTTagString(name));
        c.set("AttributeName", (NBTBase)new NBTTagString(a.name));
        c.set("Amount", (NBTBase)new NBTTagDouble(amount));
        if (op == -1) {
            op = a.op;
        }
        c.set("Operation", (NBTBase)new NBTTagInt(op));
        UUID randUUID = UUID.randomUUID();
        c.set("UUIDMost", (NBTBase)new NBTTagLong(randUUID.getMostSignificantBits()));
        c.set("UUIDLeast", (NBTBase)new NBTTagLong(randUUID.getLeastSignificantBits()));
        c.set("Slot", (NBTBase)new NBTTagString(mesto.toLowerCase()));

        attrmod.add((NBTBase)c);
        nms.getTag().set("AttributeModifiers", (NBTBase)attrmod);
        CraftItemStack i2 = CraftItemStack.asCraftMirror((net.minecraft.server.v1_12_R1.ItemStack)nms);
        player.getInventory().addItem((ItemStack)i2);
        //player.getInventory().addItem(item);
    }
    
    
    public static ItemStack addAttrDrop(String name, String num, String mesto, ItemStack item) {
        int op = -1;
        Attributes a = Attributes.get(name);

        double amount = 0.0;
        try {
            amount = Double.parseDouble(num);
        }
        catch (NumberFormatException nfe) {

        }
        net.minecraft.server.v1_12_R1.ItemStack nms = CraftItemStack.asNMSCopy(item);
        NBTTagList attrmod = getAttrList(nms);
        int i = 0;
        while (i < attrmod.size()) {
            NBTTagCompound c = attrmod.get(i);
            if (c.getString("Name").equals(name)) {
               // return;
            }
            ++i;
        }
        NBTTagCompound c = new NBTTagCompound();
        c.set("Name", (NBTBase)new NBTTagString(name));
        c.set("AttributeName", (NBTBase)new NBTTagString(a.name));
        c.set("Amount", (NBTBase)new NBTTagDouble(amount));
        if (op == -1) {
            op = a.op;
        }
        c.set("Operation", (NBTBase)new NBTTagInt(op));
        UUID randUUID = UUID.randomUUID();
        c.set("UUIDMost", (NBTBase)new NBTTagLong(randUUID.getMostSignificantBits()));
        c.set("UUIDLeast", (NBTBase)new NBTTagLong(randUUID.getLeastSignificantBits()));
        c.set("Slot", (NBTBase)new NBTTagString(mesto.toLowerCase()));

        attrmod.add((NBTBase)c);
        nms.getTag().set("AttributeModifiers", (NBTBase)attrmod);
        CraftItemStack i2 = CraftItemStack.asCraftMirror((net.minecraft.server.v1_12_R1.ItemStack)nms);
        return (ItemStack)i2;
    }
    
    

    static ItemStack attrRemove(ItemStack item, String string) {
        net.minecraft.server.v1_12_R1.ItemStack nms = CraftItemStack.asNMSCopy((ItemStack)item);
        NBTTagList attrmod = getAttrList(nms);
        NBTTagList nlist = new NBTTagList();
        boolean r = false;
        int i = 0;
        while (i < attrmod.size()) {
            NBTTagCompound c = attrmod.get(i);
            if (!c.getString("Name").equals(string)) {
                nlist.add((NBTBase)attrmod.get(i));
            } else {
                r = true;
            }
            ++i;
        }
        nms.getTag().set("AttributeModifiers", (NBTBase)nlist);
        CraftItemStack i2 = CraftItemStack.asCraftMirror((net.minecraft.server.v1_12_R1.ItemStack)nms);
        return i2;
    }

    static int attrList(Player player, String[] args) {
        net.minecraft.server.v1_12_R1.ItemStack nms = CraftItemStack.asNMSCopy((ItemStack)player.getInventory().getItemInMainHand());
        NBTTagList attrmod = getAttrList(nms);
        if (attrmod.size() == 0) {
            return 0;
        }
        int i = 0;
        while (i < attrmod.size()) {
            NBTTagCompound c = attrmod.get(i);
            player.sendMessage(i+"");
            player.sendMessage("\u00a7e" + (Object)((Object)Attributes.getByMCName(c.getString("AttributeName"))) + ", " + c.getDouble("Amount"));
            ++i;
        }
        return 0;
    }

    private static void listOptions(Player player) {
        ArrayList<String> options = new ArrayList<String>();
        options.add("mainhand");
        options.add("offhand");
        options.add("feet");
        options.add("legs");
        options.add("chest");
        options.add("head");
        StringBuilder sb = new StringBuilder();
        for (String s : options) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(s);
        }
        player.sendMessage("\u00a72Supported options: ");
        player.sendMessage("\u00a7e" + sb.toString());
   }

    static void attrListAll(Player player, String[] args) {
        player.sendMessage("\u00a72Supported attribute types: ");
        StringBuilder sb = new StringBuilder();
        Attributes[] arrattributes = Attributes.values();
        int n = arrattributes.length;
        int n2 = 0;
        while (n2 < n) {
            Attributes s = arrattributes[n2];
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append((Object)s);
            ++n2;
        }
        player.sendMessage("\u00a7e" + sb.toString());
    }

    public void saveConfigs(YamlConfiguration c){
         try {
            c.save(new File(getDataFolder(),"config.yml"));
        } catch (IOException ex) {
            
        }
    }  

    private static enum Attributes {
        DAMAGE(0, "generic.attackDamage"),
        MOVEMENT_SPEED(2, "generic.movementSpeed"),
        ATTACK_SPEED(2, "generic.attackSpeed"),
        KNOCKBACK_RESISTANCE(2, "generic.knockbackResistance"),
        MAX_HEALTH(0, "generic.maxHealth"),
        ARMOR(0, "generic.armor"),
        LUCK(0, "generic.luck");
        
        private final int op;
        private final String name;

        private Attributes(int op, String name) {
            this.op = (int)op;
            this.name = (String)name;
        }

        private static Attributes get(String s) {
            Attributes[] arrattributes = Attributes.values();
            int n = arrattributes.length;
            int n2 = 0;
            while (n2 < n) {
                Attributes a = arrattributes[n2];
                if (a.name().toLowerCase().equalsIgnoreCase(s)) {
                    return a;
                }
                ++n2;
            }
            return null;
        }

        private static Attributes getByMCName(String s) {
            Attributes[] arrattributes = Attributes.values();
            int n = arrattributes.length;
            int n2 = 0;
            while (n2 < n) {
                Attributes a = arrattributes[n2];
                if (a.name.equalsIgnoreCase(s)) {
                    return a;
                }
                ++n2;
            }
            return null;
        }
        
    }
    
  @EventHandler
  public void onIntercactDG(PlayerInteractEvent e) {
    Player p = e.getPlayer();
    ItemStack hand = p.getInventory().getItemInMainHand();
    ItemStack hand2 = p.getInventory().getItemInOffHand();
    if ((e.getAction() == Action.LEFT_CLICK_AIR
            || e.getAction() == Action.LEFT_CLICK_BLOCK) 
            
            && hand != null 
            && hand.hasItemMeta() 
            && hand.getItemMeta().hasDisplayName()
            && (hand.getItemMeta().getDisplayName().equals("§cПрокачка для оружия") || 
            hand.getItemMeta().getDisplayName().equals("§aПрокачка для брони"))){
        
        boolean spamhas = this.antispam.contains(p.getName());
        
        if(!spamhas){
        if(hand.getItemMeta().getDisplayName().equals("§cПрокачка для оружия")){
            if(p.getInventory().getItemInOffHand().getType()!=Material.AIR){
          ShopMenu.YesUpgrade(p);
        }
        e.setCancelled(true);
        }else if(hand.getItemMeta().getDisplayName().equals("§aПрокачка для брони")){
         if(p.getInventory().getItemInOffHand().getType()!=Material.AIR){
          ShopMenu.YesUpgradeHP(p);
        }
        e.setCancelled(true); 
            }   
        }else{
            p.sendMessage("§7▸ §cВы уже прокачиваете предмет! Дождитесь завершение прокачки!");
        }  
        }
    }
    /*if ((e.getAction() == Action.LEFT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_BLOCK) 
            && hand != null && hand.hasItemMeta() && (hand.getItemMeta().getDisplayName().equals("§cПрокачка для оружия") || 
            hand.getItemMeta().getDisplayName().equals("§aПрокачка для брони"))){
    }*/
  
    @EventHandler
    public void onClick(PlayerInteractEvent e){
        Player p = e.getPlayer();
        ItemStack i = p.getItemInHand();
        if (e.getClickedBlock() == null)return;
        if (e.getClickedBlock().getType() == null)return;
        if(e.getAction() == null) return;
        if(i == null)return;
        if (e.getAction() == Action.RIGHT_CLICK_BLOCK && e.getClickedBlock().getType() == Material.ENCHANTMENT_TABLE) {
              p.chat("/bag");
              e.setCancelled(true);
        }
        if(e.getAction() == Action.RIGHT_CLICK_BLOCK && e.getClickedBlock().getType() == Material.ANVIL){
            p.sendTitle("§cНедостаточно навыков", "§cК сожалению вы не Кузнец");
            e.setCancelled(true);
        }
        
    }
    @EventHandler
    public void onRightClick(PlayerInteractEntityEvent e) {
        Entity entity = e.getRightClicked();
        if (entity.getType().equals(EntityType.PLAYER)) {
            Player ep = (Player) e.getRightClicked();
            Player p = e.getPlayer();
            if(p.isSneaking()){
           ShopMenu.onPlayerInfo(p,ep);
          }
        }
    }
    
@EventHandler(priority = EventPriority.NORMAL)
public void onJoinNewLocation(RegionEnterEvent e){
    Player p = e.getPlayer();
    int l = Levels.getLevel(p.getName());
        if (e.getRegion().getId().equals("l2")){
            if(l >= 2){}else{e.setCancelled(true);p.sendTitle("§cДоступ закрыт", "§eДостигните уровня: §c2");}
        }else if (e.getRegion().getId().equals("l3")){
            if(l >= 3){}else{e.setCancelled(true);p.sendTitle("§cДоступ закрыт", "§eДостигните уровня: §c3");}
        }else if (e.getRegion().getId().equals("l4")){
            if(l >= 4){}else{e.setCancelled(true);p.sendTitle("§cДоступ закрыт", "§eДостигните уровня: §c4");}
        }else if (e.getRegion().getId().equals("l5")){
            if(l >= 5){}else{e.setCancelled(true);p.sendTitle("§cДоступ закрыт", "§eДостигните уровня: §c5");}
        }else if (e.getRegion().getId().equals("l6")){
            if(l >= 6){}else{e.setCancelled(true);p.sendTitle("§cДоступ закрыт", "§eДостигните уровня: §c6");}
        }else if (e.getRegion().getId().equals("l7")){
            if(l >= 7){}else{e.setCancelled(true);p.sendTitle("§cДоступ закрыт", "§eДостигните уровня: §c7");}
        }else if (e.getRegion().getId().equals("l8")){
            if(l >= 8){}else{e.setCancelled(true);p.sendTitle("§cДоступ закрыт", "§eДостигните уровня: §c8");}
        }else if (e.getRegion().getId().equals("l9")){
            if(l >= 9){}else{e.setCancelled(true);p.sendTitle("§cДоступ закрыт", "§eДостигните уровня: §c9");}
        }else if (e.getRegion().getId().equals("l10")){
            if(l >= 10){}else{e.setCancelled(true);p.sendTitle("§cДоступ закрыт", "§eДостигните уровня: §c10");}
        }else if (e.getRegion().getId().equals("l11")){
            if(l >= 11){}else{e.setCancelled(true);p.sendTitle("§cДоступ закрыт", "§eДостигните уровня: §c11");}
        }else if (e.getRegion().getId().equals("l12")){
            if(l >= 12){}else{e.setCancelled(true);p.sendTitle("§cДоступ закрыт", "§eДостигните уровня: §c12");}
        }else if (e.getRegion().getId().equals("l13")){
            if(l >= 13){}else{e.setCancelled(true);p.sendTitle("§cДоступ закрыт", "§eДостигните уровня: §c13");}
        }else if (e.getRegion().getId().equals("l14")){
            if(l >= 14){}else{e.setCancelled(true);p.sendTitle("§cДоступ закрыт", "§eДостигните уровня: §c14");}
        }else if (e.getRegion().getId().equals("l15")){
            if(l >= 15){}else{e.setCancelled(true);p.sendTitle("§cДоступ закрыт", "§eДостигните уровня: §c15");}
        }else if (e.getRegion().getId().equals("l16")){
            if(l >= 16){}else{e.setCancelled(true);p.sendTitle("§cДоступ закрыт", "§eДостигните уровня: §c16");}
        }else if (e.getRegion().getId().equals("l17")){
            if(l >= 17){}else{e.setCancelled(true);p.sendTitle("§cДоступ закрыт", "§eДостигните уровня: §c17");}
        }else if (e.getRegion().getId().equals("l18")){
            if(l >= 18){}else{e.setCancelled(true);p.sendTitle("§cДоступ закрыт", "§eДостигните уровня: §c18");}
        }else if (e.getRegion().getId().equals("l19")){
            if(l >= 19){}else{e.setCancelled(true);p.sendTitle("§cДоступ закрыт", "§eДостигните уровня: §c19");}
        }else if (e.getRegion().getId().equals("l20")){
            if(l >= 20){}else{e.setCancelled(true);p.sendTitle("§cДоступ закрыт", "§eДостигните уровня: §c20");}
        }else if (e.getRegion().getId().equals("p2-l1")){
            if(l >= 25){
            p.teleport(new Location(Bukkit.getWorld("world"), 77.7, 29, 1209.2, 93.6f, 0.2f));
            }else{e.setCancelled(true);p.sendTitle("§cДоступ закрыт", "§eДостигните уровня: §c25");}
        }else if (e.getRegion().getId().equals("p2-l2")){
            if(l >= 27){
            p.teleport(new Location(Bukkit.getWorld("world"), 34.4, 29, 1193.3, 117.2f, 0.3f));
            }else{e.setCancelled(true);p.sendTitle("§cДоступ закрыт", "§eДостигните уровня: §c27");}
        }
   }

  public static void sUpgrade(Player p){
          ItemStack i2 = p.getInventory().getItemInOffHand();
          ItemStack i = p.getInventory().getItemInMainHand();
          String s = p.getInventory().getItemInOffHand().getItemMeta().getLore().get(3).toString();
          String ss = "§7Прокачка: §8нет"; 
          String pech = p.getInventory().getItemInOffHand().getItemMeta().getDisplayName();
          //if(pech.endsWith("НЕРУШИМОСТЬ")){}
          if(!s.equals(ss)){
              p.sendTitle("§aОшибка", "§eДанный предмет нельзя прокачать!");
          }else{
            String si = p.getInventory().getItemInMainHand().getItemMeta().getLore().get(2).toString();
              switch (si) {
                  case "§7Прокачка: §6I":
                      if(pech.endsWith("§b [Ⓝ]")){
                          psub(pech,p);
                        UpgradeIS(p, i, i2, 2,si);
                      }else{
                       if(uRandom(100)){UpgradeIS(p, i, i2, 2,si);}else{DestroyIS(p, i, i2);}   
                      }
                      break;
                  case "§7Прокачка: §6II":
                      if(pech.endsWith("§b [Ⓝ]")){
                          psub(pech,p);
                        UpgradeIS(p, i, i2, 4,si); 
                      }else{
                        if(uRandom(90)){UpgradeIS(p, i, i2, 4,si);}else{DestroyIS(p, i, i2);}
                      }
                      break;
                  case "§7Прокачка: §6III":
                      if(pech.endsWith("§b [Ⓝ]")){
                          psub(pech,p);
                        UpgradeIS(p, i, i2, 8,si); 
                      }else{
                        if(uRandom(80)){UpgradeIS(p, i, i2, 8,si);}else{DestroyIS(p, i, i2);}
                      }
                      break;
                  case "§7Прокачка: §6IV":
                      if(pech.endsWith("§b [Ⓝ]")){
                          psub(pech,p);
                        UpgradeIS(p, i, i2, 9,si); 
                      }else{
                        if(uRandom(70)){UpgradeIS(p, i, i2, 9,si);}else{DestroyIS(p, i, i2);}
                      }
                      break;
                  case "§7Прокачка: §6V":
                      if(pech.endsWith("§b [Ⓝ]")){
                          psub(pech,p);
                        UpgradeIS(p, i, i2, 11,si); 
                      }else{
                        if(uRandom(60)){UpgradeIS(p, i, i2, 11,si);}else{DestroyIS(p, i, i2);}
                      }
                      break;
                  case "§7Прокачка: §6VI":
                      if(pech.endsWith("§b [Ⓝ]")){
                          psub(pech,p);
                        UpgradeIS(p, i, i2, 14,si); 
                      }else{
                        if(uRandom(50)){UpgradeIS(p, i, i2, 14,si);}else{DestroyIS(p, i, i2);}
                      }
                      break;
                  case "§7Прокачка: §6VII":
                      if(pech.endsWith("§b [Ⓝ]")){
                          psub(pech,p);
                        UpgradeIS(p, i, i2, 17,si); 
                      }else{
                        if(uRandom(40)){UpgradeIS(p, i, i2, 17,si);}else{DestroyIS(p, i, i2);}
                      }
                      break;
                  case "§7Прокачка: §6VIII":
                      if(pech.endsWith("§b [Ⓝ]")){
                          psub(pech,p);
                        UpgradeIS(p, i, i2, 19,si); 
                      }else{
                        if(uRandom(30)){UpgradeIS(p, i, i2, 19,si);}else{DestroyIS(p, i, i2);}
                      }
                      break;
                  case "§7Прокачка: §6IX":
                      if(pech.endsWith("§b [Ⓝ]")){
                          psub(pech,p);
                        UpgradeIS(p, i, i2, 22,si); 
                      }else{
                        if(uRandom(20)){UpgradeIS(p, i, i2, 22,si);}else{DestroyIS(p, i, i2);}
                      }
                      break;
                  case "§7Прокачка: §6X":
                      if(pech.endsWith("§b [Ⓝ]")){
                          psub(pech,p);
                        UpgradeIS(p, i, i2, 25,si);
                      }else{
                        if(uRandom(10)){UpgradeIS(p, i, i2, 25,si);}else{DestroyIS(p, i, i2);}
                      }
                      break;
              }
         }  
  }
  
  public static void sUpgradeHP(Player p){
          ItemStack i2 = p.getInventory().getItemInOffHand();
          ItemStack i = p.getInventory().getItemInMainHand();
          String s = p.getInventory().getItemInOffHand().getItemMeta().getLore().get(3).toString();
          String ss = "§7Прокачка: §9нет";
          String pech = p.getInventory().getItemInOffHand().getItemMeta().getDisplayName();
          if(!s.equals(ss)){
              p.sendTitle("§aОшибка", "§eДанный предмет нельзя прокачать!");
          }else{
            String si = p.getInventory().getItemInMainHand().getItemMeta().getLore().get(2).toString();
              switch (si) {
                  case "§7Прокачка: §6I":
                      if(pech.endsWith("§b [Ⓝ]")){
                          psub(pech,p);
                        UpgradeISHP(p, i, i2, 3,si); 
                      }else{
                        if(uRandom(100)){UpgradeISHP(p, i, i2, 3,si);}else{DestroyIS(p, i, i2);}
                      }
                      break;
                  case "§7Прокачка: §6II":
                      if(pech.endsWith("§b [Ⓝ]")){
                          psub(pech,p);
                        UpgradeISHP(p, i, i2, 11,si); 
                      }else{
                        if(uRandom(90)){UpgradeISHP(p, i, i2, 11,si);}else{DestroyIS(p, i, i2);}
                      }
                      break;
                  case "§7Прокачка: §6III":
                      if(pech.endsWith("§b [Ⓝ]")){
                          psub(pech,p);
                        UpgradeISHP(p, i, i2, 18,si);
                      }else{
                        if(uRandom(80)){UpgradeISHP(p, i, i2, 18,si);}else{DestroyIS(p, i, i2);}
                      }
                      break;
                  case "§7Прокачка: §6IV":
                      if(pech.endsWith("§b [Ⓝ]")){
                          psub(pech,p);
                        UpgradeISHP(p, i, i2, 21,si);
                      }else{
                        if(uRandom(70)){UpgradeISHP(p, i, i2, 21,si);}else{DestroyIS(p, i, i2);}
                      }
                      break;
                  case "§7Прокачка: §6V":
                      if(pech.endsWith("§b [Ⓝ]")){
                          psub(pech,p);
                        UpgradeISHP(p, i, i2, 29,si); 
                      }else{
                        if(uRandom(60)){UpgradeISHP(p, i, i2, 29,si);}else{DestroyIS(p, i, i2);}
                      }
                      break;
                  case "§7Прокачка: §6VI":
                      if(pech.endsWith("§b [Ⓝ]")){
                          psub(pech,p);
                        UpgradeISHP(p, i, i2, 34,si); 
                      }else{
                        if(uRandom(50)){UpgradeISHP(p, i, i2, 34,si);}else{DestroyIS(p, i, i2);}
                      }
                      break;
                  case "§7Прокачка: §6VII":
                      if(pech.endsWith("§b [Ⓝ]")){
                          psub(pech,p);
                        UpgradeISHP(p, i, i2, 37,si); 
                      }else{
                        if(uRandom(40)){UpgradeISHP(p, i, i2, 37,si);}else{DestroyIS(p, i, i2);}
                      }
                      break;
                  case "§7Прокачка: §6VIII":
                      if(pech.endsWith("§b [Ⓝ]")){
                          psub(pech,p);
                        UpgradeISHP(p, i, i2, 44,si); 
                      }else{
                        if(uRandom(30)){UpgradeISHP(p, i, i2, 44,si);}else{DestroyIS(p, i, i2);}
                      }
                      break;
                  case "§7Прокачка: §6IX":
                      if(pech.endsWith("§b [Ⓝ]")){
                          psub(pech,p);
                        UpgradeISHP(p, i, i2, 46,si); 
                      }else{
                        if(uRandom(20)){UpgradeISHP(p, i, i2, 46,si);}else{DestroyIS(p, i, i2);}
                      }
                      break;
                  case "§7Прокачка: §6X":
                      if(pech.endsWith("§b [Ⓝ]")){
                          psub(pech,p);
                        UpgradeISHP(p, i, i2, 50,si);
                      }else{
                        if(uRandom(10)){UpgradeISHP(p, i, i2, 50,si);}else{DestroyIS(p, i, i2);}
                      }
                      break;
              }
         }  
  }
  
  public static void psub(String s, Player p){
        String ss = s.substring(0, s.length()-6);
       ItemMeta meta = p.getInventory().getItemInOffHand().getItemMeta();
       meta.setDisplayName(ss);
       p.getInventory().getItemInOffHand().setItemMeta(meta);

  }
  
  public static void DestroyIS(Player p, ItemStack i, ItemStack i2){
      p.getInventory().setItemInMainHand(null);p.getInventory().setItemInOffHand(null);
            Bukkit.getScheduler().runTaskLater(m, new Runnable(){ 
            @Override public void run() {
            new Scheduler2(p).runTaskTimer(m, 0, 4);
            }},5);
  }
  
public static ItemStack changeLore(ItemStack item, int index, String lore)
  { 
    ItemMeta meta = item.getItemMeta();
    List<String> lores = new ArrayList(meta.getLore());lores.set(index - 1, lore);
    meta.setLore(lores);
    item.setItemMeta(meta);
    return item;
  }
  
  public static void UpgradeIS(Player p, ItemStack i, ItemStack i2, int damage, String book){
            p.getInventory().setItemInMainHand(null);p.getInventory().setItemInOffHand(null);
            
            String s = i2.getItemMeta().getLore().get(1).toString();
            changeLore(i2, 2, s+" §6(-"+damage+")");
            changeLore(i2, 4, book);
            ItemStack irem = attrRemove(i2, "DAMAGE");

            net.minecraft.server.v1_12_R1.ItemStack nms = CraftItemStack.asNMSCopy(i2);
            NBTTagList attrmod = getAttrList(nms);
            NBTTagCompound c = attrmod.get(0);
            int dmg = (int) c.getDouble("Amount");

            String setdamage = damage+dmg+"";
            m.antispam.add(p.getName());
            Bukkit.getScheduler().runTaskLater(m, new Runnable(){ 
            @Override public void run() {
            m.antispam.remove(p.getName());
            addAttr(p, "DAMAGE", setdamage, "mainhand", irem);}},48);
            
            Bukkit.getScheduler().runTaskLater(m, new Runnable(){ 
            @Override public void run() {
            new Scheduler(p).runTaskTimer(m, 0, 4);}},1);
  }
  
  public static void UpgradeISHP(Player p, ItemStack i, ItemStack i2, int damage, String book){
            p.getInventory().setItemInMainHand(null);p.getInventory().setItemInOffHand(null);
            
            String s = i2.getItemMeta().getLore().get(1).toString();
            changeLore(i2, 2, s+" §6(+"+damage+")");
            changeLore(i2, 4, book);
            ItemStack irem = attrRemove(i2, "MAX_HEALTH");

            net.minecraft.server.v1_12_R1.ItemStack nms = CraftItemStack.asNMSCopy(i2);
            NBTTagList attrmod = getAttrList(nms);
            NBTTagCompound c = attrmod.get(0);
            int dmg = (int) c.getDouble("Amount");

            String setdamage = damage+dmg+"";
            m.antispam.add(p.getName());
            Bukkit.getScheduler().runTaskLater(m, new Runnable(){ 
            @Override public void run() {
            m.antispam.remove(p.getName());
            if((i2.getType() == Material.LEATHER_CHESTPLATE)||(i2.getType() == Material.IRON_CHESTPLATE)||(i2.getType() == Material.GOLD_CHESTPLATE)){
            addAttr(p, "MAX_HEALTH", setdamage, "chest", irem);    
            }else if((i2.getType() == Material.LEATHER_LEGGINGS)||(i2.getType() == Material.IRON_LEGGINGS)||(i2.getType() == Material.GOLD_LEGGINGS)){
            addAttr(p, "MAX_HEALTH", setdamage, "legs", irem);    
            }if((i2.getType() == Material.LEATHER_BOOTS)||(i2.getType() == Material.IRON_BOOTS)||(i2.getType() == Material.GOLD_BOOTS)){
            addAttr(p, "MAX_HEALTH", setdamage, "feet", irem);    
            }if(i2.getType() == Material.SHIELD){
            addAttr(p, "MAX_HEALTH", setdamage, "offhand", irem);    
            }
            }},48);
            
            Bukkit.getScheduler().runTaskLater(m, new Runnable(){ 
            @Override public void run() {
            new Scheduler(p).runTaskTimer(m, 0, 4);}},1);
  }
  

  
  public static boolean uRandom(int chance){
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        if(number <= chance){return true;}
      return false;
  }

    @EventHandler
    public void onMobDeath(EntityDeathEvent e){
        if (e.getEntity().getKiller() instanceof Player) {
            String entity = e.getEntity().getCustomName();
            Player p = e.getEntity().getKiller();
            if(entity == null)return;
            
            if(entity.startsWith("§c§lBOSS")){
                Levels.addBoss(p.getName());  
            }
            if(entity.startsWith("§c§lMEGA")){
                Bukkit.getScheduler().runTaskLater(m, () -> {
                Levels.addDung(p.getName());    
                Bukkit.getWorld("world").getBlockAt(94,87,107).setType(Material.ENDER_CHEST);
                playChestAnimation(1); 
                openChest();
                },3*20);
            }
            if(entity.startsWith("§c§lDUNGEON")){
                   Levels.addDung(p.getName());
            }
            if(entity.startsWith("§c§lLAB")){
                  Levels.addDung(p.getName()); 
            }
            if(entity.startsWith("§c§lTUTORIAL")){
             p.teleport(new Location(Bukkit.getWorld("world"),884.5, 53, 102.5, -41.6f, 1.8f));
             Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "mm i give "+p.getName()+" xp3drop 15");
             Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "mm i give "+p.getName()+" xp3dropboss 5");
             
            }
                Levels.addMobs(p.getName());   
        }
    }
	
    /*поправить координаты*/
@SuppressWarnings("all")   
public void BossStart(int l){
            Bukkit.getScheduler().runTaskLater(m, () -> {
                int sizep = inportal.size();
                for(int i=0; i<sizep;i++){
                    String pl = inportal.get(i);
                    Player p = Bukkit.getPlayer(pl);
                    if(l==1){
                       p.teleport(new Location(Bukkit.getWorld("world"),-122, 67.5, 95.5, -179.1f, 3.9f)); 
                    }
                    if(l==2){
                       p.teleport(new Location(Bukkit.getWorld("world"),-71, 76.5, -137, 166.3f, -3.4f)); 
                    }
                    if(l==3){
                       p.teleport(new Location(Bukkit.getWorld("world"),159, 63.5, 22, 0.1f, 0.8f)); 
                    }
                }
            },3*20);
     }

/*Конфиг*/

public static void lvlUP(String p,int i){
    Mainlvl.addStats(p, i);
}

public static void BoosterTimer(){
            Bukkit.getScheduler().runTaskLater(m, () -> {
            Levels.setBoosterNO();
            Bukkit.broadcastMessage("§cВнимание! Глобальный ускоритель опыта закончился! Продлить можно в §6/donate");
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline booster 1 &r");
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "hd setline booster 2 &r");
            },3600*20);
     }

public void openChest(){
    
    Location l = new Location(Bukkit.getWorld("world"), 94.5, 87.8, 107.5);
    World w = Bukkit.getWorld("world");
    
    w.createExplosion(l.getX(), l.getY(), l.getZ(), 1.0F, false, false);
    
    Item sword = w.dropItem(l, addAttrDrop("DAMAGE", "43", "mainhand", ShopItems.ChestItems(1)));
    Item shield = w.dropItem(l, addAttrDrop("MAX_HEALTH", "28", "offhand", ShopItems.ChestItems(2)));
    Item uphp = w.dropItem(l, ShopItems.ChestItems(3));
    Item chestplate = w.dropItem(l, addAttrDrop("MAX_HEALTH", "25", "chest", ShopItems.ChestItems(2)));
    Item updmg = w.dropItem(l, ShopItems.ChestItems(5));
    Item updmg2 = w.dropItem(l, ShopItems.ChestItems(6));
    
    sword.setVelocity(new Vector(1, 0, 0));
    shield.setVelocity(new Vector(0, 1, 0));
    uphp.setVelocity(new Vector(0, 0, 1));
    chestplate.setVelocity(new Vector(-1, 0, 0));
    updmg.setVelocity(new Vector(0, -1, 0));
    updmg.setVelocity(new Vector(0, 0, -1));
    
    Bukkit.getScheduler().runTaskLater(m, () -> {
    playChestAnimation(0);    
    },5*20);
    
    Bukkit.getScheduler().runTaskLater(m, () -> {
    w.createExplosion(l.getX(), l.getY(), l.getZ(), 1.0F, false, false);
    Bukkit.getWorld("world").getBlockAt(94,87,107).setType(Material.AIR);   
    },6*20);
}

    private void playChestAnimation(int state) {
        ((CraftWorld)Bukkit.getWorld("world")).getHandle().playBlockAction(new BlockPosition(94, 87, 107), CraftMagicNumbers.getBlock(Material.ENDER_CHEST), 1, state);
    }
    
private void onEffectSpark(Player p, Effect e){
    p.getLocation().getWorld().playEffect(p.getLocation().add(0.6D, 2.0D, 0.0D), e, 1);
    p.getLocation().getWorld().playEffect(p.getLocation().add(0.55D, 2.0D, 0.23D), e, 1);
    p.getLocation().getWorld().playEffect(p.getLocation().add(0.45D, 2.0D, 0.45D), e, 1);
    p.getLocation().getWorld().playEffect(p.getLocation().add(0.23D, 2.0D, 0.55D), e, 1);
    p.getLocation().getWorld().playEffect(p.getLocation().add(0.0D, 2.0D, 0.6D), e, 1);
    p.getLocation().getWorld().playEffect(p.getLocation().add(-0.23D, 2.0D, 0.55D), e, 1);
    p.getLocation().getWorld().playEffect(p.getLocation().add(-0.45D, 2.0D, 0.45D), e, 1);
    p.getLocation().getWorld().playEffect(p.getLocation().add(-0.55D, 2.0D, 0.23D), e, 1);
    p.getLocation().getWorld().playEffect(p.getLocation().add(-0.6D, 2.0D, 0.0D), e, 1);
    p.getLocation().getWorld().playEffect(p.getLocation().add(-0.55D, 2.0D, -0.23D), e, 1);
    p.getLocation().getWorld().playEffect(p.getLocation().add(-0.45D, 2.0D, -0.45D), e, 1);
    p.getLocation().getWorld().playEffect(p.getLocation().add(-0.23D, 2.0D, -0.55D), e, 1);
    p.getLocation().getWorld().playEffect(p.getLocation().add(0.0D, 2.0D, -0.6D), e, 1);
    p.getLocation().getWorld().playEffect(p.getLocation().add(0.23D, 2.0D, -0.55D), e, 1);
    p.getLocation().getWorld().playEffect(p.getLocation().add(0.45D, 2.0D, -0.45D), e, 1);
    p.getLocation().getWorld().playEffect(p.getLocation().add(0.55D, 2.0D, -0.23D), e, 1);
}
    
@EventHandler
    private void onSposobnosty(PlayerToggleSneakEvent e) {
        if (!e.isSneaking()) return;
        long current = System.currentTimeMillis();
        Long previous = this.lastSneak.put(e.getPlayer(), current);
        if (previous == null) return;
        if (current - previous > 500) return;
        Player p = e.getPlayer();
        String spo = Levels.getSpo(e.getPlayer().getName());
        if(spo.equalsIgnoreCase("null")) return;
        if(p.getFoodLevel()==0)return;
        int f = p.getFoodLevel();
        
        switch (spo) {
          case "inv":
          if(f>=2){
          onEffectSpark(p,Effect.SMOKE);
          p.setFoodLevel(f-2);
          p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 200, 1));    
          }
                break;
          case "reg":
          if(f>=3){
          onEffectSpark(p,Effect.HEART);
          p.setFoodLevel(f-3);
          p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 200, 1));
          }
                break;
          case "bomba":
          if(f>=4){
          p.setFoodLevel(f-4);
          onEffectSpark(p,Effect.BLAZE_SHOOT);
          for (Entity entity : p.getNearbyEntities(3, 3, 3)){
              if(entity.getType()!=EntityType.PLAYER){
                 entity.setVelocity(entity.getLocation().getDirection().setY(-1).multiply(-1.2)); 
                        }
                }
          }
                break;
          case "rivok":
          if(f>=2){
          p.setFoodLevel(f-2);
          onEffectSpark(p,Effect.FIREWORKS_SPARK);
          p.setVelocity(p.getLocation().getDirection().multiply(2).setY(-1.5));
          }
                break;
          case "hil":
          if(f>=5){
          p.setFoodLevel(f-5);
          onEffectSpark(p,Effect.PORTAL);
          for (Entity entity : p.getNearbyEntities(5, 5, 5)){
                  if (entity.getType() == EntityType.PLAYER) {
                        Player pl = (Player)entity;
                        pl.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 1, 1));
                        }
                    }
          }
                break;
          case "null":break;
        } 
    }
    
    @EventHandler
    public void onEFFECTSWORD(EntityDamageByEntityEvent e) {
        Entity damager = e.getDamager();
        LivingEntity entity = (LivingEntity) e.getEntity();
        if (damager instanceof Player){
           Player p = (Player) damager;
           if(p.getInventory()==null)return;
           if(p.getInventory().getItemInMainHand()==null)return;
           if(p.getInventory().getItemInMainHand().getItemMeta()==null)return;
           if(p.getInventory().getItemInMainHand().getItemMeta().getDisplayName()==null)return;
           String item = p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().toString();
           if(entity instanceof Player){
            }else{
              if(item.startsWith("§aПаралакс §8[§e14ур§8]")){
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 60, 1)); 
              }
              if(item.startsWith("§aКсаркс §8[§e15ур§8]")){
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 60, 1));
              }
              if(item.startsWith("§aМаларис §8[§e17ур§8]")){
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 60, 1));
              }
              if(item.startsWith("§aОникс §8[§e25ур§8]")){
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 60, 1));
              }
              if(item.startsWith("§aТоксик §8[§e12ур§8]")){
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 60, 1));
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 60, 1));
              }
              if(item.startsWith("§aКсар §8[§e15ур§8]")){
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 60, 1));
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 60, 1));
              }
              if(item.startsWith("§aЭкскалибурc §8[§e10ур§8]")){
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 60, 1));
              }
              if(item.startsWith("§aСайгер §8[§e9ур§8]")){
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 60, 1));
              }
              if(item.startsWith("§aГолден §8[§e20ур§8]")){
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 60, 1));
              }
              if(item.startsWith("§aЗалфир §8[§e10ур§8]")){
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 60, 1));
              }
              if(item.startsWith("§aЛоли §8[§e8ур§8]")){
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 60, 1));
              }
              if(item.startsWith("§aОмега §8[§e27ур§8]")){
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 60, 1));
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 1));
              }
              if(item.startsWith("§aМеч Крона §8[§e15ур§8]")){
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 60, 1));
              }
              if(item.startsWith("§aЯгура §8[§e15ур§8]")){
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 1));
              }
              if(item.startsWith("§aДемонический клинок §8[§e8ур§8]")){
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 60, 1));
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 60, 1));
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 60, 1));
                 entity.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 60, 1));
              }
           }
        }
    }
    
    public void onChances(Player p){
        if(new Random().nextFloat()<0.01){
        addAttr(p, "DAMAGE", "34", "mainhand", ShopItems.SIDropSword(1));   
        }else if(new Random().nextFloat()<0.09){
           addAttr(p, "DAMAGE", "30", "mainhand", ShopItems.SIDropSword(8)); 
        }else if(new Random().nextFloat()<0.15){
           addAttr(p, "DAMAGE", "44", "mainhand", ShopItems.SIDropSword(11));
        }else if(new Random().nextFloat()<0.17){
           addAttr(p, "DAMAGE", "26", "mainhand", ShopItems.SIDropSword(17));
        }else if(new Random().nextFloat()<0.2){
           addAttr(p, "DAMAGE", "23", "mainhand", ShopItems.SIDropSword(18));
        }else if(new Random().nextFloat()<0.25){
           addAttr(p, "DAMAGE", "20", "mainhand", ShopItems.SIDropSword(171));
        }else if(new Random().nextFloat()<0.3){
           addAttr(p, "DAMAGE", "18", "mainhand", ShopItems.SIDropSword(412));  
        }else if(new Random().nextFloat()<0.4){
           addAttr(p, "DAMAGE", "23", "mainhand", ShopItems.SIDropSword(41));
        }else if(new Random().nextFloat()<0.45){
           addAttr(p, "DAMAGE", "10", "mainhand", ShopItems.SIDropSword(411)); 
        }else if(new Random().nextFloat()<0.5){
           addAttr(p, "DAMAGE", "17", "mainhand", ShopItems.SIDropSword(42)); 
        }else if(new Random().nextFloat()<0.6){
           addAttr(p, "DAMAGE", "29", "mainhand", ShopItems.SIDropSword(81));
        }else if(new Random().nextFloat()<0.7){
           addAttr(p, "DAMAGE", "11", "mainhand", ShopItems.SIDropSword(861));
        }else if(new Random().nextFloat()<0.8){
           addAttr(p, "DAMAGE", "21", "mainhand", ShopItems.SIDropSword(86)); 
        }else if(new Random().nextFloat()<0.85){
           addAttr(p, "DAMAGE", "14", "mainhand", ShopItems.SIDropSword(862)); 
        }else if(new Random().nextFloat()<0.9){
           addAttr(p, "DAMAGE", "12", "mainhand", ShopItems.SIDropSword(87));
        }else if(new Random().nextFloat()<0.95){
           addAttr(p, "DAMAGE", "7", "mainhand", ShopItems.SIDropSword(82)); 
        }
    }  
    
    public static int getBal(Player p){
        int coins = Coins.getCoins(p.getName());
        return coins;
    }
    public static boolean sB(Player p, int coins){
        int getcoin = getBal(p);
        if(getcoin>=coins){
        Coins.setCoins(p.getName(), getcoin-coins);
        return true;
        }
        return false;
    }
    public static void addBal(Player p, int coins){
        Coins.addCoins(p.getName(), coins);
        
    }
    public static Main getI() {
        return instance;
    }
    
    
    /*Создать мир сна*/
    public void onSleep (PlayerBedEnterEvent e){
    }
  
    @EventHandler
    public void onSignChange(SignChangeEvent e) {
        final Block b = e.getBlock();
        Player p = e.getPlayer();
        if(main.ClanName(p).equals("")) {
            String input = "";
            for (String line : e.getLines()) {
                if (line != null && line.length() > 0) {
                    input += line;
                }
            }
            if (b.hasMetadata("setName")) {
                if (input.length() > 2) {
                    if(input.length() > 6){
                        p.sendMessage("&cНазвание клана слишком длинное!");
                    }else{
                        String clanname = input;
                        p.chat("/clan create "+input);
                        b.setType(Material.AIR);
                    }
                } else {
                    p.sendMessage("&cНазвание клана слишком короткое!");
                    b.setType(Material.AIR);
                }
                e.setCancelled(true);
                b.removeMetadata("setName", Main.getI());
                b.setType(Material.AIR);
            }
        }
    }
    
  public void randomEvent(){
    Bukkit.getScheduler().runTaskTimer(this, new Runnable(){
      @Override
      public void run(){
       if(Bukkit.getOnlinePlayers().size()>=2){
                for(Player p : Bukkit.getOnlinePlayers()){
                   onRandomEvent(p);
       }}}}, 36000, 36000);
  }
    
  public void onRandomEvent(Player p){
        Random r = new Random();   
        int rt = r.nextInt(8) + 1;      
            if (rt == 1) {
                p.sendTitle("§eВнезапное событие", "§eВсем игрокам начисленно §a200 монет");
                economy.depositPlayer(p, 200);
            }
            if (rt == 2) {
                p.sendTitle("§eВнезапное событие", "§eВсе игроки перемещены на §aспавн!");
                p.teleport(new Location(Bukkit.getWorld("world"),94.5, 88.5, 118.5, -179.1f, 3.9f)); 
                p.setGameMode(GameMode.ADVENTURE);
            }
            if (rt == 3) {
                p.sendTitle("§eВнезапное событие", "§eВсе игроки получают замедление!");
                p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1200, 1));
            }
            if (rt == 4) {
                p.sendTitle("§eВнезапное событие", "§eВсе игроки ослеплены!");
                p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 1200, 1));
            }
            if (rt == 5) {
                p.sendTitle("§eВнезапное событие", "§eВсе игроки получают ключ от сундука!");
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "case give "+p.getName()+" 1");
            }
            if (rt == 6) {
                p.sendTitle("§eВнезапное событие", "§eВсе игроки получают ускорение!");
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1200, 2));
            }
            if (rt == 7) {
                p.sendTitle("§eВнезапное событие", "§eВсе игроки получают неуязвимость!");
                p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 2));
            }
            if (rt == 8) {
                p.sendTitle("§eВнезапное событие", "§eВсем игрокам начисленно §a250 монет");
                economy.depositPlayer(p, 250);
            }
  }
}



