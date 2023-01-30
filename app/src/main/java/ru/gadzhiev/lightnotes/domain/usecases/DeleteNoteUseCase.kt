package ru.gadzhiev.lightnotes.domain.usecases

import ru.gadzhiev.lightnotes.domain.model.Note
import ru.gadzhiev.lightnotes.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteNoteUseCase @Inject constructor(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.deleteNote(note = note)
}