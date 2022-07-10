package com.probablefish.msb.usecases

import com.probablefish.msb.data.Book
import com.probablefish.msb.local.ILocalBookRepository

class AddBooksUseCase(private val bookRepository: ILocalBookRepository) {

    fun execute(books: List<Book>) {
        bookRepository.addBooks(books)
    }
}
