package ro.coderdojo.sarmalele;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println(this.getCommand("ct"));
        this.getCommand("ct").setExecutor(new CraftingTableCommand());
        getServer().getPluginManager().registerEvents(new EventsListener(this), this);
        recipe();

    }
    public void recipe() {
        ItemStack tnt=new ItemStack(Material.TNT);
        ItemMeta meta=tnt.getItemMeta();
        meta.setDisplayName("Big Boi TNT");
        tnt.setItemMeta(meta);
        tnt.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 999);
        NamespacedKey key = new NamespacedKey(this, this.getDescription().getName());
        ShapedRecipe recipe=new ShapedRecipe(key, tnt);
        recipe.shape("DTD", "TTT", "DTD");
        recipe.setIngredient('T', Material.TNT);
        recipe.setIngredient('D', Material.DIAMOND);
        getServer().addRecipe(recipe);
        
    }
}
