package com.ladushkinySkazky.ladushkinnyskazki.models

import android.net.Uri

class SkazkiModel(var ID: Long, var NameSkazka: String, var DescriptionSkazka: String, var BodySkazka: String, var ImageNameSkazka: String, var ImageNameSkazkaForLoad: Uri?) {
    constructor(): this(ID = Long.MAX_VALUE, NameSkazka = String(), DescriptionSkazka = String(), BodySkazka = String(), ImageNameSkazka = String(), ImageNameSkazkaForLoad = null)
}