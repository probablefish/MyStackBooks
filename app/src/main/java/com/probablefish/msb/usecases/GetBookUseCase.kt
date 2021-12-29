package com.probablefish.msb.usecases

import com.probablefish.msb.IBookRepository

class GetBookUseCase(private val bookRepository: IBookRepository) {

    fun execute(title: String) = bookRepository.getBook(title)
}