package com.probablefish.msb.usecasetests

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.probablefish.msb.data.Book
import com.probablefish.msb.local.LocalBookRepository
import com.probablefish.msb.local.ILocalBookRepository
import com.probablefish.msb.usecases.AddBookUseCase
import org.junit.Test

class AddBookUseCaseTests {

    @Test
    fun `a book can be added to the repository`() {
        val bookRepository: ILocalBookRepository = mock()
        val book = Book(title = "book1", author = "author")

        AddBookUseCase(bookRepository).execute(book)

        verify(bookRepository).addBook(book)
    }
}