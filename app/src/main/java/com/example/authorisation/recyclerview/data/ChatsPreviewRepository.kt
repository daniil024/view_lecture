package com.example.authorisation.recyclerview.data

import android.content.Context
import androidx.appcompat.content.res.AppCompatResources
import com.example.authorisation.R

class ChatsPreviewRepository {

    fun getChats(context: Context): List<Chat> {
        return buildList {
            val userPhoto = AppCompatResources.getDrawable(context, R.drawable.chat_photo)
            val userName = "Alex Voronin"
            val lastMessage = "Hi, how are you?"

            val numberOfChats = (1..10).random()
            for (i in 0..numberOfChats)
                add(ChatPreview(i, userPhoto, userName, lastMessage))

            add(VideoChat("Yandex", 563))
            add(ChatPreview(1, userPhoto, userName, lastMessage))
            add(VideoChat("Friends", 8))

            for (i in 0..2)
                add(ChatPreview(i, userPhoto, userName, lastMessage))

            add(VideoChat("Family", 4))
        }
    }
}