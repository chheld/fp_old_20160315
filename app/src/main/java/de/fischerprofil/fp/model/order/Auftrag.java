package de.fischerprofil.fp.model.order;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import de.fischerprofil.fp.AppController;
import de.fischerprofil.fp.R;

public class Auftrag implements Parcelable {

    private String mObjectAsString;
    private Integer mRequestCounter = 0;

    private Integer mIcon;      // Icon des Auftrags
    @SerializedName("CREATEDATE")
    private String CREATEDATE;
    @SerializedName("MODIFYDATE")
    private String MODIFYDATE;
    @SerializedName("CREATEUSER")
    private String CREATEUSER;
    @SerializedName("MODIFYUSER")
    private String MODIFYUSER;
    @SerializedName("CID")
    private Integer CID;
    @SerializedName("RNR")
    private Integer RNR;
    @SerializedName("SAINT")
    private Integer SAINT;
    @SerializedName("SAEXT")
    private String SAEXT;
    @SerializedName("ANR")
    private String ANR;
    @SerializedName("MNR")
    private String MNR;
    @SerializedName("UTNR")
    private Integer UTNR;
    @SerializedName("KOMM")
    private String KOMM;
    @SerializedName("KTXT")
    private String KTXT;
    @SerializedName("IPOS")
    private Integer IPOS;
    @SerializedName("ZUST")
    private Integer ZUST;
    @SerializedName("WS")
    private Integer WS;
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
    @SerializedName("EPOS")
    private Object EPOS;
    @SerializedName("TEXTNR")
    private Object TEXTNR;
    @SerializedName("TEXTNR2")
    private Object TEXTNR2;
    @SerializedName("ME")
    private Object ME;
    @SerializedName("BEWPREIS")
    private Integer BEWPREIS;
    @SerializedName("BEWPREISBASIS")
    private Integer BEWPREISBASIS;
    @SerializedName("BEWPREISME")
    private Integer BEWPREISME;
    @SerializedName("GEWICHT")
    private Double GEWICHT;
    @SerializedName("DLZFIXKNZ")
    private Integer DLZFIXKNZ;
    @SerializedName("LVANZ")
    private Integer LVANZ;
    @SerializedName("LVLAENGE")
    private Integer LVLAENGE;
    @SerializedName("LVBREITE")
    private Integer LVBREITE;
    @SerializedName("LVHOEHE")
    private Integer LVHOEHE;
    @SerializedName("BEMERKUNG")
    private String BEMERKUNG;
    @SerializedName("SACHBEARBEITER")
    private Object SACHBEARBEITER;
    @SerializedName("ANZAGG")
    private Integer ANZAGG;
    @SerializedName("PLANART")
    private Integer PLANART;
    @SerializedName("EXTRNR")
    private Integer EXTRNR;
    @SerializedName("LAGERTYP")
    private Integer LAGERTYP;
    @SerializedName("ZDESC")
    private String ZDESC;
    @SerializedName("VPS")
    private Integer VPS;
    @SerializedName("VGRUPPE")
    private Integer VGRUPPE;
    @SerializedName("MAXPAKANZ")
    private Integer MAXPAKANZ;
    @SerializedName("MAXSTUECK")
    private Integer MAXSTUECK;
    @SerializedName("MAXGEWICHT")
    private Integer MAXGEWICHT;
    @SerializedName("MAXLAGEN")
    private Integer MAXLAGEN;
    @SerializedName("PAKETNUMMER")
    private Integer PAKETNUMMER;
    @SerializedName("PAKBEZUGRNR")
    private Integer PAKBEZUGRNR;
    @SerializedName("INTCODE")
    private Object INTCODE;
    @SerializedName("LOS")
    private Integer LOS;
    @SerializedName("RFNR")
    private Integer RFNR;
    @SerializedName("LOSRF")
    private Integer LOSRF;
    @SerializedName("ALRKOPPKNZ")
    private Integer ALRKOPPKNZ;
    @SerializedName("ALRKNZ")
    private String ALRKNZ;
    @SerializedName("SEGM1_TERM")
    private String SEGM1TERM;
    @SerializedName("SEGM2_ZART")
    private Integer SEGM2ZART;
    @SerializedName("SEGM2_MENG")
    private Integer SEGM2MENG;
    @SerializedName("SEGM2_TERM")
    private String SEGM2TERM;
    @SerializedName("SEGM3_MENG")
    private Integer SEGM3MENG;
    @SerializedName("SEGM3_TERM")
    private Object SEGM3TERM;
    @SerializedName("SEGM4_ZART")
    private Integer SEGM4ZART;
    @SerializedName("SEGM4_MENG")
    private Integer SEGM4MENG;
    @SerializedName("SEGM4_TERM")
    private Object SEGM4TERM;
    @SerializedName("SEGM5_ZART")
    private Integer SEGM5ZART;
    @SerializedName("SEGM5_MENG")
    private Integer SEGM5MENG;
    @SerializedName("SEGM5_TERM")
    private Object SEGM5TERM;
    @SerializedName("SEGM5_DATUM")
    private Object SEGM5DATUM;
    @SerializedName("SEGM6_ZART")
    private Integer SEGM6ZART;
    @SerializedName("SEGM6_MENG")
    private Integer SEGM6MENG;
    @SerializedName("SEGM6_TERM")
    private String SEGM6TERM;
    @SerializedName("SEGM6_DATUM")
    private Object SEGM6DATUM;
    @SerializedName("BELEGNRANG")
    private Object BELEGNRANG;
    @SerializedName("BELEGNRAUFT")
    private Object BELEGNRAUFT;
    @SerializedName("BELEGNRLIEF")
    private Object BELEGNRLIEF;
    @SerializedName("BELEGNRRECH")
    private Object BELEGNRRECH;
    @SerializedName("BELEGNRANFR")
    private Object BELEGNRANFR;
    @SerializedName("BELEGNRBEST")
    private String BELEGNRBEST;
    @SerializedName("BELEGNRBEZUG")
    private Object BELEGNRBEZUG;
    @SerializedName("BELEGNRABRUF")
    private Object BELEGNRABRUF;
    @SerializedName("BELEGNR14")
    private Object BELEGNR14;
    @SerializedName("BELEGDATANG")
    private Object BELEGDATANG;
    @SerializedName("BELEGDATAUFT")
    private Object BELEGDATAUFT;
    @SerializedName("BELEGDATLIEF")
    private Object BELEGDATLIEF;
    @SerializedName("BELEGDATRECH")
    private Object BELEGDATRECH;
    @SerializedName("BELEGDATANFR")
    private Object BELEGDATANFR;
    @SerializedName("BELEGDATBEST")
    private String BELEGDATBEST;
    @SerializedName("BELEGDATBEZUG")
    private Object BELEGDATBEZUG;
    @SerializedName("BELEGDATABRUF")
    private Object BELEGDATABRUF;
    @SerializedName("BELEGDAT14")
    private Object BELEGDAT14;
    @SerializedName("VERTRETER1")
    private String VERTRETER1;
    @SerializedName("VERTRETER2")
    private String VERTRETER2;
    @SerializedName("VERTRGRP1")
    private Integer VERTRGRP1;
    @SerializedName("VERTRGRP2")
    private Integer VERTRGRP2;
    @SerializedName("EXTARTNR")
    private Object EXTARTNR;
    @SerializedName("EXTME")
    private Object EXTME;
    @SerializedName("ADRNR0")
    private String ADRNR0;
    @SerializedName("ADRNR1")
    private String ADRNR1;
    @SerializedName("ADRNR2")
    private String ADRNR2;
    @SerializedName("ADRNR3")
    private String ADRNR3;
    @SerializedName("ADRNR4")
    private String ADRNR4;
    @SerializedName("ADRNR12")
    private String ADRNR12;
    @SerializedName("KW")
    private Integer KW;
    @SerializedName("KJ")
    private Integer KJ;
    @SerializedName("SOKNZ1")
    private Integer SOKNZ1;
    @SerializedName("TEXT0")
    private String TEXT0;
    @SerializedName("ACP_TEXT1")
    private Object ACPTEXT1;
    @SerializedName("ACP_TEXT2")
    private Object ACPTEXT2;
    @SerializedName("ACP_TEXT3")
    private Object ACPTEXT3;
    @SerializedName("TEXT4")
    private Object TEXT4;
    @SerializedName("ZBED")
    private Integer ZBED;
    @SerializedName("WE")
    private String WE;
    @SerializedName("PREISKNZ")
    private Integer PREISKNZ;
    @SerializedName("ACPPART_PREIS")
    private Integer ACPPARTPREIS;
    @SerializedName("ACPPART_NETTO0")
    private Double ACPPARTNETTO0;
    @SerializedName("RABKNZBR1")
    private Integer RABKNZBR1;
    @SerializedName("RABKNZMR")
    private Integer RABKNZMR;
    @SerializedName("RABKNZWR")
    private Integer RABKNZWR;
    @SerializedName("RABKNZBR2")
    private Integer RABKNZBR2;
    @SerializedName("RABKNZ9")
    private Integer RABKNZ9;
    @SerializedName("RABFIXBR1")
    private Integer RABFIXBR1;
    @SerializedName("RABFIXMR")
    private Integer RABFIXMR;
    @SerializedName("RABFIXWR")
    private Integer RABFIXWR;
    @SerializedName("RABFIXBR2")
    private Integer RABFIXBR2;
    @SerializedName("RABFIXFR")
    private Integer RABFIXFR;
    @SerializedName("RABFIXFZ")
    private Integer RABFIXFZ;
    @SerializedName("RABAR")
    private Integer RABAR;
    @SerializedName("RABBASBR1")
    private Object RABBASBR1;
    @SerializedName("RABBASMR")
    private Object RABBASMR;
    @SerializedName("RABBASWR")
    private Object RABBASWR;
    @SerializedName("RABBASBR2")
    private Object RABBASBR2;
    @SerializedName("RABBASFR")
    private Object RABBASFR;
    @SerializedName("RABBASFZ")
    private Object RABBASFZ;
    @SerializedName("RABBASHR1")
    private Object RABBASHR1;
    @SerializedName("RABBASHR2")
    private Object RABBASHR2;
    @SerializedName("RABBAS9")
    private Object RABBAS9;
    @SerializedName("RABSUM")
    private Double RABSUM;
    @SerializedName("NETTO1")
    private Double NETTO1;
    @SerializedName("UMSATZWERT")
    private Double UMSATZWERT;
    @SerializedName("ZSUM")
    private Double ZSUM;
    @SerializedName("ZBASIS")
    private Double ZBASIS;
    @SerializedName("ZWERT")
    private Double ZWERT;
    @SerializedName("ZPROZ")
    private Integer ZPROZ;
    @SerializedName("NETTO2")
    private Double NETTO2;
    @SerializedName("MWSTKNZ")
    private Integer MWSTKNZ;
    @SerializedName("MWSTWERT")
    private Double MWSTWERT;
    @SerializedName("MWSTPROZ")
    private Integer MWSTPROZ;
    @SerializedName("BRUTTO")
    private Double BRUTTO;
    @SerializedName("KOSTSUM")
    private Double KOSTSUM;
    @SerializedName("DECKUNGSWERT")
    private Double DECKUNGSWERT;
    @SerializedName("PROVKNZ1")
    private Integer PROVKNZ1;
    @SerializedName("PROVKNZ2")
    private Integer PROVKNZ2;
    @SerializedName("PROVBAS1")
    private Integer PROVBAS1;
    @SerializedName("PROVBAS2")
    private Integer PROVBAS2;
    @SerializedName("PROVWERT1")
    private Double PROVWERT1;
    @SerializedName("PROVWERT2")
    private Double PROVWERT2;
    @SerializedName("PROVPROZ1")
    private Integer PROVPROZ1;
    @SerializedName("PROVPROZ2")
    private Integer PROVPROZ2;
    @SerializedName("LISTENPREIS")
    private Double LISTENPREIS;
    @SerializedName("PROZNP")
    private Integer PROZNP;
    @SerializedName("VALUTATAGE")
    private Integer VALUTATAGE;
    @SerializedName("SUMMETZINLAND")
    private Integer SUMMETZINLAND;
    @SerializedName("EXTMENG")
    private Double EXTMENG;
    @SerializedName("URSPINLAND")
    private Object URSPINLAND;
    @SerializedName("URSPAUSLAND")
    private Integer URSPAUSLAND;
    @SerializedName("TCALLUP")
    private Integer TCALLUP;
    @SerializedName("ADDRPERSACC")
    private String ADDRPERSACC;
    @SerializedName("DISTACTIVE")
    private Integer DISTACTIVE;
    @SerializedName("USVERSKNZ")
    private Integer USVERSKNZ;
    @SerializedName("RESTWERT")
    private Integer RESTWERT;
    @SerializedName("ISTWERT")
    private Integer ISTWERT;
    @SerializedName("ABRUFSUMRNR")
    private Integer ABRUFSUMRNR;
    @SerializedName("LFDNR")
    private Integer LFDNR;
    @SerializedName("F_PREISBASIS")
    private Double FPREISBASIS;
    @SerializedName("PREISBASISME")
    private Object PREISBASISME;
    @SerializedName("SPLITTLIEFRNR")
    private Integer SPLITTLIEFRNR;
    @SerializedName("ENTNAHMEMENGE")
    private Integer ENTNAHMEMENGE;
    @SerializedName("RECHNUNGSMENGE")
    private Integer RECHNUNGSMENGE;
    @SerializedName("SPLITTRECHRNR")
    private Integer SPLITTRECHRNR;
    @SerializedName("UPBEZUGRNR")
    private Integer UPBEZUGRNR;
    @SerializedName("LIEFERZEIT")
    private Integer LIEFERZEIT;
    @SerializedName("WERK")
    private Object WERK;
    @SerializedName("ABLST")
    private Object ABLST;
    @SerializedName("EXTLAGER")
    private Object EXTLAGER;
    @SerializedName("ULIEFMENGE")
    private Integer ULIEFMENGE;
    @SerializedName("EXTKTXT")
    private Object EXTKTXT;
    @SerializedName("USEINTREFFTERMIN")
    private String USEINTREFFTERMIN;
    @SerializedName("USEINTREFFTBEST")
    private String USEINTREFFTBEST;
    @SerializedName("FUELLMENGE")
    private Integer FUELLMENGE;
    @SerializedName("RECHUENR")
    private Integer RECHUENR;
    @SerializedName("VERBRSTELLE")
    private Object VERBRSTELLE;
    @SerializedName("OFFENLIEF")
    private Integer OFFENLIEF;
    @SerializedName("OFFENENTN")
    private Integer OFFENENTN;
    @SerializedName("OFFENRECH")
    private Integer OFFENRECH;
    @SerializedName("WARENWERT")
    private Integer WARENWERT;
    @SerializedName("SETBEZUGRNR")
    private Integer SETBEZUGRNR;
    @SerializedName("BELEGNR13")
    private Object BELEGNR13;
    @SerializedName("USEKPREIS")
    private Integer USEKPREIS;

