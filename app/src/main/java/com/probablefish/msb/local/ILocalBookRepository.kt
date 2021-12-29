package com.probablefish.msb.local

import com.probablefish.msb.data.Book

interface ILocalBookRepository {
    fun addBook(book: Book)
    fun addBooks(books: List<Book>)
    fun getBook(title: String) : Book?
    fun getBooks() : List<Book>
    fun removeBook(title: String)
    fun removeAllBooks()
}