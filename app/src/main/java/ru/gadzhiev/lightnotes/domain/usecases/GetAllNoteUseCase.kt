package ru.gadzhiev.lightnotes.domain.usecases

import ru.gadzhiev.lightnotes.domain.repository.NoteRepository
import javax.inject.Inject

class GetAllNoteUseCase @Inject constructor(private val noteRepository: NoteRepository) {
    suspend operator fun invoke() = noteRepository.getAllNotes()
}