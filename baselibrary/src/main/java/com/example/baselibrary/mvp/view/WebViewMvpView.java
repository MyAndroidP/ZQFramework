package com.example.baselibrary.mvp.view;

import com.sjl.yuehu.data.bean.WebBean;
import com.sjl.yuehu.ui.base.MvpView;

/**
 * Created by 小鹿 on 2017/2/13.
 */
public interface WebViewMvpView extends MvpView {
    void onLoad(WebBean bean);
}
