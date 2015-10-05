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
import de.fischerprofil.fp.AppController;
import de.fischerprofil.fp.R;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Auftrag implements Parcelable {

    private String mObjectAsString;
    private int mRequestCounter = 0;

    private int mIcon;      // Icon des Auftrags
    @SerializedName("CREATEDATE")
    private String CREATEDATE;
    @SerializedName("MODIFYDATE")
    private String MODIFYDATE;
    @SerializedName("CREATEUSER")
    private String CREATEUSER;
    @SerializedName("MODIFYUSER")
    private String MODIFYUSER;
    @SerializedName("CID")
    private int CID;
    @SerializedName("RNR")
    private int RNR;
    @SerializedName("SAINT")
    private int SAINT;
    @SerializedName("SAEXT")
    private String SAEXT;
    @SerializedName("ANR")
    private String ANR;
    @SerializedName("MNR")
    private String MNR;
    @SerializedName("UTNR")
    private int UTNR;
    @SerializedName("KOMM")
    private String KOMM;
    @SerializedName("KTXT")
    private String KTXT;
    @SerializedName("IPOS")
    private int IPOS;
    @SerializedName("ZUST")
    private int ZUST;
    @SerializedName("WS")
    private int WS;
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
    private int BEWPREIS;
    @SerializedName("BEWPREISBASIS")
    private int BEWPREISBASIS;
    @SerializedName("BEWPREISME")
    private int BEWPREISME;
    @SerializedName("GEWICHT")
    private double GEWICHT;
    @SerializedName("DLZFIXKNZ")
    private int DLZFIXKNZ;
    @SerializedName("LVANZ")
    private int LVANZ;
    @SerializedName("LVLAENGE")
    private int LVLAENGE;
    @SerializedName("LVBREITE")
    private int LVBREITE;
    @SerializedName("LVHOEHE")
    private int LVHOEHE;
    @SerializedName("BEMERKUNG")
    private String BEMERKUNG;
    @SerializedName("SACHBEARBEITER")
    private Object SACHBEARBEITER;
    @SerializedName("ANZAGG")
    private int ANZAGG;
    @SerializedName("PLANART")
    private int PLANART;
    @SerializedName("EXTRNR")
    private int EXTRNR;
    @SerializedName("LAGERTYP")
    private int LAGERTYP;
    @SerializedName("ZDESC")
    private String ZDESC;
    @SerializedName("VPS")
    private int VPS;
    @SerializedName("VGRUPPE")
    private int VGRUPPE;
    @SerializedName("MAXPAKANZ")
    private int MAXPAKANZ;
    @SerializedName("MAXSTUECK")
    private int MAXSTUECK;
    @SerializedName("MAXGEWICHT")
    private int MAXGEWICHT;
    @SerializedName("MAXLAGEN")
    private int MAXLAGEN;
    @SerializedName("PAKETNUMMER")
    private int PAKETNUMMER;
    @SerializedName("PAKBEZUGRNR")
    private int PAKBEZUGRNR;
    @SerializedName("INTCODE")
    private Object INTCODE;
    @SerializedName("LOS")
    private int LOS;
    @SerializedName("RFNR")
    private int RFNR;
    @SerializedName("LOSRF")
    private int LOSRF;
    @SerializedName("ALRKOPPKNZ")
    private int ALRKOPPKNZ;
    @SerializedName("ALRKNZ")
    private String ALRKNZ;
    @SerializedName("SEGM1_TERM")
    private String SEGM1TERM;
    @SerializedName("SEGM2_ZART")
    private int SEGM2ZART;
    @SerializedName("SEGM2_MENG")
    private int SEGM2MENG;
    @SerializedName("SEGM2_TERM")
    private String SEGM2TERM;
    @SerializedName("SEGM3_MENG")
    private int SEGM3MENG;
    @SerializedName("SEGM3_TERM")
    private Object SEGM3TERM;
    @SerializedName("SEGM4_ZART")
    private int SEGM4ZART;
    @SerializedName("SEGM4_MENG")
    private int SEGM4MENG;
    @SerializedName("SEGM4_TERM")
    private Object SEGM4TERM;
    @SerializedName("SEGM5_ZART")
    private int SEGM5ZART;
    @SerializedName("SEGM5_MENG")
    private int SEGM5MENG;
    @SerializedName("SEGM5_TERM")
    private Object SEGM5TERM;
    @SerializedName("SEGM5_DATUM")
    private Object SEGM5DATUM;
    @SerializedName("SEGM6_ZART")
    private int SEGM6ZART;
    @SerializedName("SEGM6_MENG")
    private int SEGM6MENG;
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
    private int VERTRGRP1;
    @SerializedName("VERTRGRP2")
    private int VERTRGRP2;
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
    private int KW;
    @SerializedName("KJ")
    private int KJ;
    @SerializedName("SOKNZ1")
    private int SOKNZ1;
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
    private int ZBED;
    @SerializedName("WE")
    private String WE;
    @SerializedName("PREISKNZ")
    private int PREISKNZ;
    @SerializedName("ACPPART_PREIS")
    private int ACPPARTPREIS;
    @SerializedName("ACPPART_NETTO0")
    private Double ACPPARTNETTO0;
    @SerializedName("RABKNZBR1")
    private int RABKNZBR1;
    @SerializedName("RABKNZMR")
    private int RABKNZMR;
    @SerializedName("RABKNZWR")
    private int RABKNZWR;
    @SerializedName("RABKNZBR2")
    private int RABKNZBR2;
    @SerializedName("RABKNZ9")
    private int RABKNZ9;
    @SerializedName("RABFIXBR1")
    private int RABFIXBR1;
    @SerializedName("RABFIXMR")
    private int RABFIXMR;
    @SerializedName("RABFIXWR")
    private int RABFIXWR;
    @SerializedName("RABFIXBR2")
    private int RABFIXBR2;
    @SerializedName("RABFIXFR")
    private int RABFIXFR;
    @SerializedName("RABFIXFZ")
    private int RABFIXFZ;
    @SerializedName("RABAR")
    private int RABAR;
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
    private int RABSUM;
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
    private int ZPROZ;
    @SerializedName("NETTO2")
    private Double NETTO2;
    @SerializedName("MWSTKNZ")
    private int MWSTKNZ;
    @SerializedName("MWSTWERT")
    private Double MWSTWERT;
    @SerializedName("MWSTPROZ")
    private int MWSTPROZ;
    @SerializedName("BRUTTO")
    private Double BRUTTO;
    @SerializedName("KOSTSUM")
    private Double KOSTSUM;
    @SerializedName("DECKUNGSWERT")
    private Double DECKUNGSWERT;
    @SerializedName("PROVKNZ1")
    private int PROVKNZ1;
    @SerializedName("PROVKNZ2")
    private int PROVKNZ2;
    @SerializedName("PROVBAS1")
    private int PROVBAS1;
    @SerializedName("PROVBAS2")
    private int PROVBAS2;
    @SerializedName("PROVWERT1")
    private Double PROVWERT1;
    @SerializedName("PROVWERT2")
    private Double PROVWERT2;
    @SerializedName("PROVPROZ1")
    private int PROVPROZ1;
    @SerializedName("PROVPROZ2")
    private int PROVPROZ2;
    @SerializedName("LISTENPREIS")
    private Double LISTENPREIS;
    @SerializedName("PROZNP")
    private int PROZNP;
    @SerializedName("VALUTATAGE")
    private int VALUTATAGE;
    @SerializedName("SUMMETZINLAND")
    private int SUMMETZINLAND;
    @SerializedName("EXTMENG")
    private Double EXTMENG;
    @SerializedName("URSPINLAND")
    private Object URSPINLAND;
    @SerializedName("URSPAUSLAND")
    private int URSPAUSLAND;
    @SerializedName("TCALLUP")
    private int TCALLUP;
    @SerializedName("ADDRPERSACC")
    private String ADDRPERSACC;
    @SerializedName("DISTACTIVE")
    private int DISTACTIVE;
    @SerializedName("USVERSKNZ")
    private int USVERSKNZ;
    @SerializedName("RESTWERT")
    private int RESTWERT;
    @SerializedName("ISTWERT")
    private int ISTWERT;
    @SerializedName("ABRUFSUMRNR")
    private int ABRUFSUMRNR;
    @SerializedName("LFDNR")
    private int LFDNR;
    @SerializedName("F_PREISBASIS")
    private double FPREISBASIS;
    @SerializedName("PREISBASISME")
    private Object PREISBASISME;
    @SerializedName("SPLITTLIEFRNR")
    private int SPLITTLIEFRNR;
    @SerializedName("ENTNAHMEMENGE")
    private int ENTNAHMEMENGE;
    @SerializedName("RECHNUNGSMENGE")
    private int RECHNUNGSMENGE;
    @SerializedName("SPLITTRECHRNR")
    private int SPLITTRECHRNR;
    @SerializedName("UPBEZUGRNR")
    private int UPBEZUGRNR;
    @SerializedName("LIEFERZEIT")
    private int LIEFERZEIT;
    @SerializedName("WERK")
    private Object WERK;
    @SerializedName("ABLST")
    private Object ABLST;
    @SerializedName("EXTLAGER")
    private Object EXTLAGER;
    @SerializedName("ULIEFMENGE")
    private int ULIEFMENGE;
    @SerializedName("EXTKTXT")
    private Object EXTKTXT;
    @SerializedName("USEINTREFFTERMIN")
    private String USEINTREFFTERMIN;
    @SerializedName("USEINTREFFTBEST")
    private String USEINTREFFTBEST;
    @SerializedName("FUELLMENGE")
    private int FUELLMENGE;
    @SerializedName("RECHUENR")
    private int RECHUENR;
    @SerializedName("VERBRSTELLE")
    private Object VERBRSTELLE;
    @SerializedName("OFFENLIEF")
    private int OFFENLIEF;
    @SerializedName("OFFENENTN")
    private int OFFENENTN;
    @SerializedName("OFFENRECH")
    private int OFFENRECH;
    @SerializedName("WARENWERT")
    private int WARENWERT;
    @SerializedName("SETBEZUGRNR")
    private int SETBEZUGRNR;
    @SerializedName("BELEGNR13")
    private Object BELEGNR13;
    @SerializedName("USEKPREIS")
    private int USEKPREIS;

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
        mIcon = in.readInt();
        CREATEDATE = in.readString();
        MODIFYDATE = in.readString();
        CREATEUSER = in.readString();
        MODIFYUSER = in.readString();
        CID = in.readInt();
        RNR = in.readInt();
        SAINT = in.readInt();
        SAEXT = in.readString();
        ANR = in.readString();
        MNR = in.readString();
        UTNR = in.readInt();
        KOMM = in.readString();
        KTXT = in.readString();
        IPOS = in.readInt();
        ZUST = in.readInt();
        WS = in.readInt();
        STATUS1 = in.readString();
        STATUS2 = in.readString();
        STATUS3 = in.readString();
        STATUS4 = in.readString();
        STATUS5 = in.readString();
        STATUS6 = in.readString();
        BEWPREIS = in.readInt();
        BEWPREISBASIS = in.readInt();
        BEWPREISME = in.readInt();
        GEWICHT = in.readDouble();
        DLZFIXKNZ = in.readInt();
        LVANZ = in.readInt();
        LVLAENGE = in.readInt();
        LVBREITE = in.readInt();
        LVHOEHE = in.readInt();
        BEMERKUNG = in.readString();
        ANZAGG = in.readInt();
        PLANART = in.readInt();
        EXTRNR = in.readInt();
        LAGERTYP = in.readInt();
        ZDESC = in.readString();
        VPS = in.readInt();
        VGRUPPE = in.readInt();
        MAXPAKANZ = in.readInt();
        MAXSTUECK = in.readInt();
        MAXGEWICHT = in.readInt();
        MAXLAGEN = in.readInt();
        PAKETNUMMER = in.readInt();
        PAKBEZUGRNR = in.readInt();
        LOS = in.readInt();
        RFNR = in.readInt();
        LOSRF = in.readInt();
        ALRKOPPKNZ = in.readInt();
        ALRKNZ = in.readString();
        SEGM1TERM = in.readString();
        SEGM2ZART = in.readInt();
        SEGM2MENG = in.readInt();
        SEGM2TERM = in.readString();
        SEGM3MENG = in.readInt();
        SEGM4ZART = in.readInt();
        SEGM4MENG = in.readInt();
        SEGM5ZART = in.readInt();
        SEGM5MENG = in.readInt();
        SEGM6ZART = in.readInt();
        SEGM6MENG = in.readInt();
        SEGM6TERM = in.readString();
        BELEGNRBEST = in.readString();
        BELEGDATBEST = in.readString();
        VERTRETER1 = in.readString();
        VERTRETER2 = in.readString();
        VERTRGRP1 = in.readInt();
        VERTRGRP2 = in.readInt();
        ADRNR0 = in.readString();
        ADRNR1 = in.readString();
        ADRNR2 = in.readString();
        ADRNR3 = in.readString();
        ADRNR4 = in.readString();
        ADRNR12 = in.readString();
        KW = in.readInt();
        KJ = in.readInt();
        SOKNZ1 = in.readInt();
        TEXT0 = in.readString();
        ZBED = in.readInt();
        WE = in.readString();
        PREISKNZ = in.readInt();
        ACPPARTPREIS = in.readInt();
        RABKNZBR1 = in.readInt();
        RABKNZMR = in.readInt();
        RABKNZWR = in.readInt();
        RABKNZBR2 = in.readInt();
        RABKNZ9 = in.readInt();
        RABFIXBR1 = in.readInt();
        RABFIXMR = in.readInt();
        RABFIXWR = in.readInt();
        RABFIXBR2 = in.readInt();
        RABFIXFR = in.readInt();
        RABFIXFZ = in.readInt();
        RABAR = in.readInt();
        RABSUM = in.readInt();
        ZPROZ = in.readInt();
        MWSTKNZ = in.readInt();
        MWSTPROZ = in.readInt();
        PROVKNZ1 = in.readInt();
        PROVKNZ2 = in.readInt();
        PROVBAS1 = in.readInt();
        PROVBAS2 = in.readInt();
        PROVPROZ1 = in.readInt();
        PROVPROZ2 = in.readInt();
        PROZNP = in.readInt();
        VALUTATAGE = in.readInt();
        SUMMETZINLAND = in.readInt();
        URSPAUSLAND = in.readInt();
        TCALLUP = in.readInt();
        ADDRPERSACC = in.readString();
        DISTACTIVE = in.readInt();
        USVERSKNZ = in.readInt();
        RESTWERT = in.readInt();
        ISTWERT = in.readInt();
        ABRUFSUMRNR = in.readInt();
        LFDNR = in.readInt();
        FPREISBASIS = in.readDouble();
        SPLITTLIEFRNR = in.readInt();
        ENTNAHMEMENGE = in.readInt();
        RECHNUNGSMENGE = in.readInt();
        SPLITTRECHRNR = in.readInt();
        UPBEZUGRNR = in.readInt();
        LIEFERZEIT = in.readInt();
        ULIEFMENGE = in.readInt();
        USEINTREFFTERMIN = in.readString();
        USEINTREFFTBEST = in.readString();
        FUELLMENGE = in.readInt();
        RECHUENR = in.readInt();
        OFFENLIEF = in.readInt();
        OFFENENTN = in.readInt();
        OFFENRECH = in.readInt();
        WARENWERT = in.readInt();
        SETBEZUGRNR = in.readInt();
        USEKPREIS = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mObjectAsString);
        dest.writeInt(mIcon);
        dest.writeString(CREATEDATE);
        dest.writeString(MODIFYDATE);
        dest.writeString(CREATEUSER);
        dest.writeString(MODIFYUSER);
        dest.writeInt(CID);
        dest.writeInt(RNR);
        dest.writeInt(SAINT);
        dest.writeString(SAEXT);
        dest.writeString(ANR);
        dest.writeString(MNR);
        dest.writeInt(UTNR);
        dest.writeString(KOMM);
        dest.writeString(KTXT);
        dest.writeInt(IPOS);
        dest.writeInt(ZUST);
        dest.writeInt(WS);
        dest.writeString(STATUS1);
        dest.writeString(STATUS2);
        dest.writeString(STATUS3);
        dest.writeString(STATUS4);
        dest.writeString(STATUS5);
        dest.writeString(STATUS6);
        dest.writeInt(BEWPREIS);
        dest.writeInt(BEWPREISBASIS);
        dest.writeInt(BEWPREISME);
        dest.writeDouble(GEWICHT);
        dest.writeInt(DLZFIXKNZ);
        dest.writeInt(LVANZ);
        dest.writeInt(LVLAENGE);
        dest.writeInt(LVBREITE);
        dest.writeInt(LVHOEHE);
        dest.writeString(BEMERKUNG);
        dest.writeInt(ANZAGG);
        dest.writeInt(PLANART);
        dest.writeInt(EXTRNR);
        dest.writeInt(LAGERTYP);
        dest.writeString(ZDESC);
        dest.writeInt(VPS);
        dest.writeInt(VGRUPPE);
        dest.writeInt(MAXPAKANZ);
        dest.writeInt(MAXSTUECK);
        dest.writeInt(MAXGEWICHT);
        dest.writeInt(MAXLAGEN);
        dest.writeInt(PAKETNUMMER);
        dest.writeInt(PAKBEZUGRNR);
        dest.writeInt(LOS);
        dest.writeInt(RFNR);
        dest.writeInt(LOSRF);
        dest.writeInt(ALRKOPPKNZ);
        dest.writeString(ALRKNZ);
        dest.writeString(SEGM1TERM);
        dest.writeInt(SEGM2ZART);
        dest.writeInt(SEGM2MENG);
        dest.writeString(SEGM2TERM);
        dest.writeInt(SEGM3MENG);
        dest.writeInt(SEGM4ZART);
        dest.writeInt(SEGM4MENG);
        dest.writeInt(SEGM5ZART);
        dest.writeInt(SEGM5MENG);
        dest.writeInt(SEGM6ZART);
        dest.writeInt(SEGM6MENG);
        dest.writeString(SEGM6TERM);
        dest.writeString(BELEGNRBEST);
        dest.writeString(BELEGDATBEST);
        dest.writeString(VERTRETER1);
        dest.writeString(VERTRETER2);
        dest.writeInt(VERTRGRP1);
        dest.writeInt(VERTRGRP2);
        dest.writeString(ADRNR0);
        dest.writeString(ADRNR1);
        dest.writeString(ADRNR2);
        dest.writeString(ADRNR3);
        dest.writeString(ADRNR4);
        dest.writeString(ADRNR12);
        dest.writeInt(KW);
        dest.writeInt(KJ);
        dest.writeInt(SOKNZ1);
        dest.writeString(TEXT0);
        dest.writeInt(ZBED);
        dest.writeString(WE);
        dest.writeInt(PREISKNZ);
        dest.writeInt(ACPPARTPREIS);
        dest.writeInt(RABKNZBR1);
        dest.writeInt(RABKNZMR);
        dest.writeInt(RABKNZWR);
        dest.writeInt(RABKNZBR2);
        dest.writeInt(RABKNZ9);
        dest.writeInt(RABFIXBR1);
        dest.writeInt(RABFIXMR);
        dest.writeInt(RABFIXWR);
        dest.writeInt(RABFIXBR2);
        dest.writeInt(RABFIXFR);
        dest.writeInt(RABFIXFZ);
        dest.writeInt(RABAR);
        dest.writeInt(RABSUM);
        dest.writeInt(ZPROZ);
        dest.writeInt(MWSTKNZ);
        dest.writeInt(MWSTPROZ);
        dest.writeInt(PROVKNZ1);
        dest.writeInt(PROVKNZ2);
        dest.writeInt(PROVBAS1);
        dest.writeInt(PROVBAS2);
        dest.writeInt(PROVPROZ1);
        dest.writeInt(PROVPROZ2);
        dest.writeInt(PROZNP);
        dest.writeInt(VALUTATAGE);
        dest.writeInt(SUMMETZINLAND);
        dest.writeInt(URSPAUSLAND);
        dest.writeInt(TCALLUP);
        dest.writeString(ADDRPERSACC);
        dest.writeInt(DISTACTIVE);
        dest.writeInt(USVERSKNZ);
        dest.writeInt(RESTWERT);
        dest.writeInt(ISTWERT);
        dest.writeInt(ABRUFSUMRNR);
        dest.writeInt(LFDNR);
        dest.writeDouble(FPREISBASIS);
        dest.writeInt(SPLITTLIEFRNR);
        dest.writeInt(ENTNAHMEMENGE);
        dest.writeInt(RECHNUNGSMENGE);
        dest.writeInt(SPLITTRECHRNR);
        dest.writeInt(UPBEZUGRNR);
        dest.writeInt(LIEFERZEIT);
        dest.writeInt(ULIEFMENGE);
        dest.writeString(USEINTREFFTERMIN);
        dest.writeString(USEINTREFFTBEST);
        dest.writeInt(FUELLMENGE);
        dest.writeInt(RECHUENR);
        dest.writeInt(OFFENLIEF);
        dest.writeInt(OFFENENTN);
        dest.writeInt(OFFENRECH);
        dest.writeInt(WARENWERT);
        dest.writeInt(SETBEZUGRNR);
        dest.writeInt(USEKPREIS);
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

    public int getIcon() {
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
    public int getCID() {
        return CID;
    }

    /**
     *
     * @param CID
     * The CID
     */
    public void setCID(int CID) {
        this.CID = CID;
    }



    /**
     *
     * @return
     * The RNR
     */
    public int getRNR() {
        return RNR;
    }

    /**
     *
     * @param RNR
     * The RNR
     */
    public void setRNR(int RNR) {
        this.RNR = RNR;
    }



    /**
     *
     * @return
     * The SAINT
     */
    public int getSAINT() {
        return SAINT;
    }

    /**
     *
     * @param SAINT
     * The SAINT
     */
    public void setSAINT(int SAINT) {
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
    public int getUTNR() {
        return UTNR;
    }

    /**
     *
     * @param UTNR
     * The UTNR
     */
    public void setUTNR(int UTNR) {
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
    public int getIPOS() {
        return IPOS;
    }

    /**
     *
     * @param IPOS
     * The IPOS
     */
    public void setIPOS(int IPOS) {
        this.IPOS = IPOS;
    }



    /**
     *
     * @return
     * The ZUST
     */
    public int getZUST() {
        return ZUST;
    }

    /**
     *
     * @param ZUST
     * The ZUST
     */
    public void setZUST(int ZUST) {
        this.ZUST = ZUST;
    }



    /**
     *
     * @return
     * The WS
     */
    public int getWS() {
        return WS;
    }

    /**
     *
     * @param WS
     * The WS
     */
    public void setWS(int WS) {
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
    public int getBEWPREIS() {
        return BEWPREIS;
    }

    /**
     *
     * @param BEWPREIS
     * The BEWPREIS
     */
    public void setBEWPREIS(int BEWPREIS) {
        this.BEWPREIS = BEWPREIS;
    }



    /**
     *
     * @return
     * The BEWPREISBASIS
     */
    public int getBEWPREISBASIS() {
        return BEWPREISBASIS;
    }

    /**
     *
     * @param BEWPREISBASIS
     * The BEWPREISBASIS
     */
    public void setBEWPREISBASIS(int BEWPREISBASIS) {
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
    public void setBEWPREISME(int BEWPREISME) {
        this.BEWPREISME = BEWPREISME;
    }


    /**
     *
     * @return
     * The GEWICHT
     */
    public double getGEWICHT() {
        return GEWICHT;
    }

    /**
     *
     * @param GEWICHT
     * The GEWICHT
     */
    public void setGEWICHT(double GEWICHT) {
        this.GEWICHT = GEWICHT;
    }


    /**
     *
     * @return
     * The DLZFIXKNZ
     */
    public int getDLZFIXKNZ() {
        return DLZFIXKNZ;
    }

    /**
     *
     * @param DLZFIXKNZ
     * The DLZFIXKNZ
     */
    public void setDLZFIXKNZ(int DLZFIXKNZ) {
        this.DLZFIXKNZ = DLZFIXKNZ;
    }



    /**
     *
     * @return
     * The LVANZ
     */
    public int getLVANZ() {
        return LVANZ;
    }

    /**
     *
     * @param LVANZ
     * The LVANZ
     */
    public void setLVANZ(int LVANZ) {
        this.LVANZ = LVANZ;
    }



    /**
     *
     * @return
     * The LVLAENGE
     */
    public int getLVLAENGE() {
        return LVLAENGE;
    }

    /**
     *
     * @param LVLAENGE
     * The LVLAENGE
     */
    public void setLVLAENGE(int LVLAENGE) {
        this.LVLAENGE = LVLAENGE;
    }



    /**
     *
     * @return
     * The LVBREITE
     */
    public int getLVBREITE() {
        return LVBREITE;
    }

    /**
     *
     * @param LVBREITE
     * The LVBREITE
     */
    public void setLVBREITE(int LVBREITE) {
        this.LVBREITE = LVBREITE;
    }



    /**
     *
     * @return
     * The LVHOEHE
     */
    public int getLVHOEHE() {
        return LVHOEHE;
    }

    /**
     *
     * @param LVHOEHE
     * The LVHOEHE
     */
    public void setLVHOEHE(int LVHOEHE) {
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
    public int getANZAGG() {
        return ANZAGG;
    }

    /**
     *
     * @param ANZAGG
     * The ANZAGG
     */
    public void setANZAGG(int ANZAGG) {
        this.ANZAGG = ANZAGG;
    }



    /**
     *
     * @return
     * The PLANART
     */
    public int getPLANART() {
        return PLANART;
    }

    /**
     *
     * @param PLANART
     * The PLANART
     */
    public void setPLANART(int PLANART) {
        this.PLANART = PLANART;
    }



    /**
     *
     * @return
     * The EXTRNR
     */
    public int getEXTRNR() {
        return EXTRNR;
    }

    /**
     *
     * @param EXTRNR
     * The EXTRNR
     */
    public void setEXTRNR(int EXTRNR) {
        this.EXTRNR = EXTRNR;
    }



    /**
     *
     * @return
     * The LAGERTYP
     */
    public int getLAGERTYP() {
        return LAGERTYP;
    }

    /**
     *
     * @param LAGERTYP
     * The LAGERTYP
     */
    public void setLAGERTYP(int LAGERTYP) {
        this.LAGERTYP = LAGERTYP;
    }



    /**
     *
     * @return
     * The ZDESC
     */
    public String getZDESC() {
        return ZDESC;
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
    public int getVPS() {
        return VPS;
    }

    /**
     *
     * @param VPS
     * The VPS
     */
    public void setVPS(int VPS) {
        this.VPS = VPS;
    }



    /**
     *
     * @return
     * The VGRUPPE
     */
    public int getVGRUPPE() {
        return VGRUPPE;
    }

    /**
     *
     * @param VGRUPPE
     * The VGRUPPE
     */
    public void setVGRUPPE(int VGRUPPE) {
        this.VGRUPPE = VGRUPPE;
    }



    /**
     *
     * @return
     * The MAXPAKANZ
     */
    public int getMAXPAKANZ() {
        return MAXPAKANZ;
    }

    /**
     *
     * @param MAXPAKANZ
     * The MAXPAKANZ
     */
    public void setMAXPAKANZ(int MAXPAKANZ) {
        this.MAXPAKANZ = MAXPAKANZ;
    }



    /**
     *
     * @return
     * The MAXSTUECK
     */
    public int getMAXSTUECK() {
        return MAXSTUECK;
    }

    /**
     *
     * @param MAXSTUECK
     * The MAXSTUECK
     */
    public void setMAXSTUECK(int MAXSTUECK) {
        this.MAXSTUECK = MAXSTUECK;
    }



    /**
     *
     * @return
     * The MAXGEWICHT
     */
    public int getMAXGEWICHT() {
        return MAXGEWICHT;
    }

    /**
     *
     * @param MAXGEWICHT
     * The MAXGEWICHT
     */
    public void setMAXGEWICHT(int MAXGEWICHT) {
        this.MAXGEWICHT = MAXGEWICHT;
    }



    /**
     *
     * @return
     * The MAXLAGEN
     */
    public int getMAXLAGEN() {
        return MAXLAGEN;
    }

    /**
     *
     * @param MAXLAGEN
     * The MAXLAGEN
     */
    public void setMAXLAGEN(int MAXLAGEN) {
        this.MAXLAGEN = MAXLAGEN;
    }



    /**
     *
     * @return
     * The PAKETNUMMER
     */
    public int getPAKETNUMMER() {
        return PAKETNUMMER;
    }

    /**
     *
     * @param PAKETNUMMER
     * The PAKETNUMMER
     */
    public void setPAKETNUMMER(int PAKETNUMMER) {
        this.PAKETNUMMER = PAKETNUMMER;
    }



    /**
     *
     * @return
     * The PAKBEZUGRNR
     */
    public int getPAKBEZUGRNR() {
        return PAKBEZUGRNR;
    }

    /**
     *
     * @param PAKBEZUGRNR
     * The PAKBEZUGRNR
     */
    public void setPAKBEZUGRNR(int PAKBEZUGRNR) {
        this.PAKBEZUGRNR = PAKBEZUGRNR;
    }



    /**
     *
     * @return
     * The INTCODE
     */
    public Object getINTCODE() {
        return INTCODE;
    }

    /**
     *
     * @param INTCODE
     * The INTCODE
     */
    public void setINTCODE(Object INTCODE) {
        this.INTCODE = INTCODE;
    }



    /**
     *
     * @return
     * The LOS
     */
    public int getLOS() {
        return LOS;
    }

    /**
     *
     * @param LOS
     * The LOS
     */
    public void setLOS(int LOS) {
        this.LOS = LOS;
    }



    /**
     *
     * @return
     * The RFNR
     */
    public int getRFNR() {
        return RFNR;
    }

    /**
     *
     * @param RFNR
     * The RFNR
     */
    public void setRFNR(int RFNR) {
        this.RFNR = RFNR;
    }



    /**
     *
     * @return
     * The LOSRF
     */
    public int getLOSRF() {
        return LOSRF;
    }

    /**
     *
     * @param LOSRF
     * The LOSRF
     */
    public void setLOSRF(int LOSRF) {
        this.LOSRF = LOSRF;
    }



    /**
     *
     * @return
     * The ALRKOPPKNZ
     */
    public int getALRKOPPKNZ() {
        return ALRKOPPKNZ;
    }

    /**
     *
     * @param ALRKOPPKNZ
     * The ALRKOPPKNZ
     */
    public void setALRKOPPKNZ(int ALRKOPPKNZ) {
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
        return SEGM1TERM;
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
    public int getSEGM2ZART() {
        return SEGM2ZART;
    }

    /**
     *
     * @param SEGM2ZART
     * The SEGM2_ZART
     */
    public void setSEGM2ZART(int SEGM2ZART) {
        this.SEGM2ZART = SEGM2ZART;
    }



    /**
     *
     * @return
     * The SEGM2MENG
     */
    public int getSEGM2MENG() {
        return SEGM2MENG;
    }

    /**
     *
     * @param SEGM2MENG
     * The SEGM2_MENG
     */
    public void setSEGM2MENG(int SEGM2MENG) {
        this.SEGM2MENG = SEGM2MENG;
    }



    /**
     *
     * @return
     * The SEGM2TERM
     */
    public String getSEGM2TERM() {
        return SEGM2TERM;
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
    public int getSEGM3MENG() {
        return SEGM3MENG;
    }

    /**
     *
     * @param SEGM3MENG
     * The SEGM3_MENG
     */
    public void setSEGM3MENG(int SEGM3MENG) {
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
    public int getSEGM4ZART() {
        return SEGM4ZART;
    }

    /**
     *
     * @param SEGM4ZART
     * The SEGM4_ZART
     */
    public void setSEGM4ZART(int SEGM4ZART) {
        this.SEGM4ZART = SEGM4ZART;
    }



    /**
     *
     * @return
     * The SEGM4MENG
     */
    public int getSEGM4MENG() {
        return SEGM4MENG;
    }

    /**
     *
     * @param SEGM4MENG
     * The SEGM4_MENG
     */
    public void setSEGM4MENG(int SEGM4MENG) {
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
    public int getSEGM5ZART() {
        return SEGM5ZART;
    }

    /**
     *
     * @param SEGM5ZART
     * The SEGM5_ZART
     */
    public void setSEGM5ZART(int SEGM5ZART) {
        this.SEGM5ZART = SEGM5ZART;
    }



    /**
     *
     * @return
     * The SEGM5MENG
     */
    public int getSEGM5MENG() {
        return SEGM5MENG;
    }

    /**
     *
     * @param SEGM5MENG
     * The SEGM5_MENG
     */
    public void setSEGM5MENG(int SEGM5MENG) {
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
    public int getSEGM6ZART() {
        return SEGM6ZART;
    }

    /**
     *
     * @param SEGM6ZART
     * The SEGM6_ZART
     */
    public void setSEGM6ZART(int SEGM6ZART) {
        this.SEGM6ZART = SEGM6ZART;
    }



    /**
     *
     * @return
     * The SEGM6MENG
     */
    public int getSEGM6MENG() {
        return SEGM6MENG;
    }

    /**
     *
     * @param SEGM6MENG
     * The SEGM6_MENG
     */
    public void setSEGM6MENG(int SEGM6MENG) {
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
    public int getVERTRGRP1() {
        return VERTRGRP1;
    }

    /**
     *
     * @param VERTRGRP1
     * The VERTRGRP1
     */
    public void setVERTRGRP1(int VERTRGRP1) {
        this.VERTRGRP1 = VERTRGRP1;
    }



    /**
     *
     * @return
     * The VERTRGRP2
     */
    public int getVERTRGRP2() {
        return VERTRGRP2;
    }

    /**
     *
     * @param VERTRGRP2
     * The VERTRGRP2
     */
    public void setVERTRGRP2(int VERTRGRP2) {
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
    public int getKW() {
        return KW;
    }

    /**
     *
     * @param KW
     * The KW
     */
    public void setKW(int KW) {
        this.KW = KW;
    }



    /**
     *
     * @return
     * The KJ
     */
    public int getKJ() {
        return KJ;
    }

    /**
     *
     * @param KJ
     * The KJ
     */
    public void setKJ(int KJ) {
        this.KJ = KJ;
    }



    /**
     *
     * @return
     * The SOKNZ1
     */
    public int getSOKNZ1() {
        return SOKNZ1;
    }

    /**
     *
     * @param SOKNZ1
     * The SOKNZ1
     */
    public void setSOKNZ1(int SOKNZ1) {
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
    public int getZBED() {
        return ZBED;
    }

    /**
     *
     * @param ZBED
     * The ZBED
     */
    public void setZBED(int ZBED) {
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
    public int getPREISKNZ() {
        return PREISKNZ;
    }

    /**
     *
     * @param PREISKNZ
     * The PREISKNZ
     */
    public void setPREISKNZ(int PREISKNZ) {
        this.PREISKNZ = PREISKNZ;
    }



    /**
     *
     * @return
     * The ACPPARTPREIS
     */
    public int getACPPARTPREIS() {
        return ACPPARTPREIS;
    }

    /**
     *
     * @param ACPPARTPREIS
     * The ACPPART_PREIS
     */
    public void setACPPARTPREIS(int ACPPARTPREIS) {
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
    public int getRABKNZBR1() {
        return RABKNZBR1;
    }

    /**
     *
     * @param RABKNZBR1
     * The RABKNZBR1
     */
    public void setRABKNZBR1(int RABKNZBR1) {
        this.RABKNZBR1 = RABKNZBR1;
    }



    /**
     *
     * @return
     * The RABKNZMR
     */
    public int getRABKNZMR() {
        return RABKNZMR;
    }

    /**
     *
     * @param RABKNZMR
     * The RABKNZMR
     */
    public void setRABKNZMR(int RABKNZMR) {
        this.RABKNZMR = RABKNZMR;
    }



    /**
     *
     * @return
     * The RABKNZWR
     */
    public int getRABKNZWR() {
        return RABKNZWR;
    }

    /**
     *
     * @param RABKNZWR
     * The RABKNZWR
     */
    public void setRABKNZWR(int RABKNZWR) {
        this.RABKNZWR = RABKNZWR;
    }



    /**
     *
     * @return
     * The RABKNZBR2
     */
    public int getRABKNZBR2() {
        return RABKNZBR2;
    }

    /**
     *
     * @param RABKNZBR2
     * The RABKNZBR2
     */
    public void setRABKNZBR2(int RABKNZBR2) {
        this.RABKNZBR2 = RABKNZBR2;
    }



    /**
     *
     * @return
     * The RABKNZ9
     */
    public int getRABKNZ9() {
        return RABKNZ9;
    }

    /**
     *
     * @param RABKNZ9
     * The RABKNZ9
     */
    public void setRABKNZ9(int RABKNZ9) {
        this.RABKNZ9 = RABKNZ9;
    }



    /**
     *
     * @return
     * The RABFIXBR1
     */
    public int getRABFIXBR1() {
        return RABFIXBR1;
    }

    /**
     *
     * @param RABFIXBR1
     * The RABFIXBR1
     */
    public void setRABFIXBR1(int RABFIXBR1) {
        this.RABFIXBR1 = RABFIXBR1;
    }



    /**
     *
     * @return
     * The RABFIXMR
     */
    public int getRABFIXMR() {
        return RABFIXMR;
    }

    /**
     *
     * @param RABFIXMR
     * The RABFIXMR
     */
    public void setRABFIXMR(int RABFIXMR) {
        this.RABFIXMR = RABFIXMR;
    }



    /**
     *
     * @return
     * The RABFIXWR
     */
    public int getRABFIXWR() {
        return RABFIXWR;
    }

    /**
     *
     * @param RABFIXWR
     * The RABFIXWR
     */
    public void setRABFIXWR(int RABFIXWR) {
        this.RABFIXWR = RABFIXWR;
    }



    /**
     *
     * @return
     * The RABFIXBR2
     */
    public int getRABFIXBR2() {
        return RABFIXBR2;
    }

    /**
     *
     * @param RABFIXBR2
     * The RABFIXBR2
     */
    public void setRABFIXBR2(int RABFIXBR2) {
        this.RABFIXBR2 = RABFIXBR2;
    }



    /**
     *
     * @return
     * The RABFIXFR
     */
    public int getRABFIXFR() {
        return RABFIXFR;
    }

    /**
     *
     * @param RABFIXFR
     * The RABFIXFR
     */
    public void setRABFIXFR(int RABFIXFR) {
        this.RABFIXFR = RABFIXFR;
    }



    /**
     *
     * @return
     * The RABFIXFZ
     */
    public int getRABFIXFZ() {
        return RABFIXFZ;
    }

    /**
     *
     * @param RABFIXFZ
     * The RABFIXFZ
     */
    public void setRABFIXFZ(int RABFIXFZ) {
        this.RABFIXFZ = RABFIXFZ;
    }



    /**
     *
     * @return
     * The RABAR
     */
    public int getRABAR() {
        return RABAR;
    }

    /**
     *
     * @param RABAR
     * The RABAR
     */
    public void setRABAR(int RABAR) {
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
    public void setRABBASBR1(int RABBASBR1) {
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
    public void setRABBASMR(int RABBASMR) {
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
    public void setRABBASWR(int RABBASWR) {
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
    public void setRABBASBR2(int RABBASBR2) {
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
    public void setRABBASFR(int RABBASFR) {
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
    public void setRABBASFZ(int RABBASFZ) {
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
    public void setRABBASHR1(int RABBASHR1) {
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
    public void setRABBASHR2(int RABBASHR2) {
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
    public void setRABBAS9(int RABBAS9) {
        this.RABBAS9 = RABBAS9;
    }



    /**
     *
     * @return
     * The RABSUM
     */
    public int getRABSUM() {
        return RABSUM;
    }

    /**
     *
     * @param RABSUM
     * The RABSUM
     */
    public void setRABSUM(int RABSUM) {
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
    public int getZPROZ() {
        return ZPROZ;
    }

    /**
     *
     * @param ZPROZ
     * The ZPROZ
     */
    public void setZPROZ(int ZPROZ) {
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
    public int getMWSTKNZ() {
        return MWSTKNZ;
    }

    /**
     *
     * @param MWSTKNZ
     * The MWSTKNZ
     */
    public void setMWSTKNZ(int MWSTKNZ) {
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
    public int getMWSTPROZ() {
        return MWSTPROZ;
    }

    /**
     *
     * @param MWSTPROZ
     * The MWSTPROZ
     */
    public void setMWSTPROZ(int MWSTPROZ) {
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
    public int getPROVKNZ1() {
        return PROVKNZ1;
    }

    /**
     *
     * @param PROVKNZ1
     * The PROVKNZ1
     */
    public void setPROVKNZ1(int PROVKNZ1) {
        this.PROVKNZ1 = PROVKNZ1;
    }



    /**
     *
     * @return
     * The PROVKNZ2
     */
    public int getPROVKNZ2() {
        return PROVKNZ2;
    }

    /**
     *
     * @param PROVKNZ2
     * The PROVKNZ2
     */
    public void setPROVKNZ2(int PROVKNZ2) {
        this.PROVKNZ2 = PROVKNZ2;
    }



    /**
     *
     * @return
     * The PROVBAS1
     */
    public int getPROVBAS1() {
        return PROVBAS1;
    }

    /**
     *
     * @param PROVBAS1
     * The PROVBAS1
     */
    public void setPROVBAS1(int PROVBAS1) {
        this.PROVBAS1 = PROVBAS1;
    }



    /**
     *
     * @return
     * The PROVBAS2
     */
    public int getPROVBAS2() {
        return PROVBAS2;
    }

    /**
     *
     * @param PROVBAS2
     * The PROVBAS2
     */
    public void setPROVBAS2(int PROVBAS2) {
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
    public int getPROVPROZ1() {
        return PROVPROZ1;
    }

    /**
     *
     * @param PROVPROZ1
     * The PROVPROZ1
     */
    public void setPROVPROZ1(int PROVPROZ1) {
        this.PROVPROZ1 = PROVPROZ1;
    }



    /**
     *
     * @return
     * The PROVPROZ2
     */
    public int getPROVPROZ2() {
        return PROVPROZ2;
    }

    /**
     *
     * @param PROVPROZ2
     * The PROVPROZ2
     */
    public void setPROVPROZ2(int PROVPROZ2) {
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
    public int getPROZNP() {
        return PROZNP;
    }

    /**
     *
     * @param PROZNP
     * The PROZNP
     */
    public void setPROZNP(int PROZNP) {
        this.PROZNP = PROZNP;
    }



    /**
     *
     * @return
     * The VALUTATAGE
     */
    public int getVALUTATAGE() {
        return VALUTATAGE;
    }

    /**
     *
     * @param VALUTATAGE
     * The VALUTATAGE
     */
    public void setVALUTATAGE(int VALUTATAGE) {
        this.VALUTATAGE = VALUTATAGE;
    }



    /**
     *
     * @return
     * The SUMMETZINLAND
     */
    public int getSUMMETZINLAND() {
        return SUMMETZINLAND;
    }

    /**
     *
     * @param SUMMETZINLAND
     * The SUMMETZINLAND
     */
    public void setSUMMETZINLAND(int SUMMETZINLAND) {
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
    public int getURSPAUSLAND() {
        return URSPAUSLAND;
    }

    /**
     *
     * @param URSPAUSLAND
     * The URSPAUSLAND
     */
    public void setURSPAUSLAND(int URSPAUSLAND) {
        this.URSPAUSLAND = URSPAUSLAND;
    }



    /**
     *
     * @return
     * The TCALLUP
     */
    public int getTCALLUP() {
        return TCALLUP;
    }

    /**
     *
     * @param TCALLUP
     * The TCALLUP
     */
    public void setTCALLUP(int TCALLUP) {
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
    public int getDISTACTIVE() {
        return DISTACTIVE;
    }

    /**
     *
     * @param DISTACTIVE
     * The DISTACTIVE
     */
    public void setDISTACTIVE(int DISTACTIVE) {
        this.DISTACTIVE = DISTACTIVE;
    }



    /**
     *
     * @return
     * The USVERSKNZ
     */
    public int getUSVERSKNZ() {
        return USVERSKNZ;
    }

    /**
     *
     * @param USVERSKNZ
     * The USVERSKNZ
     */
    public void setUSVERSKNZ(int USVERSKNZ) {
        this.USVERSKNZ = USVERSKNZ;
    }



    /**
     *
     * @return
     * The RESTWERT
     */
    public int getRESTWERT() {
        return RESTWERT;
    }

    /**
     *
     * @param RESTWERT
     * The RESTWERT
     */
    public void setRESTWERT(int RESTWERT) {
        this.RESTWERT = RESTWERT;
    }



    /**
     *
     * @return
     * The ISTWERT
     */
    public int getISTWERT() {
        return ISTWERT;
    }

    /**
     *
     * @param ISTWERT
     * The ISTWERT
     */
    public void setISTWERT(int ISTWERT) {
        this.ISTWERT = ISTWERT;
    }



    /**
     *
     * @return
     * The ABRUFSUMRNR
     */
    public int getABRUFSUMRNR() {
        return ABRUFSUMRNR;
    }

    /**
     *
     * @param ABRUFSUMRNR
     * The ABRUFSUMRNR
     */
    public void setABRUFSUMRNR(int ABRUFSUMRNR) {
        this.ABRUFSUMRNR = ABRUFSUMRNR;
    }



    /**
     *
     * @return
     * The LFDNR
     */
    public int getLFDNR() {
        return LFDNR;
    }

    /**
     *
     * @param LFDNR
     * The LFDNR
     */
    public void setLFDNR(int LFDNR) {
        this.LFDNR = LFDNR;
    }



    /**
     *
     * @return
     * The FPREISBASIS
     */
    public double getFPREISBASIS() {
        return FPREISBASIS;
    }

    /**
     *
     * @param FPREISBASIS
     * The F_PREISBASIS
     */
    public void setFPREISBASIS(int FPREISBASIS) {
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
    public int getSPLITTLIEFRNR() {
        return SPLITTLIEFRNR;
    }

    /**
     *
     * @param SPLITTLIEFRNR
     * The SPLITTLIEFRNR
     */
    public void setSPLITTLIEFRNR(int SPLITTLIEFRNR) {
        this.SPLITTLIEFRNR = SPLITTLIEFRNR;
    }



    /**
     *
     * @return
     * The ENTNAHMEMENGE
     */
    public int getENTNAHMEMENGE() {
        return ENTNAHMEMENGE;
    }

    /**
     *
     * @param ENTNAHMEMENGE
     * The ENTNAHMEMENGE
     */
    public void setENTNAHMEMENGE(int ENTNAHMEMENGE) {
        this.ENTNAHMEMENGE = ENTNAHMEMENGE;
    }



    /**
     *
     * @return
     * The RECHNUNGSMENGE
     */
    public int getRECHNUNGSMENGE() {
        return RECHNUNGSMENGE;
    }

    /**
     *
     * @param RECHNUNGSMENGE
     * The RECHNUNGSMENGE
     */
    public void setRECHNUNGSMENGE(int RECHNUNGSMENGE) {
        this.RECHNUNGSMENGE = RECHNUNGSMENGE;
    }



    /**
     *
     * @return
     * The SPLITTRECHRNR
     */
    public int getSPLITTRECHRNR() {
        return SPLITTRECHRNR;
    }

    /**
     *
     * @param SPLITTRECHRNR
     * The SPLITTRECHRNR
     */
    public void setSPLITTRECHRNR(int SPLITTRECHRNR) {
        this.SPLITTRECHRNR = SPLITTRECHRNR;
    }



    /**
     *
     * @return
     * The UPBEZUGRNR
     */
    public int getUPBEZUGRNR() {
        return UPBEZUGRNR;
    }

    /**
     *
     * @param UPBEZUGRNR
     * The UPBEZUGRNR
     */
    public void setUPBEZUGRNR(int UPBEZUGRNR) {
        this.UPBEZUGRNR = UPBEZUGRNR;
    }



    /**
     *
     * @return
     * The LIEFERZEIT
     */
    public int getLIEFERZEIT() {
        return LIEFERZEIT;
    }

    /**
     *
     * @param LIEFERZEIT
     * The LIEFERZEIT
     */
    public void setLIEFERZEIT(int LIEFERZEIT) {
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
    public int getULIEFMENGE() {
        return ULIEFMENGE;
    }

    /**
     *
     * @param ULIEFMENGE
     * The ULIEFMENGE
     */
    public void setULIEFMENGE(int ULIEFMENGE) {
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
        return USEINTREFFTBEST;
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
        return USEINTREFFTERMIN;
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
    public int getFUELLMENGE() {
        return FUELLMENGE;
    }

    /**
     *
     * @param FUELLMENGE
     * The FUELLMENGE
     */
    public void setFUELLMENGE(int FUELLMENGE) {
        this.FUELLMENGE = FUELLMENGE;
    }



    /**
     *
     * @return
     * The RECHUENR
     */
    public int getRECHUENR() {
        return RECHUENR;
    }

    /**
     *
     * @param RECHUENR
     * The RECHUENR
     */
    public void setRECHUENR(int RECHUENR) {
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
    public int getOFFENLIEF() {
        return OFFENLIEF;
    }

    /**
     *
     * @param OFFENLIEF
     * The OFFENLIEF
     */
    public void setOFFENLIEF(int OFFENLIEF) {
        this.OFFENLIEF = OFFENLIEF;
    }



    /**
     *
     * @return
     * The OFFENENTN
     */
    public int getOFFENENTN() {
        return OFFENENTN;
    }

    /**
     *
     * @param OFFENENTN
     * The OFFENENTN
     */
    public void setOFFENENTN(int OFFENENTN) {
        this.OFFENENTN = OFFENENTN;
    }



    /**
     *
     * @return
     * The OFFENRECH
     */
    public int getOFFENRECH() {
        return OFFENRECH;
    }

    /**
     *
     * @param OFFENRECH
     * The OFFENRECH
     */
    public void setOFFENRECH(int OFFENRECH) {
        this.OFFENRECH = OFFENRECH;
    }



    /**
     *
     * @return
     * The WARENWERT
     */
    public int getWARENWERT() {
        return WARENWERT;
    }

    /**
     *
     * @param WARENWERT
     * The WARENWERT
     */
    public void setWARENWERT(int WARENWERT) {
        this.WARENWERT = WARENWERT;
    }



    /**
     *
     * @return
     * The SETBEZUGRNR
     */
    public int getSETBEZUGRNR() {
        return SETBEZUGRNR;
    }

    /**
     *
     * @param SETBEZUGRNR
     * The SETBEZUGRNR
     */
    public void setSETBEZUGRNR(int SETBEZUGRNR) {
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
    public int getUSEKPREIS() {
        return USEKPREIS;
    }

    /**
     *
     * @param USEKPREIS
     * The USEKPREIS
     */
    public void setUSEKPREIS(int USEKPREIS) {
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