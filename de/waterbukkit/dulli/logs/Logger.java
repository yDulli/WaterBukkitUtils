/*    */ package de.waterbukkit.dulli.logs;
/*    */ 
/*    */ import org.bukkit.Bukkit;
/*    */ 
/*    */ 
/*    */ public class Logger
/*    */ {
/*    */   public static void LogMessageToConsole(String msg) {
/*  9 */     Bukkit.getConsoleSender().sendMessage(msg);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void ClearConsole() {
/* 14 */     for (int i = 0; i < 500; i++)
/* 15 */       Bukkit.getConsoleSender().sendMessage("\n"); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\WaterBukkitUtils - Beta - 0.0.1.jar!\de\waterbukkit\dulli\logs\Logger.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */