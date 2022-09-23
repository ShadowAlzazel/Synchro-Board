package me.shadowalzazel.synchroboard


import me.shadowalzazel.synchroboard.listeners.SynchroboardServerListeners
import org.bukkit.plugin.java.JavaPlugin

class Synchroboard : JavaPlugin() {

    companion object {
        lateinit var instance : Synchroboard
    }

    init {
        instance = this
    }

    var configEnable = true
    var discordSRVEnabled = false


    override fun onEnable() {
        // Config start up
        config.options().copyDefaults()
        saveConfig()

        // Start up
        server.also {
            with(it.pluginManager) {
                if (configEnable) { registerEvents(SynchroboardServerListeners, this@Synchroboard) }
            }
        }



    }

    override fun onDisable() {

    }



}