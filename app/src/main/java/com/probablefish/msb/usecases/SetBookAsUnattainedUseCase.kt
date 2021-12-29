package com.probablefish.msb.usecases

import com.probablefish.msb.local.ILocalBookRepository

class SetBookAsUnattainedUseCase(private val bookRepository: ILocalBookRepository) {

    fun execute(title: String) = bookRepository.setBookAsUnattained(title)
}