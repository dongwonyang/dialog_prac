package com.example.popupwindow_dialog_prac

import android.app.Dialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.WindowManager
import android.widget.PopupMenu
import android.widget.PopupWindow
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val examplePopUpButton = findViewById<TextView>(R.id.textview_popupButton)
        val exampleDialogButton = findViewById<TextView>(R.id.textview_dialogButton)

        examplePopUpButton.setOnClickListener{
            val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = inflater.inflate(R.layout.popup, null)
            val popupWindow = PopupWindow(view, WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT, true)
            popupWindow.showAtLocation(it, Gravity.CENTER, 0, 0)
        }
        exampleDialogButton.setOnClickListener{
            val dialog = Dialog(this)
            dialog.setContentView(R.layout.popup)
            dialog.show()
        }
    }
}