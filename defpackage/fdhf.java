package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fdhf extends fdhd {
    public static final char W(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(fdgn.u(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final CharSequence X(CharSequence charSequence) {
        return new StringBuilder(charSequence).reverse();
    }

    public static final String Y(String str, int i) {
        str.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.e(i, "Requested character count ", " is less than zero."));
        }
        String strSubstring = str.substring(fddu.g(i, str.length()));
        strSubstring.getClass();
        return strSubstring;
    }

    public static final String Z(String str, int i) {
        str.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.e(i, "Requested character count ", " is less than zero."));
        }
        String strSubstring = str.substring(0, fddu.g(i, str.length()));
        strSubstring.getClass();
        return strSubstring;
    }

    public static final String aa(String str, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a.e(i, "Requested character count ", " is less than zero."));
        }
        int length = str.length();
        String strSubstring = str.substring(length - fddu.g(i, length));
        strSubstring.getClass();
        return strSubstring;
    }
}
