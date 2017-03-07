package com.example.baselibrary.injector.component;

import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.sjl.yuehu.App;
import com.sjl.yuehu.api.ApiService;
import com.sjl.yuehu.injector.module.ApiModule;
import com.sjl.yuehu.injector.module.ApplicationModule;
import com.sjl.yuehu.injector.module.DataModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by 小鹿 on 2017/2/4.
 */
@Singleton
@Component(modules = {ApplicationModule.class,DataModule.class,ApiModule.class})
public interface ApplicationComponent {
    App application();

    SharedPreferences sharedPreferences();

    Gson gson();

    DataManager dataManager();

    ApiService apiservice();
}
