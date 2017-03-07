package com.example.baselibrary.mvp.view;

import com.sjl.yuehu.data.bean.HomeBean;
import com.sjl.yuehu.ui.base.MvpView;

/**
 * Created by 小鹿 on 2017/2/8.
 */

public interface HomePageMvpView extends MvpView {
    void onList(HomeBean jsonObject);
}
