package com.example.baselibrary.injector.module;

import android.content.Context;


import com.example.baselibrary.injector.scope.ForActivity;
import com.example.baselibrary.mvp.base.BaseAct;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ZQ on 2017/2/4.
 */
@Module
public class ActivityModule {

    private BaseAct mActivity;

    public ActivityModule(BaseAct activity) {
        mActivity = activity;
    }

    @Provides
    BaseAct provideActivity() {
        return mActivity;
    }

    @Provides
    @ForActivity
    Context providesContext() {
        return mActivity;
    }
}
