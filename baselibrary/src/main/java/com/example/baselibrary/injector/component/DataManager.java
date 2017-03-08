package com.example.baselibrary.injector.component;

import com.example.baselibrary.api.ApiService;
import com.example.baselibrary.bean.TitileBean;
import com.google.gson.Gson;


import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by ZQ on 2017/2/8.
 */
@Singleton
public class DataManager {
    private final ApiService apiService;
    private final Gson gson;

    @Inject
    public DataManager(ApiService apiService, Gson gson) {
        this.apiService = apiService;
        this.gson = gson;
    }

    //左侧标题栏
    public Subscription getLeftContent(Subscriber<TitileBean> subscriber) {
        return apiService.getLeftContent()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

}
