package de.fischerprofil.fp.model.reference;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Suleiman19 on 10/22/15.
 */
public class ImageModel_ok implements Parcelable {

    String name, url;

    public ImageModel_ok() {

    }

    protected ImageModel_ok(Parcel in) {
        name = in.readString();
        url = in.readString();
    }

    public static final Creator<ImageModel_ok> CREATOR = new Creator<ImageModel_ok>() {
        @Override
        public ImageModel_ok createFromParcel(Parcel in) {
            return new ImageModel_ok(in);
        }

        @Override
        public ImageModel_ok[] newArray(int size) {
            return new ImageModel_ok[size];
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(url);
    }
}
