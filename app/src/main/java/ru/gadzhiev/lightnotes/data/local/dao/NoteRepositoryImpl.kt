package ru.gadzhiev.lightnotes.data.local.dao


import ru.gadzhiev.lightnotes.domain.model.Note
import ru.gadzhiev.lightnotes.domain.repository.NoteRepository
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(private val noteRepositoryImpl: NoteRepository) {

    suspend fun getAllNotes(): List<Note> = noteRepositoryImpl.getAllNotes()
    suspend fun insertNote(note: Note) = noteRepositoryImpl.insertNote(note = note)
    suspend fun deleteNote(note: Note) = noteRepositoryImpl.deleteNote(note = note)
    suspend fun getNoteById(id: Long) = noteRepositoryImpl.getNoteById(nodeId = id)

}