    public Auftrag() {
        super();
        this.mIcon = R.drawable.ic_order;
    }

    public Auftrag(String a) {
        super();
        this.ANR = a;
    }

    protected Auftrag(Parcel in) {
        mObjectAsString = in.readString();
        CREATEDATE = in.readString();
        MODIFYDATE = in.readString();
        CREATEUSER = in.readString();
        MODIFYUSER = in.readString();
        SAEXT = in.readString();
        ANR = in.readString();
        MNR = in.readString();
        KOMM = in.readString();
        KTXT = in.readString();
        STATUS1 = in.readString();
        STATUS2 = in.readString();
        STATUS3 = in.readString();
        STATUS4 = in.readString();
        STATUS5 = in.readString();
        STATUS6 = in.readString();
        BEMERKUNG = in.readString();
        ZDESC = in.readString();
        ALRKNZ = in.readString();
        SEGM1TERM = in.readString();
        SEGM2TERM = in.readString();
        SEGM6TERM = in.readString();
        BELEGNRBEST = in.readString();
        BELEGDATBEST = in.readString();
        VERTRETER1 = in.readString();
        VERTRETER2 = in.readString();
        ADRNR0 = in.readString();
        ADRNR1 = in.readString();
        ADRNR2 = in.readString();
        ADRNR3 = in.readString();
        ADRNR4 = in.readString();
        ADRNR12 = in.readString();
        TEXT0 = in.readString();
        WE = in.readString();
        ADDRPERSACC = in.readString();
        USEINTREFFTERMIN = in.readString();
        USEINTREFFTBEST = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mObjectAsString);
        dest.writeString(CREATEDATE);
        dest.writeString(MODIFYDATE);
        dest.writeString(CREATEUSER);
        dest.writeString(MODIFYUSER);
        dest.writeString(SAEXT);
        dest.writeString(ANR);
        dest.writeString(MNR);
        dest.writeString(KOMM);
        dest.writeString(KTXT);
        dest.writeString(STATUS1);
        dest.writeString(STATUS2);
        dest.writeString(STATUS3);
        dest.writeString(STATUS4);
        dest.writeString(STATUS5);
        dest.writeString(STATUS6);
        dest.writeString(BEMERKUNG);
        dest.writeString(ZDESC);
        dest.writeString(ALRKNZ);
        dest.writeString(SEGM1TERM);
        dest.writeString(SEGM2TERM);
        dest.writeString(SEGM6TERM);
        dest.writeString(BELEGNRBEST);
        dest.writeString(BELEGDATBEST);
        dest.writeString(VERTRETER1);
        dest.writeString(VERTRETER2);
        dest.writeString(ADRNR0);
        dest.writeString(ADRNR1);
        dest.writeString(ADRNR2);
        dest.writeString(ADRNR3);
        dest.writeString(ADRNR4);
        dest.writeString(ADRNR12);
        dest.writeString(TEXT0);
        dest.writeString(WE);
        dest.writeString(ADDRPERSACC);
        dest.writeString(USEINTREFFTERMIN);
        dest.writeString(USEINTREFFTBEST);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Auftrag> CREATOR = new Creator<Auftrag>() {
        @Override
        public Auftrag createFromParcel(Parcel in) {
            return new Auftrag(in);
        }

        @Override
        public Auftrag[] newArray(int size) {
            return new Auftrag[size];
        }
    };

