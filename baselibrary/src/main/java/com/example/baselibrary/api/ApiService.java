package com.example.baselibrary.api;


import com.example.baselibrary.bean.TitileBean;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by ZQ on 2017/2/4.
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

}
