package com.example.hw37

import android.graphics.drawable.Drawable
import android.widget.ImageView
import java.io.Serializable

data class Character(var name: String? = "Not found", var survive:String? = "Not found", var image: String? = "Not found"):
    Serializable
