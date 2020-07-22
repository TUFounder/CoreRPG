package ru.meedway.corerpg;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;


public class ChatEvents implements Listener{
  
  @EventHandler
  public void onChat(AsyncPlayerChatEvent event)
  {
    String newMessage = event.getMessage().replace(":)", "☺").replace(">:)", "ಠ‿ಠ").replace(">:)", "ಠ‿ಠ").replace(";-;", "ಥ﹏ಥ").replace(":I", "☺").replace(":3", "°ω°").replace("l:", "°ﺑ°").replace(":D", "ᐛ").replace(":I", "☺");
    event.setMessage(newMessage);
  }
  
  /*@EventHandler
  public void onAChat(AsyncPlayerChatEvent e) {
    Player p = e.getPlayer();
    if(p.hasPermission("meedway.chatadmin")){
     if (e.getMessage().startsWith("@a")) {
      String message = e.getMessage();
      Bukkit.broadcastMessage("§e[§cЗЛОЙ АДМИН§e]§c "+ p.getName() + "§8: §4" + message.replaceAll("@a", ""));
      e.setCancelled(true);
       }  
    }
  }*/
}
