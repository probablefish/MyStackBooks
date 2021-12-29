package com.probablefish.msb.usecases

import com.probablefish.msb.local.ILocalBookRepository

class SetBookAsAttainedUseCase(private val bookRepository: ILocalBookRepository) {

    fun execute(title: String) = bookRepository.setBookAsAttained(title)
}