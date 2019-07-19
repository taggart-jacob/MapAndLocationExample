
package com.example.mapandlocationexample.geolocationpojo;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Northeast implements Parcelable
{

    @SerializedName("lat")
    @Expose
    private Float lat;
    @SerializedName("lng")
    @Expose
    private Float lng;
    public final static Parcelable.Creator<Northeast> CREATOR = new Creator<Northeast>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Northeast createFromParcel(Parcel in) {
            return new Northeast(in);
        }

        public Northeast[] newArray(int size) {
            return (new Northeast[size]);
        }

    }
    ;

    protected Northeast(Parcel in) {
        this.lat = ((Float) in.readValue((Float.class.getClassLoader())));
        this.lng = ((Float) in.readValue((Float.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Northeast() {
    }

    /**
     * 
     * @param lng
     * @param lat
     */
    public Northeast(Float lat, Float lng) {
        super();
        this.lat = lat;
        this.lng = lng;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLng() {
        return lng;
    }

    public void setLng(Float lng) {
        this.lng = lng;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(lat);
        dest.writeValue(lng);
    }

    public int describeContents() {
        return  0;
    }

}
