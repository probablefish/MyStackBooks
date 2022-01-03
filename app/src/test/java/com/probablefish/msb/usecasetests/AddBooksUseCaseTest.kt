package com.probablefish.msb.usecasetests

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.probablefish.msb.data.Book
import com.probablefish.msb.local.ILocalBookRepository
import com.probablefish.msb.local.LocalBookRepository
import com.probablefish.msb.usecases.AddBooksUseCase
import org.junit.Assert.assertTrue
import org.junit.Test

class AddBooksUseCaseTest {

    @Test
    fun `Given a list of books when the usecase is executed then then are added to the repository`() {
        val bookRepository: ILocalBookRepository = mock()
        val books = listOf(Book(title = "book1", author = "author"), Book(title = "book2", author = "author"))

        AddBooksUseCase(bookRepository).execute(books)

        verify(bookRepository).addBooks(books)
    }
}