    public Integer getIcon() {
        return mIcon;
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
    public String getMODIFYDATE() {
        return MODIFYDATE;
    }

    /**
     *
     * @param MODIFYDATE
     * The MODIFYDATE
     */
    public void setMODIFYDATE(String MODIFYDATE) {
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
    public Integer getCID() {
        return CID;
    }

    /**
     *
     * @param CID
     * The CID
     */
    public void setCID(Integer CID) {
        this.CID = CID;
    }



    /**
     *
     * @return
     * The RNR
     */
    public Integer getRNR() {
        return RNR;
    }

    /**
     *
     * @param RNR
     * The RNR
     */
    public void setRNR(Integer RNR) {
        this.RNR = RNR;
    }



    /**
     *
     * @return
     * The SAINT
     */
    public Integer getSAINT() {
        return SAINT;
    }

    /**
     *
     * @param SAINT
     * The SAINT
     */
    public void setSAINT(Integer SAINT) {
        this.SAINT = SAINT;
    }



    /**
     *
     * @return
     * The SAEXT
     */
    public String getSAEXT() {
        return SAEXT;
    }

    /**
     *
     * @param SAEXT
     * The SAEXT
     */
    public void setSAEXT(String SAEXT) {
        this.SAEXT = SAEXT;
    }



    /**
     *
     * @return
     * The ANR
     */
    public String getANR() {
        return ANR;
    }

    /**
     *
     * @param ANR
     * The ANR
     */
    public void setANR(String ANR) {
        this.ANR = ANR;
    }



    /**
     *
     * @return
     * The MNR
     */
    public String getMNR() {
        return MNR;
    }

    /**
     *
     * @param MNR
     * The MNR
     */
    public void setMNR(String MNR) {
        this.MNR = MNR;
    }



    /**
     *
     * @return
     * The UTNR
     */
    public Integer getUTNR() {
        return UTNR;
    }

    /**
     *
     * @param UTNR
     * The UTNR
     */
    public void setUTNR(Integer UTNR) {
        this.UTNR = UTNR;
    }



    /**
     *
     * @return
     * The KOMM
     */
    public String getKOMM() {
        return KOMM;
    }

    /**
     *
     * @param KOMM
     * The KOMM
     */
    public void setKOMM(String KOMM) {
        this.KOMM = KOMM;
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



    /**
     *
     * @return
     * The IPOS
     */
    public Integer getIPOS() {
        return IPOS;
    }

    /**
     *
     * @param IPOS
     * The IPOS
     */
    public void setIPOS(Integer IPOS) {
        this.IPOS = IPOS;
    }



    /**
     *
     * @return
     * The ZUST
     */
    public Integer getZUST() {
        return ZUST;
    }

    /**
     *
     * @param ZUST
     * The ZUST
     */
    public void setZUST(Integer ZUST) {
        this.ZUST = ZUST;
    }



    /**
     *
     * @return
     * The WS
     */
    public Integer getWS() {
        return WS;
    }

    /**
     *
     * @param WS
     * The WS
     */
    public void setWS(Integer WS) {
        this.WS = WS;
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
     * The EPOS
     */
    public Object getEPOS() {
        return EPOS;
    }

    /**
     *
     * @param EPOS
     * The EPOS
     */
    public void setEPOS(Object EPOS) {
        this.EPOS = EPOS;
    }



    /**
     *
     * @return
     * The TEXTNR
     */
    public Object getTEXTNR() {
        return TEXTNR;
    }

    /**
     *
     * @param TEXTNR
     * The TEXTNR
     */
    public void setTEXTNR(Object TEXTNR) {
        this.TEXTNR = TEXTNR;
    }



    /**
     *
     * @return
     * The TEXTNR2
     */
    public Object getTEXTNR2() {
        return TEXTNR2;
    }

    /**
     *
     * @param TEXTNR2
     * The TEXTNR2
     */
    public void setTEXTNR2(Object TEXTNR2) {
        this.TEXTNR2 = TEXTNR2;
    }



    /**
     *
     * @return
     * The ME
     */
    public Object getME() {
        return ME;
    }

    /**
     *
     * @param ME
     * The ME
     */
    public void setME(Object ME) {
        this.ME = ME;
    }



    /**
     *
     * @return
     * The BEWPREIS
     */
    public Integer getBEWPREIS() {
        return BEWPREIS;
    }

    /**
     *
     * @param BEWPREIS
     * The BEWPREIS
     */
    public void setBEWPREIS(Integer BEWPREIS) {
        this.BEWPREIS = BEWPREIS;
    }



    /**
     *
     * @return
     * The BEWPREISBASIS
     */
    public Integer getBEWPREISBASIS() {
        return BEWPREISBASIS;
    }

    /**
     *
     * @param BEWPREISBASIS
     * The BEWPREISBASIS
     */
    public void setBEWPREISBASIS(Integer BEWPREISBASIS) {
        this.BEWPREISBASIS = BEWPREISBASIS;
    }



    /**
     *
     * @return
     * The BEWPREISME
     */
    public Object getBEWPREISME() {
        return BEWPREISME;
    }

    /**
     *
     * @param BEWPREISME
     * The BEWPREISME
     */
    public void setBEWPREISME(Integer BEWPREISME) {
        this.BEWPREISME = BEWPREISME;
    }


    /**
     *
     * @return
     * The GEWICHT
     */
    public Double getGEWICHT() {
        return GEWICHT;
    }

    /**
     *
     * @param GEWICHT
     * The GEWICHT
     */
    public void setGEWICHT(Double GEWICHT) {
        this.GEWICHT = GEWICHT;
    }


    /**
     *
     * @return
     * The DLZFIXKNZ
     */
    public Integer getDLZFIXKNZ() {
        return DLZFIXKNZ;
    }

    /**
     *
     * @param DLZFIXKNZ
     * The DLZFIXKNZ
     */
    public void setDLZFIXKNZ(Integer DLZFIXKNZ) {
        this.DLZFIXKNZ = DLZFIXKNZ;
    }



    /**
     *
     * @return
     * The LVANZ
     */
    public Integer getLVANZ() {
        return LVANZ;
    }

    /**
     *
     * @param LVANZ
     * The LVANZ
     */
    public void setLVANZ(Integer LVANZ) {
        this.LVANZ = LVANZ;
    }



    /**
     *
     * @return
     * The LVLAENGE
     */
    public Integer getLVLAENGE() {
        return LVLAENGE;
    }

    /**
     *
     * @param LVLAENGE
     * The LVLAENGE
     */
    public void setLVLAENGE(Integer LVLAENGE) {
        this.LVLAENGE = LVLAENGE;
    }



    /**
     *
     * @return
     * The LVBREITE
     */
    public Integer getLVBREITE() {
        return LVBREITE;
    }

    /**
     *
     * @param LVBREITE
     * The LVBREITE
     */
    public void setLVBREITE(Integer LVBREITE) {
        this.LVBREITE = LVBREITE;
    }



    /**
     *
     * @return
     * The LVHOEHE
     */
    public Integer getLVHOEHE() {
        return LVHOEHE;
    }

    /**
     *
     * @param LVHOEHE
     * The LVHOEHE
     */
    public void setLVHOEHE(Integer LVHOEHE) {
        this.LVHOEHE = LVHOEHE;
    }



    /**
     *
     * @return
     * The BEMERKUNG
     */
    public String getBEMERKUNG() {
        return BEMERKUNG;
    }

    /**
     *
     * @param BEMERKUNG
     * The BEMERKUNG
     */
    public void setBEMERKUNG(String BEMERKUNG) {
        this.BEMERKUNG = BEMERKUNG;
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
     * The ANZAGG
     */
    public Integer getANZAGG() {
        return ANZAGG;
    }

    /**
     *
     * @param ANZAGG
     * The ANZAGG
     */
    public void setANZAGG(Integer ANZAGG) {
        this.ANZAGG = ANZAGG;
    }



    /**
     *
     * @return
     * The PLANART
     */
    public Integer getPLANART() {
        return PLANART;
    }

    /**
     *
     * @param PLANART
     * The PLANART
     */
    public void setPLANART(Integer PLANART) {
        this.PLANART = PLANART;
    }



    /**
     *
     * @return
     * The EXTRNR
     */
    public Integer getEXTRNR() {
        return EXTRNR;
    }

    /**
     *
     * @param EXTRNR
     * The EXTRNR
     */
    public void setEXTRNR(Integer EXTRNR) {
        this.EXTRNR = EXTRNR;
    }



    /**
     *
     * @return
     * The LAGERTYP
     */
    public Integer getLAGERTYP() {
        return LAGERTYP;
    }

    /**
     *
     * @param LAGERTYP
     * The LAGERTYP
     */
    public void setLAGERTYP(Integer LAGERTYP) {
        this.LAGERTYP = LAGERTYP;
    }



    /**
     *
     * @return
     * The ZDESC
     */
    public String getZDESC() {
        return StringUtils.lowerCase(ZDESC);
    }

    /**
     *
     * @param ZDESC
     * The ZDESC
     */
    public void setZDESC(String ZDESC) {
        this.ZDESC = ZDESC;
    }



    /**
     *
     * @return
     * The VPS
     */
    public Integer getVPS() {
        return VPS;
    }

    /**
     *
     * @param VPS
     * The VPS
     */
    public void setVPS(Integer VPS) {
        this.VPS = VPS;
    }



    /**
     *
     * @return
     * The VGRUPPE
     */
    public Integer getVGRUPPE() {
        return VGRUPPE;
    }

    /**
     *
     * @param VGRUPPE
     * The VGRUPPE
     */
    public void setVGRUPPE(Integer VGRUPPE) {
        this.VGRUPPE = VGRUPPE;
    }



    /**
     *
     * @return
     * The MAXPAKANZ
     */
    public Integer getMAXPAKANZ() {
        return MAXPAKANZ;
    }

    /**
     *
     * @param MAXPAKANZ
     * The MAXPAKANZ
     */
    public void setMAXPAKANZ(Integer MAXPAKANZ) {
        this.MAXPAKANZ = MAXPAKANZ;
    }



    /**
     *
     * @return
     * The MAXSTUECK
     */
    public Integer getMAXSTUECK() {
        return MAXSTUECK;
    }

    /**
     *
     * @param MAXSTUECK
     * The MAXSTUECK
     */
    public void setMAXSTUECK(Integer MAXSTUECK) {
        this.MAXSTUECK = MAXSTUECK;
    }



    /**
     *
     * @return
     * The MAXGEWICHT
     */
    public Integer getMAXGEWICHT() {
        return MAXGEWICHT;
    }

    /**
     *
     * @param MAXGEWICHT
     * The MAXGEWICHT
     */
    public void setMAXGEWICHT(Integer MAXGEWICHT) {
        this.MAXGEWICHT = MAXGEWICHT;
    }



    /**
     *
     * @return
     * The MAXLAGEN
     */
    public Integer getMAXLAGEN() {
        return MAXLAGEN;
    }

    /**
     *
     * @param MAXLAGEN
     * The MAXLAGEN
     */
    public void setMAXLAGEN(Integer MAXLAGEN) {
        this.MAXLAGEN = MAXLAGEN;
    }



    /**
     *
     * @return
     * The PAKETNUMMER
     */
    public Integer getPAKETNUMMER() {
        return PAKETNUMMER;
    }

    /**
     *
     * @param PAKETNUMMER
     * The PAKETNUMMER
     */
    public void setPAKETNUMMER(Integer PAKETNUMMER) {
        this.PAKETNUMMER = PAKETNUMMER;
    }



    /**
     *
     * @return
     * The PAKBEZUGRNR
     */
    public Integer getPAKBEZUGRNR() {
        return PAKBEZUGRNR;
    }

    /**
     *
     * @param PAKBEZUGRNR
     * The PAKBEZUGRNR
     */
    public void setPAKBEZUGRNR(Integer PAKBEZUGRNR) {
        this.PAKBEZUGRNR = PAKBEZUGRNR;
    }



    /**
     *
     * @return
     * The IntegerCODE
     */
    public Object getINTCODE() {
        return INTCODE;
    }

    /**
     *
     * @param INTCODE
     * The IntegerCODE
     */
    public void setINTCODE(Object INTCODE) {
        this.INTCODE = INTCODE;
    }



    /**
     *
     * @return
     * The LOS
     */
    public Integer getLOS() {
        return LOS;
    }

    /**
     *
     * @param LOS
     * The LOS
     */
    public void setLOS(Integer LOS) {
        this.LOS = LOS;
    }



    /**
     *
     * @return
     * The RFNR
     */
    public Integer getRFNR() {
        return RFNR;
    }

    /**
     *
     * @param RFNR
     * The RFNR
     */
    public void setRFNR(Integer RFNR) {
        this.RFNR = RFNR;
    }



    /**
     *
     * @return
     * The LOSRF
     */
    public Integer getLOSRF() {
        return LOSRF;
    }

    /**
     *
     * @param LOSRF
     * The LOSRF
     */
    public void setLOSRF(Integer LOSRF) {
        this.LOSRF = LOSRF;
    }



    /**
     *
     * @return
     * The ALRKOPPKNZ
     */
    public Integer getALRKOPPKNZ() {
        return ALRKOPPKNZ;
    }

    /**
     *
     * @param ALRKOPPKNZ
     * The ALRKOPPKNZ
     */
    public void setALRKOPPKNZ(Integer ALRKOPPKNZ) {
        this.ALRKOPPKNZ = ALRKOPPKNZ;
    }



    /**
     *
     * @return
     * The ALRKNZ
     */
    public String getALRKNZ() {
        return ALRKNZ;
    }

    /**
     *
     * @param ALRKNZ
     * The ALRKNZ
     */
    public void setALRKNZ(String ALRKNZ) {
        this.ALRKNZ = ALRKNZ;
    }



    /**
     *
     * @return
     * The SEGM1TERM
     */
    public String getSEGM1TERM() {

        String[] p;

        if (StringUtils.isNotEmpty(SEGM1TERM)) {
            p = SEGM1TERM.split(" ");
            if (p.length==2) return p[0];
        }
        return "";
//        return SEGM1TERM;
    }

    /**
     *
     * @param SEGM1TERM
     * The SEGM1_TERM
     */
    public void setSEGM1TERM(String SEGM1TERM) {
        this.SEGM1TERM = SEGM1TERM;
    }



    /**
     *
     * @return
     * The SEGM2ZART
     */
    public Integer getSEGM2ZART() {
        return SEGM2ZART;
    }

    /**
     *
     * @param SEGM2ZART
     * The SEGM2_ZART
     */
    public void setSEGM2ZART(Integer SEGM2ZART) {
        this.SEGM2ZART = SEGM2ZART;
    }



    /**
     *
     * @return
     * The SEGM2MENG
     */
    public Integer getSEGM2MENG() {
        return SEGM2MENG;
    }

    /**
     *
     * @param SEGM2MENG
     * The SEGM2_MENG
     */
    public void setSEGM2MENG(Integer SEGM2MENG) {
        this.SEGM2MENG = SEGM2MENG;
    }



    /**
     *
     * @return
     * The SEGM2TERM
     */
    public String getSEGM2TERM() {

        String[] p;

        if (StringUtils.isNotEmpty(SEGM2TERM)) {
            p = SEGM2TERM.split(" ");
            if (p.length==2) return p[0];
        }
        return "";
//        return SEGM2TERM;
    }

    /**
     *
     * @param SEGM2TERM
     * The SEGM2_TERM
     */
    public void setSEGM2TERM(String SEGM2TERM) {
        this.SEGM2TERM = SEGM2TERM;
    }



    /**
     *
     * @return
     * The SEGM3MENG
     */
    public Integer getSEGM3MENG() {
        return SEGM3MENG;
    }

    /**
     *
     * @param SEGM3MENG
     * The SEGM3_MENG
     */
    public void setSEGM3MENG(Integer SEGM3MENG) {
        this.SEGM3MENG = SEGM3MENG;
    }



    /**
     *
     * @return
     * The SEGM3TERM
     */
    public Object getSEGM3TERM() {
        return SEGM3TERM;
    }

    /**
     *
     * @param SEGM3TERM
     * The SEGM3_TERM
     */
    public void setSEGM3TERM(Object SEGM3TERM) {
        this.SEGM3TERM = SEGM3TERM;
    }



    /**
     *
     * @return
     * The SEGM4ZART
     */
    public Integer getSEGM4ZART() {
        return SEGM4ZART;
    }

    /**
     *
     * @param SEGM4ZART
     * The SEGM4_ZART
     */
    public void setSEGM4ZART(Integer SEGM4ZART) {
        this.SEGM4ZART = SEGM4ZART;
    }



    /**
     *
     * @return
     * The SEGM4MENG
     */
    public Integer getSEGM4MENG() {
        return SEGM4MENG;
    }

    /**
     *
     * @param SEGM4MENG
     * The SEGM4_MENG
     */
    public void setSEGM4MENG(Integer SEGM4MENG) {
        this.SEGM4MENG = SEGM4MENG;
    }



    /**
     *
     * @return
     * The SEGM4TERM
     */
    public Object getSEGM4TERM() {
        return SEGM4TERM;
    }

    /**
     *
     * @param SEGM4TERM
     * The SEGM4_TERM
     */
    public void setSEGM4TERM(Object SEGM4TERM) {
        this.SEGM4TERM = SEGM4TERM;
    }



    /**
     *
     * @return
     * The SEGM5ZART
     */
    public Integer getSEGM5ZART() {
        return SEGM5ZART;
    }

    /**
     *
     * @param SEGM5ZART
     * The SEGM5_ZART
     */
    public void setSEGM5ZART(Integer SEGM5ZART) {
        this.SEGM5ZART = SEGM5ZART;
    }



    /**
     *
     * @return
     * The SEGM5MENG
     */
    public Integer getSEGM5MENG() {
        return SEGM5MENG;
    }

    /**
     *
     * @param SEGM5MENG
     * The SEGM5_MENG
     */
    public void setSEGM5MENG(Integer SEGM5MENG) {
        this.SEGM5MENG = SEGM5MENG;
    }



    /**
     *
     * @return
     * The SEGM5TERM
     */
    public Object getSEGM5TERM() {
        return SEGM5TERM;
    }

    /**
     *
     * @param SEGM5TERM
     * The SEGM5_TERM
     */
    public void setSEGM5TERM(Object SEGM5TERM) {
        this.SEGM5TERM = SEGM5TERM;
    }



    /**
     *
     * @return
     * The SEGM5DATUM
     */
    public Object getSEGM5DATUM() {
        return SEGM5DATUM;
    }

    /**
     *
     * @param SEGM5DATUM
     * The SEGM5_DATUM
     */
    public void setSEGM5DATUM(Object SEGM5DATUM) {
        this.SEGM5DATUM = SEGM5DATUM;
    }



    /**
     *
     * @return
     * The SEGM6ZART
     */
    public Integer getSEGM6ZART() {
        return SEGM6ZART;
    }

    /**
     *
     * @param SEGM6ZART
     * The SEGM6_ZART
     */
    public void setSEGM6ZART(Integer SEGM6ZART) {
        this.SEGM6ZART = SEGM6ZART;
    }



    /**
     *
     * @return
     * The SEGM6MENG
     */
    public Integer getSEGM6MENG() {
        return SEGM6MENG;
    }

    /**
     *
     * @param SEGM6MENG
     * The SEGM6_MENG
     */
    public void setSEGM6MENG(Integer SEGM6MENG) {
        this.SEGM6MENG = SEGM6MENG;
    }



    /**
     *
     * @return
     * The SEGM6TERM
     */
    public String getSEGM6TERM() {
        return SEGM6TERM;
    }

    /**
     *
     * @param SEGM6TERM
     * The SEGM6_TERM
     */
    public void setSEGM6TERM(String SEGM6TERM) {
        this.SEGM6TERM = SEGM6TERM;
    }



    /**
     *
     * @return
     * The SEGM6DATUM
     */
    public Object getSEGM6DATUM() {
        return SEGM6DATUM;
    }

    /**
     *
     * @param SEGM6DATUM
     * The SEGM6_DATUM
     */
    public void setSEGM6DATUM(Object SEGM6DATUM) {
        this.SEGM6DATUM = SEGM6DATUM;
    }



    /**
     *
     * @return
     * The BELEGNRANG
     */
    public Object getBELEGNRANG() {
        return BELEGNRANG;
    }

    /**
     *
     * @param BELEGNRANG
     * The BELEGNRANG
     */
    public void setBELEGNRANG(Object BELEGNRANG) {
        this.BELEGNRANG = BELEGNRANG;
    }



    /**
     *
     * @return
     * The BELEGNRAUFT
     */
    public Object getBELEGNRAUFT() {
        return BELEGNRAUFT;
    }

    /**
     *
     * @param BELEGNRAUFT
     * The BELEGNRAUFT
     */
    public void setBELEGNRAUFT(Object BELEGNRAUFT) {
        this.BELEGNRAUFT = BELEGNRAUFT;
    }



    /**
     *
     * @return
     * The BELEGNRLIEF
     */
    public Object getBELEGNRLIEF() {
        return BELEGNRLIEF;
    }

    /**
     *
     * @param BELEGNRLIEF
     * The BELEGNRLIEF
     */
    public void setBELEGNRLIEF(Object BELEGNRLIEF) {
        this.BELEGNRLIEF = BELEGNRLIEF;
    }



    /**
     *
     * @return
     * The BELEGNRRECH
     */
    public Object getBELEGNRRECH() {
        return BELEGNRRECH;
    }

    /**
     *
     * @param BELEGNRRECH
     * The BELEGNRRECH
     */
    public void setBELEGNRRECH(Object BELEGNRRECH) {
        this.BELEGNRRECH = BELEGNRRECH;
    }



    /**
     *
     * @return
     * The BELEGNRANFR
     */
    public Object getBELEGNRANFR() {
        return BELEGNRANFR;
    }

    /**
     *
     * @param BELEGNRANFR
     * The BELEGNRANFR
     */
    public void setBELEGNRANFR(Object BELEGNRANFR) {
        this.BELEGNRANFR = BELEGNRANFR;
    }



    /**
     *
     * @return
     * The BELEGNRBEST
     */
    public String getBELEGNRBEST() {
        return BELEGNRBEST;
    }

    /**
     *
     * @param BELEGNRBEST
     * The BELEGNRBEST
     */
    public void setBELEGNRBEST(String BELEGNRBEST) {
        this.BELEGNRBEST = BELEGNRBEST;
    }



    /**
     *
     * @return
     * The BELEGNRBEZUG
     */
    public Object getBELEGNRBEZUG() {
        return BELEGNRBEZUG;
    }

    /**
     *
     * @param BELEGNRBEZUG
     * The BELEGNRBEZUG
     */
    public void setBELEGNRBEZUG(Object BELEGNRBEZUG) {
        this.BELEGNRBEZUG = BELEGNRBEZUG;
    }



    /**
     *
     * @return
     * The BELEGNRABRUF
     */
    public Object getBELEGNRABRUF() {
        return BELEGNRABRUF;
    }

    /**
     *
     * @param BELEGNRABRUF
     * The BELEGNRABRUF
     */
    public void setBELEGNRABRUF(Object BELEGNRABRUF) {
        this.BELEGNRABRUF = BELEGNRABRUF;
    }



    /**
     *
     * @return
     * The BELEGNR14
     */
    public Object getBELEGNR14() {
        return BELEGNR14;
    }

    /**
     *
     * @param BELEGNR14
     * The BELEGNR14
     */
    public void setBELEGNR14(Object BELEGNR14) {
        this.BELEGNR14 = BELEGNR14;
    }



    /**
     *
     * @return
     * The BELEGDATANG
     */
    public Object getBELEGDATANG() {
        return BELEGDATANG;
    }

    /**
     *
     * @param BELEGDATANG
     * The BELEGDATANG
     */
    public void setBELEGDATANG(Object BELEGDATANG) {
        this.BELEGDATANG = BELEGDATANG;
    }



    /**
     *
     * @return
     * The BELEGDATAUFT
     */
    public Object getBELEGDATAUFT() {
        return BELEGDATAUFT;
    }

    /**
     *
     * @param BELEGDATAUFT
     * The BELEGDATAUFT
     */
    public void setBELEGDATAUFT(Object BELEGDATAUFT) {
        this.BELEGDATAUFT = BELEGDATAUFT;
    }



    /**
     *
     * @return
     * The BELEGDATLIEF
     */
    public Object getBELEGDATLIEF() {
        return BELEGDATLIEF;
    }

    /**
     *
     * @param BELEGDATLIEF
     * The BELEGDATLIEF
     */
    public void setBELEGDATLIEF(Object BELEGDATLIEF) {
        this.BELEGDATLIEF = BELEGDATLIEF;
    }



    /**
     *
     * @return
     * The BELEGDATRECH
     */
    public Object getBELEGDATRECH() {
        return BELEGDATRECH;
    }

    /**
     *
     * @param BELEGDATRECH
     * The BELEGDATRECH
     */
    public void setBELEGDATRECH(Object BELEGDATRECH) {
        this.BELEGDATRECH = BELEGDATRECH;
    }



    /**
     *
     * @return
     * The BELEGDATANFR
     */
    public Object getBELEGDATANFR() {
        return BELEGDATANFR;
    }

    /**
     *
     * @param BELEGDATANFR
     * The BELEGDATANFR
     */
    public void setBELEGDATANFR(Object BELEGDATANFR) {
        this.BELEGDATANFR = BELEGDATANFR;
    }



    /**
     *
     * @return
     * The BELEGDATBEST
     */
    public String getBELEGDATBEST() {
        return BELEGDATBEST;
    }

    /**
     *
     * @param BELEGDATBEST
     * The BELEGDATBEST
     */
    public void setBELEGDATBEST(String BELEGDATBEST) {
        this.BELEGDATBEST = BELEGDATBEST;
    }



    /**
     *
     * @return
     * The BELEGDATBEZUG
     */
    public Object getBELEGDATBEZUG() {
        return BELEGDATBEZUG;
    }

    /**
     *
     * @param BELEGDATBEZUG
     * The BELEGDATBEZUG
     */
    public void setBELEGDATBEZUG(Object BELEGDATBEZUG) {
        this.BELEGDATBEZUG = BELEGDATBEZUG;
    }



    /**
     *
     * @return
     * The BELEGDATABRUF
     */
    public Object getBELEGDATABRUF() {
        return BELEGDATABRUF;
    }

    /**
     *
     * @param BELEGDATABRUF
     * The BELEGDATABRUF
     */
    public void setBELEGDATABRUF(Object BELEGDATABRUF) {
        this.BELEGDATABRUF = BELEGDATABRUF;
    }



    /**
     *
     * @return
     * The BELEGDAT14
     */
    public Object getBELEGDAT14() {
        return BELEGDAT14;
    }

    /**
     *
     * @param BELEGDAT14
     * The BELEGDAT14
     */
    public void setBELEGDAT14(Object BELEGDAT14) {
        this.BELEGDAT14 = BELEGDAT14;
    }



    /**
     *
     * @return
     * The VERTRETER1
     */
    public String getVERTRETER1() {
        return VERTRETER1;
    }

    /**
     *
     * @param VERTRETER1
     * The VERTRETER1
     */
    public void setVERTRETER1(String VERTRETER1) {
        this.VERTRETER1 = VERTRETER1;
    }



    /**
     *
     * @return
     * The VERTRETER2
     */
    public String getVERTRETER2() {
        return VERTRETER2;
    }

    /**
     *
     * @param VERTRETER2
     * The VERTRETER2
     */
    public void setVERTRETER2(String VERTRETER2) {
        this.VERTRETER2 = VERTRETER2;
    }



    /**
     *
     * @return
     * The VERTRGRP1
     */
    public Integer getVERTRGRP1() {
        return VERTRGRP1;
    }

    /**
     *
     * @param VERTRGRP1
     * The VERTRGRP1
     */
    public void setVERTRGRP1(Integer VERTRGRP1) {
        this.VERTRGRP1 = VERTRGRP1;
    }



    /**
     *
     * @return
     * The VERTRGRP2
     */
    public Integer getVERTRGRP2() {
        return VERTRGRP2;
    }

    /**
     *
     * @param VERTRGRP2
     * The VERTRGRP2
     */
    public void setVERTRGRP2(Integer VERTRGRP2) {
        this.VERTRGRP2 = VERTRGRP2;
    }



    /**
     *
     * @return
     * The EXTARTNR
     */
    public Object getEXTARTNR() {
        return EXTARTNR;
    }

    /**
     *
     * @param EXTARTNR
     * The EXTARTNR
     */
    public void setEXTARTNR(Object EXTARTNR) {
        this.EXTARTNR = EXTARTNR;
    }



    /**
     *
     * @return
     * The EXTME
     */
    public Object getEXTME() {
        return EXTME;
    }

    /**
     *
     * @param EXTME
     * The EXTME
     */
    public void setEXTME(Object EXTME) {
        this.EXTME = EXTME;
    }



    /**
     *
     * @return
     * The ADRNR0
     */
    public String getADRNR0() {
        return ADRNR0;
    }

    /**
     *
     * @param ADRNR0
     * The ADRNR0
     */
    public void setADRNR0(String ADRNR0) {
        this.ADRNR0 = ADRNR0;
    }



    /**
     *
     * @return
     * The ADRNR1
     */
    public String getADRNR1() {
        return ADRNR1;
    }

    /**
     *
     * @param ADRNR1
     * The ADRNR1
     */
    public void setADRNR1(String ADRNR1) {
        this.ADRNR1 = ADRNR1;
    }



    /**
     *
     * @return
     * The ADRNR2
     */
    public String getADRNR2() {
        return ADRNR2;
    }

    /**
     *
     * @param ADRNR2
     * The ADRNR2
     */
    public void setADRNR2(String ADRNR2) {
        this.ADRNR2 = ADRNR2;
    }



    /**
     *
     * @return
     * The ADRNR3
     */
    public String getADRNR3() {
        return ADRNR3;
    }

    /**
     *
     * @param ADRNR3
     * The ADRNR3
     */
    public void setADRNR3(String ADRNR3) {
        this.ADRNR3 = ADRNR3;
    }



    /**
     *
     * @return
     * The ADRNR4
     */
    public String getADRNR4() {
        return ADRNR4;
    }

    /**
     *
     * @param ADRNR4
     * The ADRNR4
     */
    public void setADRNR4(String ADRNR4) {
        this.ADRNR4 = ADRNR4;
    }



    /**
     *
     * @return
     * The ADRNR12
     */
    public String getADRNR12() {
        return ADRNR12;
    }

    /**
     *
     * @param ADRNR12
     * The ADRNR12
     */
    public void setADRNR12(String ADRNR12) {
        this.ADRNR12 = ADRNR12;
    }



    /**
     *
     * @return
     * The KW
     */
    public Integer getKW() {
        return KW;
    }

    /**
     *
     * @param KW
     * The KW
     */
    public void setKW(Integer KW) {
        this.KW = KW;
    }



    /**
     *
     * @return
     * The KJ
     */
    public Integer getKJ() {
        return KJ;
    }

    /**
     *
     * @param KJ
     * The KJ
     */
    public void setKJ(Integer KJ) {
        this.KJ = KJ;
    }



    /**
     *
     * @return
     * The SOKNZ1
     */
    public Integer getSOKNZ1() {
        return SOKNZ1;
    }

    /**
     *
     * @param SOKNZ1
     * The SOKNZ1
     */
    public void setSOKNZ1(Integer SOKNZ1) {
        this.SOKNZ1 = SOKNZ1;
    }



    /**
     *
     * @return
     * The TEXT0
     */
    public String getTEXT0() {
        return TEXT0;
    }

    /**
     *
     * @param TEXT0
     * The TEXT0
     */
    public void setTEXT0(String TEXT0) {
        this.TEXT0 = TEXT0;
    }



    /**
     *
     * @return
     * The ACPTEXT1
     */
    public Object getACPTEXT1() {
        return ACPTEXT1;
    }

    /**
     *
     * @param ACPTEXT1
     * The ACP_TEXT1
     */
    public void setACPTEXT1(Object ACPTEXT1) {
        this.ACPTEXT1 = ACPTEXT1;
    }



    /**
     *
     * @return
     * The ACPTEXT2
     */
    public Object getACPTEXT2() {
        return ACPTEXT2;
    }

    /**
     *
     * @param ACPTEXT2
     * The ACP_TEXT2
     */
    public void setACPTEXT2(Object ACPTEXT2) {
        this.ACPTEXT2 = ACPTEXT2;
    }



    /**
     *
     * @return
     * The ACPTEXT3
     */
    public Object getACPTEXT3() {
        return ACPTEXT3;
    }

    /**
     *
     * @param ACPTEXT3
     * The ACP_TEXT3
     */
    public void setACPTEXT3(Object ACPTEXT3) {
        this.ACPTEXT3 = ACPTEXT3;
    }



    /**
     *
     * @return
     * The TEXT4
     */
    public Object getTEXT4() {
        return TEXT4;
    }

    /**
     *
     * @param TEXT4
     * The TEXT4
     */
    public void setTEXT4(Object TEXT4) {
        this.TEXT4 = TEXT4;
    }



    /**
     *
     * @return
     * The ZBED
     */
    public Integer getZBED() {
        return ZBED;
    }

    /**
     *
     * @param ZBED
     * The ZBED
     */
    public void setZBED(Integer ZBED) {
        this.ZBED = ZBED;
    }



    /**
     *
     * @return
     * The WE
     */
    public String getWE() {
        return WE;
    }

    /**
     *
     * @param WE
     * The WE
     */
    public void setWE(String WE) {
        this.WE = WE;
    }



    /**
     *
     * @return
     * The PREISKNZ
     */
    public Integer getPREISKNZ() {
        return PREISKNZ;
    }

    /**
     *
     * @param PREISKNZ
     * The PREISKNZ
     */
    public void setPREISKNZ(Integer PREISKNZ) {
        this.PREISKNZ = PREISKNZ;
    }



    /**
     *
     * @return
     * The ACPPARTPREIS
     */
    public Integer getACPPARTPREIS() {
        return ACPPARTPREIS;
    }

    /**
     *
     * @param ACPPARTPREIS
     * The ACPPART_PREIS
     */
    public void setACPPARTPREIS(Integer ACPPARTPREIS) {
        this.ACPPARTPREIS = ACPPARTPREIS;
    }



    /**
     *
     * @return
     * The ACPPARTNETTO0
     */
    public Double getACPPARTNETTO0() {
        return ACPPARTNETTO0;
    }

    /**
     *
     * @param ACPPARTNETTO0
     * The ACPPART_NETTO0
     */
    public void setACPPARTNETTO0(Double ACPPARTNETTO0) {
        this.ACPPARTNETTO0 = ACPPARTNETTO0;
    }



    /**
     *
     * @return
     * The RABKNZBR1
     */
    public Integer getRABKNZBR1() {
        return RABKNZBR1;
    }

    /**
     *
     * @param RABKNZBR1
     * The RABKNZBR1
     */
    public void setRABKNZBR1(Integer RABKNZBR1) {
        this.RABKNZBR1 = RABKNZBR1;
    }



    /**
     *
     * @return
     * The RABKNZMR
     */
    public Integer getRABKNZMR() {
        return RABKNZMR;
    }

    /**
     *
     * @param RABKNZMR
     * The RABKNZMR
     */
    public void setRABKNZMR(Integer RABKNZMR) {
        this.RABKNZMR = RABKNZMR;
    }



    /**
     *
     * @return
     * The RABKNZWR
     */
    public Integer getRABKNZWR() {
        return RABKNZWR;
    }

    /**
     *
     * @param RABKNZWR
     * The RABKNZWR
     */
    public void setRABKNZWR(Integer RABKNZWR) {
        this.RABKNZWR = RABKNZWR;
    }



    /**
     *
     * @return
     * The RABKNZBR2
     */
    public Integer getRABKNZBR2() {
        return RABKNZBR2;
    }

    /**
     *
     * @param RABKNZBR2
     * The RABKNZBR2
     */
    public void setRABKNZBR2(Integer RABKNZBR2) {
        this.RABKNZBR2 = RABKNZBR2;
    }



    /**
     *
     * @return
     * The RABKNZ9
     */
    public Integer getRABKNZ9() {
        return RABKNZ9;
    }

    /**
     *
     * @param RABKNZ9
     * The RABKNZ9
     */
    public void setRABKNZ9(Integer RABKNZ9) {
        this.RABKNZ9 = RABKNZ9;
    }



    /**
     *
     * @return
     * The RABFIXBR1
     */
    public Integer getRABFIXBR1() {
        return RABFIXBR1;
    }

    /**
     *
     * @param RABFIXBR1
     * The RABFIXBR1
     */
    public void setRABFIXBR1(Integer RABFIXBR1) {
        this.RABFIXBR1 = RABFIXBR1;
    }



    /**
     *
     * @return
     * The RABFIXMR
     */
    public Integer getRABFIXMR() {
        return RABFIXMR;
    }

    /**
     *
     * @param RABFIXMR
     * The RABFIXMR
     */
    public void setRABFIXMR(Integer RABFIXMR) {
        this.RABFIXMR = RABFIXMR;
    }



    /**
     *
     * @return
     * The RABFIXWR
     */
    public Integer getRABFIXWR() {
        return RABFIXWR;
    }

    /**
     *
     * @param RABFIXWR
     * The RABFIXWR
     */
    public void setRABFIXWR(Integer RABFIXWR) {
        this.RABFIXWR = RABFIXWR;
    }



    /**
     *
     * @return
     * The RABFIXBR2
     */
    public Integer getRABFIXBR2() {
        return RABFIXBR2;
    }

    /**
     *
     * @param RABFIXBR2
     * The RABFIXBR2
     */
    public void setRABFIXBR2(Integer RABFIXBR2) {
        this.RABFIXBR2 = RABFIXBR2;
    }



    /**
     *
     * @return
     * The RABFIXFR
     */
    public Integer getRABFIXFR() {
        return RABFIXFR;
    }

    /**
     *
     * @param RABFIXFR
     * The RABFIXFR
     */
    public void setRABFIXFR(Integer RABFIXFR) {
        this.RABFIXFR = RABFIXFR;
    }



    /**
     *
     * @return
     * The RABFIXFZ
     */
    public Integer getRABFIXFZ() {
        return RABFIXFZ;
    }

    /**
     *
     * @param RABFIXFZ
     * The RABFIXFZ
     */
    public void setRABFIXFZ(Integer RABFIXFZ) {
        this.RABFIXFZ = RABFIXFZ;
    }



    /**
     *
     * @return
     * The RABAR
     */
    public Integer getRABAR() {
        return RABAR;
    }

    /**
     *
     * @param RABAR
     * The RABAR
     */
    public void setRABAR(Integer RABAR) {
        this.RABAR = RABAR;
    }



    /**
     *
     * @return
     * The RABBASBR1
     */
    public Object getRABBASBR1() {
        return RABBASBR1;
    }

    /**
     *
     * @param RABBASBR1
     * The RABBASBR1
     */
    public void setRABBASBR1(Integer RABBASBR1) {
        this.RABBASBR1 = RABBASBR1;
    }



    /**
     *
     * @return
     * The RABBASMR
     */
    public Object getRABBASMR() {
        return RABBASMR;
    }

    /**
     *
     * @param RABBASMR
     * The RABBASMR
     */
    public void setRABBASMR(Integer RABBASMR) {
        this.RABBASMR = RABBASMR;
    }



    /**
     *
     * @return
     * The RABBASWR
     */
    public Object getRABBASWR() {
        return RABBASWR;
    }

    /**
     *
     * @param RABBASWR
     * The RABBASWR
     */
    public void setRABBASWR(Integer RABBASWR) {
        this.RABBASWR = RABBASWR;
    }



    /**
     *
     * @return
     * The RABBASBR2
     */
    public Object getRABBASBR2() {
        return RABBASBR2;
    }

    /**
     *
     * @param RABBASBR2
     * The RABBASBR2
     */
    public void setRABBASBR2(Integer RABBASBR2) {
        this.RABBASBR2 = RABBASBR2;
    }



    /**
     *
     * @return
     * The RABBASFR
     */
    public Object getRABBASFR() {
        return RABBASFR;
    }

    /**
     *
     * @param RABBASFR
     * The RABBASFR
     */
    public void setRABBASFR(Integer RABBASFR) {
        this.RABBASFR = RABBASFR;
    }



    /**
     *
     * @return
     * The RABBASFZ
     */
    public Object getRABBASFZ() {
        return RABBASFZ;
    }

    /**
     *
     * @param RABBASFZ
     * The RABBASFZ
     */
    public void setRABBASFZ(Integer RABBASFZ) {
        this.RABBASFZ = RABBASFZ;
    }



    /**
     *
     * @return
     * The RABBASHR1
     */
    public Object getRABBASHR1() {
        return RABBASHR1;
    }

    /**
     *
     * @param RABBASHR1
     * The RABBASHR1
     */
    public void setRABBASHR1(Integer RABBASHR1) {
        this.RABBASHR1 = RABBASHR1;
    }



    /**
     *
     * @return
     * The RABBASHR2
     */
    public Object getRABBASHR2() {
        return RABBASHR2;
    }

    /**
     *
     * @param RABBASHR2
     * The RABBASHR2
     */
    public void setRABBASHR2(Integer RABBASHR2) {
        this.RABBASHR2 = RABBASHR2;
    }



    /**
     *
     * @return
     * The RABBAS9
     */
    public Object getRABBAS9() {
        return RABBAS9;
    }

    /**
     *
     * @param RABBAS9
     * The RABBAS9
     */
    public void setRABBAS9(Integer RABBAS9) {
        this.RABBAS9 = RABBAS9;
    }



    /**
     *
     * @return
     * The RABSUM
     */
    public Double getRABSUM() {
        return RABSUM;
    }

    /**
     *
     * @param RABSUM
     * The RABSUM
     */
    public void setRABSUM(Double RABSUM) {
        this.RABSUM = RABSUM;
    }



    /**
     *
     * @return
     * The NETTO1
     */
    public Double getNETTO1() {
        return NETTO1;
    }

    /**
     *
     * @param NETTO1
     * The NETTO1
     */
    public void setNETTO1(Double NETTO1) {
        this.NETTO1 = NETTO1;
    }



    /**
     *
     * @return
     * The UMSATZWERT
     */
    public Double getUMSATZWERT() {
        return UMSATZWERT;
    }

    /**
     *
     * @param UMSATZWERT
     * The UMSATZWERT
     */
    public void setUMSATZWERT(Double UMSATZWERT) {
        this.UMSATZWERT = UMSATZWERT;
    }



    /**
     *
     * @return
     * The ZSUM
     */
    public Double getZSUM() {
        return ZSUM;
    }

    /**
     *
     * @param ZSUM
     * The ZSUM
     */
    public void setZSUM(Double ZSUM) {
        this.ZSUM = ZSUM;
    }



    /**
     *
     * @return
     * The ZBASIS
     */
    public Double getZBASIS() {
        return ZBASIS;
    }

    /**
     *
     * @param ZBASIS
     * The ZBASIS
     */
    public void setZBASIS(Double ZBASIS) {
        this.ZBASIS = ZBASIS;
    }



    /**
     *
     * @return
     * The ZWERT
     */
    public Double getZWERT() {
        return ZWERT;
    }

    /**
     *
     * @param ZWERT
     * The ZWERT
     */
    public void setZWERT(Double ZWERT) {
        this.ZWERT = ZWERT;
    }



    /**
     *
     * @return
     * The ZPROZ
     */
    public Integer getZPROZ() {
        return ZPROZ;
    }

    /**
     *
     * @param ZPROZ
     * The ZPROZ
     */
    public void setZPROZ(Integer ZPROZ) {
        this.ZPROZ = ZPROZ;
    }



    /**
     *
     * @return
     * The NETTO2
     */
    public Double getNETTO2() {
        return NETTO2;
    }

    /**
     *
     * @param NETTO2
     * The NETTO2
     */
    public void setNETTO2(Double NETTO2) {
        this.NETTO2 = NETTO2;
    }



    /**
     *
     * @return
     * The MWSTKNZ
     */
    public Integer getMWSTKNZ() {
        return MWSTKNZ;
    }

    /**
     *
     * @param MWSTKNZ
     * The MWSTKNZ
     */
    public void setMWSTKNZ(Integer MWSTKNZ) {
        this.MWSTKNZ = MWSTKNZ;
    }



    /**
     *
     * @return
     * The MWSTWERT
     */
    public Double getMWSTWERT() {
        return MWSTWERT;
    }

    /**
     *
     * @param MWSTWERT
     * The MWSTWERT
     */
    public void setMWSTWERT(Double MWSTWERT) {
        this.MWSTWERT = MWSTWERT;
    }



    /**
     *
     * @return
     * The MWSTPROZ
     */
    public Integer getMWSTPROZ() {
        return MWSTPROZ;
    }

    /**
     *
     * @param MWSTPROZ
     * The MWSTPROZ
     */
    public void setMWSTPROZ(Integer MWSTPROZ) {
        this.MWSTPROZ = MWSTPROZ;
    }



    /**
     *
     * @return
     * The BRUTTO
     */
    public Double getBRUTTO() {
        return BRUTTO;
    }

    /**
     *
     * @param BRUTTO
     * The BRUTTO
     */
    public void setBRUTTO(Double BRUTTO) {
        this.BRUTTO = BRUTTO;
    }



    /**
     *
     * @return
     * The KOSTSUM
     */
    public Double getKOSTSUM() {
        return KOSTSUM;
    }

    /**
     *
     * @param KOSTSUM
     * The KOSTSUM
     */
    public void setKOSTSUM(Double KOSTSUM) {
        this.KOSTSUM = KOSTSUM;
    }



    /**
     *
     * @return
     * The DECKUNGSWERT
     */
    public Double getDECKUNGSWERT() {
        return DECKUNGSWERT;
    }

    /**
     *
     * @param DECKUNGSWERT
     * The DECKUNGSWERT
     */
    public void setDECKUNGSWERT(Double DECKUNGSWERT) {
        this.DECKUNGSWERT = DECKUNGSWERT;
    }



    /**
     *
     * @return
     * The PROVKNZ1
     */
    public Integer getPROVKNZ1() {
        return PROVKNZ1;
    }

    /**
     *
     * @param PROVKNZ1
     * The PROVKNZ1
     */
    public void setPROVKNZ1(Integer PROVKNZ1) {
        this.PROVKNZ1 = PROVKNZ1;
    }



    /**
     *
     * @return
     * The PROVKNZ2
     */
    public Integer getPROVKNZ2() {
        return PROVKNZ2;
    }

    /**
     *
     * @param PROVKNZ2
     * The PROVKNZ2
     */
    public void setPROVKNZ2(Integer PROVKNZ2) {
        this.PROVKNZ2 = PROVKNZ2;
    }



    /**
     *
     * @return
     * The PROVBAS1
     */
    public Integer getPROVBAS1() {
        return PROVBAS1;
    }

    /**
     *
     * @param PROVBAS1
     * The PROVBAS1
     */
    public void setPROVBAS1(Integer PROVBAS1) {
        this.PROVBAS1 = PROVBAS1;
    }



    /**
     *
     * @return
     * The PROVBAS2
     */
    public Integer getPROVBAS2() {
        return PROVBAS2;
    }

    /**
     *
     * @param PROVBAS2
     * The PROVBAS2
     */
    public void setPROVBAS2(Integer PROVBAS2) {
        this.PROVBAS2 = PROVBAS2;
    }



    /**
     *
     * @return
     * The PROVWERT1
     */
    public Double getPROVWERT1() {
        return PROVWERT1;
    }

    /**
     *
     * @param PROVWERT1
     * The PROVWERT1
     */
    public void setPROVWERT1(Double PROVWERT1) {
        this.PROVWERT1 = PROVWERT1;
    }



    /**
     *
     * @return
     * The PROVWERT2
     */
    public Double getPROVWERT2() {
        return PROVWERT2;
    }

    /**
     *
     * @param PROVWERT2
     * The PROVWERT2
     */
    public void setPROVWERT2(Double PROVWERT2) {
        this.PROVWERT2 = PROVWERT2;
    }



    /**
     *
     * @return
     * The PROVPROZ1
     */
    public Integer getPROVPROZ1() {
        return PROVPROZ1;
    }

    /**
     *
     * @param PROVPROZ1
     * The PROVPROZ1
     */
    public void setPROVPROZ1(Integer PROVPROZ1) {
        this.PROVPROZ1 = PROVPROZ1;
    }



    /**
     *
     * @return
     * The PROVPROZ2
     */
    public Integer getPROVPROZ2() {
        return PROVPROZ2;
    }

    /**
     *
     * @param PROVPROZ2
     * The PROVPROZ2
     */
    public void setPROVPROZ2(Integer PROVPROZ2) {
        this.PROVPROZ2 = PROVPROZ2;
    }



    /**
     *
     * @return
     * The LISTENPREIS
     */
    public Double getLISTENPREIS() {
        return LISTENPREIS;
    }

    /**
     *
     * @param LISTENPREIS
     * The LISTENPREIS
     */
    public void setLISTENPREIS(Double LISTENPREIS) {
        this.LISTENPREIS = LISTENPREIS;
    }



    /**
     *
     * @return
     * The PROZNP
     */
    public Integer getPROZNP() {
        return PROZNP;
    }

    /**
     *
     * @param PROZNP
     * The PROZNP
     */
    public void setPROZNP(Integer PROZNP) {
        this.PROZNP = PROZNP;
    }



    /**
     *
     * @return
     * The VALUTATAGE
     */
    public Integer getVALUTATAGE() {
        return VALUTATAGE;
    }

    /**
     *
     * @param VALUTATAGE
     * The VALUTATAGE
     */
    public void setVALUTATAGE(Integer VALUTATAGE) {
        this.VALUTATAGE = VALUTATAGE;
    }



    /**
     *
     * @return
     * The SUMMETZINLAND
     */
    public Integer getSUMMETZINLAND() {
        return SUMMETZINLAND;
    }

    /**
     *
     * @param SUMMETZINLAND
     * The SUMMETZINLAND
     */
    public void setSUMMETZINLAND(Integer SUMMETZINLAND) {
        this.SUMMETZINLAND = SUMMETZINLAND;
    }



    /**
     *
     * @return
     * The EXTMENG
     */
    public Double getEXTMENG() {
        return EXTMENG;
    }

    /**
     *
     * @param EXTMENG
     * The EXTMENG
     */
    public void setEXTMENG(Double EXTMENG) {
        this.EXTMENG = EXTMENG;
    }



    /**
     *
     * @return
     * The URSPINLAND
     */
    public Object getURSPINLAND() {
        return URSPINLAND;
    }

    /**
     *
     * @param URSPINLAND
     * The URSPINLAND
     */
    public void setURSPINLAND(Object URSPINLAND) {
        this.URSPINLAND = URSPINLAND;
    }



    /**
     *
     * @return
     * The URSPAUSLAND
     */
    public Integer getURSPAUSLAND() {
        return URSPAUSLAND;
    }

    /**
     *
     * @param URSPAUSLAND
     * The URSPAUSLAND
     */
    public void setURSPAUSLAND(Integer URSPAUSLAND) {
        this.URSPAUSLAND = URSPAUSLAND;
    }



    /**
     *
     * @return
     * The TCALLUP
     */
    public Integer getTCALLUP() {
        return TCALLUP;
    }

    /**
     *
     * @param TCALLUP
     * The TCALLUP
     */
    public void setTCALLUP(Integer TCALLUP) {
        this.TCALLUP = TCALLUP;
    }



    /**
     *
     * @return
     * The ADDRPERSACC
     */
    public String getADDRPERSACC() {
        return ADDRPERSACC;
    }

    /**
     *
     * @param ADDRPERSACC
     * The ADDRPERSACC
     */
    public void setADDRPERSACC(String ADDRPERSACC) {
        this.ADDRPERSACC = ADDRPERSACC;
    }



    /**
     *
     * @return
     * The DISTACTIVE
     */
    public Integer getDISTACTIVE() {
        return DISTACTIVE;
    }

    /**
     *
     * @param DISTACTIVE
     * The DISTACTIVE
     */
    public void setDISTACTIVE(Integer DISTACTIVE) {
        this.DISTACTIVE = DISTACTIVE;
    }



    /**
     *
     * @return
     * The USVERSKNZ
     */
    public Integer getUSVERSKNZ() {
        return USVERSKNZ;
    }

    /**
     *
     * @param USVERSKNZ
     * The USVERSKNZ
     */
    public void setUSVERSKNZ(Integer USVERSKNZ) {
        this.USVERSKNZ = USVERSKNZ;
    }



    /**
     *
     * @return
     * The RESTWERT
     */
    public Integer getRESTWERT() {
        return RESTWERT;
    }

    /**
     *
     * @param RESTWERT
     * The RESTWERT
     */
    public void setRESTWERT(Integer RESTWERT) {
        this.RESTWERT = RESTWERT;
    }



    /**
     *
     * @return
     * The ISTWERT
     */
    public Integer getISTWERT() {
        return ISTWERT;
    }

    /**
     *
     * @param ISTWERT
     * The ISTWERT
     */
    public void setISTWERT(Integer ISTWERT) {
        this.ISTWERT = ISTWERT;
    }



    /**
     *
     * @return
     * The ABRUFSUMRNR
     */
    public Integer getABRUFSUMRNR() {
        return ABRUFSUMRNR;
    }

    /**
     *
     * @param ABRUFSUMRNR
     * The ABRUFSUMRNR
     */
    public void setABRUFSUMRNR(Integer ABRUFSUMRNR) {
        this.ABRUFSUMRNR = ABRUFSUMRNR;
    }



    /**
     *
     * @return
     * The LFDNR
     */
    public Integer getLFDNR() {
        return LFDNR;
    }

    /**
     *
     * @param LFDNR
     * The LFDNR
     */
    public void setLFDNR(Integer LFDNR) {
        this.LFDNR = LFDNR;
    }



    /**
     *
     * @return
     * The FPREISBASIS
     */
    public Double getFPREISBASIS() {
        return FPREISBASIS;
    }

    /**
     *
     * @param FPREISBASIS
     * The F_PREISBASIS
     */
    public void setFPREISBASIS(Double FPREISBASIS) {
        this.FPREISBASIS = FPREISBASIS;
    }



    /**
     *
     * @return
     * The PREISBASISME
     */
    public Object getPREISBASISME() {
        return PREISBASISME;
    }

    /**
     *
     * @param PREISBASISME
     * The PREISBASISME
     */
    public void setPREISBASISME(Object PREISBASISME) {
        this.PREISBASISME = PREISBASISME;
    }



    /**
     *
     * @return
     * The SPLITTLIEFRNR
     */
    public Integer getSPLITTLIEFRNR() {
        return SPLITTLIEFRNR;
    }

    /**
     *
     * @param SPLITTLIEFRNR
     * The SPLITTLIEFRNR
     */
    public void setSPLITTLIEFRNR(Integer SPLITTLIEFRNR) {
        this.SPLITTLIEFRNR = SPLITTLIEFRNR;
    }



    /**
     *
     * @return
     * The ENTNAHMEMENGE
     */
    public Integer getENTNAHMEMENGE() {
        return ENTNAHMEMENGE;
    }

    /**
     *
     * @param ENTNAHMEMENGE
     * The ENTNAHMEMENGE
     */
    public void setENTNAHMEMENGE(Integer ENTNAHMEMENGE) {
        this.ENTNAHMEMENGE = ENTNAHMEMENGE;
    }



    /**
     *
     * @return
     * The RECHNUNGSMENGE
     */
    public Integer getRECHNUNGSMENGE() {
        return RECHNUNGSMENGE;
    }

    /**
     *
     * @param RECHNUNGSMENGE
     * The RECHNUNGSMENGE
     */
    public void setRECHNUNGSMENGE(Integer RECHNUNGSMENGE) {
        this.RECHNUNGSMENGE = RECHNUNGSMENGE;
    }



    /**
     *
     * @return
     * The SPLITTRECHRNR
     */
    public Integer getSPLITTRECHRNR() {
        return SPLITTRECHRNR;
    }

    /**
     *
     * @param SPLITTRECHRNR
     * The SPLITTRECHRNR
     */
    public void setSPLITTRECHRNR(Integer SPLITTRECHRNR) {
        this.SPLITTRECHRNR = SPLITTRECHRNR;
    }



    /**
     *
     * @return
     * The UPBEZUGRNR
     */
    public Integer getUPBEZUGRNR() {
        return UPBEZUGRNR;
    }

    /**
     *
     * @param UPBEZUGRNR
     * The UPBEZUGRNR
     */
    public void setUPBEZUGRNR(Integer UPBEZUGRNR) {
        this.UPBEZUGRNR = UPBEZUGRNR;
    }



    /**
     *
     * @return
     * The LIEFERZEIT
     */
    public Integer getLIEFERZEIT() {
        return LIEFERZEIT;
    }

    /**
     *
     * @param LIEFERZEIT
     * The LIEFERZEIT
     */
    public void setLIEFERZEIT(Integer LIEFERZEIT) {
        this.LIEFERZEIT = LIEFERZEIT;
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
     * The ULIEFMENGE
     */
    public Integer getULIEFMENGE() {
        return ULIEFMENGE;
    }

    /**
     *
     * @param ULIEFMENGE
     * The ULIEFMENGE
     */
    public void setULIEFMENGE(Integer ULIEFMENGE) {
        this.ULIEFMENGE = ULIEFMENGE;
    }



    /**
     *
     * @return
     * The EXTKTXT
     */
    public Object getEXTKTXT() {
        return EXTKTXT;
    }

    /**
     *
     * @param EXTKTXT
     * The EXTKTXT
     */
    public void setEXTKTXT(Object EXTKTXT) {
        this.EXTKTXT = EXTKTXT;
    }



    /**
     *
     * @return
     * The USEINTREFFTBEST
     */
    public String getUSEINTREFFTBEST() {

        String[] p;

        if (StringUtils.isNotEmpty(USEINTREFFTBEST)) {
            p = USEINTREFFTBEST.split(" ");
            if (p.length==2) return p[0];
        }
        return "";
        //return USEINTREFFTBEST;
    }

    /**
     *
     * @param USEINTREFFTBEST
     * The USEINTREFFTBEST
     */
    public void setUSEINTREFFTBEST(String USEINTREFFTBEST) {
        this.USEINTREFFTBEST = USEINTREFFTBEST;
    }



    /**
     *
     * @return
     * The USEINTREFFTERMIN
     */
    public String getUSEINTREFFTERMIN() {

        String[] p;

        if (StringUtils.isNotEmpty(USEINTREFFTERMIN)) {
            p = USEINTREFFTERMIN.split(" ");
            if (p.length==2) return p[0];
        }
        return "";
        //return USEINTREFFTERMIN;
    }

    /**
     *
     * @param USEINTREFFTERMIN
     * The USEINTREFFTERMIN
     */
    public void setUSEINTREFFTERMIN(String USEINTREFFTERMIN) {
        this.USEINTREFFTERMIN = USEINTREFFTERMIN;
    }



    /**
     *
     * @return
     * The FUELLMENGE
     */
    public Integer getFUELLMENGE() {
        return FUELLMENGE;
    }

    /**
     *
     * @param FUELLMENGE
     * The FUELLMENGE
     */
    public void setFUELLMENGE(Integer FUELLMENGE) {
        this.FUELLMENGE = FUELLMENGE;
    }



    /**
     *
     * @return
     * The RECHUENR
     */
    public Integer getRECHUENR() {
        return RECHUENR;
    }

    /**
     *
     * @param RECHUENR
     * The RECHUENR
     */
    public void setRECHUENR(Integer RECHUENR) {
        this.RECHUENR = RECHUENR;
    }



    /**
     *
     * @return
     * The VERBRSTELLE
     */
    public Object getVERBRSTELLE() {
        return VERBRSTELLE;
    }

    /**
     *
     * @param VERBRSTELLE
     * The VERBRSTELLE
     */
    public void setVERBRSTELLE(Object VERBRSTELLE) {
        this.VERBRSTELLE = VERBRSTELLE;
    }



    /**
     *
     * @return
     * The OFFENLIEF
     */
    public Integer getOFFENLIEF() {
        return OFFENLIEF;
    }

    /**
     *
     * @param OFFENLIEF
     * The OFFENLIEF
     */
    public void setOFFENLIEF(Integer OFFENLIEF) {
        this.OFFENLIEF = OFFENLIEF;
    }



    /**
     *
     * @return
     * The OFFENENTN
     */
    public Integer getOFFENENTN() {
        return OFFENENTN;
    }

    /**
     *
     * @param OFFENENTN
     * The OFFENENTN
     */
    public void setOFFENENTN(Integer OFFENENTN) {
        this.OFFENENTN = OFFENENTN;
    }



    /**
     *
     * @return
     * The OFFENRECH
     */
    public Integer getOFFENRECH() {
        return OFFENRECH;
    }

    /**
     *
     * @param OFFENRECH
     * The OFFENRECH
     */
    public void setOFFENRECH(Integer OFFENRECH) {
        this.OFFENRECH = OFFENRECH;
    }



    /**
     *
     * @return
     * The WARENWERT
     */
    public Integer getWARENWERT() {
        return WARENWERT;
    }

    /**
     *
     * @param WARENWERT
     * The WARENWERT
     */
    public void setWARENWERT(Integer WARENWERT) {
        this.WARENWERT = WARENWERT;
    }



    /**
     *
     * @return
     * The SETBEZUGRNR
     */
    public Integer getSETBEZUGRNR() {
        return SETBEZUGRNR;
    }

    /**
     *
     * @param SETBEZUGRNR
     * The SETBEZUGRNR
     */
    public void setSETBEZUGRNR(Integer SETBEZUGRNR) {
        this.SETBEZUGRNR = SETBEZUGRNR;
    }



    /**
     *
     * @return
     * The BELEGNR13
     */
    public Object getBELEGNR13() {
        return BELEGNR13;
    }

    /**
     *
     * @param BELEGNR13
     * The BELEGNR13
     */
    public void setBELEGNR13(Object BELEGNR13) {
        this.BELEGNR13 = BELEGNR13;
    }



    /**
     *
     * @return
     * The USEKPREIS
     */
    public Integer getUSEKPREIS() {
        return USEKPREIS;
    }

    /**
     *
     * @param USEKPREIS
     * The USEKPREIS
     */
    public void setUSEKPREIS(Integer USEKPREIS) {
        this.USEKPREIS = USEKPREIS;
    }


    public String getObjectAsString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Auftrag loadOrderDataByANR (Context c, String search) {

        //final String URL = "http://api.androidhive.info/volley/person_object.json";
        final Context context = c;
        final Gson gson = new Gson();

        // Increase counter for pending search requests
        mRequestCounter++;

        JsonObjectRequest req = new JsonObjectRequest(search, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                try {
                    VolleyLog.d("Response:%n %s", response.toString(4));
                    JSONArray orders = response.getJSONArray("orders");
                    JSONObject o = orders.getJSONObject(0);
                    Toast.makeText(context, orders.length() + " Einträge über ANR gefunden", Toast.LENGTH_SHORT).show();
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(context, e.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.e("Error: ", error.getMessage());
                Toast.makeText(context, error.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        req.setRetryPolicy(new DefaultRetryPolicy(3000, 2, 2));
        AppController.getInstance().addToRequestQueue(req);

        return null;
    }
}