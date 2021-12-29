package com.probablefish.msb

interface IBookRepository {
    fun addBook(book: Book)
    fun getBook(title: String) : Book?
    fun getBooks() : List<Book>
}