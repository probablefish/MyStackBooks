package com.probablefish.msb.di.modules

import android.content.Context
import androidx.room.Room
import com.probablefish.msb.local.database.MyStackBooksDatabase
import com.probablefish.msb.local.storage.coverimage.CoverImageRepository
import com.probablefish.msb.local.storage.coverimage.ICoverImageRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object StorageModule {

    @Singleton
    @Provides
    fun provideCoverImageRepository(@ApplicationContext context : Context) : ICoverImageRepository =
        CoverImageRepository(context)


    @Singleton
    @Provides
    fun provideBookDatabase(@ApplicationContext context : Context) : MyStackBooksDatabase =
        Room.databaseBuilder(
            context,
            MyStackBooksDatabase::class.java, "my-stack-books"
        ).build()
}