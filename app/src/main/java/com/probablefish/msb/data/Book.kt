package com.probablefish.msb.data

import androidx.room.Entity

@Entity
data class Book(
    val title: String,
    val author: String?,
    var publisher: String?,
    var publishedDate: String?,
    var description: String?,
    var coverImageUrl: String?,
    var coverImageLocalId: Int?,
    var isAttained: Boolean = false
)

