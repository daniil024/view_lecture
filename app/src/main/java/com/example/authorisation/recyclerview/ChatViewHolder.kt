package com.example.authorisation.recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.authorisation.R
import com.example.authorisation.recyclerview.data.ChatPreview
import com.example.authorisation.recyclerview.data.VideoChat

class ChatPreviewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val userPhoto: ImageView = itemView.findViewById(R.id.user_photo)
    private val userName: TextView = itemView.findViewById(R.id.user_name)
    private val lastMessage: TextView = itemView.findViewById(R.id.last_message)

    fun onBind(chatPreview: ChatPreview) {
        userPhoto.setImageDrawable(chatPreview.userPhoto)
        userName.text = chatPreview.userName
        lastMessage.text = chatPreview.lastMessage
    }
}

class VideoChatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val videoChatName: TextView = itemView.findViewById(R.id.video_chat_name)
    private val numberOfParticipants: TextView = itemView.findViewById(R.id.number_of_participants)

    fun onBind(videoChat: VideoChat) {
        videoChatName.text = videoChat.videoChatName
        numberOfParticipants.text = "People: ${videoChat.numberOfParticipants}"
    }
}