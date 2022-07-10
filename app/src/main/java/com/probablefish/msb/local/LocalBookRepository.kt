package com.probablefish.msb.local

import com.probablefish.msb.data.Book
import com.probablefish.msb.local.database.BookDao

class LocalBookRepository(private val bookDao: BookDao) : ILocalBookRepository {

    override fun addBook(book: Book) =
        bookDao.insert(book)


    override fun addBooks(books: List<Book>) {
        bookDao.insertAll(books)
    }

    override fun getBook(title: String, author: String): Book? =
        bookDao.findByTitleAndAuthor(title, author)

    override fun getBooks(): List<Book> = bookDao.getAll()

    override fun removeBook(title: String, author: String) {
        bookDao.findByTitleAndAuthor(title, author)?.let {
            bookDao.delete(it)
        }
    }

    override fun removeAllBooks() {
        bookDao.deleteAll()
    }

    override fun setBookAsAttained(title: String, author: String) {
        bookDao.setIsAttained(true, title, author)
    }

    override fun setBookAsUnattained(title: String, author: String) {
        bookDao.setIsAttained(false, title, author)
    }
}