package com.example.recyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TheSmiths(
    val imgTheSmiths: Int,
    val nameTheSmiths: String,
    val descTheSmiths: String
) : Parcelable
