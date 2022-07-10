package com.probablefish.msb.local.storage.coverimage

import android.graphics.Bitmap
import android.net.Uri

interface ICoverImageRepository {
    fun storeImage(bitmap: Bitmap) : Uri
}