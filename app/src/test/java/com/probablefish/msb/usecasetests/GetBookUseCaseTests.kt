package com.probablefish.msb.usecasetests

import com.probablefish.msb.Book
import com.probablefish.msb.BookRepository
import com.probablefish.msb.IBookRepository
import com.probablefish.msb.usecases.GetBookUseCase
import org.junit.Test

class GetBookUseCaseTests {

    @Test
    fun `when a book title matches one in the repository then it is returned`() {
        val book = Book(title = "book1")
        val bookRepository: IBookRepository = BookRepository().apply { addBook(book) }

        val result = GetBookUseCase(bookRepository).execute("book1")

        assert(result?.title == book.title)
    }

    @Test
    fun `when a book title does not match any in the repository then null is returned`() {
        val bookRepository: IBookRepository = BookRepository().apply {
            addBook(
                Book("book1")
            )}

        val result = GetBookUseCase(bookRepository).execute("book2")

        assert(result == null)
    }

}