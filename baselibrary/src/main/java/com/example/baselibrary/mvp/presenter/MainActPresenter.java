package com.example.baselibrary.mvp.presenter;

import com.sjl.yuehu.api.SimpleAPICallBack;
import com.sjl.yuehu.data.bean.TitileBean;
import com.sjl.yuehu.injector.component.DataManager;
import com.sjl.yuehu.mvp.view.MainActMvpView;
import com.sjl.yuehu.ui.base.BasePresenter;

import javax.inject.Inject;

import rx.Subscription;

/**
 * Created by 小鹿 on 2017/2/8.
 */

public class MainActPresenter extends BasePresenter<MainActMvpView> {
    private DataManager dataManager;
    private Subscription subscription;
    private int pageIndex = -1;

    @Inject
    public MainActPresenter(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    //
    @Override
    public void detachView() {
        super.detachView();
        if (subscription != null && !subscription.isUnsubscribed())
            subscription.unsubscribe();
    }


    public void onList() {
        SimpleAPICallBack<TitileBean> simpleAPICallBack=new SimpleAPICallBack<TitileBean>(){
            @Override
            public void onNext(TitileBean titileBean) {
                super.onNext(titileBean);
            }

            @Override
            public void onCompleted() {
                super.onCompleted();
            }

        };
       /* Subscriber<TitileBean> subscriber=new Subscriber<TitileBean>(){

            @Override
            public void onCompleted() {
                LogUtil.e("请求完成");
            }

            @Override
            public void onError(Throwable e) {
                LogUtil.e(e + "");
            }

            @Override
            public void onNext(TitileBean titileBean) {
                if (isViewAttached())
                    getMvpView().onList(titileBean);
            }

        };*/
        subscription = dataManager.getLeftContent(simpleAPICallBack);
    }

}
