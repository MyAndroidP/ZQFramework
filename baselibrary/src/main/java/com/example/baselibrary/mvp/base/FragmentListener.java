package com.example.baselibrary.mvp.base;

/**
 * Created by 小鹿 on 2017/2/4.
 */
public interface FragmentListener {
    void switchFragment(BaseFg fragment, boolean addToBackStack);

    void fragmentVisible(BaseFg fragment);

    void updateTitle(String title);
}
