package org.example.exampleplugin

import org.bukkit.plugin.java.JavaPlugin

class ExamplePlugin : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic

        logger.info("Hello, world!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
