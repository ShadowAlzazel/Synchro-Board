package me.shadowalzazel.synchroboard.listeners

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.server.BroadcastMessageEvent

object SynchroboardServerListeners : Listener {

    @EventHandler
    fun mainPlayerJoinHandler(event: PlayerJoinEvent) {
        println("Hello World!")
    }


    @EventHandler
    fun hello(event: BroadcastMessageEvent) {

    }





}