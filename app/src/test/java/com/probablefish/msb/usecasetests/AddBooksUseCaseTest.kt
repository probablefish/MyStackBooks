package com.probablefish.msb.usecasetests

import com.probablefish.msb.Book
import com.probablefish.msb.BookRepository
import com.probablefish.msb.usecases.AddBooksUseCase
import org.junit.Assert.assertTrue
import org.junit.Test

class AddBooksUseCaseTest {

    @Test
    fun `Given a list of books when the usecase is executed then then are added to the repository`() {
        val bookRepository = BookRepository()
        val books = listOf(Book("book1"), Book("book2"))

        AddBooksUseCase(bookRepository).execute(books)

        val result = bookRepository.getBooks()
        assertTrue(result.containsAll(books))
    }
}