package com.example.authorisation.recyclerview

import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.RecyclerView

class ChatAnimator : DefaultItemAnimator() {

    override fun animateAppearance(
        viewHolder: RecyclerView.ViewHolder,
        preLayoutInfo: ItemHolderInfo?,
        postLayoutInfo: ItemHolderInfo
    ): Boolean {

        animateMove(
            viewHolder,
            0,
            0,
            postLayoutInfo.left,
            postLayoutInfo.top
        )
        runPendingAnimations()
        return true
    }
}