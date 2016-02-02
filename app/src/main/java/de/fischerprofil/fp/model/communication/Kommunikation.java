package de.fischerprofil.fp.model.communication;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Kommunikation implements Parcelable {

    private int mIcon;

    @SerializedName("PERSONNR")
    private String PERSONNR;
    @SerializedName("NAME")
    private String NAME;
    @SerializedName("VORNAME")
    private String VORNAME;
    @SerializedName("KOMART")
    private Integer KOMART;
    @SerializedName("BEMERKUNG")
    private Object BEMERKUNG;
    @SerializedName("NUMMER")
    private Object NUMMER;
    @SerializedName("KTXT")
    private String KTXT;

    protected Kommunikation(Parcel in) {
        mIcon = in.readInt();
        PERSONNR = in.readString();
        NAME = in.readString();
        VORNAME = in.readString();
        KTXT = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mIcon);
        dest.writeString(PERSONNR);
        dest.writeString(NAME);
        dest.writeString(VORNAME);
        dest.writeString(KTXT);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Kommunikation> CREATOR = new Creator<Kommunikation>() {
        @Override
        public Kommunikation createFromParcel(Parcel in) {
            return new Kommunikation(in);
        }

        @Override
        public Kommunikation[] newArray(int size) {
            return new Kommunikation[size];
        }
    };

    /**
     *
     * @return
     * The mIcon
     */
    public int getIcon() {

        return mIcon;
    }

    /**
     *
     * @return
     * The PERSONNR
     */
    public String getPERSONNR() {
        return PERSONNR;
    }

    /**
     *
     * @param PERSONNR
     * The PERSONNR
     */
    public void setPERSONNR(String PERSONNR) {
        this.PERSONNR = PERSONNR;
    }

    /**
     *
     * @return
     * The NAME
     */
    public String getNAME() {
        return NAME;
    }

    /**
     *
     * @param NAME
     * The NAME
     */
    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    /**
     *
     * @return
     * The VORNAME
     */
    public String getVORNAME() {
        return VORNAME;
    }

    /**
     *
     * @param VORNAME
     * The VORNAME
     */
    public void setVORNAME(String VORNAME) {
        this.VORNAME = VORNAME;
    }

    /**
     *
     * @return
     * The KOMART
     */
    public Integer getKOMART() {
        return KOMART;
    }

    /**
     *
     * @param KOMART
     * The KOMART
     */
    public void setKOMART(Integer KOMART) {
        this.KOMART = KOMART;
    }

    /**
     *
     * @return
     * The BEMERKUNG
     */
    public Object getBEMERKUNG() {
        return BEMERKUNG;
    }

    /**
     *
     * @param BEMERKUNG
     * The BEMERKUNG
     */
    public void setBEMERKUNG(Object BEMERKUNG) {
        this.BEMERKUNG = BEMERKUNG;
    }

    /**
     *
     * @return
     * The NUMMER
     */
    public Object getNUMMER() {
        return NUMMER;
    }

    /**
     *
     * @param NUMMER
     * The NUMMER
     */
    public void setNUMMER(Object NUMMER) {
        this.NUMMER = NUMMER;
    }

    /**
     *
     * @return
     * The KTXT
     */
    public String getKTXT() {
        return KTXT;
    }

    /**
     *
     * @param KTXT
     * The KTXT
     */
    public void setKTXT(String KTXT) {
        this.KTXT = KTXT;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}