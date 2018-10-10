package com.birjuvachhani.vectoranimations.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class VectorModel(var name: String, var thumbnail: Int, var type: Enum<VectorType>) : Parcelable