package com.safarov399.sigma

import com.safarov399.sigma.di.mainModule
import io.ktor.server.application.Application
import io.ktor.server.application.install
import com.safarov399.sigma.plugins.configureSockets
import com.safarov399.sigma.plugins.configureRouting
import com.safarov399.sigma.plugins.configureSecurity
import com.safarov399.sigma.plugins.configureMonitoring
import com.safarov399.sigma.plugins.configureSerialization

import org.koin.ktor.plugin.Koin

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    install(Koin) {
        modules(mainModule)
    }
    configureSockets()
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureSecurity()
}
