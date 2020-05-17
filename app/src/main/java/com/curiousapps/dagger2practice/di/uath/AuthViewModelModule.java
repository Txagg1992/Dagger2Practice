package com.curiousapps.dagger2practice.di.uath;

import androidx.lifecycle.ViewModel;

import com.curiousapps.dagger2practice.di.ViewModelKey;
import com.curiousapps.dagger2practice.ui.auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);
}
