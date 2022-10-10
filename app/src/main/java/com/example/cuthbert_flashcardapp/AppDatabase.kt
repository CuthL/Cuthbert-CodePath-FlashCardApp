package com.example.cuthbert_flashcardapp

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Flashcard::class], version = 1)

abstract class AppDatabase : RoomDatabase() {
    abstract fun flashcardDao(): FlashcardDao
}
