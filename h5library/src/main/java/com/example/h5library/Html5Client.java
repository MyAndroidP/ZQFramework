package com.example.h5library;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

import com.example.h5library.Implementation.BaseHtmlcallAndroid;


/**
 * Created by ZQ on 2017/3/7.
 */

public class Html5Client {
    /**
     * 仅加载url
     * @param context
     * @param url
     */
    public static void launch(Context context, String url) {
        launch(context,url,null);
    }

    /**
     *  html5交互
     * @param context
     * @param url
     * @param bean
     */
    public static void launch(Context context, String url, BaseHtmlcallAndroid bean) {
        if (TextUtils.isEmpty(url)){
            throw new RuntimeException("the url is empty~!");
        }
        Intent intent=new Intent(context,Html5Activity.class);
        intent.putExtra("url",url);
        if (bean!=null){
            intent.putExtra("javascript",bean);
        }
        context.startActivity(intent);
    }


}
