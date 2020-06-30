package com.example.roomdbkotlin

import androidx.room.Database
import androidx.room.DatabaseConfiguration
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteOpenHelper

@Database(entities = [(BookEntity::class)], version = 1, exportSchema = true)
abstract class BookDB : RoomDatabase() {

    abstract fun bookDao(): BookDAO

}