package com.probablefish.msb.data

import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    tableName = "books",
    primaryKeys = ["title", "author"])
data class Book(
    val title: String,
    val author: String,
    var publisher: String? = null,
    var publishedDate: String? = null,
    var description: String? = null,
    var isAttained: Boolean = false,
    var imageUrl: String? = null,
    var imageFileLocation: String? = null

)

