package com.yogi.komikku

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
class Komik(
    val imgKomik: Int,
    val nameKomik: String,
    val descKomik: String,
    val imgDetail: Int,
    val chapter: Int,
    val rate: String
) : Parcelable

