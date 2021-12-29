package com.probablefish.msb.usecases

import com.probablefish.msb.local.ILocalBookRepository

class RemoveBookUseCase(private val repository: ILocalBookRepository) {

    fun execute(title: String) = repository.removeBook(title)
}