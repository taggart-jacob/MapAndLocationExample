
package com.example.mapandlocationexample.reversegeolocationpojo;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReverseGeocodingObject implements Parcelable
{

    @SerializedName("plus_code")
    @Expose
    private PlusCode plusCode;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;
    @SerializedName("status")
    @Expose
    private String status;
    public final static Parcelable.Creator<ReverseGeocodingObject> CREATOR = new Creator<ReverseGeocodingObject>() {


        @SuppressWarnings({
            "unchecked"
        })
        public ReverseGeocodingObject createFromParcel(Parcel in) {
            return new ReverseGeocodingObject(in);
        }

        public ReverseGeocodingObject[] newArray(int size) {
            return (new ReverseGeocodingObject[size]);
        }

    }
    ;

    protected ReverseGeocodingObject(Parcel in) {
        this.plusCode = ((PlusCode) in.readValue((PlusCode.class.getClassLoader())));
        in.readList(this.results, (Result.class.getClassLoader()));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReverseGeocodingObject() {
    }

    /**
     * 
     * @param results
     * @param status
     * @param plusCode
     */
    public ReverseGeocodingObject(PlusCode plusCode, List<Result> results, String status) {
        super();
        this.plusCode = plusCode;
        this.results = results;
        this.status = status;
    }

    public PlusCode getPlusCode() {
        return plusCode;
    }

    public void setPlusCode(PlusCode plusCode) {
        this.plusCode = plusCode;
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
        dest.writeValue(plusCode);
        dest.writeList(results);
        dest.writeValue(status);
    }

    public int describeContents() {
        return  0;
    }

}
