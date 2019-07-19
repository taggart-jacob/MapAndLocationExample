package com.example.mapandlocationexample;

import com.example.mapandlocationexample.geolocationpojo.GeocodingObject;
import com.example.mapandlocationexample.reversegeolocationpojo.ReverseGeocodingObject;

import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public class GeolocationRetrofit {
    //COME BACK TO THIS IF THERE ARE ISSUES
    public static final String BASE_URL = "https://maps.googleapis.com/maps/api/geocode/";
    public static final String PATH = "json";
    public static final String QUERY_GEO = "address";
    public static final String QUERY_REVERSE = "latlng";
    public static final String QUERY_KEY = "key";

    public Retrofit getRetroFitInstance(){
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor()
                        .setLevel(HttpLoggingInterceptor.Level.BODY)).build();

        return new Retrofit.Builder().baseUrl(BASE_URL).client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public RetrofitGeoApiService getGeo(){
        return getRetroFitInstance().create(RetrofitGeoApiService.class);
    }

    public interface RetrofitGeoApiService{
        @GET(PATH)
        Call<GeocodingObject> getGeolocation(@Query(QUERY_GEO) String address, @Query(QUERY_KEY) String key);
    }

    public RetrofitApiReverseService getReverse(){
        return getRetroFitInstance().create(RetrofitApiReverseService.class);
    }

    public interface RetrofitApiReverseService{
        @GET(PATH)
        Call<ReverseGeocodingObject> getReverse(@Query(QUERY_REVERSE) String coords, @Query(QUERY_KEY) String key);
    }
}
