package com.probablefish.msb.local

import com.probablefish.msb.data.Book

interface ILocalBookRepository {
    fun addBook(book: Book)
    fun addBooks(books: List<Book>)
    fun getBook(title: String, author: String) : Book?
    fun getBooks() : List<Book>
    fun removeBook(title: String, author: String)
    fun removeAllBooks()
    fun setBookAsAttained(title: String, author: String)
    fun setBookAsUnattained(title: String, author: String)
}