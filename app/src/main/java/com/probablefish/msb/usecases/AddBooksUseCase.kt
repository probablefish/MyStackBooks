package com.probablefish.msb.usecases

import com.probablefish.msb.Book
import com.probablefish.msb.IBookRepository

class AddBooksUseCase(private val bookRepository: IBookRepository) {

    fun execute(books: List<Book>) {
        bookRepository.addBooks(books)
    }
}
