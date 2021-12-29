package com.probablefish.msb.usecases

import com.probablefish.msb.local.ILocalBookRepository

class RemoveAllBooksUseCase(private val repository: ILocalBookRepository) {

    fun execute() {
        repository.removeAllBooks()
    }
}