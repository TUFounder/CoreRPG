package ru.meedway.corerpg;

import net.minecraft.server.v1_12_R1.ChatMessageType;
import net.minecraft.server.v1_12_R1.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_12_R1.PacketPlayOutChat;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;


public class ActionBar {
  private final PacketPlayOutChat packet;
  
  public ActionBar (String text){
      PacketPlayOutChat packet = new PacketPlayOutChat (ChatSerializer.a("{\"text\":\"" + text +"\"}"),ChatMessageType.GAME_INFO);
      this.packet = packet;
  }
  
  public void sendToPlayer(Player p){
      ((CraftPlayer)p).getHandle().playerConnection.sendPacket(packet);
  }

}
