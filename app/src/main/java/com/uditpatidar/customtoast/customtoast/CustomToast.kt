package com.uditpatidar.customtoast.customtoast

import android.content.Context
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.uditpatidar.customtoast.R

object CustomToast {
    fun show(context: Context, message: String, iconResId: Int = R.drawable.ic_info) {
        val inflater = LayoutInflater.from(context)
        val layout = inflater.inflate(R.layout.custom_toast, null)

        val icon = layout.findViewById<ImageView>(R.id.toast_icon)
        val text = layout.findViewById<TextView>(R.id.toast_text)

        icon.setImageResource(iconResId)
        text.text = message

        Toast(context).apply {
            duration = Toast.LENGTH_SHORT
            view = layout
            show()
        }
    }
}
