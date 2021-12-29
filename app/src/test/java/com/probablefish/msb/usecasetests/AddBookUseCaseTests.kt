package com.probablefish.msb.usecasetests

import com.probablefish.msb.Book
import com.probablefish.msb.BookRepository
import com.probablefish.msb.IBookRepository
import com.probablefish.msb.usecases.AddBookUseCase
import org.junit.Test

class AddBookUseCaseTests {

    @Test
    fun `a book can be added to the repository`() {
        val bookRepository: IBookRepository = BookRepository()
        val book = Book("book1")

        AddBookUseCase(bookRepository).execute(book)

        assert(bookRepository.getBooks().size == 1)
    }
}