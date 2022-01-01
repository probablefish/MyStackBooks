package com.probablefish.msb.usecasetests

import com.probablefish.msb.data.Book
import com.probablefish.msb.local.LocalBookRepository
import com.probablefish.msb.usecases.RemoveBookUseCase
import org.junit.Assert.assertNull
import org.junit.Test

class RemoveBookUseCaseTest {

    @Test
    fun `Given a book title that matches one in the repository it is removed`() {
        val repository = LocalBookRepository().apply {
            addBook(Book(title = "book1"))
        }

        RemoveBookUseCase(repository).execute(title = "book1")

        assertNull(repository.getBook(title = "book1"))
    }
}