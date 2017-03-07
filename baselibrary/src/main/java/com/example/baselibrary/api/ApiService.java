package com.example.baselibrary.api;

import com.sjl.yuehu.data.bean.HomeBean;
import com.sjl.yuehu.data.bean.ThemesBean;
import com.sjl.yuehu.data.bean.TitileBean;
import com.sjl.yuehu.data.bean.WebBean;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by 小鹿 on 2017/2/4.
 */

public interface ApiService {


    //    @POST("login/VerifyCodeMobile")
//    @FormUrlEncoded
//    Observable<RemoteResult<JsonObject>> verifyCodeMobile(@Field("para") String para);
//
//    @POST("login/Regedit")
//    @Multipart
//    Observable<RemoteResult<JsonObject>> regedit(@PartMap HashMap<String, RequestBody> params);

    @GET("themes")
    Observable <TitileBean> getLeftContent();

    @GET("theme/{id}")
    Observable <ThemesBean>onLoad(@Path("id") int id);

    @GET("news/latest")
    Observable <HomeBean> onLatest();

    @GET("news/{id}")
    Observable <WebBean>onLoadWeb(@Path("id") int id);

    @GET("news/before/{date}")
    Observable <HomeBean> onGone(@Path("date") String date);
//  at.zhihu.com/api/4/section/34/before/1465772400
    @GET("theme/{id}/before/{timestamp}")
    Observable <ThemesBean> onThemeGone(@Path("timestamp") String timestamp, @Path("id") int id);
}
