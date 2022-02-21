/*    */ package de.waterbukkit.dulli.main;
/*    */ 
/*    */ import de.waterbukkit.dulli.logs.Logger;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ import org.bukkit.plugin.java.JavaPlugin;
/*    */ 
/*    */ 
/*    */ public class WaterBukkitUtils
/*    */   extends JavaPlugin
/*    */ {
/* 12 */   private Logger logger = new Logger();
/*    */   
/* 14 */   private final String prefix = "§bWaterBukkitUtils §7• §7";
/*    */ 
/*    */ 
/*    */   
/*    */   public void onLoad() {
/* 19 */     Logger.LogMessageToConsole("§bWaterBukkitUtils §7• §7§7Die §bAPI §7wurde §aerfolgreich geladen");
/* 20 */     Logger.LogMessageToConsole(" ");
/* 21 */     Logger.LogMessageToConsole("§bWaterBukkitUtils §7• §7§bVersion §7• §a" + getDescription().getVersion());
/* 22 */     Logger.LogMessageToConsole("§bWaterBukkitUtils §7• §7§bDev §7• §a" + (String)getDescription().getAuthors().get(0));
/* 23 */     Logger.LogMessageToConsole(" ");
/*    */   }
/*    */   
/*    */   public static boolean isPlayerOnline(String playerName) {
/* 27 */     if (Bukkit.getPlayer(playerName) != null) {
/* 28 */       return true;
/*    */     }
/* 30 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public static String getPluginName(Plugin pln) {
/* 35 */     return pln.getDescription().getName();
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\WaterBukkitUtils - Beta - 0.0.1.jar!\de\waterbukkit\dulli\main\WaterBukkitUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */