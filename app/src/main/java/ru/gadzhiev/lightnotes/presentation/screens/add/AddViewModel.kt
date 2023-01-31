package ru.gadzhiev.lightnotes.presentation.screens.add

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import ru.gadzhiev.lightnotes.domain.model.Note
import ru.gadzhiev.lightnotes.domain.usecases.AddNoteUseCase
import javax.inject.Inject


@HiltViewModel
class AddViewModel @Inject constructor(
    private val addNoteUseCase: AddNoteUseCase
): ViewModel() {

    fun addNote(note: Note, onSuccess: () -> Unit) {
        viewModelScope.launch {
            addNoteUseCase.invoke(note = note)
            onSuccess()
        }
    }

}