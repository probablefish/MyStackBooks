package com.probablefish.msb.usecasetests

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import com.probablefish.msb.data.Book
import com.probablefish.msb.local.ILocalBookRepository
import com.probablefish.msb.local.LocalBookRepository
import com.probablefish.msb.usecases.SetBookAsAttainedUseCase
import org.junit.Test

class SetBookAsAttainedUseCaseTest {

    @Test
    fun `given a book title that exists in the local repository, when the usecase is executed, it has a state of attained`() {
        val book = Book(title = "book1", isAttained = false, author = "author")
        val bookRepository: ILocalBookRepository = mock()
        whenever(bookRepository.getBook(book.title, book.author)).thenReturn(book)

        SetBookAsAttainedUseCase(bookRepository).execute(book.title, book.author)

        verify(bookRepository).setBookAsAttained(book.title, book.author)
    }
}