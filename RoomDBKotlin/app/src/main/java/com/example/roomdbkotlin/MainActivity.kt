package com.example.roomdbkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.room.Room

class MainActivity : AppCompatActivity() {

    private lateinit var addButton: Button
    private lateinit var displayButton: Button
    private lateinit var editName: EditText
    private lateinit var editAuthor: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton = findViewById(R.id.btn_addBook)
        displayButton = findViewById(R.id.btn_displayAllBooks)
        editName = findViewById(R.id.et_name)
        editAuthor = findViewById(R.id.et_author)

        val db = Room.databaseBuilder(applicationContext, BookDB::class.java, "MyBookDB").allowMainThreadQueries().build()

        addButton.setOnClickListener {
                val book = BookEntity()

                book.name = editName.text.toString()
                book.author = editAuthor.text.toString()

                Log.d("@@@@@","Inserted Book is : ${book.id}, ${book.name}, ${book.author}")
                db.bookDao().insertBook(book)
        }

        displayButton.setOnClickListener {
                val list: List<BookEntity> = db.bookDao().readBook()
                list.forEach {
                    Log.d("@@@@@", "Book id : ${it.id}")
                    Log.d("@@@@@", "Book name : ${it.name}")
                    Log.d("@@@@@", "Book author : ${it.author}")
                }
        }
    }
}
