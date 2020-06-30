package com.example.roomdbkotlin

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BookDAO {

    @Insert
    fun insertBook(book: BookEntity)

    @Query("SELECT * FROM BookEntity")
    fun readBook():List<BookEntity>
}