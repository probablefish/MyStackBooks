package com.probablefish.msb.usecases

import android.graphics.Bitmap
import com.probablefish.msb.data.Book
import com.probablefish.msb.local.ILocalBookRepository
import com.probablefish.msb.local.storage.coverimage.ICoverImageRepository

class ApplyCoverImageToBookUseCase(
    private val localBookRepository: ILocalBookRepository,
    private val coverImageRepository: ICoverImageRepository
) {

    fun execute(book: Book, coverImage: Bitmap) {
        val storedImage = coverImageRepository.storeImage(coverImage)
        book.imageFileLocation = storedImage.path
        localBookRepository.addBook(book)
    }
}