
package com.example.mapandlocationexample.reversegeolocationpojo;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Geometry implements Parcelable
{

    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("location_type")
    @Expose
    private String locationType;
    @SerializedName("viewport")
    @Expose
    private Viewport viewport;
    @SerializedName("bounds")
    @Expose
    private Bounds bounds;
    public final static Parcelable.Creator<Geometry> CREATOR = new Creator<Geometry>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Geometry createFromParcel(Parcel in) {
            return new Geometry(in);
        }

        public Geometry[] newArray(int size) {
            return (new Geometry[size]);
        }

    }
    ;

    protected Geometry(Parcel in) {
        this.location = ((Location) in.readValue((Location.class.getClassLoader())));
        this.locationType = ((String) in.readValue((String.class.getClassLoader())));
        this.viewport = ((Viewport) in.readValue((Viewport.class.getClassLoader())));
        this.bounds = ((Bounds) in.readValue((Bounds.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Geometry() {
    }

    /**
     * 
     * @param bounds
     * @param viewport
     * @param location
     * @param locationType
     */
    public Geometry(Location location, String locationType, Viewport viewport, Bounds bounds) {
        super();
        this.location = location;
        this.locationType = locationType;
        this.viewport = viewport;
        this.bounds = bounds;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public Viewport getViewport() {
        return viewport;
    }

    public void setViewport(Viewport viewport) {
        this.viewport = viewport;
    }

    public Bounds getBounds() {
        return bounds;
    }

    public void setBounds(Bounds bounds) {
        this.bounds = bounds;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(location);
        dest.writeValue(locationType);
        dest.writeValue(viewport);
        dest.writeValue(bounds);
    }

    public int describeContents() {
        return  0;
    }

}
