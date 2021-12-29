package com.probablefish.msb

class BookRepository : IBookRepository {
    private val books = mutableListOf<Book>()

    override fun addBook(book: Book) {
        books.add(book)
    }

    override fun getBook(title: String): Book? {
        return books.find { book -> book.title == title }
    }

    override fun getBooks(): List<Book> {
        return books
    }

}