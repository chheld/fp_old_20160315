package de.fischerprofil.fp.model.company;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Firma implements Parcelable {

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
        @SerializedName("FIRMANR")
        private String FIRMANR;
        @SerializedName("SUCHBEGRIFF")
        private String SUCHBEGRIFF;
        @SerializedName("NAME")
        private String NAME;
        @SerializedName("GFORM")
        private String GFORM;
        @SerializedName("KTXT")
        private String KTXT;
        @SerializedName("TEXTNR")
        private Object TEXTNR;
        @SerializedName("BANK")
        private Object BANK;
        @SerializedName("BLZ")
        private Object BLZ;
        @SerializedName("BIC")
        private Object BIC;
        @SerializedName("KTO")
        private Object KTO;
        @SerializedName("USTIDNR")
        private Object USTIDNR;
        @SerializedName("MITARBEITER")
        private Object MITARBEITER;
        @SerializedName("BEMERKUNG")
        private Object BEMERKUNG;
        @SerializedName("SPRACHKNZ")
        private String SPRACHKNZ;
        @SerializedName("EAN")
        private Object EAN;
        @SerializedName("ABCKLAS")
        private String ABCKLAS;
        @SerializedName("EPOS")
        private Object EPOS;
        @SerializedName("LIEFERMODELL")
        private String LIEFERMODELL;
        @SerializedName("STANDARDLIEFERZEIT")
        private String STANDARDLIEFERZEIT;
        @SerializedName("FGKNZ_1")
        private String FGKNZ_1;
        @SerializedName("FGKNZ_2")
        private String FGKNZ_2;
        @SerializedName("FGKNZ_3")
        private Object FGKNZ_3;
        @SerializedName("FGKNZ_4")
        private Object FGKNZ_4;
        @SerializedName("FGKNZ_5")
        private String FGKNZ_5;
        @SerializedName("SACHBEREICH")
        private Object SACHBEREICH;
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
        @SerializedName("VERWENDUNG6")
        private String VERWENDUNG6;
        @SerializedName("VERWENDUNG7")
        private String VERWENDUNG7;
        @SerializedName("VERWENDUNG8")
        private String VERWENDUNG8;
        @SerializedName("VERWENDUNG9")
        private String VERWENDUNG9;
        @SerializedName("VERWENDUNG10")
        private String VERWENDUNG10;
        @SerializedName("VERWENDUNG11")
        private String VERWENDUNG11;
        @SerializedName("VERWENDUNG12")
        private String VERWENDUNG12;
        @SerializedName("VERWENDUNG13")
        private String VERWENDUNG13;
        @SerializedName("VERWENDUNG14")
        private String VERWENDUNG14;
        @SerializedName("VERWENDUNG15")
        private String VERWENDUNG15;
        @SerializedName("VERWENDUNG16")
        private String VERWENDUNG16;
        @SerializedName("TEXTNR2")
        private Object TEXTNR2;
        @SerializedName("FREMDNR")
        private Object FREMDNR;
        @SerializedName("UMSZIEL")
        private String UMSZIEL;
        @SerializedName("UMSBONUS")
        private String UMSBONUS;
        @SerializedName("KNGBONUS")
        private String KNGBONUS;
        @SerializedName("REFERENZ")
        private String REFERENZ;
        @SerializedName("PRODUKTE")
        private Object PRODUKTE;
        @SerializedName("EVALUATIONACTIVE")
        private String EVALUATIONACTIVE;
        @SerializedName("CRMCOMPANYID")
        private String CRMCOMPANYID;
        @SerializedName("MAILINGLOCKFLAG")
        private String MAILINGLOCKFLAG;
        @SerializedName("TAXNO")
        private Object TAXNO;
        @SerializedName("SHIPPINGCOST")
        private String SHIPPINGCOST;
        @SerializedName("IBAN")
        private Object IBAN;
        @SerializedName("BANKCOUNTRYCODE")
        private Object BANKCOUNTRYCODE;
        @SerializedName("ROHSUPDATEMODE")
        private String ROHSUPDATEMODE;
        @SerializedName("SUPPLYWEBSUPPLIER")
        private String SUPPLYWEBSUPPLIER;
        @SerializedName("SUPPLIERID")
        private Object SUPPLIERID;
        @SerializedName("PURCHASEORDERACTIVE")
        private String PURCHASEORDERACTIVE;
        @SerializedName("RECEIPTACTIVE")
        private String RECEIPTACTIVE;
        @SerializedName("POCONFIRMATIONACTIVE")
        private String POCONFIRMATIONACTIVE;
        @SerializedName("DELADVISEACTIVE")
        private String DELADVISEACTIVE;
        @SerializedName("CREDITNOTEACTIVE")
        private String CREDITNOTEACTIVE;
        @SerializedName("MASTERDATAACTIVE")
        private String MASTERDATAACTIVE;
        @SerializedName("USTRANSPORTZEIT")
        private String USTRANSPORTZEIT;
        @SerializedName("USGESPERRT")
        private String USGESPERRT;
        @SerializedName("USSPERRGRUND")
        private String USSPERRGRUND;
        @SerializedName("SACHBEARBEITER_")
        private Object SACHBEARBEITER_;
        @SerializedName("SUCHBEGRIFF_")
        private String SUCHBEGRIFF_;
        @SerializedName("NAME_")
        private String NAME_;
        @SerializedName("KTXT_")
        private String KTXT_;
        @SerializedName("TEXTNR_")
        private Object TEXTNR_;
        @SerializedName("BANK_")
        private Object BANK_;
        @SerializedName("MITARBEITER_")
        private Object MITARBEITER_;
        @SerializedName("BEMERKUNG_")
        private Object BEMERKUNG_;
        @SerializedName("EPOS_")
        private Object EPOS_;
        @SerializedName("SACHBEREICH_")
        private Object SACHBEREICH_;
        @SerializedName("TEXTNR2_")
        private Object TEXTNR2_;
        @SerializedName("FREMDNR_")
        private Object FREMDNR_;
        @SerializedName("IBAN_")
        private Object IBAN_;
        @SerializedName("RELZTGK_KTXT")
        private String RELZTGK_KTXT;

        /**
         * No args constructor for use in serialization
         *
         */
        public Firma() {
        }

    protected Firma(Parcel in) {
        mIcon = in.readInt();
        IK = in.readString();
        SYSF = in.readString();
        CREATEDATE = in.readString();
        MODIFYDATE = in.readString();
        CREATEUSER = in.readString();
        MODIFYUSER = in.readString();
        CID = in.readString();
        STATUS1 = in.readString();
        STATUS2 = in.readString();
        STATUS3 = in.readString();
        STATUS4 = in.readString();
        STATUS5 = in.readString();
        STATUS6 = in.readString();
        FIRMANR = in.readString();
        SUCHBEGRIFF = in.readString();
        NAME = in.readString();
        GFORM = in.readString();
        KTXT = in.readString();
        SPRACHKNZ = in.readString();
        ABCKLAS = in.readString();
        LIEFERMODELL = in.readString();
        STANDARDLIEFERZEIT = in.readString();
        FGKNZ_1 = in.readString();
        FGKNZ_2 = in.readString();
        FGKNZ_5 = in.readString();
        VERWENDUNG1 = in.readString();
        VERWENDUNG2 = in.readString();
        VERWENDUNG3 = in.readString();
        VERWENDUNG4 = in.readString();
        VERWENDUNG5 = in.readString();
        VERWENDUNG6 = in.readString();
        VERWENDUNG7 = in.readString();
        VERWENDUNG8 = in.readString();
        VERWENDUNG9 = in.readString();
        VERWENDUNG10 = in.readString();
        VERWENDUNG11 = in.readString();
        VERWENDUNG12 = in.readString();
        VERWENDUNG13 = in.readString();
        VERWENDUNG14 = in.readString();
        VERWENDUNG15 = in.readString();
        VERWENDUNG16 = in.readString();
        UMSZIEL = in.readString();
        UMSBONUS = in.readString();
        KNGBONUS = in.readString();
        REFERENZ = in.readString();
        EVALUATIONACTIVE = in.readString();
        CRMCOMPANYID = in.readString();
        MAILINGLOCKFLAG = in.readString();
        SHIPPINGCOST = in.readString();
        ROHSUPDATEMODE = in.readString();
        SUPPLYWEBSUPPLIER = in.readString();
        PURCHASEORDERACTIVE = in.readString();
        RECEIPTACTIVE = in.readString();
        POCONFIRMATIONACTIVE = in.readString();
        DELADVISEACTIVE = in.readString();
        CREDITNOTEACTIVE = in.readString();
        MASTERDATAACTIVE = in.readString();
        USTRANSPORTZEIT = in.readString();
        USGESPERRT = in.readString();
        USSPERRGRUND = in.readString();
        SUCHBEGRIFF_ = in.readString();
        NAME_ = in.readString();
        KTXT_ = in.readString();
        RELZTGK_KTXT = in.readString();
    }

    public static final Creator<Firma> CREATOR = new Creator<Firma>() {
        @Override
        public Firma createFromParcel(Parcel in) {
            return new Firma(in);
        }

        @Override
        public Firma[] newArray(int size) {
            return new Firma[size];
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
         * The SUCHBEGRIFF
         */
        public String getSUCHBEGRIFF() {
            return SUCHBEGRIFF;
        }

        /**
         *
         * @param SUCHBEGRIFF
         * The SUCHBEGRIFF
         */
        public void setSUCHBEGRIFF(String SUCHBEGRIFF) {
            this.SUCHBEGRIFF = SUCHBEGRIFF;
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
         * The GFORM
         */
        public String getGFORM() {
            return GFORM;
        }

        /**
         *
         * @param GFORM
         * The GFORM
         */
        public void setGFORM(String GFORM) {
            this.GFORM = GFORM;
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
         * The BANK
         */
        public Object getBANK() {
            return BANK;
        }

        /**
         *
         * @param BANK
         * The BANK
         */
        public void setBANK(Object BANK) {
            this.BANK = BANK;
        }

        /**
         *
         * @return
         * The BLZ
         */
        public Object getBLZ() {
            return BLZ;
        }

        /**
         *
         * @param BLZ
         * The BLZ
         */
        public void setBLZ(Object BLZ) {
            this.BLZ = BLZ;
        }

        /**
         *
         * @return
         * The BIC
         */
        public Object getBIC() {
            return BIC;
        }

        /**
         *
         * @param BIC
         * The BIC
         */
        public void setBIC(Object BIC) {
            this.BIC = BIC;
        }

        /**
         *
         * @return
         * The KTO
         */
        public Object getKTO() {
            return KTO;
        }

        /**
         *
         * @param KTO
         * The KTO
         */
        public void setKTO(Object KTO) {
            this.KTO = KTO;
        }

        /**
         *
         * @return
         * The USTIDNR
         */
        public Object getUSTIDNR() {
            return USTIDNR;
        }

        /**
         *
         * @param USTIDNR
         * The USTIDNR
         */
        public void setUSTIDNR(Object USTIDNR) {
            this.USTIDNR = USTIDNR;
        }

        /**
         *
         * @return
         * The MITARBEITER
         */
        public Object getMITARBEITER() {
            return MITARBEITER;
        }

        /**
         *
         * @param MITARBEITER
         * The MITARBEITER
         */
        public void setMITARBEITER(Object MITARBEITER) {
            this.MITARBEITER = MITARBEITER;
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
         * The EAN
         */
        public Object getEAN() {
            return EAN;
        }

        /**
         *
         * @param EAN
         * The EAN
         */
        public void setEAN(Object EAN) {
            this.EAN = EAN;
        }

        /**
         *
         * @return
         * The ABCKLAS
         */
        public String getABCKLAS() {
            return ABCKLAS;
        }

        /**
         *
         * @param ABCKLAS
         * The ABCKLAS
         */
        public void setABCKLAS(String ABCKLAS) {
            this.ABCKLAS = ABCKLAS;
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
         * The LIEFERMODELL
         */
        public String getLIEFERMODELL() {
            return LIEFERMODELL;
        }

        /**
         *
         * @param LIEFERMODELL
         * The LIEFERMODELL
         */
        public void setLIEFERMODELL(String LIEFERMODELL) {
            this.LIEFERMODELL = LIEFERMODELL;
        }

        /**
         *
         * @return
         * The STANDARDLIEFERZEIT
         */
        public String getSTANDARDLIEFERZEIT() {
            return STANDARDLIEFERZEIT;
        }

        /**
         *
         * @param STANDARDLIEFERZEIT
         * The STANDARDLIEFERZEIT
         */
        public void setSTANDARDLIEFERZEIT(String STANDARDLIEFERZEIT) {
            this.STANDARDLIEFERZEIT = STANDARDLIEFERZEIT;
        }

        /**
         *
         * @return
         * The FGKNZ_1
         */
        public String getFGKNZ_1() {
            return FGKNZ_1;
        }

        /**
         *
         * @param FGKNZ_1
         * The FGKNZ_1
         */
        public void setFGKNZ_1(String FGKNZ_1) {
            this.FGKNZ_1 = FGKNZ_1;
        }

        /**
         *
         * @return
         * The FGKNZ_2
         */
        public String getFGKNZ_2() {
            return FGKNZ_2;
        }

        /**
         *
         * @param FGKNZ_2
         * The FGKNZ_2
         */
        public void setFGKNZ_2(String FGKNZ_2) {
            this.FGKNZ_2 = FGKNZ_2;
        }

        /**
         *
         * @return
         * The FGKNZ_3
         */
        public Object getFGKNZ_3() {
            return FGKNZ_3;
        }

        /**
         *
         * @param FGKNZ_3
         * The FGKNZ_3
         */
        public void setFGKNZ_3(Object FGKNZ_3) {
            this.FGKNZ_3 = FGKNZ_3;
        }

        /**
         *
         * @return
         * The FGKNZ_4
         */
        public Object getFGKNZ_4() {
            return FGKNZ_4;
        }

        /**
         *
         * @param FGKNZ_4
         * The FGKNZ_4
         */
        public void setFGKNZ_4(Object FGKNZ_4) {
            this.FGKNZ_4 = FGKNZ_4;
        }

        /**
         *
         * @return
         * The FGKNZ_5
         */
        public String getFGKNZ_5() {
            return FGKNZ_5;
        }

        /**
         *
         * @param FGKNZ_5
         * The FGKNZ_5
         */
        public void setFGKNZ_5(String FGKNZ_5) {
            this.FGKNZ_5 = FGKNZ_5;
        }

        /**
         *
         * @return
         * The SACHBEREICH
         */
        public Object getSACHBEREICH() {
            return SACHBEREICH;
        }

        /**
         *
         * @param SACHBEREICH
         * The SACHBEREICH
         */
        public void setSACHBEREICH(Object SACHBEREICH) {
            this.SACHBEREICH = SACHBEREICH;
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
         * The VERWENDUNG6
         */
        public String getVERWENDUNG6() {
            return VERWENDUNG6;
        }

        /**
         *
         * @param VERWENDUNG6
         * The VERWENDUNG6
         */
        public void setVERWENDUNG6(String VERWENDUNG6) {
            this.VERWENDUNG6 = VERWENDUNG6;
        }

        /**
         *
         * @return
         * The VERWENDUNG7
         */
        public String getVERWENDUNG7() {
            return VERWENDUNG7;
        }

        /**
         *
         * @param VERWENDUNG7
         * The VERWENDUNG7
         */
        public void setVERWENDUNG7(String VERWENDUNG7) {
            this.VERWENDUNG7 = VERWENDUNG7;
        }

        /**
         *
         * @return
         * The VERWENDUNG8
         */
        public String getVERWENDUNG8() {
            return VERWENDUNG8;
        }

        /**
         *
         * @param VERWENDUNG8
         * The VERWENDUNG8
         */
        public void setVERWENDUNG8(String VERWENDUNG8) {
            this.VERWENDUNG8 = VERWENDUNG8;
        }

        /**
         *
         * @return
         * The VERWENDUNG9
         */
        public String getVERWENDUNG9() {
            return VERWENDUNG9;
        }

        /**
         *
         * @param VERWENDUNG9
         * The VERWENDUNG9
         */
        public void setVERWENDUNG9(String VERWENDUNG9) {
            this.VERWENDUNG9 = VERWENDUNG9;
        }

        /**
         *
         * @return
         * The VERWENDUNG10
         */
        public String getVERWENDUNG10() {
            return VERWENDUNG10;
        }

        /**
         *
         * @param VERWENDUNG10
         * The VERWENDUNG10
         */
        public void setVERWENDUNG10(String VERWENDUNG10) {
            this.VERWENDUNG10 = VERWENDUNG10;
        }

        /**
         *
         * @return
         * The VERWENDUNG11
         */
        public String getVERWENDUNG11() {
            return VERWENDUNG11;
        }

        /**
         *
         * @param VERWENDUNG11
         * The VERWENDUNG11
         */
        public void setVERWENDUNG11(String VERWENDUNG11) {
            this.VERWENDUNG11 = VERWENDUNG11;
        }

        /**
         *
         * @return
         * The VERWENDUNG12
         */
        public String getVERWENDUNG12() {
            return VERWENDUNG12;
        }

        /**
         *
         * @param VERWENDUNG12
         * The VERWENDUNG12
         */
        public void setVERWENDUNG12(String VERWENDUNG12) {
            this.VERWENDUNG12 = VERWENDUNG12;
        }

        /**
         *
         * @return
         * The VERWENDUNG13
         */
        public String getVERWENDUNG13() {
            return VERWENDUNG13;
        }

        /**
         *
         * @param VERWENDUNG13
         * The VERWENDUNG13
         */
        public void setVERWENDUNG13(String VERWENDUNG13) {
            this.VERWENDUNG13 = VERWENDUNG13;
        }

        /**
         *
         * @return
         * The VERWENDUNG14
         */
        public String getVERWENDUNG14() {
            return VERWENDUNG14;
        }

        /**
         *
         * @param VERWENDUNG14
         * The VERWENDUNG14
         */
        public void setVERWENDUNG14(String VERWENDUNG14) {
            this.VERWENDUNG14 = VERWENDUNG14;
        }

        /**
         *
         * @return
         * The VERWENDUNG15
         */
        public String getVERWENDUNG15() {
            return VERWENDUNG15;
        }

        /**
         *
         * @param VERWENDUNG15
         * The VERWENDUNG15
         */
        public void setVERWENDUNG15(String VERWENDUNG15) {
            this.VERWENDUNG15 = VERWENDUNG15;
        }

        /**
         *
         * @return
         * The VERWENDUNG16
         */
        public String getVERWENDUNG16() {
            return VERWENDUNG16;
        }

        /**
         *
         * @param VERWENDUNG16
         * The VERWENDUNG16
         */
        public void setVERWENDUNG16(String VERWENDUNG16) {
            this.VERWENDUNG16 = VERWENDUNG16;
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
         * The FREMDNR
         */
        public Object getFREMDNR() {
            return FREMDNR;
        }

        /**
         *
         * @param FREMDNR
         * The FREMDNR
         */
        public void setFREMDNR(Object FREMDNR) {
            this.FREMDNR = FREMDNR;
        }

        /**
         *
         * @return
         * The UMSZIEL
         */
        public String getUMSZIEL() {
            return UMSZIEL;
        }

        /**
         *
         * @param UMSZIEL
         * The UMSZIEL
         */
        public void setUMSZIEL(String UMSZIEL) {
            this.UMSZIEL = UMSZIEL;
        }

        /**
         *
         * @return
         * The UMSBONUS
         */
        public String getUMSBONUS() {
            return UMSBONUS;
        }

        /**
         *
         * @param UMSBONUS
         * The UMSBONUS
         */
        public void setUMSBONUS(String UMSBONUS) {
            this.UMSBONUS = UMSBONUS;
        }

        /**
         *
         * @return
         * The KNGBONUS
         */
        public String getKNGBONUS() {
            return KNGBONUS;
        }

        /**
         *
         * @param KNGBONUS
         * The KNGBONUS
         */
        public void setKNGBONUS(String KNGBONUS) {
            this.KNGBONUS = KNGBONUS;
        }

        /**
         *
         * @return
         * The REFERENZ
         */
        public String getREFERENZ() {
            return REFERENZ;
        }

        /**
         *
         * @param REFERENZ
         * The REFERENZ
         */
        public void setREFERENZ(String REFERENZ) {
            this.REFERENZ = REFERENZ;
        }

        /**
         *
         * @return
         * The PRODUKTE
         */
        public Object getPRODUKTE() {
            return PRODUKTE;
        }

        /**
         *
         * @param PRODUKTE
         * The PRODUKTE
         */
        public void setPRODUKTE(Object PRODUKTE) {
            this.PRODUKTE = PRODUKTE;
        }

        /**
         *
         * @return
         * The EVALUATIONACTIVE
         */
        public String getEVALUATIONACTIVE() {
            return EVALUATIONACTIVE;
        }

        /**
         *
         * @param EVALUATIONACTIVE
         * The EVALUATIONACTIVE
         */
        public void setEVALUATIONACTIVE(String EVALUATIONACTIVE) {
            this.EVALUATIONACTIVE = EVALUATIONACTIVE;
        }

        /**
         *
         * @return
         * The CRMCOMPANYID
         */
        public String getCRMCOMPANYID() {
            return CRMCOMPANYID;
        }

        /**
         *
         * @param CRMCOMPANYID
         * The CRMCOMPANYID
         */
        public void setCRMCOMPANYID(String CRMCOMPANYID) {
            this.CRMCOMPANYID = CRMCOMPANYID;
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
         * The TAXNO
         */
        public Object getTAXNO() {
            return TAXNO;
        }

        /**
         *
         * @param TAXNO
         * The TAXNO
         */
        public void setTAXNO(Object TAXNO) {
            this.TAXNO = TAXNO;
        }

        /**
         *
         * @return
         * The SHIPPINGCOST
         */
        public String getSHIPPINGCOST() {
            return SHIPPINGCOST;
        }

        /**
         *
         * @param SHIPPINGCOST
         * The SHIPPINGCOST
         */
        public void setSHIPPINGCOST(String SHIPPINGCOST) {
            this.SHIPPINGCOST = SHIPPINGCOST;
        }

        /**
         *
         * @return
         * The IBAN
         */
        public Object getIBAN() {
            return IBAN;
        }

        /**
         *
         * @param IBAN
         * The IBAN
         */
        public void setIBAN(Object IBAN) {
            this.IBAN = IBAN;
        }

        /**
         *
         * @return
         * The BANKCOUNTRYCODE
         */
        public Object getBANKCOUNTRYCODE() {
            return BANKCOUNTRYCODE;
        }

        /**
         *
         * @param BANKCOUNTRYCODE
         * The BANKCOUNTRYCODE
         */
        public void setBANKCOUNTRYCODE(Object BANKCOUNTRYCODE) {
            this.BANKCOUNTRYCODE = BANKCOUNTRYCODE;
        }

        /**
         *
         * @return
         * The ROHSUPDATEMODE
         */
        public String getROHSUPDATEMODE() {
            return ROHSUPDATEMODE;
        }

        /**
         *
         * @param ROHSUPDATEMODE
         * The ROHSUPDATEMODE
         */
        public void setROHSUPDATEMODE(String ROHSUPDATEMODE) {
            this.ROHSUPDATEMODE = ROHSUPDATEMODE;
        }

        /**
         *
         * @return
         * The SUPPLYWEBSUPPLIER
         */
        public String getSUPPLYWEBSUPPLIER() {
            return SUPPLYWEBSUPPLIER;
        }

        /**
         *
         * @param SUPPLYWEBSUPPLIER
         * The SUPPLYWEBSUPPLIER
         */
        public void setSUPPLYWEBSUPPLIER(String SUPPLYWEBSUPPLIER) {
            this.SUPPLYWEBSUPPLIER = SUPPLYWEBSUPPLIER;
        }

        /**
         *
         * @return
         * The SUPPLIERID
         */
        public Object getSUPPLIERID() {
            return SUPPLIERID;
        }

        /**
         *
         * @param SUPPLIERID
         * The SUPPLIERID
         */
        public void setSUPPLIERID(Object SUPPLIERID) {
            this.SUPPLIERID = SUPPLIERID;
        }

        /**
         *
         * @return
         * The PURCHASEORDERACTIVE
         */
        public String getPURCHASEORDERACTIVE() {
            return PURCHASEORDERACTIVE;
        }

        /**
         *
         * @param PURCHASEORDERACTIVE
         * The PURCHASEORDERACTIVE
         */
        public void setPURCHASEORDERACTIVE(String PURCHASEORDERACTIVE) {
            this.PURCHASEORDERACTIVE = PURCHASEORDERACTIVE;
        }

        /**
         *
         * @return
         * The RECEIPTACTIVE
         */
        public String getRECEIPTACTIVE() {
            return RECEIPTACTIVE;
        }

        /**
         *
         * @param RECEIPTACTIVE
         * The RECEIPTACTIVE
         */
        public void setRECEIPTACTIVE(String RECEIPTACTIVE) {
            this.RECEIPTACTIVE = RECEIPTACTIVE;
        }

        /**
         *
         * @return
         * The POCONFIRMATIONACTIVE
         */
        public String getPOCONFIRMATIONACTIVE() {
            return POCONFIRMATIONACTIVE;
        }

        /**
         *
         * @param POCONFIRMATIONACTIVE
         * The POCONFIRMATIONACTIVE
         */
        public void setPOCONFIRMATIONACTIVE(String POCONFIRMATIONACTIVE) {
            this.POCONFIRMATIONACTIVE = POCONFIRMATIONACTIVE;
        }

        /**
         *
         * @return
         * The DELADVISEACTIVE
         */
        public String getDELADVISEACTIVE() {
            return DELADVISEACTIVE;
        }

        /**
         *
         * @param DELADVISEACTIVE
         * The DELADVISEACTIVE
         */
        public void setDELADVISEACTIVE(String DELADVISEACTIVE) {
            this.DELADVISEACTIVE = DELADVISEACTIVE;
        }

        /**
         *
         * @return
         * The CREDITNOTEACTIVE
         */
        public String getCREDITNOTEACTIVE() {
            return CREDITNOTEACTIVE;
        }

        /**
         *
         * @param CREDITNOTEACTIVE
         * The CREDITNOTEACTIVE
         */
        public void setCREDITNOTEACTIVE(String CREDITNOTEACTIVE) {
            this.CREDITNOTEACTIVE = CREDITNOTEACTIVE;
        }

        /**
         *
         * @return
         * The MASTERDATAACTIVE
         */
        public String getMASTERDATAACTIVE() {
            return MASTERDATAACTIVE;
        }

        /**
         *
         * @param MASTERDATAACTIVE
         * The MASTERDATAACTIVE
         */
        public void setMASTERDATAACTIVE(String MASTERDATAACTIVE) {
            this.MASTERDATAACTIVE = MASTERDATAACTIVE;
        }

        /**
         *
         * @return
         * The USTRANSPORTZEIT
         */
        public String getUSTRANSPORTZEIT() {
            return USTRANSPORTZEIT;
        }

        /**
         *
         * @param USTRANSPORTZEIT
         * The USTRANSPORTZEIT
         */
        public void setUSTRANSPORTZEIT(String USTRANSPORTZEIT) {
            this.USTRANSPORTZEIT = USTRANSPORTZEIT;
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
         * The SUCHBEGRIFF_
         */
        public String getSUCHBEGRIFF_() {
            return SUCHBEGRIFF_;
        }

        /**
         *
         * @param SUCHBEGRIFF_
         * The SUCHBEGRIFF_
         */
        public void setSUCHBEGRIFF_(String SUCHBEGRIFF_) {
            this.SUCHBEGRIFF_ = SUCHBEGRIFF_;
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
         * The KTXT_
         */
        public String getKTXT_() {
            return KTXT_;
        }

        /**
         *
         * @param KTXT_
         * The KTXT_
         */
        public void setKTXT_(String KTXT_) {
            this.KTXT_ = KTXT_;
        }

        /**
         *
         * @return
         * The TEXTNR_
         */
        public Object getTEXTNR_() {
            return TEXTNR_;
        }

        /**
         *
         * @param TEXTNR_
         * The TEXTNR_
         */
        public void setTEXTNR_(Object TEXTNR_) {
            this.TEXTNR_ = TEXTNR_;
        }

        /**
         *
         * @return
         * The BANK_
         */
        public Object getBANK_() {
            return BANK_;
        }

        /**
         *
         * @param BANK_
         * The BANK_
         */
        public void setBANK_(Object BANK_) {
            this.BANK_ = BANK_;
        }

        /**
         *
         * @return
         * The MITARBEITER_
         */
        public Object getMITARBEITER_() {
            return MITARBEITER_;
        }

        /**
         *
         * @param MITARBEITER_
         * The MITARBEITER_
         */
        public void setMITARBEITER_(Object MITARBEITER_) {
            this.MITARBEITER_ = MITARBEITER_;
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
         * The EPOS_
         */
        public Object getEPOS_() {
            return EPOS_;
        }

        /**
         *
         * @param EPOS_
         * The EPOS_
         */
        public void setEPOS_(Object EPOS_) {
            this.EPOS_ = EPOS_;
        }

        /**
         *
         * @return
         * The SACHBEREICH_
         */
        public Object getSACHBEREICH_() {
            return SACHBEREICH_;
        }

        /**
         *
         * @param SACHBEREICH_
         * The SACHBEREICH_
         */
        public void setSACHBEREICH_(Object SACHBEREICH_) {
            this.SACHBEREICH_ = SACHBEREICH_;
        }

        /**
         *
         * @return
         * The TEXTNR2_
         */
        public Object getTEXTNR2_() {
            return TEXTNR2_;
        }

        /**
         *
         * @param TEXTNR2_
         * The TEXTNR2_
         */
        public void setTEXTNR2_(Object TEXTNR2_) {
            this.TEXTNR2_ = TEXTNR2_;
        }

        /**
         *
         * @return
         * The FREMDNR_
         */
        public Object getFREMDNR_() {
            return FREMDNR_;
        }

        /**
         *
         * @param FREMDNR_
         * The FREMDNR_
         */
        public void setFREMDNR_(Object FREMDNR_) {
            this.FREMDNR_ = FREMDNR_;
        }

        /**
         *
         * @return
         * The IBAN_
         */
        public Object getIBAN_() {
            return IBAN_;
        }

        /**
         *
         * @param IBAN_
         * The IBAN_
         */
        public void setIBAN_(Object IBAN_) {
            this.IBAN_ = IBAN_;
        }

        /**
         *
         * @return
         * The RELZTGK_KTXT
         */
        public String getRELZTGK_KTXT() {
            return RELZTGK_KTXT;
        }

        /**
         *
         * @param RELZTGK_KTXT
         * The RELZTGK_KTXT
         */
        public void setRELZTGK_KTXT(String RELZTGK_KTXT) {
            this.RELZTGK_KTXT = RELZTGK_KTXT;
        }

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
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
        dest.writeString(STATUS1);
        dest.writeString(STATUS2);
        dest.writeString(STATUS3);
        dest.writeString(STATUS4);
        dest.writeString(STATUS5);
        dest.writeString(STATUS6);
        dest.writeString(FIRMANR);
        dest.writeString(SUCHBEGRIFF);
        dest.writeString(NAME);
        dest.writeString(GFORM);
        dest.writeString(KTXT);
        dest.writeString(SPRACHKNZ);
        dest.writeString(ABCKLAS);
        dest.writeString(LIEFERMODELL);
        dest.writeString(STANDARDLIEFERZEIT);
        dest.writeString(FGKNZ_1);
        dest.writeString(FGKNZ_2);
        dest.writeString(FGKNZ_5);
        dest.writeString(VERWENDUNG1);
        dest.writeString(VERWENDUNG2);
        dest.writeString(VERWENDUNG3);
        dest.writeString(VERWENDUNG4);
        dest.writeString(VERWENDUNG5);
        dest.writeString(VERWENDUNG6);
        dest.writeString(VERWENDUNG7);
        dest.writeString(VERWENDUNG8);
        dest.writeString(VERWENDUNG9);
        dest.writeString(VERWENDUNG10);
        dest.writeString(VERWENDUNG11);
        dest.writeString(VERWENDUNG12);
        dest.writeString(VERWENDUNG13);
        dest.writeString(VERWENDUNG14);
        dest.writeString(VERWENDUNG15);
        dest.writeString(VERWENDUNG16);
        dest.writeString(UMSZIEL);
        dest.writeString(UMSBONUS);
        dest.writeString(KNGBONUS);
        dest.writeString(REFERENZ);
        dest.writeString(EVALUATIONACTIVE);
        dest.writeString(CRMCOMPANYID);
        dest.writeString(MAILINGLOCKFLAG);
        dest.writeString(SHIPPINGCOST);
        dest.writeString(ROHSUPDATEMODE);
        dest.writeString(SUPPLYWEBSUPPLIER);
        dest.writeString(PURCHASEORDERACTIVE);
        dest.writeString(RECEIPTACTIVE);
        dest.writeString(POCONFIRMATIONACTIVE);
        dest.writeString(DELADVISEACTIVE);
        dest.writeString(CREDITNOTEACTIVE);
        dest.writeString(MASTERDATAACTIVE);
        dest.writeString(USTRANSPORTZEIT);
        dest.writeString(USGESPERRT);
        dest.writeString(USSPERRGRUND);
        dest.writeString(SUCHBEGRIFF_);
        dest.writeString(NAME_);
        dest.writeString(KTXT_);
        dest.writeString(RELZTGK_KTXT);
    }

    /**
     *
     * @return
     * The mIcon
     */
    public int getIcon() {
        return mIcon;
    }

    public String getObjectToString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
