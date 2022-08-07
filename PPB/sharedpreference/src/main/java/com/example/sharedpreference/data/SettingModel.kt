package com.example.sharedpreference.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SettingModel(
    var fullName: String? = null,
    var name: String? = null,
    var email: String? = null,
    var address: String? = null,
    var age: Int = 0,
    var phoneNumber: String? = null,
    var isDarkTheme: Boolean = false
) : Parcelable
