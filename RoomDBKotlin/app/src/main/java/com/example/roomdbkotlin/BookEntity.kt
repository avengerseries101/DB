package com.example.roomdbkotlin

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class BookEntity {

    @PrimaryKey(autoGenerate = true)
    var id: Int? = 0

    var name: String? = ""
    var author: String? = ""


}