package com.probablefish.msb.local

import com.probablefish.msb.data.Book

class LocalBookRepository : ILocalBookRepository {
    private val books = mutableListOf<Book>()

    override fun addBook(book: Book) {
        books.add(book)
    }

    override fun addBooks(booksToBeAdded: List<Book>) {
        books.addAll(booksToBeAdded)
    }

    override fun getBook(title: String): Book? {
        return books.find { book -> book.title == title }
    }

    override fun getBooks(): List<Book> {
        return books
    }

    override fun removeBook(title: String) {
        books.removeIf { book -> book.title == title}
    }

    override fun removeAllBooks() {
        books.clear()
    }

}