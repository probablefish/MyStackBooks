package com.probablefish.msb.usecases

import com.probablefish.msb.IBookRepository

class RemoveAllBooksUseCase(private val repository: IBookRepository) {

    fun execute() {
        repository.removeAllBooks()
    }
}