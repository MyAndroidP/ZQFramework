package com.example.baselibrary.mvp.view;

import com.sjl.yuehu.data.bean.TitileBean;
import com.sjl.yuehu.ui.base.MvpView;

/**
 * Created by 小鹿 on 2017/2/8.
 */

public interface MainActMvpView extends MvpView {
    void onList(TitileBean remoteResult);
}
