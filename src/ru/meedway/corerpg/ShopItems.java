package ru.meedway.corerpg;

import de.Keyle.MyPet.MyPetApi;
import de.Keyle.MyPet.api.entity.MyPet;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.Color;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.Banner;
import org.bukkit.block.BlockState;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;


public class ShopItems { 
    public static int[] getboss = new int[]{10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,170,190,200,220,240,260,280,300,320,340,360,380,400,440,480,520,560,600,650,700,750,800,850,900,950,1000,1050,1100,1150,1200,1250,1300,1350,1400,1450,1500,1550,1600,1650,1700,1750,1800,1850,1900,1950,2000,2050,2100,2150,2200,2250,2300,2350,2400,2450,2500,2550,2600,2650,2700,2750,2800,2850,2900,2950,3000,3050,3100,3150,3200,3250,3300,3350,3400,3450,3500,3550,3600,3650,3700,3750,3750,3800,3850,3900,3950,4000,4100,4200,4300,4400,4500,4600,4700,4800,4900,5000,9999999};
    public static int[] getmob = new int[]{50,100,150,200,250,300,350,400,450,500,550,600,650,700,750,800,950,1000,1050,1100,1150,1200,1250,1300,1350,1400,1450,1500,1550,1600,1650,1700,1750,1800,1850,1900,1950,2000,2050,2100,2150,2200,2250,2300,2400,2500,2600,2700,2800,2900,3000,3100,3200,3300,3400,3500,3600,3700,3800,3900,4000,4100,4200,4300,4400,4500,4600,4700,4800,4900,5000,5100,5200,5300,5400,5500,5600,5700,5800,5900,6000,6100,6200,6300,6400,6500,6600,6700,6800,6900,7000,9999999};
    public static int[] getdun = new int []{5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100,110,120,130,140,150,160,170,180,190,200,210,220,230,240,250,260,270,280,290,300,310,320,330,340,350,360,370,380,390,400,9999};
    
