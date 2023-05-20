package com.example.authorisation.recyclerview.data

import android.graphics.drawable.Drawable

sealed class Chat(
    val id: Int
)

data class ChatPreview(
    val userId: Int,
    val userPhoto: Drawable?,
    val userName: String,
    val lastMessage: String
): Chat(id = userId)

data class VideoChat(
    val videoChatId: Int,
    val videoChatName: String,
    val numberOfParticipants: Int
): Chat(videoChatId)
