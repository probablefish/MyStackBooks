package com.probablefish.msb.usecases

import com.probablefish.msb.IBookRepository

class GetAllBooksUseCase(private val bookRepository: IBookRepository) {

    fun execute() = bookRepository.getBooks()
}