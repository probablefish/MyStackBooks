package com.probablefish.msb.usecasetests

import com.probablefish.msb.Book
import com.probablefish.msb.BookRepository
import com.probablefish.msb.usecases.RemoveAllBooksUseCase
import org.junit.Assert.assertTrue
import org.junit.Test

class RemoveAllBooksUseCaseTest {

    @Test
    fun `when usecase is executed then all books are removed from the repository`() {
        val repository = BookRepository().apply {
            addBook(Book("book1"))
            addBook(Book("book2"))
        }

        RemoveAllBooksUseCase(repository).execute()

        assertTrue(repository.getBooks().isEmpty())
    }
}