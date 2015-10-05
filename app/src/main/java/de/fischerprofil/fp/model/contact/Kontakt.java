package de.fischerprofil.fp.model.contact;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;
import de.fischerprofil.fp.R;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Kontakt  implements Parcelable {

    private int mIcon;      // Icon des Auftrags

        @SerializedName("IK")
        private String IK;
        @SerializedName("SYSF")
        private String SYSF;
        @SerializedName("CREATEDATE")
        private String CREATEDATE;
        @SerializedName("MODIFYDATE")
        private String MODIFYDATE;
        @SerializedName("CREATEUSER")
        private String CREATEUSER;
        @SerializedName("MODIFYUSER")
        private String MODIFYUSER;
        @SerializedName("CID")
        private String CID;
        @SerializedName("ADRESSENR")
        private String ADRESSENR;
        @SerializedName("PERSONNR")
        private String PERSONNR;
        @SerializedName("FIRMANR")
        private String FIRMANR;
        @SerializedName("ANSCHRIFTNR")
        private String ANSCHRIFTNR;
        @SerializedName("BEMERKUNG")
        private Object BEMERKUNG;
        @SerializedName("LASTEINM")
        private String LASTEINM;
        @SerializedName("BEMERKUNG_")
        private Object BEMERKUNG_;
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
        @SerializedName("NAME")
        private String NAME;
        @SerializedName("VORNAME")
        private String VORNAME;
        @SerializedName("GEBTAG")
        private Object GEBTAG;
        @SerializedName("ANREDE")
        private String ANREDE;
        @SerializedName("BRIEFANREDE")
        private Object BRIEFANREDE;
        @SerializedName("TITEL")
        private String TITEL;
        @SerializedName("SPRACHKNZ")
        private String SPRACHKNZ;
        @SerializedName("ABTEILUNG")
        private Object ABTEILUNG;
        @SerializedName("VERTRGRP")
        private String VERTRGRP;
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
        @SerializedName("KURZNAME")
        private Object KURZNAME;
        @SerializedName("CRMPERSONID")
        private String CRMPERSONID;
        @SerializedName("MAILINGLOCKFLAG")
        private String MAILINGLOCKFLAG;
        @SerializedName("INTERNALDISPATCHERSIGN")
        private Object INTERNALDISPATCHERSIGN;
        @SerializedName("SEX")
        private String SEX;
        @SerializedName("USGESPERRT")
        private String USGESPERRT;
        @SerializedName("USSPERRGRUND")
        private String USSPERRGRUND;
        @SerializedName("SACHBEARBEITER_")
        private Object SACHBEARBEITER_;
        @SerializedName("NAME_")
        private String NAME_;
        @SerializedName("VORNAME_")
        private String VORNAME_;
        @SerializedName("ANREDE_")
        private String ANREDE_;
        @SerializedName("BRIEFANREDE_")
        private Object BRIEFANREDE_;
        @SerializedName("TITEL_")
        private String TITEL_;
        @SerializedName("ABTEILUNG_")
        private Object ABTEILUNG_;
        @SerializedName("KURZNAME_")
        private Object KURZNAME_;
        @SerializedName("RELFIRMA_NAME")
        private String RELFIRMA_NAME;
        @SerializedName("RELFIRMA_KTXT")
        private String RELFIRMA_KTXT;

    protected Kontakt(Parcel in) {
        mIcon = in.readInt();
        IK = in.readString();
        SYSF = in.readString();
        CREATEDATE = in.readString();
        MODIFYDATE = in.readString();
        CREATEUSER = in.readString();
        MODIFYUSER = in.readString();
        CID = in.readString();
        ADRESSENR = in.readString();
        PERSONNR = in.readString();
        FIRMANR = in.readString();
        ANSCHRIFTNR = in.readString();
        LASTEINM = in.readString();
        STATUS1 = in.readString();
        STATUS2 = in.readString();
        STATUS3 = in.readString();
        STATUS4 = in.readString();
        STATUS5 = in.readString();
        STATUS6 = in.readString();
        NAME = in.readString();
        VORNAME = in.readString();
        ANREDE = in.readString();
        TITEL = in.readString();
        SPRACHKNZ = in.readString();
        VERTRGRP = in.readString();
        VERWENDUNG1 = in.readString();
        VERWENDUNG2 = in.readString();
        VERWENDUNG3 = in.readString();
        VERWENDUNG4 = in.readString();
        VERWENDUNG5 = in.readString();
        CRMPERSONID = in.readString();
        MAILINGLOCKFLAG = in.readString();
        SEX = in.readString();
        USGESPERRT = in.readString();
        USSPERRGRUND = in.readString();
        NAME_ = in.readString();
        VORNAME_ = in.readString();
        ANREDE_ = in.readString();
        TITEL_ = in.readString();
        RELFIRMA_NAME = in.readString();
        RELFIRMA_KTXT = in.readString();
    }

    public static final Creator<Kontakt> CREATOR = new Creator<Kontakt>() {
        @Override
        public Kontakt createFromParcel(Parcel in) {
            return new Kontakt(in);
        }

        @Override
        public Kontakt[] newArray(int size) {
            return new Kontakt[size];
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
         * The BEMERKUNG_
         */
        public Object getBEMERKUNG_() {
            return BEMERKUNG_;
        }

        /**
         *
         * @param BEMERKUNG_
         * The BEMERKUNG_
         */
        public void setBEMERKUNG_(Object BEMERKUNG_) {
            this.BEMERKUNG_ = BEMERKUNG_;
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
         * The NAME
         */
        public String getNAME() {
            if (TextUtils.isEmpty(NAME)) return "";
            if (NAME.equals("null")) return "";
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
            if (TextUtils.isEmpty(VORNAME)) return "";
            if (VORNAME.equals("null")) return VORNAME;
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
         * The GEBTAG
         */
        public Object getGEBTAG() {
            return GEBTAG;
        }

        /**
         *
         * @param GEBTAG
         * The GEBTAG
         */
        public void setGEBTAG(Object GEBTAG) {
            this.GEBTAG = GEBTAG;
        }

        /**
         *
         * @return
         * The ANREDE
         */
        public String getANREDE() {
            return ANREDE;
        }

        /**
         *
         * @param ANREDE
         * The ANREDE
         */
        public void setANREDE(String ANREDE) {
            this.ANREDE = ANREDE;
        }

        /**
         *
         * @return
         * The BRIEFANREDE
         */
        public Object getBRIEFANREDE() {
            return BRIEFANREDE;
        }

        /**
         *
         * @param BRIEFANREDE
         * The BRIEFANREDE
         */
        public void setBRIEFANREDE(Object BRIEFANREDE) {
            this.BRIEFANREDE = BRIEFANREDE;
        }

        /**
         *
         * @return
         * The TITEL
         */
        public String getTITEL() {
            return TITEL;
        }

        /**
         *
         * @param TITEL
         * The TITEL
         */
        public void setTITEL(String TITEL) {
            this.TITEL = TITEL;
        }

        /**
         *
         * @return
         * The SPRACHKNZ
         */
        public String getSPRACHKNZ() {
            return SPRACHKNZ;
        }

        /**
         *
         * @param SPRACHKNZ
         * The SPRACHKNZ
         */
        public void setSPRACHKNZ(String SPRACHKNZ) {
            this.SPRACHKNZ = SPRACHKNZ;
        }

        /**
         *
         * @return
         * The ABTEILUNG
         */
        public Object getABTEILUNG() {
            return ABTEILUNG;
        }

        /**
         *
         * @param ABTEILUNG
         * The ABTEILUNG
         */
        public void setABTEILUNG(Object ABTEILUNG) {
            this.ABTEILUNG = ABTEILUNG;
        }

        /**
         *
         * @return
         * The VERTRGRP
         */
        public String getVERTRGRP() {
            return VERTRGRP;
        }

        /**
         *
         * @param VERTRGRP
         * The VERTRGRP
         */
        public void setVERTRGRP(String VERTRGRP) {
            this.VERTRGRP = VERTRGRP;
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
         * The KURZNAME
         */
        public Object getKURZNAME() {
            return KURZNAME;
        }

        /**
         *
         * @param KURZNAME
         * The KURZNAME
         */
        public void setKURZNAME(Object KURZNAME) {
            this.KURZNAME = KURZNAME;
        }

        /**
         *
         * @return
         * The CRMPERSONID
         */
        public String getCRMPERSONID() {
            return CRMPERSONID;
        }

        /**
         *
         * @param CRMPERSONID
         * The CRMPERSONID
         */
        public void setCRMPERSONID(String CRMPERSONID) {
            this.CRMPERSONID = CRMPERSONID;
        }

        /**
         *
         * @return
         * The MAILINGLOCKFLAG
         */
        public String getMAILINGLOCKFLAG() {
            return MAILINGLOCKFLAG;
        }

        /**
         *
         * @param MAILINGLOCKFLAG
         * The MAILINGLOCKFLAG
         */
        public void setMAILINGLOCKFLAG(String MAILINGLOCKFLAG) {
            this.MAILINGLOCKFLAG = MAILINGLOCKFLAG;
        }

        /**
         *
         * @return
         * The INTERNALDISPATCHERSIGN
         */
        public Object getINTERNALDISPATCHERSIGN() {
            return INTERNALDISPATCHERSIGN;
        }

        /**
         *
         * @param INTERNALDISPATCHERSIGN
         * The INTERNALDISPATCHERSIGN
         */
        public void setINTERNALDISPATCHERSIGN(Object INTERNALDISPATCHERSIGN) {
            this.INTERNALDISPATCHERSIGN = INTERNALDISPATCHERSIGN;
        }

        /**
         *
         * @return
         * The SEX
         */
        public String getSEX() {
            return SEX;
        }

        /**
         *
         * @param SEX
         * The SEX
         */
        public void setSEX(String SEX) {
            this.SEX = SEX;
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

        /**
         *
         * @return
         * The SACHBEARBEITER_
         */
        public Object getSACHBEARBEITER_() {
            return SACHBEARBEITER_;
        }

        /**
         *
         * @param SACHBEARBEITER_
         * The SACHBEARBEITER_
         */
        public void setSACHBEARBEITER_(Object SACHBEARBEITER_) {
            this.SACHBEARBEITER_ = SACHBEARBEITER_;
        }

        /**
         *
         * @return
         * The NAME_
         */
        public String getNAME_() {
            return NAME_;
        }

        /**
         *
         * @param NAME_
         * The NAME_
         */
        public void setNAME_(String NAME_) {
            this.NAME_ = NAME_;
        }

        /**
         *
         * @return
         * The VORNAME_
         */
        public String getVORNAME_() {
            return VORNAME_;
        }

        /**
         *
         * @param VORNAME_
         * The VORNAME_
         */
        public void setVORNAME_(String VORNAME_) {
            this.VORNAME_ = VORNAME_;
        }

        /**
         *
         * @return
         * The ANREDE_
         */
        public String getANREDE_() {
            return ANREDE_;
        }

        /**
         *
         * @param ANREDE_
         * The ANREDE_
         */
        public void setANREDE_(String ANREDE_) {
            this.ANREDE_ = ANREDE_;
        }

        /**
         *
         * @return
         * The BRIEFANREDE_
         */
        public Object getBRIEFANREDE_() {
            return BRIEFANREDE_;
        }

        /**
         *
         * @param BRIEFANREDE_
         * The BRIEFANREDE_
         */
        public void setBRIEFANREDE_(Object BRIEFANREDE_) {
            this.BRIEFANREDE_ = BRIEFANREDE_;
        }

        /**
         *
         * @return
         * The TITEL_
         */
        public String getTITEL_() {
            return TITEL_;
        }

        /**
         *
         * @param TITEL_
         * The TITEL_
         */
        public void setTITEL_(String TITEL_) {
            this.TITEL_ = TITEL_;
        }

        /**
         *
         * @return
         * The ABTEILUNG_
         */
        public Object getABTEILUNG_() {
            return ABTEILUNG_;
        }

        /**
         *
         * @param ABTEILUNG_
         * The ABTEILUNG_
         */
        public void setABTEILUNG_(Object ABTEILUNG_) {
            this.ABTEILUNG_ = ABTEILUNG_;
        }

        /**
         *
         * @return
         * The KURZNAME_
         */
        public Object getKURZNAME_() {
            return KURZNAME_;
        }

        /**
         *
         * @param KURZNAME_
         * The KURZNAME_
         */
        public void setKURZNAME_(Object KURZNAME_) {
            this.KURZNAME_ = KURZNAME_;
        }

        /**
         *
         * @return
         * The RELFIRMA_NAME
         */
        public String getRELFIRMA_NAME() {
            return RELFIRMA_NAME;
        }

        /**
         *
         * @param RELFIRMA_NAME
         * The RELFIRMA_NAME
         */
        public void setRELFIRMA_NAME(String RELFIRMA_NAME) {
            this.RELFIRMA_NAME = RELFIRMA_NAME;
        }

        /**
         *
         * @return
         * The RELFIRMA_KTXT
         */
        public String getRELFIRMA_KTXT() {
            return RELFIRMA_KTXT;
        }

        /**
         *
         * @param RELFIRMA_KTXT
         * The RELFIRMA_KTXT
         */
        public void setRELFIRMA_KTXT(String RELFIRMA_KTXT) {
            this.RELFIRMA_KTXT = RELFIRMA_KTXT;
        }

        public String getObjectToString() {
            return ToStringBuilder.reflectionToString(this);
        }

    /**
     * No args constructor for use in serialization
     *
     */
    public Kontakt() {
        super();
        this.mIcon = R.drawable.ic_contact;
    }

    /**
     *
     * @param a
     * The PERSONNR
     */
    public Kontakt(String a) {
        super();
        this.PERSONNR = a;
    }

    /**
     *
     * @return
     * The mIcon
     */
    public int getIcon() {
        return mIcon;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mIcon);
        dest.writeString(IK);
        dest.writeString(SYSF);
        dest.writeString(CREATEDATE);
        dest.writeString(MODIFYDATE);
        dest.writeString(CREATEUSER);
        dest.writeString(MODIFYUSER);
        dest.writeString(CID);
        dest.writeString(ADRESSENR);
        dest.writeString(PERSONNR);
        dest.writeString(FIRMANR);
        dest.writeString(ANSCHRIFTNR);
        dest.writeString(LASTEINM);
        dest.writeString(STATUS1);
        dest.writeString(STATUS2);
        dest.writeString(STATUS3);
        dest.writeString(STATUS4);
        dest.writeString(STATUS5);
        dest.writeString(STATUS6);
        dest.writeString(NAME);
        dest.writeString(VORNAME);
        dest.writeString(ANREDE);
        dest.writeString(TITEL);
        dest.writeString(SPRACHKNZ);
        dest.writeString(VERTRGRP);
        dest.writeString(VERWENDUNG1);
        dest.writeString(VERWENDUNG2);
        dest.writeString(VERWENDUNG3);
        dest.writeString(VERWENDUNG4);
        dest.writeString(VERWENDUNG5);
        dest.writeString(CRMPERSONID);
        dest.writeString(MAILINGLOCKFLAG);
        dest.writeString(SEX);
        dest.writeString(USGESPERRT);
        dest.writeString(USSPERRGRUND);
        dest.writeString(NAME_);
        dest.writeString(VORNAME_);
        dest.writeString(ANREDE_);
        dest.writeString(TITEL_);
        dest.writeString(RELFIRMA_NAME);
        dest.writeString(RELFIRMA_KTXT);
    }
}