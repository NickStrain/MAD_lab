package com.example.gra
import android.app.Activity
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.widget.ImageView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bg = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888)

        val i = findViewById<ImageView>(R.id.imageView)
        i.setBackgroundDrawable(BitmapDrawable(resources, bg))
        val canvas = Canvas(bg)
        val paint = Paint().apply { color = Color.BLUE
            textSize = 50f
        }
        canvas.drawText("Circle", 150f, 150f, paint)
        canvas.drawCircle(200f, 350f, 150f, paint)
        canvas.drawText("ellipse", 120f, 800f, paint)
        canvas.drawOval(100f,900f,700f,1100f,paint)

    }
}
