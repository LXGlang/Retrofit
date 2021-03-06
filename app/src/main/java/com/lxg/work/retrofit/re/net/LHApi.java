package com.lxg.work.retrofit.re.net;


import com.lxg.work.retrofit.re.entity.response.WanAndroidBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Lxg on 2018/5/24 0024.
 */
public interface LHApi {
    @GET("wxarticle/chapters/json")
    Observable<WanAndroidBean> getWanAndroid();
}
