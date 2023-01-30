package ru.gadzhiev.lightnotes.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.gadzhiev.lightnotes.data.local.dao.NoteRepositoryImpl
import ru.gadzhiev.lightnotes.domain.model.Note


@Database(entities = [Note::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun noteDao():NoteRepositoryImpl
}