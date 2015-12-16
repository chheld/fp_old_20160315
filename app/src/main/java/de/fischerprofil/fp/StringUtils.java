package de.fischerprofil.fp;

import java.text.NumberFormat;
import java.util.Locale;

public class StringUtils {

    public static boolean IsNullOrEmpty(Object o) {
        boolean r = true;
        String s;

        try {
            s = o.toString();
            if (s != null) {
                if (s.length() != 0) r = false;
            }
        }
        catch (Exception e) {
            r = true;
        }
        return r;
    }

    public static boolean IsNotNullOrEmpty(Object o) {
        boolean r = false;
        String s;

        try {
            s = o.toString();
            if (s != null) {
                if (s.length() != 0) {
                    if (!s.equals("null")) {
                        r = true;
                    }
                }
            }
        }
        catch (Exception e) {
            r = false;
        }
        return r;
    }

    public static String getGermanCurrencyFormat(double value) {
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.GERMAN);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        return nf.format(value) + " EUR";
    }

    /**
     * returns the string, the first char lowercase
     *
     * @param target
     * @return
     */
    public final static String asLowerCaseFirstChar(final String target) {

        if ((target == null) || (target.length() == 0)) {
            return target; // You could omit this check and simply live with an
            // exception if you like
        }
        return Character.toLowerCase(target.charAt(0))
                + (target.length() > 1 ? target.substring(1) : "");
    }

    /**
     * returns the string, the first char uppercase
     *
     * @param target
     * @return
     */
    public final static String asUpperCaseFirstChar(final String target) {

        if ((target == null) || (target.length() == 0)) {
            return target; // You could omit this check and simply live with an
            // exception if you like
        }
        return Character.toUpperCase(target.charAt(0))
                + (target.length() > 1 ? target.substring(1) : "");
    }
}