    public static ItemStack SISworld(int lvl,boolean shop){
        if(lvl == 0){
            ItemStack i= new ItemStack(280,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПалка §8[§eMEEDWAY§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-1");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Предмет получен при первом входе игрока");
            l.add("§7  Следуй в направлении - Начать игру!");
            if(shop == true){l.add("");l.add("§aСтоимость: §60");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 1){
            ItemStack i= new ItemStack(280,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПалка §8[§e1ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-2");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Этой палкой можно отбиваться");
            if(shop == true){l.add("");l.add("§aСтоимость: §610");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 2){
            ItemStack i= new ItemStack(352,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aКосточка §8[§e2ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-4");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Останки живого скелета");
            if(shop == true){l.add("");l.add("§aСтоимость: §620");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 3){
            ItemStack i= new ItemStack(Material.WOOD_HOE,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aСельская мотыга §8[§e3ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-5");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Если присмотреться можно найти землю");
            if(shop == true){l.add("");l.add("§aСтоимость: §630");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 4){
            ItemStack i= new ItemStack(Material.WOOD_SPADE,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПоношенная лопата §8[§e4ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-7");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Сельские жители поделились орудием");
            if(shop == true){l.add("");l.add("§aСтоимость: §640");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 5){
            ItemStack i= new ItemStack(Material.WOOD_AXE,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aДревесный топор §8[§e5ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-9");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Лесник рекомендует, знак качества");
            if(shop == true){l.add("");l.add("§aСтоимость: §650");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 6){
            ItemStack i= new ItemStack(Material.WOOD_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aСамодельный кинжал §8[§e6ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-10");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Посмотрите как он блестит");
            if(shop == true){l.add("");l.add("§aСтоимость: §660");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 7){
            ItemStack i= new ItemStack(Material.STONE_HOE,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aТяпка §8[§e7ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-12");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Сегодня будет жарко");
            if(shop == true){l.add("");l.add("§aСтоимость: §670");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 8){
            ItemStack i= new ItemStack(Material.STONE_SPADE,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aСаперная лопатка §8[§e8ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-13");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Предназначена не для разминирования");
            if(shop == true){l.add("");l.add("§aСтоимость: §680");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 9){
            ItemStack i= new ItemStack(Material.STONE_AXE,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aИзящный топор §8[§e9ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-15");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Сделан из упругих материалов");
            if(shop == true){l.add("");l.add("§aСтоимость: §690");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 10){
            ItemStack i= new ItemStack(Material.STONE_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЭкстремальная секира §8[§e10ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-16");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Еще древние славяне носили такие");
            if(shop == true){l.add("");l.add("§aСтоимость: §6100");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 11){
            ItemStack i= new ItemStack(359,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aНожницы §8[§e11ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-18");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Оружия для скрытого нанесения урона");
            if(shop == true){l.add("");l.add("§aСтоимость: §6110");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 12){
            ItemStack i= new ItemStack(Material.IRON_HOE,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЖелезная рукоять §8[§e12ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-19");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Состав метала превосходит все ожидания");
            if(shop == true){l.add("");l.add("§aСтоимость: §6120");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 13){
            ItemStack i= new ItemStack(Material.IRON_SPADE,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aНесокрушимая лопата §8[§e13ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-21");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Один удар в кочане шар");
            if(shop == true){l.add("");l.add("§aСтоимость: §6130");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 14){
            ItemStack i= new ItemStack(Material.IRON_AXE,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aТопор возмездия §8[§e14ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-23");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Рубит не только деревья");
            if(shop == true){l.add("");l.add("§aСтоимость: §6140");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 15){
            ItemStack i= new ItemStack(Material.IRON_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aМеч свободы §8[§e15ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-24");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Может разрубать ветер");
            if(shop == true){l.add("");l.add("§aСтоимость: §6150");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 16){
            ItemStack i= new ItemStack(369,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЖезл правосудия §8[§e16ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-26");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Использует сверх естественные силы");
            if(shop == true){l.add("");l.add("§aСтоимость: §6160");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 17){
            ItemStack i= new ItemStack(Material.GOLD_HOE,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aСвященная мотыга §8[§e17ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-27");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Тайна данного предмета до сих пор не раскрыта");
            if(shop == true){l.add("");l.add("§aСтоимость: §6170");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 18){
            ItemStack i= new ItemStack(Material.GOLD_SPADE,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aСвященная лопата §8[§e18ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-29");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- А сегодня в завтрашний день ...");
            if(shop == true){l.add("");l.add("§aСтоимость: §6180");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 19){
            ItemStack i= new ItemStack(Material.GOLD_AXE,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aСвященный топор §8[§e19ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-31");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Разносите щиты противников в щепки");
            if(shop == true){l.add("");l.add("§aСтоимость: §6190");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 20){
            ItemStack i= new ItemStack(Material.GOLD_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aСвященный меч §8[§e20ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-33");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- И тут все начали тебя бояться");
            if(shop == true){l.add("");l.add("§aСтоимость: §6200");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 21){
            ItemStack i= new ItemStack(Material.WOOD_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aУлучшенный меч §8[§e21ур§8]");
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-35");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Меч прошел этап адаптации");
            if(shop == true){l.add("");l.add("§aСтоимость: §6210");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 22){
            ItemStack i= new ItemStack(Material.STONE_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЭпический меч §8[§e22ур§8]");
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-37");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Когда то он упал с радужного портала");
            if(shop == true){l.add("");l.add("§aСтоимость: §6220");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 23){
            ItemStack i= new ItemStack(Material.IRON_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aКосмический меч §8[§e23ур§8]");
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-39");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Был найден на просторах космоса");
            if(shop == true){l.add("");l.add("§aСтоимость: §6230");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 24){
            ItemStack i= new ItemStack(Material.GOLD_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aМеч бесконечности §8[§e24ур§8]");
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-41");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Тайно создавался вместо с перчаткой");
            if(shop == true){l.add("");l.add("§aСтоимость: §6250");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(lvl == 25){
            ItemStack i= new ItemStack(Material.BLAZE_ROD,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЖезл разума §8[§e25ур§8]");
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-43");
            l.add("§7Свойства: §cПоджигание");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Взяв данное оружие в руки вы сразу же к...");
            if(shop == true){l.add("");l.add("§aСтоимость: §6260");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }
        
        return null;}
    

    
    
    public static ItemStack SIMENU(int num){
        if(num == 1){
            ItemStack i= new ItemStack(Material.GOLD_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§cОружие");
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            i.setItemMeta(im); 
           return i;
        }else if(num == 2){
            ItemStack i= new ItemStack(Material.LEATHER_CHESTPLATE,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§eБроня");
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            i.setItemMeta(im); 
           return i;
        }else if(num == 3){
            ItemStack i= new ItemStack(Material.SHIELD,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§eЩиты");
            i.setItemMeta(im); 
           return i;
        }else if(num == 4){
            ItemStack i= new ItemStack(Material.ENCHANTED_BOOK,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§eКниги прокачки");
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            i.setItemMeta(im); 
           return i;
        }else if(num == 5){
            ItemStack i= new ItemStack(Material.ENDER_CHEST,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bPREMIUM снаряжение");
            i.setItemMeta(im); 
           return i;
        }
        return null;}
    public static ItemStack SIMAIN(int num){
        if(num == 1){
            ItemStack i= new ItemStack(Material.ENDER_CHEST,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПокупка");
            i.setItemMeta(im); 
           return i;
        }else if(num == 2){
            ItemStack i= new ItemStack(175,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПродажа");
            i.setItemMeta(im); 
           return i;
        }
        else if(num == 3){
            ItemStack i= new ItemStack(Material.BOOK,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aАукцион");
            i.setItemMeta(im); 
           return i;
        }
        return null;
    }
    public static ItemStack SITUTORIAL(int num){
        if(num == 1){
            ItemStack i= new ItemStack(Material.EMERALD_BLOCK,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aДА, я хочу пройти обучение!");
            i.setItemMeta(im); 
           return i;
        }else if(num == 2){
            ItemStack i= new ItemStack(Material.REDSTONE_BLOCK,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§cНЕТ, я уже все знаю!");
            i.setItemMeta(im); 
           return i;
        }
        return null;
    }
    public static ItemStack SITPRUDA(int slot){
        if(slot == 1){
            ItemStack i= new ItemStack(Material.DIAMOND_ORE,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация добычи предметов #1");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eГородское поселение");
            l.add("");
            l.add("§7Описание: §eЛокация создана для добычи редких");
            l.add("§eвещей, которые понадобятся вам в развитии деревни.");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }
        return null;
    }
    public static ItemStack SIBILET(int slot, boolean shop){
        if(slot == 1){
            ItemStack i= new ItemStack(Material.PAPER,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aБилет #1: §cСпавн");
            List l = new ArrayList();
            l.add("");
            l.add("§7Описание: §eДанный билет предназначен");
            l.add("§eдля возврата персонажа на спавн.");
            l.add("");
            if(shop == true){l.add("");l.add("§aСтоимость: §61");}
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(slot == 2){
            ItemStack i= new ItemStack(Material.PAPER,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aБилет #2: §cСмертельный лабиринт");
            List l = new ArrayList();
            l.add("");
            l.add("§7Описание: §eДанный билет предназначен");
            l.add("§eдля перемещения в лабиринт с боссом");
            l.add("");
            if(shop == true){l.add("");l.add("§aСтоимость: §6800");}
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(slot == 3){
            ItemStack i= new ItemStack(Material.PAPER,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aБилет #3: §cМистический лабиринт");
            List l = new ArrayList();
            l.add("");
            l.add("§7Описание: §eДанный билет предназначен");
            l.add("§eдля перемещения в лабиринт с боссом");
            l.add("");
            if(shop == true){l.add("");l.add("§aСтоимость: §61000");}
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }
        return null;
    }
    public static ItemStack SITP(int slot){
        if(slot == 1){
            ItemStack i= new ItemStack(6,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #1");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eСторожка лесника");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(slot == 2){
            ItemStack i= new ItemStack(170,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #2");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eФерма");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 3){
            ItemStack i= new ItemStack(14,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #3");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eШахта");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 4){
            ItemStack i= new ItemStack(381,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #4");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eМагическая башня");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 5){
            ItemStack i= new ItemStack(40,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #5");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eГрибная поляна");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 6){
            ItemStack i= new ItemStack(169,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #6");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eВладыка морей");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 7){
            ItemStack i= new ItemStack(295,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #7");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eХлебная поляна");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 8){
            ItemStack i= new ItemStack(121,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #8");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eДругая вселенная");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 9){
            ItemStack i= new ItemStack(215,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #9");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eАдская крепость");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 10){
            ItemStack i= new ItemStack(138,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #10");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eМистической оазис");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 11){
            ItemStack i= new ItemStack(332,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #11");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eЗимний край");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 12){
            ItemStack i= new ItemStack(152,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #12");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eАдский дерижабль");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 13){
            ItemStack i= new ItemStack(168,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #13");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eМорской дракон");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 14){
            ItemStack i= new ItemStack(368,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #14");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eУщелье края");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 15){
            ItemStack i= new ItemStack(2,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #15");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eДеревня стражников");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 16){
            ItemStack i= new ItemStack(81,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #16");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eСахара");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }
        return null;
    }
    public static ItemStack SITP1(int slot){
        if(slot == 1){
            ItemStack i= new ItemStack(426,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #1(17)");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eМагический портал");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(slot == 2){
            ItemStack i= new ItemStack(427,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #2(18)");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eПоселение");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 3){
            ItemStack i= new ItemStack(444,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #3(19)");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eДеревня");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 4){
            ItemStack i= new ItemStack(381,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #4");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eМагическая башня");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 5){
            ItemStack i= new ItemStack(40,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #5");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eГрибная поляна");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 6){
            ItemStack i= new ItemStack(169,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #6");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eВладыка морей");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 7){
            ItemStack i= new ItemStack(295,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #7");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eХлебная поляна");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 8){
            ItemStack i= new ItemStack(121,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #8");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eДругая вселенная");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 9){
            ItemStack i= new ItemStack(215,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #9");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eАдская крепость");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 10){
            ItemStack i= new ItemStack(138,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #10");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eМистической оазис");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 11){
            ItemStack i= new ItemStack(332,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #11");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eЗимний край");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 12){
            ItemStack i= new ItemStack(152,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #12");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eАдский дерижабль");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 13){
            ItemStack i= new ItemStack(168,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #13");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eМорской дракон");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 14){
            ItemStack i= new ItemStack(368,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #14");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eУщелье края");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 15){
            ItemStack i= new ItemStack(2,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #15");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eДеревня стражников");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(slot == 16){
            ItemStack i= new ItemStack(81,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЛокация #16");
            List l = new ArrayList();
            l.add("");
            l.add("§7Статус: §aОткрыто");
            l.add("§7Название: §eСахара");
            l.add("");
            l.add("- §9Кликните, чтобы телепортироваться...");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }
        return null;
    }
    
    public static ItemStack SINONE(){
            ItemStack i= new ItemStack(402,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§4Закрытая локация");
            List l = new ArrayList();
            l.add("");
            l.add("§cДля открытия, прокачивайте свой уровень!");
            im.setLore(l);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            i.setItemMeta(im); 
           return i;
        }
    
    public static ItemStack SINONE1(){
            ItemStack i= new ItemStack(426,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§45е-Измерение");
            List l = new ArrayList();
            l.add("");
            l.add("§cНовые локации открываются с 23 уровня!");
            im.setLore(l);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            i.setItemMeta(im); 
           return i;
        }
    
    
    public static ItemStack SIPRIZE(int num, String p){
        int lv = Levels.getLevel(p);
        int xpto = 1;
        if(num == -1){
            ItemStack i= new ItemStack(379,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aУровень");
            List l = new ArrayList();
            l.add("§7Играйте и выполняйте различные");
            l.add("§7задания, чтобы получить награду");
            l.add("§7в размере §3опыта§7, который");
            l.add("§7понадобится для поднятия уровня и");
            l.add("§7получения различных наград и возможностей.");
            l.add("");
            l.add("§3Уровень:"+Levels.getLevel(p)+" §3Опыт: ");
            l.add("");
            l.add("§7Опыта до следующего уровня: §3"+xpto);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 0){
            ItemStack i= new ItemStack(328,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§eНаграда за уровень");
            List l = new ArrayList();
            l.add("");
            l.add("§8+§650,000 §7Монет");
            l.add("§8+§32,500 §7Опыта");
            l.add("§8+§b10 §7Мистической пыли");
            l.add("");
            l.add("§eДанный приз получен");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 1){
            ItemStack i= new ItemStack(342,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aНаграда за 1 уровень");
            List l = new ArrayList();
            l.add("");
            l.add("§8+§650,000 §7Монет");
            l.add("§8+§32,500 §7Опыта");
            l.add("§8+§b10 §7Мистической пыли");
            l.add("");
            l.add("§aНажмите, чтобы получить приз");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 2){
            ItemStack i= new ItemStack(342,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aНаграда за 2 уровень");
            List l = new ArrayList();
            l.add("");
            l.add("§8+§650,000 §7Монет");
            l.add("§8+§32,500 §7Опыта");
            l.add("§8+§b10 §7Мистической пыли");
            l.add("");
            l.add("§aНажмите, чтобы получить приз");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 3){
            ItemStack i= new ItemStack(342,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aНаграда за 3 уровень");
            List l = new ArrayList();
            l.add("");
            l.add("§8+§650,000 §7Монет");
            l.add("§8+§32,500 §7Опыта");
            l.add("§8+§b10 §7Мистической пыли");
            l.add("");
            l.add("§aНажмите, чтобы получить приз");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 4){
            ItemStack i= new ItemStack(342,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aНаграда за 4 уровень");
            List l = new ArrayList();
            l.add("");
            l.add("§8+§650,000 §7Монет");
            l.add("§8+§32,500 §7Опыта");
            l.add("§8+§b10 §7Мистической пыли");
            l.add("");
            l.add("§aНажмите, чтобы получить приз");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 5){
            ItemStack i= new ItemStack(342,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aНаграда за 5 уровень");
            List l = new ArrayList();
            l.add("");
            l.add("§8+§650,000 §7Монет");
            l.add("§8+§32,500 §7Опыта");
            l.add("§8+§b10 §7Мистической пыли");
            l.add("");
            l.add("§aНажмите, чтобы получить приз");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 6){
            ItemStack i= new ItemStack(342,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aНаграда за 6 уровень");
            List l = new ArrayList();
            l.add("");
            l.add("§8+§650,000 §7Монет");
            l.add("§8+§32,500 §7Опыта");
            l.add("§8+§b10 §7Мистической пыли");
            l.add("");
            l.add("§aНажмите, чтобы получить приз");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 7){
            ItemStack i= new ItemStack(342,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aНаграда за 7 уровень");
            List l = new ArrayList();
            l.add("");
            l.add("§8+§650,000 §7Монет");
            l.add("§8+§32,500 §7Опыта");
            l.add("§8+§b10 §7Мистической пыли");
            l.add("");
            l.add("§aНажмите, чтобы получить приз");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 8){
            ItemStack i= new ItemStack(342,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aНаграда за 8 уровень");
            List l = new ArrayList();
            l.add("");
            l.add("§8+§650,000 §7Монет");
            l.add("§8+§32,500 §7Опыта");
            l.add("§8+§b10 §7Мистической пыли");
            l.add("");
            l.add("§aНажмите, чтобы получить приз");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 9){
            ItemStack i= new ItemStack(342,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aНаграда за 9 уровень");
            List l = new ArrayList();
            l.add("");
            l.add("§8+§650,000 §7Монет");
            l.add("§8+§32,500 §7Опыта");
            l.add("§8+§b10 §7Мистической пыли");
            l.add("");
            l.add("§aНажмите, чтобы получить приз");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 10){
            ItemStack i= new ItemStack(342,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aНаграда за 10 уровень");
            List l = new ArrayList();
            l.add("");
            l.add("§8+§650,000 §7Монет");
            l.add("§8+§32,500 §7Опыта");
            l.add("§8+§b10 §7Мистической пыли");
            l.add("");
            l.add("§aНажмите, чтобы получить приз");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }
        return null;
    }
    
    public static ItemStack SIShield(int lvl,boolean shop){
        if(lvl == 1){
            ItemStack i = stringtoShield("BROWN GRADIENT_UP GRAY STRIPE_SMALL BROWN BRICKS BROWN STRAIGHT_CROSS SILVER FLOWER SILVER");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aДеревянный щит §8[§e1ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+4");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Кусок дерева, для отражения атак");
            if(shop == true){l.add("");l.add("§aСтоимость: §69");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 2){
            ItemStack i = stringtoShield("BROWN CROSS SILVER CIRCLE_MIDDLE SILVER STRAIGHT_CROSS SILVER CREEPER SILVER");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aДревесный щит §8[§e2ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+8");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В его составе имеется метал");
            if(shop == true){l.add("");l.add("§aСтоимость: §618");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 3){
            ItemStack i = stringtoShield("BLACK SKULL RED STRIPE_BOTTOM SILVER STRIPE_CENTER GRAY HALF_HORIZONTAL SILVER");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЩит жителей §8[§e3ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+12");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Кто нибудь поймет из чего он сделан?");
            if(shop == true){l.add("");l.add("§aСтоимость: §627");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 4){
            ItemStack i = stringtoShield("CYAN STRIPE_MIDDLE WHITE STRIPE_CENTER CYAN CURLY_BORDER BLACK STRIPE_TOP CYAN HALF_HORIZONTAL_MIRROR CYAN BORDER CYAN");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЩит морских обитателей §8[§e4ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+16");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- С него постоянно течет вода");
            if(shop == true){l.add("");l.add("§aСтоимость: §636");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 5){
            ItemStack i = stringtoShield("BLUE CURLY_BORDER BLACK BRICKS BLACK STRIPE_SMALL BLACK GRADIENT GRAY TRIANGLES_TOP SILVER TRIANGLES_BOTTOM BLUE");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЩит ночной суеты §8[§e5ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+20");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Легенда гласит, что его делали в темноте");
            if(shop == true){l.add("");l.add("§aСтоимость: §645");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 6){
            ItemStack i = stringtoShield("WHITE TRIANGLES_TOP BLACK STRIPE_CENTER YELLOW HALF_HORIZONTAL_MIRROR RED STRIPE_MIDDLE YELLOW SQUARE_BOTTOM_RIGHT PINK BORDER YELLOW");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aСмаил щит §8[§e6ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+24");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Найдите удивленного на данном щите");
            if(shop == true){l.add("");l.add("§aСтоимость: §654");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 7){
            ItemStack i = stringtoShield("GREEN CURLY_BORDER WHITE HALF_VERTICAL_MIRROR PINK STRIPE_MIDDLE BLACK STRIPE_CENTER PINK TRIANGLE_BOTTOM GREEN");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aФинк эбаут щит §8[§e7ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+28");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Зыс ис зе деференс");
            if(shop == true){l.add("");l.add("§aСтоимость: §663");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 8){
            ItemStack i = stringtoShield("BLACK FLOWER RED STRIPE_TOP GREEN TRIANGLES_BOTTOM GREEN CURLY_BORDER GREEN CROSS GREEN CREEPER GREEN");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aКриперский щит §8[§e8ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+32");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Тссссссссссссссссссссссс");
            if(shop == true){l.add("");l.add("§aСтоимость: §672");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 9){
            ItemStack i = stringtoShield("WHITE GRADIENT RED GRADIENT_UP ORANGE GRADIENT_UP YELLOW GRADIENT_UP LIME GRADIENT_UP LIGHT_BLUE");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aРадужный щит §8[§e9ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+36");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- А ведь был дождь?");
            if(shop == true){l.add("");l.add("§aСтоимость: §681");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 10){
            ItemStack i = stringtoShield("PURPLE STRIPE_DOWNRIGHT BLACK SQUARE_TOP_RIGHT BLACK FLOWER BLACK CURLY_BORDER MAGENTA BORDER BLACK");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЩит уничтожителя §8[§e10ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+40");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Как сломать мозг врагу, уничтож его");
            if(shop == true){l.add("");l.add("§aСтоимость: §690");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 11){
            ItemStack i = stringtoShield("SILVER STRIPE_CENTER GRAY RHOMBUS_MIDDLE BLACK CROSS SILVER CIRCLE_MIDDLE LIGHT_BLUE FLOWER GRAY");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aГранитный щит §8[§e11ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+44");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Он крепче всех камней на планете");
            if(shop == true){l.add("");l.add("§aСтоимость: §699");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 12){
            ItemStack i = stringtoShield("BLUE MOJANG SILVER GRADIENT_UP LIGHT_BLUE GRADIENT BLACK TRIANGLES_BOTTOM BLACK CIRCLE_MIDDLE WHITE SQUARE_BOTTOM_LEFT BLACK");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aСияющий щит §8[§e12ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+48");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Его сияние изменит мир");
            if(shop == true){l.add("");l.add("§aСтоимость: §6108");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 13){
            ItemStack i = stringtoShield("ORANGE MOJANG SILVER GRADIENT_UP YELLOW GRADIENT RED TRIANGLES_BOTTOM BLACK CIRCLE_MIDDLE YELLOW SQUARE_BOTTOM_LEFT BLACK");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЩит солнца пустыни §8[§e13ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+52");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Восход изменит жизнь на нашей земле");
            if(shop == true){l.add("");l.add("§aСтоимость: §6117");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 14){
            ItemStack i = stringtoShield("YELLOW STRIPE_DOWNRIGHT RED SQUARE_TOP_RIGHT RED FLOWER RED CURLY_BORDER YELLOW BORDER BLACK");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЩит дракона §8[§e14ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+56");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Создан из панциря самого дракона");
            if(shop == true){l.add("");l.add("§aСтоимость: §6126");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 15){
            ItemStack i = stringtoShield("WHITE STRIPE_TOP RED RHOMBUS_MIDDLE BLACK STRIPE_MIDDLE BLACK STRIPE_TOP RED STRIPE_BOTTOM WHITE CIRCLE_MIDDLE WHITE");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЗимний щит §8[§e15ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+60");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Осторожней можно отморозить руки");
            if(shop == true){l.add("");l.add("§aСтоимость: §6135");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 16){
            ItemStack i = stringtoShield("WHITE RHOMBUS_MIDDLE BROWN CURLY_BORDER ORANGE CIRCLE_MIDDLE ORANGE TRIANGLE_TOP ORANGE TRIANGLES_TOP ORANGE");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aФокс щит §8[§e16ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+64");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Использовав данный ты становишься хитрее");
            if(shop == true){l.add("");l.add("§aСтоимость: §6144");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 17){
            ItemStack i = stringtoShield("YELLOW GRADIENT YELLOW GRADIENT_UP YELLOW CREEPER YELLOW STRIPE_SMALL YELLOW CREEPER BLACK BRICKS YELLOW");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЩит джека §8[§e17ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+68");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Джек создатель всех щитов в данном мире");
            if(shop == true){l.add("");l.add("§aСтоимость: §6153");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 18){
            ItemStack i = stringtoShield("BLACK STRIPE_MIDDLE SILVER STRIPE_CENTER SILVER STRAIGHT_CROSS WHITE GRADIENT BLACK GRADIENT_UP BLACK FLOWER BLACK");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЩит темного рыцаря §8[§e18ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+72");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Это настолько все странное, что не ясно");
            if(shop == true){l.add("");l.add("§aСтоимость: §6162");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 19){
            ItemStack i = stringtoShield("BLACK MOJANG RED BRICKS BLACK TRIANGLE_BOTTOM ORANGE RHOMBUS_MIDDLE BLACK GRADIENT_UP ORANGE TRIANGLES_BOTTOM YELLOW");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПламенный щит §8[§e19ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+76");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Достаточно горячий в наше время");
            if(shop == true){l.add("");l.add("§aСтоимость: §6171");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 20){
            ItemStack i = stringtoShield("BLUE STRIPE_MIDDLE RED CIRCLE_MIDDLE BLACK FLOWER YELLOW CROSS YELLOW STRIPE_BOTTOM BLUE CURLY_BORDER BLUE");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЩит пикачу §8[§e20ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+80");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Он заряжен энергетикой покемонов");
            if(shop == true){l.add("");l.add("§aСтоимость: §6180");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 21){
            ItemStack i = stringtoShield("RED MOJANG RED BRICKS BLACK TRIANGLE_BOTTOM LIGHT_BLUE RHOMBUS_MIDDLE BLUE GRADIENT_UP LIGHT_BLUE TRIANGLES_BOTTOM YELLOW");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aСинее пламя §8[§e21ур§8]");
            im.addEnchant(Enchantment.DURABILITY, 1, true);
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+82");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Кусок дерева, выдранный из 100 летнего дуба");
            if(shop == true){l.add("");l.add("§aСтоимость: §6190");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 22){
            ItemStack i = stringtoShield("YELLOW STRIPE_DOWNRIGHT GREEN SQUARE_TOP_RIGHT GREEN FLOWER GREEN CURLY_BORDER YELLOW BORDER BLACK");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aМагические зеленый дракон §8[§e22ур§8]");
            im.addEnchant(Enchantment.DURABILITY, 1, true);
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+85");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Выкован из дерева на который упал метеорит");
            if(shop == true){l.add("");l.add("§aСтоимость: §6200");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 23){
            ItemStack i = stringtoShield("BLACK GRADIENT BLACK GRADIENT_UP BLACK CREEPER BLACK STRIPE_SMALL BLACK CREEPER RED BRICKS BLACK");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЩит черный кристал §8[§e23ур§8]");
            im.addEnchant(Enchantment.DURABILITY, 1, true);
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+88");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Как и предыдущий, непонятно из чего он вообще?");
            if(shop == true){l.add("");l.add("§aСтоимость: §6230");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 24){
            ItemStack i = stringtoShield("WHITE STRIPE_MIDDLE RED CIRCLE_MIDDLE BLACK FLOWER YELLOW CROSS YELLOW STRIPE_BOTTOM WHITE CURLY_BORDER WHITE");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЩит посейдона §8[§e24ур§8]");
            im.addEnchant(Enchantment.DURABILITY, 1, true);
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+90");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Владелец данного щита может повелевать морем");
            if(shop == true){l.add("");l.add("§aСтоимость: §6250");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 25){
            ItemStack i = stringtoShield("GREEN BRICKS BLACK GRADIENT BLACK GRADIENT_UP BLACK CREEPER RED BORDER BLACK");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aЩит адский крипер §8[§e25ур§8]");
            im.addEnchant(Enchantment.DURABILITY, 1, true);
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+93");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Согласно легенде, что легенде и гласит");
            if(shop == true){l.add("");l.add("§aСтоимость: §6280");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }
        return null;
    }
    
     public static ItemStack stringtoShield(String line) {
        String[] s = line.split(" ");
        ItemStack shield = new ItemStack(Material.SHIELD, 1);
        BlockStateMeta bmeta = (BlockStateMeta)shield.getItemMeta();
        Banner banner = (Banner)bmeta.getBlockState();
        banner.setBaseColor(DyeColor.valueOf((String)s[0]));
        banner.update();
        int i = 1;
        while (i < s.length - 1) {
            banner.addPattern(new Pattern(DyeColor.valueOf((String)s[i + 1]), PatternType.valueOf((String)s[i])));
            banner.update();
            i += 2;
        }
        bmeta.setBlockState((BlockState)banner);
        shield.setItemMeta((ItemMeta)bmeta);
        return shield;
    }

    public String shieldtoString(ItemStack item) {
        BlockStateMeta bmeta = (BlockStateMeta)item.getItemMeta();
        Banner banner = (Banner)bmeta.getBlockState();
        String s = banner.getBaseColor().toString();
        int i = 0;
        while (i < banner.numberOfPatterns()) {
            s = String.valueOf(s) + " " + banner.getPattern(i).getPattern().toString();
            s = String.valueOf(s) + " " + banner.getPattern(i).getColor().toString();
            ++i;
        }
        return s;
    }
    
    
   public static ItemStack BR(Material material,String name,String lvl,Color color, String damage, String features,boolean shop,Integer prize){
            ItemStack i= new ItemStack(material);
            LeatherArmorMeta im = (LeatherArmorMeta)i.getItemMeta();
            im.setColor(color);
            im.setDisplayName("§a"+name+" §8[§e"+lvl+"ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+"+damage+"");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- "+features);
            if(shop == true){l.add("");l.add("§aСтоимость: §6"+prize);}
            im.setLore(l);
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            i.setItemMeta(im);
        return i;
   }
   public static ItemStack BR21(Material material,String name,String lvl,Color color, String damage, String features,boolean shop,Integer prize){
            ItemStack i= new ItemStack(material);
            LeatherArmorMeta im = (LeatherArmorMeta)i.getItemMeta();
            im.setColor(color);
            im.setDisplayName("§a"+name+" §8[§e"+lvl+"ур§8]");
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+"+damage+"");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- "+features);
            if(shop == true){l.add("");l.add("§aСтоимость: §6"+prize);}
            im.setLore(l);
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            i.setItemMeta(im);
        return i;
   }
   public static ItemStack BR2(Material material,String name,String lvl, String damage, String features,boolean shop,Integer prize){
            ItemStack i= new ItemStack(material);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§a"+name+" §8[§e"+lvl+"ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+"+damage+"");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- "+features);
            if(shop == true){l.add("");l.add("§aСтоимость: §6"+prize);}
            im.setLore(l);
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            i.setItemMeta(im);
        return i;
   }
   
    public static ItemStack SIChestPlate(int lvl,boolean shop){
        if(lvl == 1){
            ItemStack i = BR(Material.LEATHER_CHESTPLATE,"Нагрудник лесника", "1", Color.GREEN, "1", "Способствует защите от животных", shop, 1);
           return i;
        }else if(lvl == 2){
            ItemStack i = BR(Material.LEATHER_CHESTPLATE,"Накидка фермера", "2", Color.YELLOW, "2", "Накидка защитит от непогоды", shop, 2);
           return i;
        }else if(lvl == 3){
            ItemStack i = BR(Material.LEATHER_CHESTPLATE,"Броня шахтера", "3", Color.BLACK, "3", "Защитит от завала камнями", shop, 3);
           return i;
        }else if(lvl == 4){
            ItemStack i = BR(Material.LEATHER_CHESTPLATE,"Плащ мага", "4", Color.PURPLE, "4", "Плащ даст тебе сил", shop, 4);
           return i;
        }else if(lvl == 5){
            ItemStack i = BR(Material.LEATHER_CHESTPLATE,"Накидка аквонафта", "5", Color.AQUA, "5", "Ведь под водой не получится дышать", shop, 5);
           return i;
        }else if(lvl == 6){
            ItemStack i = BR(Material.LEATHER_CHESTPLATE,"Болотная накидка", "6", Color.GREEN, "6", "Какая то лягушка, была очень интересной", shop, 6);
           return i;
        }else if(lvl == 7){
            ItemStack i = BR(Material.LEATHER_CHESTPLATE,"Пустынная накидка", "7", Color.YELLOW, "8", "В пустыне очень жарко", shop, 7);
           return i;
        }else if(lvl == 8){
            ItemStack i = BR(Material.LEATHER_CHESTPLATE,"Сумеречный нагрудник", "8", Color.WHITE, "9", "Всегда светло, когда темно", shop, 8);
           return i;
        }else if(lvl == 9){
            ItemStack i = BR(Material.LEATHER_CHESTPLATE,"Охотничья накидка", "9", Color.LIME, "10", "Все звери курят в сторонке", shop, 9);
           return i;
        }else if(lvl == 10){
            ItemStack i = BR(Material.LEATHER_CHESTPLATE,"Пиратская накидка", "10", Color.GRAY, "13", "Одноногий Джо просит свою ногу", shop, 10);
           return i;
        }else if(lvl == 11){
            ItemStack i = BR(Material.LEATHER_CHESTPLATE,"Зимняя накидка", "11", Color.BLUE, "16", "Все говорят что холодно, а мне тепло", shop, 11);
           return i;
        }else if(lvl == 12){
            ItemStack i = BR2(Material.IRON_CHESTPLATE,"Нагрудник забвения", "12", "17", "Вы на время становитесь невидимы", shop, 12);
           return i;
        }else if(lvl == 13){
            ItemStack i = BR(Material.LEATHER_CHESTPLATE,"Древесная накидка", "13", Color.MAROON, "10", "Сделано из чистого дерева", shop, 13);
           return i;
        }else if(lvl == 14){
            ItemStack i = BR(Material.LEATHER_CHESTPLATE,"Гоблинский грудак", "14", Color.ORANGE, "12", "Мерзковато изчасти жести", shop, 14);
           return i;
        }else if(lvl == 15){
            ItemStack i = BR(Material.LEATHER_CHESTPLATE,"Пустотная накидка", "15", Color.AQUA, "22", "Что тут вообще происходит:?", shop, 14);
           return i;
        }else if(lvl == 16){
            ItemStack i = BR(Material.LEATHER_CHESTPLATE,"Адский путник", "16", Color.RED, "13", "Оочень жгучий плащ мертвеца", shop, 16);
           return i;
        }else if(lvl == 17){
            ItemStack i = BR(Material.LEATHER_CHESTPLATE,"Эльфийская накидка", "17", Color.OLIVE, "18", "Вы становитесь очень меткие", shop, 17);
           return i;
        }else if(lvl == 18){
            ItemStack i = BR(Material.LEATHER_CHESTPLATE,"Ледяной нагрудник", "18", Color.AQUA, "23", "Ваше сердце замерзло", shop, 18);
           return i;
        }else if(lvl == 19){
            ItemStack i = BR(Material.LEATHER_CHESTPLATE,"Мистическая накидка", "19", Color.ORANGE, "20", "Вы только посмотрите как она сияет", shop, 19);
           return i;
        }else if(lvl == 20){
            ItemStack i = BR2(Material.GOLD_CHESTPLATE,"Священный нагрудник", "20", "25", "Божественная сила вселилась в вас", shop, 20);
           return i;
        }
        return null;
    }
    
    public static ItemStack SIPonoji(int lvl,boolean shop){
        if(lvl == 1){
            ItemStack i = BR(Material.LEATHER_LEGGINGS,"Поножи лесника", "1", Color.GREEN, "1", "В них очень удобно бегать", shop, 1);
           return i;
        }else if(lvl == 2){
            ItemStack i = BR(Material.LEATHER_LEGGINGS,"Поножи фермера", "2", Color.YELLOW, "2", "Шорты работают как нужно", shop, 2);
           return i;
        }else if(lvl == 3){
            ItemStack i = BR(Material.LEATHER_LEGGINGS,"Поножи шахтера", "3", Color.BLACK, "3", "Свет слепит в глаза", shop, 3);
           return i;
        }else if(lvl == 4){
            ItemStack i = BR(Material.LEATHER_LEGGINGS,"Поножи мага", "4", Color.PURPLE, "3", "Магические поножи жизни", shop, 4);
           return i;
        }else if(lvl == 5){
            ItemStack i = BR(Material.LEATHER_LEGGINGS,"Поножи аквонафта", "5", Color.AQUA, "4", "Обтякающие штанцы русалки", shop, 5);
           return i;
        }else if(lvl == 6){
            ItemStack i = BR(Material.LEATHER_LEGGINGS,"Болотные поножи", "6", Color.GREEN, "5", "Сделано из водорослей морей", shop, 6);
           return i;
        }else if(lvl == 7){
            ItemStack i = BR(Material.LEATHER_LEGGINGS,"Пустынные поножи", "7", Color.YELLOW, "6", "Желтый песок, был совсем не высок", shop, 7);
           return i;
        }else if(lvl == 8){
            ItemStack i = BR(Material.LEATHER_LEGGINGS,"Сумеречные поножи", "8", Color.WHITE, "7", "В сумерках ночи, сияет звезда", shop, 8);
           return i;
        }else if(lvl == 9){
            ItemStack i = BR(Material.LEATHER_LEGGINGS,"Охотничьи ласины", "9", Color.LIME, "8", "Для безшумного рассекания воздуха", shop, 9);
           return i;
        }else if(lvl == 10){
            ItemStack i = BR(Material.LEATHER_LEGGINGS,"Пиратские поножи", "10", Color.GRAY, "6", "Джо вернул вам одну штанину", shop, 10);
           return i;
        }else if(lvl == 11){
            ItemStack i = BR(Material.LEATHER_LEGGINGS,"Зимнии поножи", "11", Color.BLUE, "10", "Пушистые заичьи бега", shop, 11);
           return i;
        }else if(lvl == 12){
            ItemStack i = BR2(Material.IRON_LEGGINGS,"Поножи забвения", "12", "12", "Начищенно до зеркального отражения", shop, 12);
           return i;
        }else if(lvl == 13){
            ItemStack i = BR(Material.LEATHER_LEGGINGS,"Древесные поножи", "13", Color.MAROON, "8", "Было потрачено несколько древов", shop, 13);
           return i;
        }else if(lvl == 14){
            ItemStack i = BR(Material.LEATHER_LEGGINGS,"Гоблинские поножи", "14", Color.ORANGE, "15", "Фу бяка какая то", shop, 14);
           return i;
        }else if(lvl == 15){
            ItemStack i = BR(Material.LEATHER_LEGGINGS,"Пустотные поножи", "15", Color.AQUA, "6", "Ищите меня где хотите и куда хотите", shop, 15);
           return i;
        }else if(lvl == 16){
            ItemStack i = BR(Material.LEATHER_LEGGINGS,"Адский попутник", "16", Color.RED, "10", "Они всегда будут гореть", shop, 16);
           return i;
        }else if(lvl == 17){
            ItemStack i = BR(Material.LEATHER_LEGGINGS,"Эльфийские поножи", "17", Color.OLIVE, "11", "Устойчивость на высоком уровне", shop, 17);
           return i;
        }else if(lvl == 18){
            ItemStack i = BR(Material.LEATHER_LEGGINGS,"Ледяные поножи", "18", Color.AQUA, "7", "Скованные движения, не должны мешать", shop, 18);
           return i;
        }else if(lvl == 19){
            ItemStack i = BR(Material.LEATHER_LEGGINGS,"Мистические поножи", "19", Color.ORANGE, "13", "Такие поножи защищат от всего", shop, 19);
           return i;
        }else if(lvl == 20){
            ItemStack i = BR2(Material.GOLD_LEGGINGS,"Священные поножи", "20", "14", "Все защищено от темных сил", shop, 20);
           return i;
        }
        return null;
    }
    
    public static ItemStack SIBoots(int lvl,boolean shop){
        if(lvl == 1){
            ItemStack i = BR(Material.LEATHER_BOOTS,"Тапки лесника", "1", Color.GREEN, "0", "Ни в чем себе не отказывай", shop, 1);
           return i;
        }else if(lvl == 2){
            ItemStack i = BR(Material.LEATHER_BOOTS,"Лапти фермера", "2", Color.YELLOW, "1", "Соломенная удобная обувь", shop, 2);
           return i;
        }else if(lvl == 3){
            ItemStack i = BR(Material.LEATHER_BOOTS,"Высокие сапоги шахтера", "3", Color.BLACK, "1", "Не один камушек не залетит", shop, 3);
           return i;
        }else if(lvl == 4){
            ItemStack i = BR(Material.LEATHER_BOOTS,"Шлепки мага", "4", Color.PURPLE, "2", "Они приносят удачу и силы", shop, 4);
           return i;
        }else if(lvl == 5){
            ItemStack i = BR(Material.LEATHER_BOOTS,"Ласты аквонафта", "5", Color.AQUA, "3", "Улучшают передвижения по воде", shop, 5);
           return i;
        }else if(lvl == 6){
            ItemStack i = BR(Material.LEATHER_BOOTS,"Болотные ботинки", "6", Color.GREEN, "4", "Не утонешь в болоте", shop, 6);
           return i;
        }else if(lvl == 7){
            ItemStack i = BR(Material.LEATHER_BOOTS,"Пустынные тапки", "7", Color.YELLOW, "5", "Накиньте чтобы не обжечь пятки", shop, 7);
           return i;
        }else if(lvl == 8){
            ItemStack i = BR(Material.LEATHER_BOOTS,"Сумеречные ботинки", "8", Color.WHITE, "4", "Их можно носить только ночью", shop, 8);
           return i;
        }else if(lvl == 9){
            ItemStack i = BR(Material.LEATHER_BOOTS,"Охотничьи сапоги", "9", Color.LIME, "5", "Это должно остаться тут", shop, 9);
           return i;
        }else if(lvl == 10){
            ItemStack i = BR(Material.LEATHER_BOOTS,"Пиратские боты", "10", Color.GRAY, "7", "Джо не удобно таскать левое на правом", shop, 10);
           return i;
        }else if(lvl == 11){
            ItemStack i = BR(Material.LEATHER_BOOTS,"Зимнии валенки", "11", Color.BLUE, "4", "Валенки очень теплые ну очень", shop, 11);
           return i;
        }else if(lvl == 12){
            ItemStack i = BR2(Material.IRON_BOOTS,"Ботинки забвения", "12", "5", "Завораживающие, что не реально оторваться", shop, 12);
           return i;
        }else if(lvl == 13){
            ItemStack i = BR(Material.LEATHER_BOOTS,"Древесные ботинки", "13", Color.MAROON, "12", "Было потрачено несколько древов", shop, 13);
           return i;
        }else if(lvl == 14){
            ItemStack i = BR(Material.LEATHER_BOOTS,"Гоблинские ботиночки", "14", Color.ORANGE, "6", "Шлеп шлеп шлеп", shop, 14);
           return i;
        }else if(lvl == 15){
            ItemStack i = BR(Material.LEATHER_BOOTS,"Пустотные тапочки", "15", Color.AQUA, "8", "Внимание, опасность исчезновения", shop, 15);
           return i;
        }else if(lvl == 16){
            ItemStack i = BR(Material.LEATHER_BOOTS,"Адский бутник", "16", Color.RED, "15", "Беги беги беги пока живой", shop, 16);
           return i;
        }else if(lvl == 17){
            ItemStack i = BR(Material.LEATHER_BOOTS,"Эльфийские ботинки", "17", Color.OLIVE, "12", "Говорят в них можно бегать по воздуху", shop, 17);
           return i;
        }else if(lvl == 18){
            ItemStack i = BR(Material.LEATHER_BOOTS,"Ледяные ботинки", "18", Color.AQUA, "13", "Эти ботинки очень мерзлые", shop, 18);
           return i;
        }else if(lvl == 19){
            ItemStack i = BR(Material.LEATHER_BOOTS,"Мистические ботинки", "19", Color.ORANGE, "12", "Они придают сиду воли ", shop, 19);
           return i;
        }else if(lvl == 20){
            ItemStack i = BR2(Material.GOLD_BOOTS,"Священные ботинки", "20", "15", "Будьте осторожны при их использовании", shop, 20);
           return i;
        }
        return null;
    }
    public static ItemStack SIget(int lvl,boolean shop){
        if(lvl == 1){
            ItemStack i= new ItemStack(Material.BOOK,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПалка §8[§e1ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-2");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Этой палкой можно отбиваться");
            if(shop == true){l.add("");l.add("§aСтоимость: §610");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 2){
            ItemStack i= new ItemStack(Material.BOOK,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aКосточка §8[§e2ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-4");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Останки живого скелета");
            if(shop == true){l.add("");l.add("§aСтоимость: §620");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }
        return null;
    }
    
    public static ItemStack SIUPGRADE(int num){
        if(num == 1){
            ItemStack i= new ItemStack(Material.BARRIER,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§cОтменить");
            i.setItemMeta(im); 
           return i;
        }else if(num == 2){
            ItemStack i= new ItemStack(Material.EMERALD,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПодтвердить");
            i.setItemMeta(im); 
           return i;
        }
        else if(num == 3){
            ItemStack i= new ItemStack(262,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aСледующая страница");
            i.setItemMeta(im); 
           return i;
        }
        return null;
    }
    public static ItemStack SIBOOK(int num,boolean shop){
        if(num == 1){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§cПрокачка для оружия");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает урон на: §c-2");
            l.add("§7Прокачка: §6I");
            l.add("§9Шанс разрушения: §e0%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            if(shop == true){l.add("");l.add("§aСтоимость: §610");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(num == 2){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§cПрокачка для оружия");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает урон на: §c-4");
            l.add("§7Прокачка: §6II");
            l.add("§9Шанс разрушения: §e10%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            if(shop == true){l.add("");l.add("§aСтоимость: §620");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }else if(num == 3){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§cПрокачка для оружия");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает урон на: §c-8");
            l.add("§7Прокачка: §6III");
            l.add("§9Шанс разрушения: §e20%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            if(shop == true){l.add("");l.add("§aСтоимость: §630");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }else if(num == 4){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§cПрокачка для оружия");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает урон на: §c-9");
            l.add("§7Прокачка: §6IV");
            l.add("§9Шанс разрушения: §e30%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            if(shop == true){l.add("");l.add("§aСтоимость: §640");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }else if(num == 5){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§cПрокачка для оружия");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает урон на: §c-11");
            l.add("§7Прокачка: §6V");
            l.add("§9Шанс разрушения: §e40%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            if(shop == true){l.add("");l.add("§aСтоимость: §650");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }else if(num == 6){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§cПрокачка для оружия");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает урон на: §c-14");
            l.add("§7Прокачка: §6VI");
            l.add("§9Шанс разрушения: §e50%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            if(shop == true){l.add("");l.add("§aСтоимость: §660");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }else if(num == 7){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§cПрокачка для оружия");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает урон на: §c-17");
            l.add("§7Прокачка: §6VII");
            l.add("§9Шанс разрушения: §e60%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            if(shop == true){l.add("");l.add("§aСтоимость: §670");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }else if(num == 8){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§cПрокачка для оружия");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает урон на: §c-19");
            l.add("§7Прокачка: §6VIII");
            l.add("§9Шанс разрушения: §e70%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            if(shop == true){l.add("");l.add("§aСтоимость: §680");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }else if(num == 9){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§cПрокачка для оружия");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает урон на: §c-22");
            l.add("§7Прокачка: §6IX");
            l.add("§9Шанс разрушения: §e80%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            if(shop == true){l.add("");l.add("§aСтоимость: §690");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
            return i;
        }else if(num == 10){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§cПрокачка для оружия");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает урон на: §c-25");
            l.add("§7Прокачка: §6X");
            l.add("§9Шанс разрушения: §e90%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            if(shop == true){l.add("");l.add("§aСтоимость: §6100");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }
        return null;
        }
    public static ItemStack SIBOOKHP(int num,boolean shop){
        if(num == 1){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПрокачка для брони");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает жизни на: §a+3");
            l.add("§7Прокачка: §6I");
            l.add("§9Шанс разрушения: §e0%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            if(shop == true){l.add("");l.add("§aСтоимость: §610");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(num == 2){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПрокачка для брони");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает жизни на: §a+11");
            l.add("§7Прокачка: §6II");
            l.add("§9Шанс разрушения: §e10%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            if(shop == true){l.add("");l.add("§aСтоимость: §620");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }else if(num == 3){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПрокачка для брони");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает жизни на: §a+18");
            l.add("§7Прокачка: §6III");
            l.add("§9Шанс разрушения: §e20%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            if(shop == true){l.add("");l.add("§aСтоимость: §630");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }else if(num == 4){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПрокачка для брони");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает жизни на: §a+21");
            l.add("§7Прокачка: §6IV");
            l.add("§9Шанс разрушения: §e30%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            if(shop == true){l.add("");l.add("§aСтоимость: §640");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }else if(num == 5){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПрокачка для брони");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает жизни на: §a+29");
            l.add("§7Прокачка: §6V");
            l.add("§9Шанс разрушения: §e40%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            if(shop == true){l.add("");l.add("§aСтоимость: §650");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }else if(num == 6){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПрокачка для брони");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает жизни на: §a+34");
            l.add("§7Прокачка: §6VI");
            l.add("§9Шанс разрушения: §e50%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            if(shop == true){l.add("");l.add("§aСтоимость: §660");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }else if(num == 7){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПрокачка для брони");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает жизни на: §a+37");
            l.add("§7Прокачка: §6VII");
            l.add("§9Шанс разрушения: §e60%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            if(shop == true){l.add("");l.add("§aСтоимость: §670");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }else if(num == 8){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПрокачка для брони");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает жизни на: §a+44");
            l.add("§7Прокачка: §6VIII");
            l.add("§9Шанс разрушения: §e70%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            if(shop == true){l.add("");l.add("§aСтоимость: §680");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }else if(num == 9){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПрокачка для брони");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает жизни на: §a+46");
            l.add("§7Прокачка: §6IX");
            l.add("§9Шанс разрушения: §e80%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            if(shop == true){l.add("");l.add("§aСтоимость: §690");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
            return i;
        }else if(num == 10){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПрокачка для брони");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает жизни на: §a+50");
            l.add("§7Прокачка: §6X");
            l.add("§9Шанс разрушения: §e90%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            if(shop == true){l.add("");l.add("§aСтоимость: §6100");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }
        return null;
        }
    
    public static ItemStack SIQUESTS(int num,Player p){
        
       int lgetmob = Levels.getPrizeMob(p.getName());
       int lgetboss = Levels.getPrizeBoss(p.getName());
       int lgetdun = Levels.getPrizeDung(p.getName());
       int lgetbossget = getboss[lgetboss];
       int lgetmobget = getmob[lgetmob];
       int lgetdunget = getdun[lgetdun];
       if(num == 0){
            ItemStack i= new ItemStack(Material.BOOK,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aСтатистика игрока");
            List l = new ArrayList();
            l.add("");
            l.add("§7Убито мобов: §e"+Levels.getMobs(p.getName()));
            l.add("§7Убито БОССОВ: §c"+Levels.getBoss(p.getName()));
            l.add("§7Убито БОССОВ в Данжах: §c"+Levels.getDung(p.getName()));
            l.add("§7Разрушено сундуков: §a0");
            l.add("");
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(num == 1){
            ItemStack i= new ItemStack(Material.EXP_BOTTLE,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aКвест §e#"+lgetmob);
            List l = new ArrayList();
            l.add("");
            l.add("§7Цель:");
            l.add("§7- Убить §с"+lgetmobget+" §7мобов");
            l.add("§7Достижение:");
            l.add("§7- Убито: §c"+Levels.getMobs(p.getName())+"§7/§c"+lgetmobget);
            l.add("§7Награда:");
            l.add("§f- §a"+(lgetmob+20)+" §7(Монет)");
            l.add("§f- §a"+(lgetmob*50)+" §7(Опыта)");
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
           
        }else if(num == 2){
            ItemStack i= new ItemStack(Material.EXP_BOTTLE,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aКвест §e#"+lgetboss);
            List l = new ArrayList();
            l.add("");
            l.add("§7Цель:");
            l.add("§7- Убить §с"+lgetbossget+" §7боссов");
            l.add("§7Достижение:");
            l.add("§7- Убито: §c"+Levels.getBoss(p.getName())+"§7/§c"+lgetbossget);
            l.add("§7Награда:");
            l.add("§f- §a"+(lgetboss+30)+" §7(Монет)");
            l.add("§f- §a"+(lgetboss*60)+" §7(Опыта)");
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(num == 3){
            ItemStack i= new ItemStack(Material.EXP_BOTTLE,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aКвест §e#"+lgetdun);
            List l = new ArrayList();
            l.add("");
            l.add("§7Цель:");
            l.add("§7- Убить §с"+lgetdunget+" §7боссов в данже ");
            l.add("§7Достижение:");
            l.add("§7- Убито: §c"+Levels.getDung(p.getName())+"§7/§c"+lgetdunget);
            l.add("§7Награда:");
            l.add("§f- §a"+(lgetdun+50)+" §7(Монет)");
            l.add("§f- §a"+(lgetdun*100)+" §7(Опыта)");
            l.add("§f- §b1 §7(Ключ)");
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }
        return null;
    }
    
    
    public static ItemStack SIPREMIUM(int num,Player p, boolean shop){
       if(num == 0){
            ItemStack i= new ItemStack(Material.DIAMOND_CHESTPLATE);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bНагрудник Кримсона");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+65 §6(+50)");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §6X");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Выкован из полярной звезды");
            if(shop == true){l.add("");l.add("§aСтоимость: §620 коинов");}
            im.setLore(l);
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            i.setItemMeta(im);
           return i;
        }else if(num == 1){
            ItemStack i= new ItemStack(Material.DIAMOND_LEGGINGS);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bПоножи Кримсона");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+45 §6(+50)");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §6X");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Были найдены в межпространстве");
            if(shop == true){l.add("");l.add("§aСтоимость: §615 коинов");}
            im.setLore(l);
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            i.setItemMeta(im);
           return i;
        }else if(num == 2){
            ItemStack i= new ItemStack(Material.DIAMOND_BOOTS);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bБотинки Кримсона");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+37 §6(+50)");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §6X");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Сотканы и покрыты крошкой млечного пути");
            if(shop == true){l.add("");l.add("§aСтоимость: §69 коинов");}
            im.setLore(l);
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            i.setItemMeta(im);
           return i;
        }else if(num == 3){
            ItemStack i= new ItemStack(Material.DIAMOND_SWORD);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bМеч Кримсона");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-77 §6(-25)");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §6X");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Выкован из камня бесконечности");
            if(shop == true){l.add("");l.add("§aСтоимость: §617 коинов");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 4){
            ItemStack i= new ItemStack(Material.DIAMOND_AXE);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bМьёльнир");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-75 §6(-25)");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §6X");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Передан из рук самого Тора");
            if(shop == true){l.add("");l.add("§aСтоимость: §617 коинов");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 5){
            ItemStack i = stringtoShield("YELLOW STRIPE_CENTER LIGHT_BLUE FLOWER BLUE HALF_HORIZONTAL YELLOW TRIANGLE_TOP BLUE STRIPE_TOP YELLOW GRADIENT WHITE");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bЩит Кэпа");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+125 §6(+50)");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §6X");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Ну вы уже догадались на сколько он крут?");
            if(shop == true){l.add("");l.add("§aСтоимость: §617 коинов");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(num == 6){
            ItemStack i= new ItemStack(Material.EXP_BOTTLE);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§e+500.000 опыта");
            List l = new ArrayList();
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Быстрое начисление опыта на ваш аккаунт");
            if(shop == true){l.add("");l.add("§aСтоимость: §65 коинов");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 7){
            ItemStack i= new ItemStack(Material.EXP_BOTTLE);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§e+1.000.000 опыта");
            List l = new ArrayList();
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Быстрое начисление опыта на ваш аккаунт");
            if(shop == true){l.add("");l.add("§aСтоимость: §69 коинов");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 8){
            ItemStack i= new ItemStack(437);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§b+1.000 опыта гильдии");
            List l = new ArrayList();
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Быстрое начисление опыта в гильдию");
            l.add("  §7в которой вы состоите, если вы покините гильдию");
            l.add("  §7опыт останется там, с вами не переносится.");
            if(shop == true){l.add("");l.add("§aСтоимость: §610 коинов");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 9){
            ItemStack i= new ItemStack(437);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§b+5.000 опыта гильдии");
            List l = new ArrayList();
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Быстрое начисление опыта в гильдию");
            l.add("  §7в которой вы состоите, если вы покините гильдию");
            l.add("  §7опыт останется там, с вами не переносится.");
            if(shop == true){l.add("");l.add("§aСтоимость: §619 коинов");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 10){
            ItemStack i= new ItemStack(Material.GOLD_NUGGET);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§b+10.000 монета");
            List l = new ArrayList();
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Быстрое начисление монет на ваш аккаунт");
            if(shop == true){l.add("");l.add("§aСтоимость: §69 коинов");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 11){
            ItemStack i= new ItemStack(Material.GOLD_INGOT);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§b+50.000 монет");
            List l = new ArrayList();
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Быстрое начисление монет на ваш аккаунт");
            if(shop == true){l.add("");l.add("§aСтоимость: §619 коинов");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 12){
            ItemStack i= new ItemStack(Material.GOLD_BLOCK);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§b+100.000 монета");
            List l = new ArrayList();
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Быстрое начисление монет на ваш аккаунт");
            if(shop == true){l.add("");l.add("§aСтоимость: §629 коинов");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 13){
            /*Бустер*/
            ItemStack i= new ItemStack(Material.COOKIE);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§eГлобальный ускоритель опыта §6х2");
            List l = new ArrayList();
            l.add("");
            l.add("§7Свойство: §6x2");
            l.add("§7Время действия: §a60 минут");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Активировав данную опцию, весь сервер будет получать");
            l.add("§7- в 2 раза больше опыта на протяжении 1го часа!");
            if(shop == true){l.add("");l.add("§aСтоимость: §65 коина");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 14){
            /*Мега босс*/
            ItemStack i= new ItemStack(Material.DRAGON_EGG);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§eПризыв босса: §aИмперский разрушитель");
            List l = new ArrayList();
            l.add("");
            l.add("§7Сложность: §eНормально");
            l.add("");
            l.add("§7Награда: §aРедкие вещи, ресурсы деревни");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Происходит появление босса на территории спавна");
            l.add("§7- сражение и убийство сопровождается большим количеством");
            l.add("§7- враждебных существ.");
            if(shop == true){l.add("");l.add("§aСтоимость: §61 коин");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(num == 15){
            ItemStack i= new ItemStack(Material.DIAMOND_SWORD);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bМеч Короля Артура");
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-90");
            l.add("§7Свойства: §8нет");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Меч который можно как улучшить, так и сломать");
            if(shop == true){l.add("");l.add("§aСтоимость: §617 коинов");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 16){
            boolean slink = Levels.getRLink(p.getName());
            ItemStack i= new ItemStack(Material.ENDER_CHEST);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bCБОРКА СЕРВЕРА");
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            List l = new ArrayList();
            l.add("");
            if(slink==true){l.add("§7Скачать: §6"+Levels.slink);}else{l.add("§7Скачать: §cСсылка появится после покупки");}
            l.add("");
            l.add("§7Что вы получаете:");
            l.add("§7- Архив, залитый на Яндекс Диск.");
            l.add("§7- В архиве чистая последняя версия сборки");
            l.add("§7- на которой вы в данный момент играете.");
            if(shop == true){l.add("");l.add("§aСтоимость: §62000 коинов");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 17){
            boolean rlink = Levels.getRLink(p.getName());
            ItemStack i= new ItemStack(Material.CHEST);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bИСХОДНИКИ ПЛАГИНОВ СЕРВЕРА");
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            List l = new ArrayList();
            l.add("");
            if(rlink==true){l.add("§7Скачать: §6"+Levels.rlink);}else{l.add("§7Скачать: §cСсылка появится после покупки");}
            l.add("");
            l.add("§7Что вы получаете:");
            l.add("§7- Архив, залитый на Яндекс Диск.");
            l.add("§7- В архиве исходники всех плагинов сервера");
            l.add("§7- последней версии, а так же текствый фаил описания.");
            if(shop == true){l.add("");l.add("§aСтоимость: §62000 коинов");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(num == 20){
            ItemStack i= new ItemStack(Material.DRAGON_EGG);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§eПризыв босса: §aКороль скелет - Аларон");
            List l = new ArrayList();
            l.add("");
            l.add("§7Сложность: §cСложно");
            l.add("");
            l.add("§7Награда: §aРедкие вещи, ресурсы деревни, большое количество опыта");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Происходит появление босса на территории спавна");
            l.add("§7- сражение и убийство сопровождается большим количеством");
            l.add("§7- враждебных существ.");
            if(shop == true){l.add("");l.add("§aСтоимость: §61 коин");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(num == 21){
            ItemStack i= new ItemStack(Material.DRAGON_EGG);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§eПризыв босса: §aУтер Святой ");
            List l = new ArrayList();
            l.add("");
            l.add("§7Сложность: §aЛегко");
            l.add("");
            l.add("§7Награда: §aРедкие вещи");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Происходит появление босса на территории спавна");
            l.add("§7- сражение и убийство сопровождается большим количеством");
            l.add("§7- враждебных существ.");
            if(shop == true){l.add("");l.add("§aСтоимость: §61 коин");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(num == 22){
            ItemStack i= new ItemStack(Material.DRAGON_EGG);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§eПризыв босса: §aДревний дракон - Нефам ");
            List l = new ArrayList();
            l.add("");
            l.add("§7Сложность: §4Экстремально");
            l.add("");
            l.add("§7Награда: §aРедкие вещи, ресурсы деревни, огромное количество опыта");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Происходит появление босса на территории спавна");
            l.add("§7- сражение и убийство сопровождается большим количеством");
            l.add("§7- враждебных существ.");
            if(shop == true){l.add("");l.add("§aСтоимость: §62 коин");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(num == 23){
            ItemStack i= new ItemStack(Material.DRAGON_EGG);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§eПризыв босса: §aНекромант - Зул ");
            List l = new ArrayList();
            l.add("");
            l.add("§7Сложность: §eНормально");
            l.add("");
            l.add("§7Награда: §aРедкие вещи, ресурсы деревни");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Происходит появление босса на территории спавна");
            l.add("§7- сражение и убийство сопровождается большим количеством");
            l.add("§7- враждебных существ.");
            if(shop == true){l.add("");l.add("§aСтоимость: §61 коин");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(num == 24){
            ItemStack i= new ItemStack(Material.DRAGON_EGG);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§eПризыв босса: §aАрхангел - Тэмуэрбиель ");
            List l = new ArrayList();
            l.add("");
            l.add("§7Сложность: §cСложно");
            l.add("");
            l.add("§7Награда: §aРедкие вещи, ресурсы деревни, большое количество опыта");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Происходит появление босса на территории спавна");
            l.add("§7- сражение и убийство сопровождается большим количеством");
            l.add("§7- враждебных существ.");
            if(shop == true){l.add("");l.add("§aСтоимость: §61 коин");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(num == 25){
            ItemStack i= new ItemStack(Material.DRAGON_EGG);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§eПризыв босса: §aЯгай");
            List l = new ArrayList();
            l.add("");
            l.add("§7Сложность: §aЛегко");
            l.add("");
            l.add("§7Награда: §aРедкие вещи");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Происходит появление босса на территории спавна");
            l.add("§7- сражение и убийство сопровождается большим количеством");
            l.add("§7- враждебных существ.");
            if(shop == true){l.add("");l.add("§aСтоимость: §61 коин");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(num == 26){
            ItemStack i= new ItemStack(Material.DRAGON_EGG);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§eПризыв босса: §aНелтарион");
            List l = new ArrayList();
            l.add("");
            l.add("§7Сложность: §4Экстремально");
            l.add("");
            l.add("§7Награда: §aРедкие вещи, ресурсы деревни, большое количество опыта");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Происходит появление босса на территории спавна");
            l.add("§7- сражение и убийство сопровождается большим количеством");
            l.add("§7- враждебных существ.");
            if(shop == true){l.add("");l.add("§aСтоимость: §62 коин");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(num == 27){
            ItemStack i= new ItemStack(Material.DRAGON_EGG);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§eПризыв босса: §aАГРАИЛ");
            List l = new ArrayList();
            l.add("");
            l.add("§7Сложность: §0 СМЕРТЕЛЬНО");
            l.add("");
            l.add("§7Награда: §4НЕИЗВЕСТНО");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Происходит появление босса на территории спавна");
            l.add("§7- сражение и убийство сопровождается большим количеством");
            l.add("§7- враждебных существ.");
            if(shop == true){l.add("");l.add("§aСтоимость: §65 коин");}
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }
        return null;
    }
    public static ItemStack Village(int num){
        if(num == 1){
            ItemStack i= new ItemStack(Material.BARRIER,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§cРазрушить деревню");
            i.setItemMeta(im); 
           return i;
        }else if(num == 2){
            ItemStack i= new ItemStack(Material.EMERALD,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aСоздать деревню");
            i.setItemMeta(im); 
           return i;
        }
        else if(num == 3){
            ItemStack i= new ItemStack(262,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aКоманды: §e/village §aили §e/v");
            List l = new ArrayList();
            l.add("§a/v create §7- создать деревню");
            l.add("§a/v delete §a- разрушить деревню");
            l.add("§a/v home §a- переместится в деревню");
            l.add("§a/v tpa НИК §a- сделать запрос переместится к игроку");
            l.add("§a - /v tpa accept НИК §a- одобрить запрос на перемещение");
            l.add("§a - /v tpa deny НИК §a- отклонить запрос на перемещение");
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }
        else if(num == 4){
            ItemStack i= new ItemStack(Material.EMERALD,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПереместится в деревню");
            i.setItemMeta(im); 
           return i;
        }
        return null;
    }
    public static ItemStack SISPO(int slot, Player p){
        if(slot == 0){
            ItemStack i= new ItemStack(Material.ARMOR_STAND,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aСпособность #1: §cНевидимость");
            List l = new ArrayList();
            l.add("");
            l.add("§7Чтобы использовать нажмите (SHIFT) 2 раза");
            l.add("");
            l.add("§7Время действия: §a10 секунд");
            l.add("");
            if(Levels.getSpo(p.getName()).equalsIgnoreCase("inv")){l.add("§7Статус способности: §6Активен");  }else{l.add("§7Статус способности: §cНе выбран");  }
            l.add("");
            l.add("§7Описание: §eДанная способность скрывает игрока");
            l.add("§eна 10 секунд от всех сущностей.");
            l.add("§7Взымает §e3 §7единицы голода при использовании");
            l.add("");
            if(Levels.getSPOPay(p.getName(), "inv")){l.add("§aСтоимость: §6КУПЛЕНО");}else{l.add("§7§aСтоимость: §610000");}
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(slot == 1){
            ItemStack i= new ItemStack(Material.APPLE,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aСпособность #2: §cРегенерация");
            List l = new ArrayList();
            l.add("");
            l.add("§7Чтобы использовать нажмите (SHIFT) 2 раза");
            l.add("");
            l.add("§7Время действия: §a10 секунд");
            l.add("");
            if(Levels.getSpo(p.getName()).equalsIgnoreCase("reg")){l.add("§7Статус способности: §6Активен");  }else{l.add("§7Статус способности: §cНе выбран");  }
            l.add("");
            l.add("§7Описание: §eДанная способность излечивает игрока");
            l.add("§eна протяжении 10 секунд.");
            l.add("§7Взымает §e2 §7единицы голода при использовании");
            l.add("");
            if(Levels.getSPOPay(p.getName(), "reg")){l.add("§aСтоимость: §6КУПЛЕНО");}else{l.add("§7§aСтоимость: §610000");}
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(slot == 2){
            ItemStack i= new ItemStack(Material.TNT,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aСпособность #3: §cВЗРЫВ");
            List l = new ArrayList();
            l.add("");
            l.add("§7Чтобы использовать нажмите (SHIFT) 2 раза");
            l.add("");
            l.add("§7Время действия: §aМгновенно");
            l.add("");
            if(Levels.getSpo(p.getName()).equalsIgnoreCase("bomba")){l.add("§7Статус способности: §6Активен");  }else{l.add("§7Статус способности: §cНе выбран");  }
            l.add("");
            l.add("§7Описание: §eДанная способность раскидывает всех мобов");
            l.add("§eв радиусе 3х блоков от вас");
            l.add("§7Взымает §e4 §7единицы голода при использовании");
            l.add("");
            if(Levels.getSPOPay(p.getName(), "bomba")){l.add("§aСтоимость: §6КУПЛЕНО");}else{l.add("§7§aСтоимость: §610000");}
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(slot == 3){
            ItemStack i= new ItemStack(Material.ARROW,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aСпособность #4: §cРЫВОК");
            List l = new ArrayList();
            l.add("");
            l.add("§7Чтобы использовать нажмите (SHIFT) 2 раза");
            l.add("");
            l.add("§7Время действия: §aМгновенно");
            l.add("");
            if(Levels.getSpo(p.getName()).equalsIgnoreCase("rivok")){l.add("§7Статус способности: §6Активен");  }else{l.add("§7Статус способности: §cНе выбран");  }
            l.add("");
            l.add("§7Описание: §eДанная способность заставляет игрока");
            l.add("§eбыстро прыгнуть вперед.");
            l.add("§7Взымает §e2 §7единицы голода при использовании");
            l.add("");
            if(Levels.getSPOPay(p.getName(), "rivok")){l.add("§aСтоимость: §6КУПЛЕНО");}else{l.add("§7§aСтоимость: §610000");}
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(slot == 4){
            ItemStack i= new ItemStack(Material.BLAZE_ROD,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aСпособность #5: §cХИЛЛЕР");
            List l = new ArrayList();
            l.add("");
            l.add("§7Чтобы использовать нажмите (SHIFT) 2 раза");
            l.add("");
            l.add("§7Время действия: §aМгновенно");
            l.add("");
            if(Levels.getSpo(p.getName()).equalsIgnoreCase("hil")){l.add("§7Статус способности: §6Активен");  }else{l.add("§7Статус способности: §cНе выбран");  }
            l.add("");
            l.add("§7Описание: §eДанная способность излечивает игроков");
            l.add("§eв радиусе 5ти блоков.");
            l.add("§7Взымает §e5 §7единиц голода при использовании");
            l.add("");
            if(Levels.getSPOPay(p.getName(), "hil")){l.add("§aСтоимость: §6КУПЛЕНО");}else{l.add("§7§aСтоимость: §610000");}
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(slot == 10){
            ItemStack i= new ItemStack(Material.BLAZE_ROD,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§cОтключение всех способностей");
            i.setItemMeta(im);
           return i;
        }
        return null;
    }
    public static ItemStack ChestItems(int s){
        if(s == 1){
            ItemStack i= new ItemStack(Material.WOOD_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aМистический меч §8[§e10ур§8]");
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-30");
            l.add("§7Свойства: §cПоджигание");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Создано космическим сундуком...");
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im); 
           return i;
        }else if(s == 2){
            ItemStack i = stringtoShield("GREEN BRICKS BLACK GRADIENT BLACK GRADIENT_UP BLACK CREEPER RED BORDER BLACK");
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aМистический щит §8[§e10ур§8]");
            im.addEnchant(Enchantment.DURABILITY, 1, true);
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+75");
            l.add("§7Свойства: §cПоглощение");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Щит создан космическим сундуком");
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(s == 3){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПрокачка для брони");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает жизни на: §a+50");
            l.add("§7Прокачка: §6X");
            l.add("§9Шанс разрушения: §e90%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }else if(s == 4){
            ItemStack i= new ItemStack(Material.GOLD_CHESTPLATE);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aМистический нагрудник §8[§e10ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Здоровье: §a+39");
            l.add("§7Свойства: §cПоглощение");
            l.add("§7Прокачка: §9нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Выкован из полярной звезды");
            im.setLore(l);
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            i.setItemMeta(im);
           return i;
        }else if(s == 5){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§cПрокачка для оружия");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает урон на: §c-25");
            l.add("§7Прокачка: §6X");
            l.add("§9Шанс разрушения: §e90%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }else if(s == 6){
            ItemStack i= new ItemStack(403,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§cПрокачка для оружия");
            List l = new ArrayList();
            l.add("");
            l.add("§7Увеличивает урон на: §c-25");
            l.add("§7Прокачка: §6X");
            l.add("§9Шанс разрушения: §e90%");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В левую руку берем оружие, щит или броню");
            l.add("§7  в правую эту книгу и кликаем (ЛКМ) книгой по воздуху");
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }
        return null;
    }
    
    public static ItemStack SIPIT(int slot, Player p){
        if(slot == 0){
            ItemStack i= new ItemStack(Material.MONSTER_EGG,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aМагазин боевых питомцев");List l = new ArrayList();
            l.add("");
            l.add("§7- Магазин в котором собраны большое количество питомцев");
            l.add(" §7имеющие разные характеристики.");
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 1){
            if(MyPetApi.getPlugin().getPlayerManager().getMyPetPlayer(p)==null){
            ItemStack i= new ItemStack(Material.BOOK,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aИнформация о питомце:");List l = new ArrayList();
            l.add("");
            l.add("§7- На данный момент у вас нет питомца");
            l.add("§7  и информация отсуствует.");
            l.add("§7  Для того, чтобы завести питомца кликните");
            l.add("§7  <-- на §aяйцо призыва");
            im.setLore(l);i.setItemMeta(im);return i;      
            }else{
            MyPet pit = MyPetApi.getPlugin().getPlayerManager().getMyPetPlayer(p).getMyPet();
            if(pit==null){
            ItemStack i= new ItemStack(Material.BOOK,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aИнформация о питомце:");List l = new ArrayList();
            l.add("");
            l.add("§7- На данный момент у вас нет питомца");
            l.add("§7  и информация отсуствует.");
            l.add("§7  Для того, чтобы завести питомца кликните");
            l.add("§7  <-- на §aяйцо призыва");
            im.setLore(l);i.setItemMeta(im);return i;    
            }else{
            ItemStack i= new ItemStack(Material.BOOK,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aИнформация о питомце:");List l = new ArrayList();
            l.add("");
            l.add("§7Владелец питомца: §a"+pit.getOwner().getName());
            l.add("§7Вид питомца: §b"+pit.getPetType().toString());
            l.add("§7Кличка питомца: §b"+pit.getPetName());
            l.add("");
            l.add("§7Жизни: §c"+pit.getHealth()+"♥§7/§c"+pit.getMaxHealth()+"♥");
            l.add("§7Уровень голода: §a"+pit.getHungerValue());
            l.add("§7Питается: §aЯблоками");
            l.add("§7Урон: §c"+pit.getDamage());
            l.add("");
            int exp = (int)pit.getExperience().getExp();
            l.add("§7Опыт: §a"+exp+"§7/§a"+pit.getExperience().getExpByLevel(pit.getExperience().getLevel()+1));
            l.add("§7Уровень: §a"+pit.getExperience().getLevel());
            im.setLore(l);i.setItemMeta(im);return i;
            }}
        }else if(slot == 2){
            ItemStack i= new ItemStack(Material.DIAMOND_SWORD,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aВыбор професии");List l = new ArrayList();
            l.add("");
            l.add("§7- Только вы сможете решить кем будет ваш");
            l.add(" §7питомец, разбойником или мирным и ласковым няшей.");
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 3){
            ItemStack i= new ItemStack(Material.DIODE,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aВыбор поведения питомца");List l = new ArrayList();
            l.add("");
            l.add("§7- Ваши питомцы на столько послушные,");
            l.add(" §7что готовы слушать ваши команды.");
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 4){
            ItemStack i= new ItemStack(Material.PAPER,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aДополнительная информация");List l = new ArrayList();
            l.add("");
            l.add("§7- Боевые питомцы способны прокачиваться");
            l.add("§7  и повышать свои навыки боев.");
            l.add("§7  Так же давая им еду вы их исцеляете.");
            l.add("§e/petc §7- призвать питомца");
            l.add("§e/petname Имя §7- придумать новую кличку питомцу");
            l.add("§e/petstop §7- приказать питомцу прекратить атаку");
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 5){
            ItemStack i= new ItemStack(Material.MOB_SPAWNER,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§eВыбрать и призвать питомца");List l = new ArrayList();
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 6){
            ItemStack i= new ItemStack(Material.BARRIER,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§cПрогнать питомца");List l = new ArrayList();
            im.setLore(l);i.setItemMeta(im);return i;
        }
        /*Питомцы*/
        else if(slot == 7){
            ItemStack i= new ItemStack(Material.BONE,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bВолк");List l = new ArrayList();
            l.add("");
            l.add("§7Вид питомца: §bВолк");
            l.add("§7Жизней: §c5♥");
            l.add("§7Питается: §aЯблоками");
            l.add("§7Скорость передвижения: §a0.3");
            l.add("");
            l.add("§aСтоимость: §65000");
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 8){
            ItemStack i= new ItemStack(375,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bПещерный паук");List l = new ArrayList();
            l.add("");
            l.add("§7Вид питомца: §bПещерный паук");
            l.add("§7Жизней: §c10♥");
            l.add("§7Питается: §aЯблоками");
            l.add("§7Скорость передвижения: §a0.3");
            l.add("");
            l.add("§aСтоимость: §610000");
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 9){
            ItemStack i= new ItemStack(Material.COOKED_FISH,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bОцелот");List l = new ArrayList();
            l.add("");
            l.add("§7Вид питомца: §bОцелот");
            l.add("§7Жизней: §c10♥");
            l.add("§7Питается: §aЯблоками");
            l.add("§7Скорость передвижения: §a0.3");
            l.add("");
            l.add("§aСтоимость: §610000");
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 10){
            ItemStack i= new ItemStack(Material.MILK_BUCKET,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bКорова");List l = new ArrayList();
            l.add("");
            l.add("§7Вид питомца: §bКорова");
            l.add("§7Жизней: §c10♥");
            l.add("§7Питается: §aЯблоками");
            l.add("§7Скорость передвижения: §a0.3");
            l.add("");
            l.add("§aСтоимость: §610000");
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 11){
            ItemStack i= new ItemStack(Material.WOOL,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bОвечка");List l = new ArrayList();
            l.add("");
            l.add("§7Вид питомца: §bОвца");
            l.add("§7Жизней: §c10♥");
            l.add("§7Питается: §aЯблоками");
            l.add("§7Скорость передвижения: §a0.3");
            l.add("");
            l.add("§aСтоимость: §610000");
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 12){
            ItemStack i= new ItemStack(Material.MUSHROOM_SOUP,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bГрибная корова");List l = new ArrayList();
            l.add("");
            l.add("§7Вид питомца: §bГрибная корова");
            l.add("§7Жизней: §c10♥");
            l.add("§7Питается: §aЯблоками");
            l.add("§7Скорость передвижения: §a0.3");
            l.add("");
            l.add("§aСтоимость: §610000");
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 13){
            ItemStack i= new ItemStack(Material.SLIME_BALL,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bСлизняк");List l = new ArrayList();
            l.add("");
            l.add("§7Вид питомца: §bСлизь");
            l.add("§7Жизней: §c20♥");
            l.add("§7Питается: §aЯблоками");
            l.add("§7Скорость передвижения: §a0.3");
            l.add("");
            l.add("§aСтоимость: §620000");
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 14){
            ItemStack i= new ItemStack(Material.MAGMA_CREAM,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bМагмовый куб");List l = new ArrayList();
            l.add("");
            l.add("§7Вид питомца: §bМагмовый куб");
            l.add("§7Жизней: §c20♥");
            l.add("§7Питается: §aЯблоками");
            l.add("§7Скорость передвижения: §a0.3");
            l.add("");
            l.add("§aСтоимость: §620000");
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 15){
            ItemStack i= new ItemStack(Material.ENDER_PEARL,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bЭндермит");List l = new ArrayList();
            l.add("");
            l.add("§7Вид питомца: §bЭндермит");
            l.add("§7Жизней: §c20♥");
            l.add("§7Питается: §aЯблоками");
            l.add("§7Скорость передвижения: §a0.3");
            l.add("");
            l.add("§aСтоимость: §620000");
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 16){
            ItemStack i= new ItemStack(Material.SADDLE,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bЛошадка");List l = new ArrayList();
            l.add("");
            l.add("§7Вид питомца: §bЛошадь");
            l.add("§7Жизней: §c20♥");
            l.add("§7Питается: §aЯблоками");
            l.add("§7Скорость передвижения: §a0.3");
            l.add("");
            l.add("§aСтоимость: §620000");
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 17){
            ItemStack i= new ItemStack(Material.BEETROOT_SEEDS,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bПопугайчик");List l = new ArrayList();
            l.add("");
            l.add("§7Вид питомца: §bПопугай");
            l.add("§7Жизней: §c20♥");
            l.add("§7Питается: §aЯблоками");
            l.add("§7Скорость передвижения: §a0.3");
            l.add("");
            l.add("§aСтоимость: §620000");
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 18){
            ItemStack i= new ItemStack(Material.EGG,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bЦыпленок");List l = new ArrayList();
            l.add("");
            l.add("§7Вид питомца: §bКурица");
            l.add("§7Жизней: §c20♥");
            l.add("§7Питается: §aЯблоками");
            l.add("§7Скорость передвижения: §a0.3");
            l.add("");
            l.add("§aСтоимость: §620000");
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 19){
            ItemStack i= new ItemStack(Material.GOLD_SWORD,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bЗомби-свинка");List l = new ArrayList();
            l.add("");
            l.add("§7Вид питомца: §bСвинозомби");
            l.add("§7Жизней: §c20♥");
            l.add("§7Питается: §aЯблоками");
            l.add("§7Скорость передвижения: §a0.3");
            l.add("");
            l.add("§aСтоимость: §620000");
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 20){
            ItemStack i= new ItemStack(Material.RABBIT_STEW,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bКролик");List l = new ArrayList();
            l.add("");
            l.add("§7Вид питомца: §bКролик");
            l.add("§7Жизней: §c20♥");
            l.add("§7Питается: §aЯблоками");
            l.add("§7Скорость передвижения: §a0.3");
            l.add("");
            l.add("§aСтоимость: §620000");
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 21){
            ItemStack i= new ItemStack(Material.COAL,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bЛетучая мышь §5[PREMIUM]");List l = new ArrayList();
            l.add("");
            l.add("§7Вид питомца: §bЛетучая мышь");
            l.add("§7Жизней: §c30♥");
            l.add("§7Питается: §aЯблоками");
            l.add("§7Скорость передвижения: §a0.3");
            l.add("");
            l.add("§aСтоимость: §610 коинов");
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 22){
            ItemStack i= new ItemStack(Material.SUGAR,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bЛама §5[PREMIUM]");List l = new ArrayList();
            l.add("");
            l.add("§7Вид питомца: §bЛама");
            l.add("§7Жизней: §c30♥");
            l.add("§7Питается: §aЯблоками");
            l.add("§7Скорость передвижения: §a0.3");
            l.add("");
            l.add("§aСтоимость: §610 коинов");
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 23){
            ItemStack i= new ItemStack(Material.SNOW_BALL,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bМедвеженок §5[PREMIUM]");List l = new ArrayList();
            l.add("");
            l.add("§7Вид питомца: §bПолярный медведь ");
            l.add("§7Жизней: §c30♥");
            l.add("§7Питается: §aЯблоками");
            l.add("§7Скорость передвижения: §a0.3");
            l.add("");
            l.add("§aСтоимость: §610 коинов");
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 24){
            ItemStack i= new ItemStack(Material.GOLDEN_APPLE,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bДосаждатель §5[PREMIUM]");List l = new ArrayList();
            l.add("");
            l.add("§7Вид питомца: §bДосаждатель");
            l.add("§7Жизней: §c30♥");
            l.add("§7Питается: §aЯблоками");
            l.add("§7Скорость передвижения: §a0.3");
            l.add("");
            l.add("§aСтоимость: §610 коинов");
            im.setLore(l);i.setItemMeta(im);return i;
            /**/
        }else if(slot == 25){
            ItemStack i= new ItemStack(Material.GOLDEN_APPLE,1);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bАтакующий §5(Combat)");List l = new ArrayList();
            l.add("");
            l.add("§7Основные способности:");
            l.add("§7- Атака");
            l.add("§7- Ускоренное передвижение");
            l.add("§7- Замедление противников");
            l.add("§7- Поджигание противника");
            l.add("§7- Использование способностей в радиусе");
            l.add("§7Прокачка происходит за счет убийства монстров");
            l.add("§7с помощью питомца.");
            l.add("");
            l.add("§7Выбрать данную профессию?");
            im.setLore(l);i.setItemMeta(im);return i;
        }else if(slot == 26){
            ItemStack i= new ItemStack(Material.DIAMOND_SWORD);ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bСражающийся §5(PVP)");List l = new ArrayList();
            l.add("");
            l.add("§7Основные способности:");
            l.add("§7- Атака");
            l.add("§7- Регенрация жизней");
            l.add("§7- Удары молнией");
            l.add("§7- Откидывание");
            l.add("§7Прокачка происходит за счет убийства монстров");
            l.add("§7с помощью питомца.");
            l.add("");
            l.add("§7Выбрать данную профессию?");
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.setLore(l);i.setItemMeta(im);return i;
        }
        
        return null;
    }
    
    public static ItemStack SIDropSword(int lvl){
        if(lvl == 86){
            ItemStack i= new ItemStack(Material.IRON_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            im.setDisplayName("§aПаралакс §8[§e14ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-21");
            l.add("§7Свойства: §e накладывает отравление");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Говорят что этот клинок создал великий");
            l.add("§7  алхимик Рафаам");
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 41){
            ItemStack i= new ItemStack(Material.GOLD_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            im.setDisplayName("§aКсаркс §8[§e15ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-23");
            l.add("§7Свойства: §e накладывает ослабление");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Этот поистине великий клинок был найден в далекой");
            l.add("§7  пустыне, его происхождение до сих пор не известно");
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 17){
            ItemStack i= new ItemStack(Material.STONE_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            im.setDisplayName("§aМаларис §8[§e17ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-26");
            l.add("§7Свойства: §e накладывает замедление");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Этот клинок на столько тяжелый, что некоторые");
            l.add("§7  даже просто поднять не могут");
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 8){
            ItemStack i= new ItemStack(Material.WOOD_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
            im.setDisplayName("§aАройн §8[§e23ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-30");
            l.add("§7Свойства: §e накладывает поджег");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Самый горячий меч в мире");
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 1){
            ItemStack i= new ItemStack(Material.DIAMOND_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            im.setDisplayName("§aОникс §8[§e25ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-34");
            l.add("§7Свойства: §e накладывает слепоту");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Оникс настолько легендарный, что многие даже");
            l.add("§7  сомниваются в его существовании");
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 42){
            ItemStack i= new ItemStack(Material.STONE_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            im.setDisplayName("§aКсар §8[§e15ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-17");
            l.add("§7Свойства: §e накладывает замедление и отравление");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Скрытый и тихий клинок, идеален");
            l.add("§7  для настоящих убийц");
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 18){
            ItemStack i= new ItemStack(Material.IRON_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            im.setDisplayName("§aТоксик §8[§e12ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-23");
            l.add("§7Свойства: §e накладывает отравление и тошноту");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Пусть ваши враги познают настоящее безумие");
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 87){
            ItemStack i= new ItemStack(Material.STONE_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            im.setDisplayName("§aЭкскалибурc §8[§e10ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-12");
            l.add("§7Свойства: §e накладывает тошноту");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Этим старым, но по прежнему великолепным клинком");
            l.add("§7  владел сам Король Артур");
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
           /*Новые*/
        }else if(lvl == 861){
            ItemStack i= new ItemStack(Material.WOOD_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            im.setDisplayName("§aСайгер §8[§e9ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-11");
            l.add("§7Свойства: §e замедление");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Говорят что этот меч был создан самим Сайгером,");
            l.add("§7  но это ведь только слухи");
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 81){
            ItemStack i= new ItemStack(Material.GOLD_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
            im.setDisplayName("§aГолден §8[§e20ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-29");
            l.add("§7Свойства: §eподжигание, ослабление");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Этот меч хочет каждый, но имеют его лишь единицы");
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 862){
            ItemStack i= new ItemStack(Material.STONE_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
            im.setDisplayName("§aЗалфир §8[§e10ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-14");
            l.add("§7Свойства: §eголод");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Старинный меч передаваемый уже несколько сотен лет из");
            l.add("§7  поколения в поколение");
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 411){
            ItemStack i= new ItemStack(Material.WOOD_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            im.setDisplayName("§aЛоли §8[§e8ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-10");
            l.add("§7Свойства: §eслабость");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Пожалуй самый милый клинок из всех :3 ");
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 11){
            ItemStack i= new ItemStack(Material.DIAMOND_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
            im.setDisplayName("§aОмега §8[§e27ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-44");
            l.add("§7Свойства: §eиссушение, поджигание, слепота");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Вам никогда не познать всю силу этого легендарного клинка");
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 171){
            ItemStack i= new ItemStack(Material.IRON_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
            im.setDisplayName("§aМеч Крона §8[§e15ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-20");
            l.add("§7Свойства: §eзамедление, поджигание");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Легендарный меч обращающий в бегство ваших врагов");
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 412){
            ItemStack i= new ItemStack(Material.STONE_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            im.setDisplayName("§aЯгура §8[§e15ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-18");
            l.add("§7Свойства: §eисушение");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- От этого клинка исходит таинственное тёмное свечение");
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(lvl == 82){
            ItemStack i= new ItemStack(Material.IRON_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.addEnchant(Enchantment.DURABILITY, 1, false);
            im.setDisplayName("§aДемонический клинок §8[§e8ур§8]");
            List l = new ArrayList();
            l.add("");
            l.add("§7Урон: §c-7");
            l.add("§7Свойства: §eисушение, тошнота, слепота, ослабление");
            l.add("§7Прокачка: §8нет");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- В этом оружии таятся тысячи душ жаждующих мести, не все");
            l.add("§7- смертные смогут справится с подобной силой");
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }
        return null;
    }
    public static ItemStack SIArhont(int lvl){
        if(lvl == 0){
            ItemStack i= new ItemStack(Material.IRON_SWORD,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("Внести на счет сервера");
            List l = new ArrayList();
            l.add("");
            l.add("Пополнение счета для  осуществления попадания в архонты");
            l.add("");
            l.add("");
            l.add("");
            im.setUnbreakable(true);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }
        return null;
    }
    public static ItemStack SIPECH(int num, boolean shop){
        if(num == 1){
            ItemStack i= new ItemStack(Material.NETHER_STAR,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bПечать нерушимости");
            List l = new ArrayList();
            l.add("");
            l.add("§7Особая метка в названии: §b[Ⓝ]");
            l.add("");
            l.add("§7Как пользоваться:");
            l.add("§7- Открываем инвентарь, берем данную мечать");
            l.add("§7и §aкликаем на предмет §7на который, хотите ее наложить!");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Предмет с §bданной печатью §7будет нерушим при прокачке,");
            l.add("§7т.е. будет иметь §e100% шанс прокачаться§7!");
            l.add("§cОграничения:");
            l.add("§c- Нельзя наложить когда наложена печать стойкости.");
            if(shop == true){l.add("");l.add("§aСтоимость: §650");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(num == 2){
            ItemStack i= new ItemStack(Material.NETHER_STAR,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bПечать стойкости");
            List l = new ArrayList();
            l.add("");
            l.add("§7Особая метка в названии: §b[Ⓢ]");
            l.add("");
            l.add("§7Как пользоваться:");
            l.add("§7- Открываем инвентарь, берем данную мечать");
            l.add("§7и §aкликаем на предмет §7на который, хотите ее наложить!");
            l.add("");
            l.add("§7Описание:");
            l.add("§7- Предмет с §bданной печатью §7будет устойчив к выпадению,");
            l.add("§7т.е. он останется в инвентаре даже если вы погибните§7!");
            l.add("§cОграничения:");
            l.add("§c- Нельзя наложить когда наложена печать нерушимости.");
            l.add("§cСледует улучшить предмет чтобы печать нерушимости исчезла!");
            if(shop == true){l.add("");l.add("§aСтоимость: §650");}
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }
        return null;
    }
    public static ItemStack onPlayerInfo(Player p){
		ItemStack i = new ItemStack((Material.SKULL_ITEM), 1, (short) 3);
		SkullMeta sm = (SkullMeta) i.getItemMeta();
                sm.setOwner(p.getName());
                ItemMeta im = i.getItemMeta();
                im.setDisplayName("§a"+p.getName());
                List l = new ArrayList();
                l.add("");
                l.add("§7Уровень: §a"+Levels.getLevel(p.getName()));
                l.add("§7Опыт: §e"+Levels.getXP(p.getName()));
                l.add("");
                l.add("§7Монеты: §6"+Main.economy.getBalance(p.getName()));
                l.add("§7Коины: §6"+Main.getBal(p));
                im.setLore(l);
                i.setItemMeta(im);
           return i;
    }
    public static ItemStack onPlayerReport(Player p){
	    ItemStack i= new ItemStack(Material.REDSTONE_BLOCK,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§cПодать жалобу на игрока §e"+p.getName());
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            i.setItemMeta(im); 
           return i;
    }
    
     public static ItemStack onPlayerClan(Player p){
	    ItemStack i= new ItemStack(Material.APPLE,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§aПригласить в клан игрока: §e"+p.getName());
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            i.setItemMeta(im); 
           return i;
    }
     
    public static ItemStack Nagrada(int n, Player p){
        if(n == 0){
            ItemStack i= new ItemStack(Material.ENDER_CHEST,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bПолучить ежедневную награду");
            List l = new ArrayList();
            String s;
            if(Cooldown.hasCooldown(p.getName(), "kit")){
            long time = ((Cooldown.getCooldown(p.getName(), "kit")) /1000/60/60);
            int timeformat = (int)time;
            s = "§7До повторного получения: §e"+timeformat+" час(ов)";
            //p.sendMessage("§e[Награда дня] §aДля повторного получения, ожидайте " + timeformat + "§a час(ов)");
            }else{
            s = "§aНаграда доступна, нажмите чтобы получить!";           
            }
            l.add("");
            l.add(s);
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im);
           return i;
        }else if(n == 1){
            ItemStack i= new ItemStack(Material.PAPER,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bУзнать информацию о нововведениях");
            List l = new ArrayList();
            l.add("§7Список:");
            l.add("§7- 08.09.2019");
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }else if(n == 2){
            ItemStack i= new ItemStack(Material.BOOK,1);
            ItemMeta im = i.getItemMeta();
            im.setDisplayName("§bНововведения от 08.09.2019");
            List l = new ArrayList();
            l.add("");
            l.add("§7- Изменены кланы, добавлен банк клана,");
            l.add("§7а так же магазин, которым может управлять глава");
            l.add("§7- Глава клана теперь выделяется на фоне остальных");
            l.add("§7- Восстановлен билетер");
            l.add("§7- В меню игрока (ШИФТ+ПКМ), можно пригласить в клан");
            l.add("§7- Исправлены мелкие баги, баг исчезания борда справа");
            l.add("");
            l.add("§7Более подробно в группе вк §ahttps://vk.com/neuralmc");
            im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            im.setLore(l);
            i.setItemMeta(im); 
            return i;
        }
        return null;
    }
}
