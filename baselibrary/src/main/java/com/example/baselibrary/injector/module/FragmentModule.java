package com.example.baselibrary.injector.module;

import android.content.Context;


import com.example.baselibrary.mvp.base.BaseFg;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ZQ on 2017/2/4.
 */
@Module
public class FragmentModule {

    private BaseFg fragment;

    public FragmentModule(BaseFg fragment) {
        this.fragment = fragment;
    }

    @Provides
    BaseFg provideFragment() {
        return fragment;
    }

    @Provides
    Context provideContext() {
        return fragment.getContext();
    }
}
