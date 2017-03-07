package com.example.baselibrary.mvp.presenter;

import com.facebook.stetho.common.LogUtil;
import com.sjl.yuehu.api.ApiService;
import com.sjl.yuehu.data.bean.HomeBean;
import com.sjl.yuehu.injector.component.DataManager;
import com.sjl.yuehu.mvp.view.HomePageMvpView;
import com.sjl.yuehu.ui.base.BasePresenter;

import javax.inject.Inject;

import rx.Subscriber;
import rx.Subscription;

/**
 * Created by 小鹿 on 2017/2/8.
 */

public class HomePagePresenter extends BasePresenter<HomePageMvpView> {
    private DataManager dataManager;
    private Subscription subscription;
    private int pageIndex = -1;
    @Inject
    ApiService apiService;

    @Inject
    public HomePagePresenter(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    //
    @Override
    public void detachView() {
        super.detachView();
        if (subscription != null && !subscription.isUnsubscribed())
            subscription.unsubscribe();
    }

    //
    public void onLoad() {
//        SimpleAPICallBack<JsonObject> subscriber = new SimpleAPICallBack<JsonObject>() {
//            @Override
//            public void onNext(JsonObject remoteResult) {
//                super.onNext(remoteResult);
//                if (isViewAttached()) {
//                    LogUtil.e(remoteResult + "");
//                    getMvpView().onList(true, remoteResult);
//                }
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                if (isViewAttached())
//                    getMvpView().onList(false, null);
//            }
//
//            @Override
//            protected void onResultError(ApiException ex) {
//                if (isViewAttached())
//                    getMvpView().onList(false, null);
//            }
//        };

//
//        String para ="";
//        subscription = dataManager.getHomePage(para, subscriber);
//        OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                .connectTimeout(15 * 1000L, TimeUnit.MILLISECONDS)//15
//                .readTimeout(20 * 1000L, TimeUnit.MILLISECONDS)//20
//                .writeTimeout(30 * 1000L, TimeUnit.MILLISECONDS)//15
//                .build(); //设置缓存目录和20M缓存;
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("http://news-at.zhihu.com/api/4/")
//                .client(okHttpClient)
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//                .build();
//        ApiService apiService = retrofit.create(ApiService.class);
//        Call<JsonObject> repos = apiService.getData();
//        repos.enqueue(new Callback<JsonObject>() {
//            @Override
//            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
//                Log.e("APP",response.body()+"");
//            }
//
//            @Override
//            public void onFailure(Call<JsonObject> call, Throwable t) {
//                t.printStackTrace();
//            }
//        });
//        Subscriber<TitileBean> subscriber=new Subscriber<TitileBean>(){
//
//            @Override
//            public void onCompleted() {
//                LogUtil.e("请求完成");
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                LogUtil.e(e + "");
//            }
//
//            @Override
//            public void onNext(TitileBean titileBean) {
//                if (isViewAttached())
//                    getMvpView().onList(titileBean);
//            }
//
//        };
//        subscription = dataManager.getLeftContent(subscriber);
//        apiService.getLeftList()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Subscriber<TitileBean>() {
//                    @Override
//                    public void onCompleted() {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onNext(TitileBean jsonObject) {
//                        LogUtil.e(jsonObject + "");
//                    }
//                });


    }

    public void onLoadLatest() {
        Subscriber<HomeBean> subscriber=new Subscriber<HomeBean>(){

            @Override
            public void onCompleted() {
                LogUtil.e("请求完成");
            }

            @Override
            public void onError(Throwable e) {
                LogUtil.e(e + "");
            }

            @Override
            public void onNext(HomeBean titileBean) {
                if (isViewAttached())
                    getMvpView().onList(titileBean);
            }

        };
        subscription = dataManager.getLatest(subscriber);

    }

    public void onLoadGone(String date) {
        Subscriber<HomeBean> subscriber=new Subscriber<HomeBean>(){

            @Override
            public void onCompleted() {
                LogUtil.e("请求完成");
            }

            @Override
            public void onError(Throwable e) {
                LogUtil.e(e + "");
            }

            @Override
            public void onNext(HomeBean titileBean) {
                if (isViewAttached())
                    getMvpView().onList(titileBean);
            }

        };
        subscription = dataManager.getGone(subscriber,date);

    }
}
