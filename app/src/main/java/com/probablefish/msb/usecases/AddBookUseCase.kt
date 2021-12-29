package com.probablefish.msb.usecases

import com.probablefish.msb.Book
import com.probablefish.msb.IBookRepository

class AddBookUseCase(private val bookRepository: IBookRepository) {

    fun execute(book: Book) = bookRepository.addBook(book)

}