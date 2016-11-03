package com.caoye.newsapp;

import com.caoye.newsapp.Model.NewsGson;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by admin on 10/28/16.
 */
public interface ApiService {
    @GET("keji/")
    Observable<NewsGson> getNewsData(@Query("key")String key, @Query("num") String num, @Query("page") int page);
}
