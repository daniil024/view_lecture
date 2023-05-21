package com.example.authorisation

import android.content.res.Resources
import android.os.Bundle
import android.util.TypedValue
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.authorisation.recyclerview.ChatAnimator
import com.example.authorisation.recyclerview.ChatPreviewOffsetItemDecoration
import com.example.authorisation.recyclerview.ChatsAdapter
import com.example.authorisation.recyclerview.data.ChatsPreviewRepository

class MainActivity : AppCompatActivity() {

    private lateinit var chatsRecyclerView: RecyclerView
    private val chatsPreviewRepository = ChatsPreviewRepository()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chatsRecyclerView = findViewById(R.id.chats)
        val chatsAdapter = ChatsAdapter()
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        chatsRecyclerView.adapter = chatsAdapter
        chatsRecyclerView.layoutManager = layoutManager
        chatsRecyclerView.addItemDecoration(ChatPreviewOffsetItemDecoration(bottomOffset = 16f.toPx.toInt()))
        chatsAdapter.chats = chatsPreviewRepository.getChats(this)
        chatsRecyclerView.itemAnimator = ChatAnimator()

        val pullToRefresh: SwipeRefreshLayout = findViewById(R.id.pull_to_refresh)
        pullToRefresh.setOnRefreshListener {
            chatsAdapter.chats = chatsPreviewRepository.getChats(this)
            pullToRefresh.isRefreshing = false
        }
    }
}

val Number.toPx
    get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        this.toFloat(),
        Resources.getSystem().displayMetrics
    )
