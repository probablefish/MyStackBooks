package com.probablefish.msb.usecasetests

import com.probablefish.msb.data.Book
import com.probablefish.msb.local.LocalBookRepository
import com.probablefish.msb.local.ILocalBookRepository
import com.probablefish.msb.usecases.GetBookUseCase
import org.junit.Test

class GetBookUseCaseTests {

    @Test
    fun `when a book title matches one in the repository then it is returned`() {
        val book = Book(title = "book1")
        val bookRepository: ILocalBookRepository = LocalBookRepository().apply { addBook(book) }

        val result = GetBookUseCase(bookRepository).execute(title = "book1")

        assert(result?.title == book.title)
    }

    @Test
    fun `when a book title does not match any in the repository then null is returned`() {
        val bookRepository: ILocalBookRepository = LocalBookRepository().apply {
            addBook(
                Book(title = "book1")
            )}

        val result = GetBookUseCase(bookRepository).execute(title = "book2")

        assert(result == null)
    }

}