package com.probablefish.msb.usecasetests

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import com.probablefish.msb.local.database.BookDao
import com.probablefish.msb.local.database.MyStackBooksDatabase
import org.junit.After
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mockito.mock
import java.io.IOException

open class LocalStorageTest {

    lateinit var bookDao: BookDao

    @Before
    fun mockBookDao() {
        bookDao = mock(BookDao::class.java)
    }

    @After
    @Throws(IOException::class)
    fun clearBookDaoMock() {
        //bookDao = null
    }
}