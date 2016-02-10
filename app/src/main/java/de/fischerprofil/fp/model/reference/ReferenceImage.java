package de.fischerprofil.fp.model.reference;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Suleiman19 on 10/22/15.
 */
public class ReferenceImage implements Parcelable {

    String name, url;

    public ReferenceImage() {

    }

    protected ReferenceImage(Parcel in) {
        name = in.readString();
        url = in.readString();
    }

    public static final Creator<ReferenceImage> CREATOR = new Creator<ReferenceImage>() {
        @Override
        public ReferenceImage createFromParcel(Parcel in) {
            return new ReferenceImage(in);
        }

        @Override
        public ReferenceImage[] newArray(int size) {
            return new ReferenceImage[size];
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
