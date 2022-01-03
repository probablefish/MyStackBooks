package com.probablefish.msb.usecasetests

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import com.probablefish.msb.data.Book
import com.probablefish.msb.local.ILocalBookRepository
import com.probablefish.msb.local.LocalBookRepository
import com.probablefish.msb.usecases.GetAllBooksUseCase
import org.junit.Test

class GetAllBooksUseCaseTest {

    @Test
    fun `when use case is executed all books are returned`() {
        val bookRepository: ILocalBookRepository = mock()
        val book1 = Book(title = "book1", author = "author")
        val book2 = Book(title = "book2", author = "author")
        val books = listOf(book1, book2)
        whenever(bookRepository.getBooks()).thenReturn(books)

        val result = GetAllBooksUseCase(bookRepository).execute()

        assert(result.contains(book1) && result.contains(book2))
    }

    @Test
    fun `when use case is executed and repository is empty then an empty list is returned`() {
        val bookRepository: ILocalBookRepository = mock()
        whenever(bookRepository.getBooks()).thenReturn(emptyList())

        val result = GetAllBooksUseCase(bookRepository).execute()

        assert(result.isEmpty())
    }
}