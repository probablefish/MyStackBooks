package com.probablefish.msb.usecasetests

import com.probablefish.msb.data.Book
import com.probablefish.msb.local.LocalBookRepository
import com.probablefish.msb.usecases.GetAllBooksUseCase
import org.junit.Test

class GetAllBooksUseCaseTest {

    @Test
    fun `when use case is executed all books are returned`() {
        val bookRepository = LocalBookRepository()
        val book1 = Book(title = "book1")
        val book2 = Book(title = "book2")
        bookRepository.addBook(book1)
        bookRepository.addBook(book2)

        val result = GetAllBooksUseCase(bookRepository).execute()

        assert(result.contains(book1) && result.contains(book2))
    }

    @Test
    fun `when use case is executed and repository is empty then an empty list is returned`() {
        val bookRepository = LocalBookRepository()

        val result = GetAllBooksUseCase(bookRepository).execute()

        assert(result.isEmpty())
    }
}