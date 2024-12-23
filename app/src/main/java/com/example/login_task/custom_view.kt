package com.example.login_task

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.login_task.databinding.ActivityCustomViewBinding

class CustomView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defSet: Int = 0
) : View(context, attributeSet, defSet) {

    private var name: String = ""
    private var circleColor: Int = Color.LTGRAY
    private var textColor: Int = Color.BLACK
    private var textSize: Float = 80f

    // Method to set text and invalidate view to trigger redraw
    fun setTEXT(text: String) {
        this.name = text
        invalidate()
    }

    // Override onDraw to draw custom content
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // Create paint objects for text and circle

        val shape = Paint(Paint.ANTI_ALIAS_FLAG)
        val radius = height/2f
        val textBrash = Paint(Paint.ANTI_ALIAS_FLAG)
        textBrash.color = Color.WHITE
        textBrash.textAlign = Paint.Align.CENTER
        textBrash.textSize = 70f
        // Draw the circle in the center of the view
        shape.color=Color.BLUE
        canvas.drawCircle(radius,radius,radius,shape)
        canvas.drawText(name,height/2f,height/2f,textBrash)
        // Draw the text in the center of the view


    }
}
