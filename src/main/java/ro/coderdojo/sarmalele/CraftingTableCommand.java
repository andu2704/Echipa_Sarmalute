/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.coderdojo.sarmalele;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

/**
 *
 * @author Cris
 */
public class CraftingTableCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        Player player = (Player) cs;
        Inventory craftingTable = Bukkit.getServer().createInventory(player, InventoryType.CRAFTING);
        player.openWorkbench(player.getLocation(), true);
        return true;
    }

}
