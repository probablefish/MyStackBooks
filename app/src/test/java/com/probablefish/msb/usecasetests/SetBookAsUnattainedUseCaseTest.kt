package com.probablefish.msb.usecasetests

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import com.probablefish.msb.data.Book
import com.probablefish.msb.local.ILocalBookRepository
import com.probablefish.msb.local.LocalBookRepository
import com.probablefish.msb.usecases.SetBookAsUnattainedUseCase
import org.junit.Assert.assertFalse
import org.junit.Test

class SetBookAsUnattainedUseCaseTest : LocalStorageTest() {

    @Test
    fun `given a book title that exists in the local repository, when the usecase is executed, it has a state of unattained`() {
        val book = Book(title = "book1", isAttained = true, author = "author")
        val bookRepository: ILocalBookRepository = mock()
        whenever(bookRepository.getBook(book.title, book.author)).thenReturn(book)

        SetBookAsUnattainedUseCase(bookRepository).execute(book.title, book.author)

        verify(bookRepository).setBookAsUnattained(book.title, book.author)
    }
}