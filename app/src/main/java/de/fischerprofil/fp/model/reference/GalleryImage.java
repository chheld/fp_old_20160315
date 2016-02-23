package de.fischerprofil.fp.model.reference;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Suleiman19 on 10/22/15.
 */
public class GalleryImage implements Parcelable {

    String name, url;

    public GalleryImage() {

    }

    protected GalleryImage(Parcel in) {
        name = in.readString();
        url = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(url);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<GalleryImage> CREATOR = new Creator<GalleryImage>() {
        @Override
        public GalleryImage createFromParcel(Parcel in) {
            return new GalleryImage(in);
        }

        @Override
        public GalleryImage[] newArray(int size) {
            return new GalleryImage[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
