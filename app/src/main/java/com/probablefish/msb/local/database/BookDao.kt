package com.probablefish.msb.local.database

import androidx.room.*
import com.probablefish.msb.data.Book

@Dao
interface BookDao {

    @Query("SELECT * FROM books")
    fun getAll() : List<Book>

    @Query("SELECT * FROM books WHERE title LIKE :title AND author LIKE :author LIMIT 1")
    fun findByTitleAndAuthor(title: String, author: String): Book?

    @Query("UPDATE books SET isAttained=:isAttained WHERE title = :title AND author = :author")
    fun setIsAttained(isAttained: Boolean, title: String, author: String)

    @Query("DELETE FROM books")
    fun deleteAll()

    @Delete
    fun delete(book: Book)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(book: Book)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(books: List<Book>)




}