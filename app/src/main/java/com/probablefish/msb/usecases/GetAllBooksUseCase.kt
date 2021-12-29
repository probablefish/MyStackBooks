package com.probablefish.msb.usecases

import com.probablefish.msb.local.ILocalBookRepository

class GetAllBooksUseCase(private val bookRepository: ILocalBookRepository) {

    fun execute() = bookRepository.getBooks()
}