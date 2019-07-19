
package com.example.mapandlocationexample.reversegeolocationpojo;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Northeast_ implements Parcelable
{

    @SerializedName("lat")
    @Expose
    private Float lat;
    @SerializedName("lng")
    @Expose
    private Float lng;
    public final static Parcelable.Creator<Northeast_> CREATOR = new Creator<Northeast_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Northeast_ createFromParcel(Parcel in) {
            return new Northeast_(in);
        }

        public Northeast_[] newArray(int size) {
            return (new Northeast_[size]);
        }

    }
    ;

    protected Northeast_(Parcel in) {
        this.lat = ((Float) in.readValue((Float.class.getClassLoader())));
        this.lng = ((Float) in.readValue((Float.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Northeast_() {
    }

    /**
     * 
     * @param lng
     * @param lat
     */
    public Northeast_(Float lat, Float lng) {
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
