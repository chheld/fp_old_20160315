package de.fischerprofil.fp;

import java.text.NumberFormat;
import java.util.Locale;

public class StringUtils {

    public static boolean IsNullOrEmpty(String s) {
        boolean r = true;
        if (s != null) {
            if (s.length() != 0) r = false;
        }
        return r;
    }

    public static boolean IsNotNullOrEmpty(String s) {
        boolean r = false;
        if (s != null) {
            if (s.length() != 0) r = true;
        }
        return r;
    }

    public static String getGermanCurrencyFormat(double value) {
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.GERMAN);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        return nf.format(value) + " EUR";
    }
}
