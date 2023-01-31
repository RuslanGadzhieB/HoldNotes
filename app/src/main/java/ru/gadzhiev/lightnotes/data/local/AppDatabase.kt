package ru.gadzhiev.lightnotes.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.gadzhiev.lightnotes.domain.model.Note
import ru.gadzhiev.lightnotes.domain.repository.NoteRepository


@Database(entities = [Note::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteRepository

}