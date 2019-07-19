
package com.example.mapandlocationexample.geolocationpojo;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GeocodingObject implements Parcelable
{

    @SerializedName("results")
    @Expose
    private List<Result> results = null;
    @SerializedName("status")
    @Expose
    private String status;
    public final static Parcelable.Creator<GeocodingObject> CREATOR = new Creator<GeocodingObject>() {


        @SuppressWarnings({
            "unchecked"
        })
        public GeocodingObject createFromParcel(Parcel in) {
            return new GeocodingObject(in);
        }

        public GeocodingObject[] newArray(int size) {
            return (new GeocodingObject[size]);
        }

    }
    ;

    protected GeocodingObject(Parcel in) {
        in.readList(this.results, (Result.class.getClassLoader()));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public GeocodingObject() {
    }

    /**
     * 
     * @param results
     * @param status
     */
    public GeocodingObject(List<Result> results, String status) {
        super();
        this.results = results;
        this.status = status;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(results);
        dest.writeValue(status);
    }

    public int describeContents() {
        return  0;
    }

}
