package com.probablefish.msb.usecasetests

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import com.probablefish.msb.data.Book
import com.probablefish.msb.local.LocalBookRepository
import com.probablefish.msb.local.ILocalBookRepository
import com.probablefish.msb.usecases.GetBookUseCase
import org.junit.Test

class GetBookUseCaseTests {

    @Test
    fun `when a book title and author matches one in the repository then it is returned`() {
        val book = Book(title = "book1", author = "author")
        val bookRepository: ILocalBookRepository = mock()
        whenever(bookRepository.getBook("book1", "author")).thenReturn(book)

        val result = GetBookUseCase(bookRepository).execute(title = "book1", author = "author")

        assert(result?.title == book.title)
    }

    @Test
    fun `when a book title and author does not match any in the repository then null is returned`() {
        val bookRepository: ILocalBookRepository = mock()

        val result = GetBookUseCase(bookRepository).execute(title = "book2", author = "author")

        assert(result == null)
    }

}