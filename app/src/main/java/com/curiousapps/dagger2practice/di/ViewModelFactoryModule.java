package com.curiousapps.dagger2practice.di;

import androidx.lifecycle.ViewModelProvider;

import com.curiousapps.dagger2practice.viewModels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory modelProviderFactory);
}
