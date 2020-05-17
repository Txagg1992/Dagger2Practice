package com.curiousapps.dagger2practice.di;

import com.curiousapps.dagger2practice.di.uath.AuthViewModelModule;
import com.curiousapps.dagger2practice.ui.auth.AuthActivity;
import com.curiousapps.dagger2practice.ui.auth.AuthViewModel;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

}
