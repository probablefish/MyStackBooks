package com.probablefish.msb.usecases

import com.probablefish.msb.local.ILocalBookRepository

class GetBookUseCase(private val bookRepository: ILocalBookRepository) {

    fun execute(title: String) = bookRepository.getBook(title)
}