package com.probablefish.msb.usecases

import com.probablefish.msb.IBookRepository

class RemoveBookUseCase(private val repository: IBookRepository) {

    fun execute(title: String) = repository.removeBook(title)
}