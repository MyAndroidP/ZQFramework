package com.example.baselibrary.injector.component;

import android.content.SharedPreferences;

import com.example.baselibrary.api.ApiService;
import com.example.baselibrary.injector.module.ApiModule;
import com.example.baselibrary.injector.module.ApplicationModule;
import com.example.baselibrary.injector.module.DataModule;
import com.google.gson.Gson;


import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by 小鹿 on 2017/2/4.
 */
@Singleton
@Component(modules = {ApplicationModule.class,DataModule.class,ApiModule.class})
public interface ApplicationComponent {

    SharedPreferences sharedPreferences();

    Gson gson();

    DataManager dataManager();

    ApiService apiservice();
}
