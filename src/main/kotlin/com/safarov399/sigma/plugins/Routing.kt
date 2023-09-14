package com.safarov399.sigma.plugins

import com.safarov399.sigma.room.RoomController
import com.safarov399.sigma.routes.chatSocket
import com.safarov399.sigma.routes.getAllMessages
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.routing.Routing
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
    install(Routing) {
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}
