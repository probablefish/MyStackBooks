package com.probablefish.msb.local.storage.coverimage

import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import android.os.Environment
import android.util.Log
import com.probablefish.msb.data.Book
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStream
import java.util.*

class CoverImageRepository(private val mContext: Context) : ICoverImageRepository{

    companion object {
        private const val ALBUM_NAME = "images"
    }

    override fun storeImage(bitmap: Bitmap) : Uri {
        return storeBitmap(bitmap)
    }



    private fun storeBitmap(image: Bitmap) : Uri {
        val file = File(getAppSpecificAlbumStorageDir(mContext), "${UUID.randomUUID()}.jpg")

        try {
            // Get the file output stream
            val stream: OutputStream = FileOutputStream(file)

            // Compress bitmap
            image.compress(Bitmap.CompressFormat.JPEG, 100, stream)

            // Flush the stream
            stream.flush()

            // Close stream
            stream.close()
        } catch (e: IOException){ // Catch the exception
            e.printStackTrace()
        }

        // Return the saved image uri
        return Uri.parse(file.absolutePath)
    }

    private fun getAppSpecificAlbumStorageDir(context: Context): File {
        // Get the pictures directory that's inside the app-specific directory on
        // external storage.
        val file = File(context.getExternalFilesDir(
            Environment.DIRECTORY_PICTURES), ALBUM_NAME)
        if (!file.mkdirs()) {
            Log.e("STORAGE", "Directory '$ALBUM_NAME' not created")
        }
        return file
    }


}