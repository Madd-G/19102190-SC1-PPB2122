package com.example.praktikum6

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class MyData(
    var name: String,
    var description: String, var photo: String
) : Parcelable
