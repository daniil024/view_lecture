package com.example.authorisation

import android.content.res.Resources
import android.os.Bundle
import android.util.TypedValue
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title: TextView = findViewById(R.id.title)
        title.text = "Авторизация"

//        val rootView = findViewById<FrameLayout>(R.id.root_container)
//        val layoutParams = FrameLayout.LayoutParams(
//            ViewGroup.LayoutParams.WRAP_CONTENT,
//            ViewGroup.LayoutParams.WRAP_CONTENT
//        ).apply {
//            marginStart = 26.toPx.toInt()
//            topMargin = 80.toPx.toInt()
//        }
//        val title: TextView = TextView(this)
//        title.text = "Авторизация"
//        title.typeface = Typeface.DEFAULT_BOLD
//        title.textSize = 24f
//        title.setTextColor(Color.BLACK)
//        title.layoutParams = layoutParams
//        rootView.addView(title)
    }
}

val Number.toPx
    get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        this.toFloat(),
        Resources.getSystem().displayMetrics
    )
