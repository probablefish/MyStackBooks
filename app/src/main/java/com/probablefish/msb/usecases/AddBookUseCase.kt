package com.probablefish.msb.usecases

import com.probablefish.msb.data.Book
import com.probablefish.msb.local.ILocalBookRepository

class AddBookUseCase(private val bookRepository: ILocalBookRepository) {

    fun execute(book: Book) = bookRepository.addBook(book)

}