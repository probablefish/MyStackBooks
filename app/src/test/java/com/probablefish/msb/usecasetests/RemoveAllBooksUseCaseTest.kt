package com.probablefish.msb.usecasetests

import com.probablefish.msb.data.Book
import com.probablefish.msb.local.LocalBookRepository
import com.probablefish.msb.usecases.RemoveAllBooksUseCase
import org.junit.Assert.assertTrue
import org.junit.Test

class RemoveAllBooksUseCaseTest {

    @Test
    fun `when usecase is executed then all books are removed from the repository`() {
        val repository = LocalBookRepository().apply {
            addBook(Book(title = "book1"))
            addBook(Book(title = "book2"))
        }

        RemoveAllBooksUseCase(repository).execute()

        assertTrue(repository.getBooks().isEmpty())
    }
}