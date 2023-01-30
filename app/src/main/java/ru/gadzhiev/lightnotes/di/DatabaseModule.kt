package ru.gadzhiev.lightnotes.di

import android.content.Context
import androidx.room.Room
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ru.gadzhiev.lightnotes.data.local.AppDatabase
import ru.gadzhiev.lightnotes.data.local.dao.NoteRepositoryImpl


@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Provides
    fun providerAppData(@ApplicationContext appContext: Context): AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "notea_database"
        ).build()
    }

    @Provides
    fun provideNoteDao(appDatabase: AppDatabase): NoteRepositoryImpl{
        return appDatabase.noteDao()
    }
}