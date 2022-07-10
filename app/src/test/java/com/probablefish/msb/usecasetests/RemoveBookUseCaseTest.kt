package com.probablefish.msb.usecasetests

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.probablefish.msb.local.ILocalBookRepository
import com.probablefish.msb.usecases.RemoveBookUseCase
import org.junit.Test

class RemoveBookUseCaseTest {

    @Test
    fun `Given a book title that matches one in the repository it is removed`() {
        val repository : ILocalBookRepository = mock()

        RemoveBookUseCase(repository).execute(title = "book1", author = "author")

        verify(repository).removeBook("book1", "author")
    }
}