package com.probablefish.msb.usecasetests

import com.probablefish.msb.data.AttainedState
import com.probablefish.msb.data.Book
import com.probablefish.msb.local.LocalBookRepository
import com.probablefish.msb.usecases.SetBookAsAttainedUseCase
import org.junit.Test

class SetBookAsAttainedUseCaseTest {

    @Test
    fun `given a book title that exists in the local repository, when the usecase is executed, it has a state of attained`() {
        val book = Book(title = "book1", attainedState = AttainedState.UNATTAINED)
        val bookRepository = LocalBookRepository().apply {
            addBook(book)
        }

        SetBookAsAttainedUseCase(bookRepository).execute(book.title)

        val result = bookRepository.getBook(book.title)
        assert(result?.attainedState == AttainedState.ATTAINED)
    }
}