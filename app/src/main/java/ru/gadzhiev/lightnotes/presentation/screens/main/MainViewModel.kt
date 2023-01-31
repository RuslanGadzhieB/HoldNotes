package ru.gadzhiev.lightnotes.presentation.screens.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import ru.gadzhiev.lightnotes.domain.model.Note
import ru.gadzhiev.lightnotes.domain.usecases.GetAllNoteUseCase
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getAllNoteUseCase: GetAllNoteUseCase
): ViewModel() {
    private val _notes = MutableLiveData<List<Note>>()
    val notes:LiveData<List<Note>>
        get() = _notes

    init {
        getAllNotes()
    }

    fun getAllNotes(){
        viewModelScope.launch {
            getAllNoteUseCase.invoke().let {
                _notes.postValue(it)
            }
        }
    }
}