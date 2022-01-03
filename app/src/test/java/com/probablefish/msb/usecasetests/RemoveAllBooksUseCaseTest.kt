package com.probablefish.msb.usecasetests

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.probablefish.msb.local.ILocalBookRepository
import com.probablefish.msb.usecases.RemoveAllBooksUseCase
import org.junit.Test


class RemoveAllBooksUseCaseTest {

    @Test
    fun `when usecase is executed then all books are removed from the repository`() {
        val repository : ILocalBookRepository = mock()

        RemoveAllBooksUseCase(repository).execute()

        verify(repository).removeAllBooks()
    }
}