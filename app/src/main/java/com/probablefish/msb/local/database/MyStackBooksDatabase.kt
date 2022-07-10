package com.probablefish.msb.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.probablefish.msb.data.Book

@Database(entities = [Book::class], version = 1)
abstract class MyStackBooksDatabase : RoomDatabase() {
    abstract fun bookDao() : BookDao
}