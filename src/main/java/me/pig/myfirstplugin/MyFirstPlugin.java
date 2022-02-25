package me.pig.myfirstplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class MyFirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("My first plugin has started!!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("My first plugin has stopped!!");
    }
}
