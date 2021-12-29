package com.probablefish.msb.usecasetests

import com.probablefish.msb.Book
import com.probablefish.msb.BookRepository
import com.probablefish.msb.usecases.RemoveBookUseCase
import org.junit.Assert.assertNull
import org.junit.Test

class RemoveBookUseCaseTest {

    @Test
    fun `Given a book title that matches one in the repository it is removed`() {
        val repository = BookRepository().apply {
            addBook(Book("book1"))
        }

        RemoveBookUseCase(repository).execute("book1")

        assertNull(repository.getBook("book1"))
    }
}