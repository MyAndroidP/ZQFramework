package com.example.baselibrary.injector.module;

import android.content.Context;


import com.example.baselibrary.App;
import com.example.baselibrary.injector.scope.ForApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ZQ on 2017/2/4.
 */
@Module
public class ApplicationModule {
    private  App mApplication;

    public ApplicationModule(App application) {
        this.mApplication = application;
    }

    @Provides
    @Singleton
    public App provideApplication() {
        return mApplication;
    }

    @Provides
    @ForApplication
    Context provideContext() {
        return mApplication;
    }
}
