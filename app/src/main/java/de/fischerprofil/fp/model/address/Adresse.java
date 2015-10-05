package de.fischerprofil.fp.model.address;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Adresse implements Parcelable {

    @SerializedName("IK")
    private String IK;
    @SerializedName("SYSF")
    private String SYSF;
    @SerializedName("CREATEDATE")
    private String CREATEDATE;
    @SerializedName("MODIFYDATE")
    private Object MODIFYDATE;
    @SerializedName("CREATEUSER")
    private String CREATEUSER;
    @SerializedName("MODIFYUSER")
    private String MODIFYUSER;
    @SerializedName("CID")
    private String CID;
    @SerializedName("ADRESSENR")
    private String ADRESSENR;
    @SerializedName("PERSONNR")
    private Object PERSONNR;
    @SerializedName("FIRMANR")
    private String FIRMANR;
    @SerializedName("ANSCHRIFTNR")
    private String ANSCHRIFTNR;
    @SerializedName("BEMERKUNG")
    private Object BEMERKUNG;
    @SerializedName("LASTEINM")
    private String LASTEINM;
    @SerializedName("POSTFACH")
    private Object POSTFACH;
    @SerializedName("PLZPOSTFACH")
    private String PLZPOSTFACH;
    @SerializedName("PLZORT")
    private String PLZORT;
    @SerializedName("ORT")
    private String ORT;
    @SerializedName("STRASSE")
    private String STRASSE;
    @SerializedName("LAND")
    private Object LAND;
    @SerializedName("STAAT")
    private String STAAT;
    @SerializedName("LANDKNG")
    private String LANDKNG;
    @SerializedName("WERK")
    private Object WERK;
    @SerializedName("ABLST")
    private Object ABLST;
    @SerializedName("EXTLAGER")
    private Object EXTLAGER;
    @SerializedName("ZUSATZ1")
    private String ZUSATZ1;
    @SerializedName("ZUSATZ2")
    private String ZUSATZ2;
    @SerializedName("VERWENDUNG1")
    private String VERWENDUNG1;
    @SerializedName("VERWENDUNG2")
    private String VERWENDUNG2;
    @SerializedName("VERWENDUNG3")
    private String VERWENDUNG3;
    @SerializedName("VERWENDUNG4")
    private String VERWENDUNG4;
    @SerializedName("VERWENDUNG5")
    private String VERWENDUNG5;
    @SerializedName("NAME1")
    private Object NAME1;
    @SerializedName("NAME2")
    private Object NAME2;
    @SerializedName("NAME3")
    private Object NAME3;
    @SerializedName("SPRACHKNZ")
    private Object SPRACHKNZ;
    @SerializedName("SUBTYPE0")
    private String SUBTYPE0;
    @SerializedName("RURALROUTE")
    private Object RURALROUTE;
    @SerializedName("HIGHWAY")
    private Object HIGHWAY;
    @SerializedName("POSTRESTANTE")
    private Object POSTRESTANTE;
    @SerializedName("BEZEICHNUNG")
    private Object BEZEICHNUNG;
    @SerializedName("STATUS1")
    private String STATUS1;
    @SerializedName("STATUS2")
    private String STATUS2;
    @SerializedName("STATUS3")
    private String STATUS3;
    @SerializedName("STATUS4")
    private String STATUS4;
    @SerializedName("STATUS5")
    private String STATUS5;
    @SerializedName("STATUS6")
    private String STATUS6;
    @SerializedName("SACHBEARBEITER")
    private Object SACHBEARBEITER;
    @SerializedName("BASEROUTE")
    private String BASEROUTE;
    @SerializedName("ADDRESS1")
    private Object ADDRESS1;
    @SerializedName("CRMADDRESSID")
    private String CRMADDRESSID;
    @SerializedName("ILN")
    private Object ILN;
    @SerializedName("COUNTYCODE")
    private String COUNTYCODE;
    @SerializedName("THIRDPARTY")
    private String THIRDPARTY;
    @SerializedName("VESRKNZ")
    private String VESRKNZ;
    @SerializedName("BANKNR")
    private String BANKNR;
    @SerializedName("USGESPERRT")
    private String USGESPERRT;
    @SerializedName("USSPERRGRUND")
    private String USSPERRGRUND;

    /**
     * No args constructor for use in serialization
     *
     */
    public Adresse() {
    }

    protected Adresse(Parcel in) {
        IK = in.readString();
        SYSF = in.readString();
        CREATEDATE = in.readString();
        CREATEUSER = in.readString();
        MODIFYUSER = in.readString();
        CID = in.readString();
        ADRESSENR = in.readString();
        FIRMANR = in.readString();
        ANSCHRIFTNR = in.readString();
        LASTEINM = in.readString();
        PLZORT = in.readString();
        ORT = in.readString();
        STRASSE = in.readString();
        STAAT = in.readString();
        LANDKNG = in.readString();
        ZUSATZ1 = in.readString();
        VERWENDUNG1 = in.readString();
        VERWENDUNG2 = in.readString();
        VERWENDUNG3 = in.readString();
        VERWENDUNG4 = in.readString();
        VERWENDUNG5 = in.readString();
        SUBTYPE0 = in.readString();
        STATUS1 = in.readString();
        STATUS2 = in.readString();
        STATUS3 = in.readString();
        STATUS4 = in.readString();
        STATUS5 = in.readString();
        STATUS6 = in.readString();
        BASEROUTE = in.readString();
        CRMADDRESSID = in.readString();
        COUNTYCODE = in.readString();
        THIRDPARTY = in.readString();
        VESRKNZ = in.readString();
        BANKNR = in.readString();
        USGESPERRT = in.readString();
        USSPERRGRUND = in.readString();
    }

    public static final Creator<Adresse> CREATOR = new Creator<Adresse>() {
        @Override
        public Adresse createFromParcel(Parcel in) {
            return new Adresse(in);
        }

        @Override
        public Adresse[] newArray(int size) {
            return new Adresse[size];
        }
    };

    /**
     *
     * @return
     * The IK
     */
    public String getIK() {
        return IK;
    }

    /**
     *
     * @param IK
     * The IK
     */
    public void setIK(String IK) {
        this.IK = IK;
    }

    /**
     *
     * @return
     * The SYSF
     */
    public String getSYSF() {
        return SYSF;
    }

    /**
     *
     * @param SYSF
     * The SYSF
     */
    public void setSYSF(String SYSF) {
        this.SYSF = SYSF;
    }

    /**
     *
     * @return
     * The CREATEDATE
     */
    public String getCREATEDATE() {
        return CREATEDATE;
    }

    /**
     *
     * @param CREATEDATE
     * The CREATEDATE
     */
    public void setCREATEDATE(String CREATEDATE) {
        this.CREATEDATE = CREATEDATE;
    }

    /**
     *
     * @return
     * The MODIFYDATE
     */
    public Object getMODIFYDATE() {
        return MODIFYDATE;
    }

    /**
     *
     * @param MODIFYDATE
     * The MODIFYDATE
     */
    public void setMODIFYDATE(Object MODIFYDATE) {
        this.MODIFYDATE = MODIFYDATE;
    }

    /**
     *
     * @return
     * The CREATEUSER
     */
    public String getCREATEUSER() {
        return CREATEUSER;
    }

    /**
     *
     * @param CREATEUSER
     * The CREATEUSER
     */
    public void setCREATEUSER(String CREATEUSER) {
        this.CREATEUSER = CREATEUSER;
    }

    /**
     *
     * @return
     * The MODIFYUSER
     */
    public String getMODIFYUSER() {
        return MODIFYUSER;
    }

    /**
     *
     * @param MODIFYUSER
     * The MODIFYUSER
     */
    public void setMODIFYUSER(String MODIFYUSER) {
        this.MODIFYUSER = MODIFYUSER;
    }

    /**
     *
     * @return
     * The CID
     */
    public String getCID() {
        return CID;
    }

    /**
     *
     * @param CID
     * The CID
     */
    public void setCID(String CID) {
        this.CID = CID;
    }

    /**
     *
     * @return
     * The ADRESSENR
     */
    public String getADRESSENR() {
        return ADRESSENR;
    }

    /**
     *
     * @param ADRESSENR
     * The ADRESSENR
     */
    public void setADRESSENR(String ADRESSENR) {
        this.ADRESSENR = ADRESSENR;
    }

    /**
     *
     * @return
     * The PERSONNR
     */
    public Object getPERSONNR() {
        return PERSONNR;
    }

    /**
     *
     * @param PERSONNR
     * The PERSONNR
     */
    public void setPERSONNR(Object PERSONNR) {
        this.PERSONNR = PERSONNR;
    }

    /**
     *
     * @return
     * The FIRMANR
     */
    public String getFIRMANR() {
        return FIRMANR;
    }

    /**
     *
     * @param FIRMANR
     * The FIRMANR
     */
    public void setFIRMANR(String FIRMANR) {
        this.FIRMANR = FIRMANR;
    }

    /**
     *
     * @return
     * The ANSCHRIFTNR
     */
    public String getANSCHRIFTNR() {
        return ANSCHRIFTNR;
    }

    /**
     *
     * @param ANSCHRIFTNR
     * The ANSCHRIFTNR
     */
    public void setANSCHRIFTNR(String ANSCHRIFTNR) {
        this.ANSCHRIFTNR = ANSCHRIFTNR;
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
     * The LASTEINM
     */
    public String getLASTEINM() {
        return LASTEINM;
    }

    /**
     *
     * @param LASTEINM
     * The LASTEINM
     */
    public void setLASTEINM(String LASTEINM) {
        this.LASTEINM = LASTEINM;
    }

    /**
     *
     * @return
     * The POSTFACH
     */
    public Object getPOSTFACH() {
        return POSTFACH;
    }

    /**
     *
     * @param POSTFACH
     * The POSTFACH
     */
    public void setPOSTFACH(Object POSTFACH) {
        this.POSTFACH = POSTFACH;
    }

    /**
     *
     * @return
     * The PLZPOSTFACH
     */
    public String getPLZPOSTFACH() {
        return PLZPOSTFACH;
    }

    /**
     *
     * @param PLZPOSTFACH
     * The PLZPOSTFACH
     */
    public void setPLZPOSTFACH(String PLZPOSTFACH) {
        this.PLZPOSTFACH = PLZPOSTFACH;
    }

    /**
     *
     * @return
     * The PLZORT
     */
    public String getPLZORT() {return PLZORT;
    }

    /**
     *
     * @param PLZORT
     * The PLZORT
     */
    public void setPLZORT(String PLZORT) {
        this.PLZORT = PLZORT;
    }

    /**
     *
     * @return
     * The ORT
     */
    public String getORT() {return ORT;
    }

    /**
     *
     * @param ORT
     * The ORT
     */
    public void setORT(String ORT) {
        this.ORT = ORT;
    }

    /**
     *
     * @return
     * The STRASSE
     */
    public String getSTRASSE() {return STRASSE;
    }

    /**
     *
     * @param STRASSE
     * The STRASSE
     */
    public void setSTRASSE(String STRASSE) {
        this.STRASSE = STRASSE;
    }

    /**
     *
     * @return
     * The LAND
     */
    public Object getLAND() {
        return LAND;
    }

    /**
     *
     * @param LAND
     * The LAND
     */
    public void setLAND(Object LAND) {
        this.LAND = LAND;
    }

    /**
     *
     * @return
     * The STAAT
     */
    public String getSTAAT() {
        return STAAT;
    }

    /**
     *
     * @param STAAT
     * The STAAT
     */
    public void setSTAAT(String STAAT) {
        this.STAAT = STAAT;
    }

    /**
     *
     * @return
     * The LANDKNG
     */
    public String getLANDKNG() {
        return LANDKNG;
    }

    /**
     *
     * @param LANDKNG
     * The LANDKNG
     */
    public void setLANDKNG(String LANDKNG) {
        this.LANDKNG = LANDKNG;
    }

    /**
     *
     * @return
     * The WERK
     */
    public Object getWERK() {
        return WERK;
    }

    /**
     *
     * @param WERK
     * The WERK
     */
    public void setWERK(Object WERK) {
        this.WERK = WERK;
    }

    /**
     *
     * @return
     * The ABLST
     */
    public Object getABLST() {
        return ABLST;
    }

    /**
     *
     * @param ABLST
     * The ABLST
     */
    public void setABLST(Object ABLST) {
        this.ABLST = ABLST;
    }

    /**
     *
     * @return
     * The EXTLAGER
     */
    public Object getEXTLAGER() {
        return EXTLAGER;
    }

    /**
     *
     * @param EXTLAGER
     * The EXTLAGER
     */
    public void setEXTLAGER(Object EXTLAGER) {
        this.EXTLAGER = EXTLAGER;
    }

    /**
     *
     * @return
     * The ZUSATZ1
     */
    public String getZUSATZ1() {
        if (TextUtils.isEmpty(ZUSATZ1)) return "";
        if (ZUSATZ1.equals("null")) return "";
        return ZUSATZ1;
    }

    /**
     *
     * @param ZUSATZ1
     * The ZUSATZ1
     */
    public void setZUSATZ1(String ZUSATZ1) {
        this.ZUSATZ1 = ZUSATZ1;
    }

    /**
     *
     * @return
     * The ZUSATZ2
     */
    public String getZUSATZ2() {
        if (TextUtils.isEmpty(ZUSATZ2)) return "";
        if (ZUSATZ2.equals("null")) return "";
        return ZUSATZ2;
    }

    /**
     *
     * @param ZUSATZ2
     * The ZUSATZ2
     */
    public void setZUSATZ2(String ZUSATZ2) {
        this.ZUSATZ2 = ZUSATZ2;
    }

    /**
     *
     * @return
     * The VERWENDUNG1
     */
    public String getVERWENDUNG1() {
        return VERWENDUNG1;
    }

    /**
     *
     * @param VERWENDUNG1
     * The VERWENDUNG1
     */
    public void setVERWENDUNG1(String VERWENDUNG1) {
        this.VERWENDUNG1 = VERWENDUNG1;
    }

    /**
     *
     * @return
     * The VERWENDUNG2
     */
    public String getVERWENDUNG2() {
        return VERWENDUNG2;
    }

    /**
     *
     * @param VERWENDUNG2
     * The VERWENDUNG2
     */
    public void setVERWENDUNG2(String VERWENDUNG2) {
        this.VERWENDUNG2 = VERWENDUNG2;
    }

    /**
     *
     * @return
     * The VERWENDUNG3
     */
    public String getVERWENDUNG3() {
        return VERWENDUNG3;
    }

    /**
     *
     * @param VERWENDUNG3
     * The VERWENDUNG3
     */
    public void setVERWENDUNG3(String VERWENDUNG3) {
        this.VERWENDUNG3 = VERWENDUNG3;
    }

    /**
     *
     * @return
     * The VERWENDUNG4
     */
    public String getVERWENDUNG4() {
        return VERWENDUNG4;
    }

    /**
     *
     * @param VERWENDUNG4
     * The VERWENDUNG4
     */
    public void setVERWENDUNG4(String VERWENDUNG4) {
        this.VERWENDUNG4 = VERWENDUNG4;
    }

    /**
     *
     * @return
     * The VERWENDUNG5
     */
    public String getVERWENDUNG5() {
        return VERWENDUNG5;
    }

    /**
     *
     * @param VERWENDUNG5
     * The VERWENDUNG5
     */
    public void setVERWENDUNG5(String VERWENDUNG5) {
        this.VERWENDUNG5 = VERWENDUNG5;
    }

    /**
     *
     * @return
     * The NAME1
     */
    public Object getNAME1() {
        return NAME1;
    }

    /**
     *
     * @param NAME1
     * The NAME1
     */
    public void setNAME1(Object NAME1) {
        this.NAME1 = NAME1;
    }

    /**
     *
     * @return
     * The NAME2
     */
    public Object getNAME2() {
        return NAME2;
    }

    /**
     *
     * @param NAME2
     * The NAME2
     */
    public void setNAME2(Object NAME2) {
        this.NAME2 = NAME2;
    }

    /**
     *
     * @return
     * The NAME3
     */
    public Object getNAME3() {
        return NAME3;
    }

    /**
     *
     * @param NAME3
     * The NAME3
     */
    public void setNAME3(Object NAME3) {
        this.NAME3 = NAME3;
    }

    /**
     *
     * @return
     * The SPRACHKNZ
     */
    public Object getSPRACHKNZ() {
        return SPRACHKNZ;
    }

    /**
     *
     * @param SPRACHKNZ
     * The SPRACHKNZ
     */
    public void setSPRACHKNZ(Object SPRACHKNZ) {
        this.SPRACHKNZ = SPRACHKNZ;
    }

    /**
     *
     * @return
     * The SUBTYPE0
     */
    public String getSUBTYPE0() {
        return SUBTYPE0;
    }

    /**
     *
     * @param SUBTYPE0
     * The SUBTYPE0
     */
    public void setSUBTYPE0(String SUBTYPE0) {
        this.SUBTYPE0 = SUBTYPE0;
    }

    /**
     *
     * @return
     * The RURALROUTE
     */
    public Object getRURALROUTE() {
        return RURALROUTE;
    }

    /**
     *
     * @param RURALROUTE
     * The RURALROUTE
     */
    public void setRURALROUTE(Object RURALROUTE) {
        this.RURALROUTE = RURALROUTE;
    }


    /**
     *
     * @return
     * The HIGHWAY
     */
    public Object getHIGHWAY() {
        return HIGHWAY;
    }

    /**
     *
     * @param HIGHWAY
     * The HIGHWAY
     */
    public void setHIGHWAY(Object HIGHWAY) {
        this.HIGHWAY = HIGHWAY;
    }


    /**
     *
     * @return
     * The POSTRESTANTE
     */
    public Object getPOSTRESTANTE() {
        return POSTRESTANTE;
    }

    /**
     *
     * @param POSTRESTANTE
     * The POSTRESTANTE
     */
    public void setPOSTRESTANTE(Object POSTRESTANTE) {
        this.POSTRESTANTE = POSTRESTANTE;
    }


    /**
     *
     * @return
     * The BEZEICHNUNG
     */
    public Object getBEZEICHNUNG() {
        return BEZEICHNUNG;
    }

    /**
     *
     * @param BEZEICHNUNG
     * The BEZEICHNUNG
     */
    public void setBEZEICHNUNG(Object BEZEICHNUNG) {
        this.BEZEICHNUNG = BEZEICHNUNG;
    }


    /**
     *
     * @return
     * The STATUS1
     */
    public String getSTATUS1() {
        return STATUS1;
    }

    /**
     *
     * @param STATUS1
     * The STATUS1
     */
    public void setSTATUS1(String STATUS1) {
        this.STATUS1 = STATUS1;
    }


    /**
     *
     * @return
     * The STATUS2
     */
    public String getSTATUS2() {
        return STATUS2;
    }

    /**
     *
     * @param STATUS2
     * The STATUS2
     */
    public void setSTATUS2(String STATUS2) {
        this.STATUS2 = STATUS2;
    }


    /**
     *
     * @return
     * The STATUS3
     */
    public String getSTATUS3() {
        return STATUS3;
    }

    /**
     *
     * @param STATUS3
     * The STATUS3
     */
    public void setSTATUS3(String STATUS3) {
        this.STATUS3 = STATUS3;
    }


    /**
     *
     * @return
     * The STATUS4
     */
    public String getSTATUS4() {
        return STATUS4;
    }

    /**
     *
     * @param STATUS4
     * The STATUS4
     */
    public void setSTATUS4(String STATUS4) {
        this.STATUS4 = STATUS4;
    }


    /**
     *
     * @return
     * The STATUS5
     */
    public String getSTATUS5() {
        return STATUS5;
    }

    /**
     *
     * @param STATUS5
     * The STATUS5
     */
    public void setSTATUS5(String STATUS5) {
        this.STATUS5 = STATUS5;
    }


    /**
     *
     * @return
     * The STATUS6
     */
    public String getSTATUS6() {
        return STATUS6;
    }

    /**
     *
     * @param STATUS6
     * The STATUS6
     */
    public void setSTATUS6(String STATUS6) {
        this.STATUS6 = STATUS6;
    }


    /**
     *
     * @return
     * The SACHBEARBEITER
     */
    public Object getSACHBEARBEITER() {
        return SACHBEARBEITER;
    }

    /**
     *
     * @param SACHBEARBEITER
     * The SACHBEARBEITER
     */
    public void setSACHBEARBEITER(Object SACHBEARBEITER) {
        this.SACHBEARBEITER = SACHBEARBEITER;
    }


    /**
     *
     * @return
     * The BASEROUTE
     */
    public String getBASEROUTE() {
        return BASEROUTE;
    }

    /**
     *
     * @param BASEROUTE
     * The BASEROUTE
     */
    public void setBASEROUTE(String BASEROUTE) {
        this.BASEROUTE = BASEROUTE;
    }


    /**
     *
     * @return
     * The ADDRESS1
     */
    public Object getADDRESS1() {
        return ADDRESS1;
    }

    /**
     *
     * @param ADDRESS1
     * The ADDRESS1
     */
    public void setADDRESS1(Object ADDRESS1) {
        this.ADDRESS1 = ADDRESS1;
    }


    /**
     *
     * @return
     * The CRMADDRESSID
     */
    public String getCRMADDRESSID() {
        return CRMADDRESSID;
    }

    /**
     *
     * @param CRMADDRESSID
     * The CRMADDRESSID
     */
    public void setCRMADDRESSID(String CRMADDRESSID) {
        this.CRMADDRESSID = CRMADDRESSID;
    }


    /**
     *
     * @return
     * The ILN
     */
    public Object getILN() {
        return ILN;
    }

    /**
     *
     * @param ILN
     * The ILN
     */
    public void setILN(Object ILN) {
        this.ILN = ILN;
    }


    /**
     *
     * @return
     * The COUNTYCODE
     */
    public String getCOUNTYCODE() {
        return COUNTYCODE;
    }

    /**
     *
     * @param COUNTYCODE
     * The COUNTYCODE
     */
    public void setCOUNTYCODE(String COUNTYCODE) {
        this.COUNTYCODE = COUNTYCODE;
    }


    /**
     *
     * @return
     * The THIRDPARTY
     */
    public String getTHIRDPARTY() {
        return THIRDPARTY;
    }

    /**
     *
     * @param THIRDPARTY
     * The THIRDPARTY
     */
    public void setTHIRDPARTY(String THIRDPARTY) {
        this.THIRDPARTY = THIRDPARTY;
    }


    /**
     *
     * @return
     * The VESRKNZ
     */
    public String getVESRKNZ() {
        return VESRKNZ;
    }

    /**
     *
     * @param VESRKNZ
     * The VESRKNZ
     */
    public void setVESRKNZ(String VESRKNZ) {
        this.VESRKNZ = VESRKNZ;
    }


    /**
     *
     * @return
     * The BANKNR
     */
    public String getBANKNR() {
        return BANKNR;
    }

    /**
     *
     * @param BANKNR
     * The BANKNR
     */
    public void setBANKNR(String BANKNR) {
        this.BANKNR = BANKNR;
    }


    /**
     *
     * @return
     * The USGESPERRT
     */
    public String getUSGESPERRT() {
        return USGESPERRT;
    }

    /**
     *
     * @param USGESPERRT
     * The USGESPERRT
     */
    public void setUSGESPERRT(String USGESPERRT) {
        this.USGESPERRT = USGESPERRT;
    }


    /**
     *
     * @return
     * The USSPERRGRUND
     */
    public String getUSSPERRGRUND() {
        return USSPERRGRUND;
    }

    /**
     *
     * @param USSPERRGRUND
     * The USSPERRGRUND
     */
    public void setUSSPERRGRUND(String USSPERRGRUND) {
        this.USSPERRGRUND = USSPERRGRUND;
    }


    public String getObjectAsString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(IK);
        dest.writeString(SYSF);
        dest.writeString(CREATEDATE);
        dest.writeString(CREATEUSER);
        dest.writeString(MODIFYUSER);
        dest.writeString(CID);
        dest.writeString(ADRESSENR);
        dest.writeString(FIRMANR);
        dest.writeString(ANSCHRIFTNR);
        dest.writeString(LASTEINM);
        dest.writeString(PLZORT);
        dest.writeString(ORT);
        dest.writeString(STRASSE);
        dest.writeString(STAAT);
        dest.writeString(LANDKNG);
        dest.writeString(ZUSATZ1);
        dest.writeString(VERWENDUNG1);
        dest.writeString(VERWENDUNG2);
        dest.writeString(VERWENDUNG3);
        dest.writeString(VERWENDUNG4);
        dest.writeString(VERWENDUNG5);
        dest.writeString(SUBTYPE0);
        dest.writeString(STATUS1);
        dest.writeString(STATUS2);
        dest.writeString(STATUS3);
        dest.writeString(STATUS4);
        dest.writeString(STATUS5);
        dest.writeString(STATUS6);
        dest.writeString(BASEROUTE);
        dest.writeString(CRMADDRESSID);
        dest.writeString(COUNTYCODE);
        dest.writeString(THIRDPARTY);
        dest.writeString(VESRKNZ);
        dest.writeString(BANKNR);
        dest.writeString(USGESPERRT);
        dest.writeString(USSPERRGRUND);
    }
}