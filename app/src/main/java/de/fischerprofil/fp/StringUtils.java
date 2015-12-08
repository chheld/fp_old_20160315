package de.fischerprofil.fp;

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
}
