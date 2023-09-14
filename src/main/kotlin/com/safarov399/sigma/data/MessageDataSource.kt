package com.safarov399.sigma.data

import com.safarov399.sigma.data.model.Message

interface MessageDataSource {

    suspend fun getAllMessages(): List<Message>

    suspend fun insertMessage(message: Message)
}