package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eomo {
    public static eomp a(String str) {
        String str2;
        String strSubstring;
        String strSubstring2;
        Charset charset = eomq.a;
        str.getClass();
        charset.getClass();
        int i = 0;
        int i2 = 0;
        while (i2 < str.length() && ":/\\?#".indexOf(str.charAt(i2)) < 0) {
            i2++;
        }
        String strSubstring3 = null;
        if (i2 <= 0 || !str.startsWith(":", i2)) {
            str2 = null;
        } else {
            String strSubstring4 = str.substring(0, i2);
            int i3 = i2 + 1;
            str2 = strSubstring4;
            i = i3;
        }
        if (str.startsWith("//", i)) {
            int i4 = i + 2;
            int i5 = i4;
            while (i5 < str.length() && "/\\?#".indexOf(str.charAt(i5)) < 0) {
                i5++;
            }
            strSubstring3 = str.substring(i4, i5);
            i = i5;
            strSubstring = null;
        } else {
            strSubstring = null;
        }
        int i6 = i;
        while (i6 < str.length() && "?#".indexOf(str.charAt(i6)) < 0) {
            i6++;
        }
        String strSubstring5 = i6 > i ? str.substring(i, i6) : strSubstring;
        if (str.startsWith("?", i6)) {
            int i7 = i6 + 1;
            while (i6 < str.length() && str.charAt(i6) != '#') {
                i6++;
            }
            strSubstring2 = str.substring(i7, i6);
        } else {
            strSubstring2 = strSubstring;
        }
        if (str.startsWith("#", i6)) {
            strSubstring = str.substring(i6 + 1);
        }
        if ((str2 == null || str2.equals(eomp.b(str2))) && charset.equals(charset)) {
            return new eomp(str2, strSubstring3, strSubstring5, strSubstring2, strSubstring, charset, str);
        }
        return new eomp(str2, strSubstring3, strSubstring5, strSubstring2, strSubstring, charset);
    }
}
