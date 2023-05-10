package com.example.authorisation.recyclerview.data

import android.graphics.drawable.Drawable

sealed class Chat

data class ChatPreview(
    val userId: Int,
    val userPhoto: Drawable?,
    val userName: String,
    val lastMessage: String
): Chat()

data class VideoChat(
    val videoChatName: String,
    val numberOfParticipants: Int
): Chat()
