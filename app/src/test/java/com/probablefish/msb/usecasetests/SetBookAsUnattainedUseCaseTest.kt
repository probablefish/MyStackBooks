package com.probablefish.msb.usecasetests

import com.probablefish.msb.data.AttainedState
import com.probablefish.msb.data.Book
import com.probablefish.msb.local.LocalBookRepository
import com.probablefish.msb.usecases.SetBookAsUnattainedUseCase
import org.junit.Test

class SetBookAsUnattainedUseCaseTest {

    @Test
    fun `given a book title that exists in the local repository, when the usecase is executed, it has a state of unattained`() {
        val book = Book(title = "book1", attainedState = AttainedState.ATTAINED)
        val bookRepository = LocalBookRepository().apply {
            addBook(book)
        }

        SetBookAsUnattainedUseCase(bookRepository).execute(book.title)

        val result = bookRepository.getBook(book.title)
        assert(result?.attainedState == AttainedState.UNATTAINED)
    }
}