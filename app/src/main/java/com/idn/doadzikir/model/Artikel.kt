package com.idn.doadzikir.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Artikel (
    val imageArtikel: Int,
    val titleArtikel: String,
    val descArtikel: String
) : Parcelable

