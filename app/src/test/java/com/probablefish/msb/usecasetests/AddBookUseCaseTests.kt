package com.probablefish.msb.usecasetests

import com.probablefish.msb.data.Book
import com.probablefish.msb.local.LocalBookRepository
import com.probablefish.msb.local.ILocalBookRepository
import com.probablefish.msb.usecases.AddBookUseCase
import org.junit.Test

class AddBookUseCaseTests {

    @Test
    fun `a book can be added to the repository`() {
        val bookRepository: ILocalBookRepository = LocalBookRepository()
        val book = Book("book1")

        AddBookUseCase(bookRepository).execute(book)

        assert(bookRepository.getBooks().size == 1)
    }
}