
package com.example.mapandlocationexample.reversegeolocationpojo;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bounds implements Parcelable
{

    @SerializedName("northeast")
    @Expose
    private Northeast_ northeast;
    @SerializedName("southwest")
    @Expose
    private Southwest_ southwest;
    public final static Parcelable.Creator<Bounds> CREATOR = new Creator<Bounds>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Bounds createFromParcel(Parcel in) {
            return new Bounds(in);
        }

        public Bounds[] newArray(int size) {
            return (new Bounds[size]);
        }

    }
    ;

    protected Bounds(Parcel in) {
        this.northeast = ((Northeast_) in.readValue((Northeast_.class.getClassLoader())));
        this.southwest = ((Southwest_) in.readValue((Southwest_.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Bounds() {
    }

    /**
     * 
     * @param southwest
     * @param northeast
     */
    public Bounds(Northeast_ northeast, Southwest_ southwest) {
        super();
        this.northeast = northeast;
        this.southwest = southwest;
    }

    public Northeast_ getNortheast() {
        return northeast;
    }

    public void setNortheast(Northeast_ northeast) {
        this.northeast = northeast;
    }

    public Southwest_ getSouthwest() {
        return southwest;
    }

    public void setSouthwest(Southwest_ southwest) {
        this.southwest = southwest;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(northeast);
        dest.writeValue(southwest);
    }

    public int describeContents() {
        return  0;
    }

}
