package com.probablefish.msb.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Book(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val author: String? = null,
    var publisher: String? = null,
    var publishedDate: String? = null,
    var description: String? = null,
    var coverImageDetailsId: Int? = null,
    var isAttained: Boolean = false,
    var imageUrl: String? = null,
    var imageFileLocation: String? = null

)

