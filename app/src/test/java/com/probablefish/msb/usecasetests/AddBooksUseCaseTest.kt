package com.probablefish.msb.usecasetests

import com.probablefish.msb.data.Book
import com.probablefish.msb.local.LocalBookRepository
import com.probablefish.msb.usecases.AddBooksUseCase
import org.junit.Assert.assertTrue
import org.junit.Test

class AddBooksUseCaseTest {

    @Test
    fun `Given a list of books when the usecase is executed then then are added to the repository`() {
        val bookRepository = LocalBookRepository()
        val books = listOf(Book("book1"), Book("book2"))

        AddBooksUseCase(bookRepository).execute(books)

        val result = bookRepository.getBooks()
        assertTrue(result.containsAll(books))
    }
}