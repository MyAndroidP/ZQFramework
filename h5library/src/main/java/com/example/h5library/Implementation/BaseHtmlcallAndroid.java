package com.example.h5library.Implementation;

import android.webkit.JavascriptInterface;

import java.io.Serializable;

/**
 * Created by ZQ on 2017/3/7.
 */

public abstract class BaseHtmlcallAndroid implements Serializable{
    //给html提供的方法，js中可以通过：var str = window.jsObj.HtmlcallJava(); 获取到
    @JavascriptInterface
    public abstract void HtmlcallJava() ;

    //给html提供的有参函数 ： window.jsObj.HtmlcallJava2("IT-homer blog");
    @JavascriptInterface
    public abstract String HtmlcallJava2(final String param) ;
}
