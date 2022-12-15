package com.example.proyecto.viewmodels;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.example.proyecto.repository.EventRepository;

public class ListaEventosViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private final EventRepository mRepository;

    public ListaEventosViewModelFactory(EventRepository repository) {
        this.mRepository = repository;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        //noinspection unchecked
        return (T) new ListaEventosViewModel(mRepository);
    }
}