package com.probablefish.msb

interface IBookRepository {
    fun addBook(book: Book)
    fun addBooks(books: List<Book>)
    fun getBook(title: String) : Book?
    fun getBooks() : List<Book>
    fun removeBook(title: String)
    fun removeAllBooks()
}