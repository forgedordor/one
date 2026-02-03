package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebcq {
    public final String a;
    private final String b;

    public ebcq(String str, String str2) {
        this.b = str;
        this.a = str2;
    }

    public static ebcq a(String str) {
        String strTrim;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Address must not be null");
        }
        int iIndexOf = str.indexOf(60);
        if (iIndexOf == -1) {
            return new ebcq(b(str));
        }
        if (iIndexOf > 0) {
            String strTrim2 = str.substring(0, iIndexOf).trim();
            if (strTrim2.startsWith("\"")) {
                strTrim2 = strTrim2.substring(1);
            }
            if (strTrim2.endsWith("\"")) {
                strTrim2 = strTrim2.substring(0, strTrim2.length() - 1);
            }
            strTrim = strTrim2.trim();
        } else {
            strTrim = null;
        }
        return new ebcq(strTrim, b(str.substring(iIndexOf)));
    }

    private static String b(String str) {
        String strTrim = str.trim();
        if (strTrim.startsWith("<")) {
            strTrim = strTrim.substring(1);
        }
        if (strTrim.endsWith(">")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        return strTrim.trim();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ebcq)) {
            return false;
        }
        ebcq ebcqVar = (ebcq) obj;
        return TextUtils.equals(this.b, ebcqVar.b) && TextUtils.equals(this.a, ebcqVar.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{String.valueOf(this.b), this.a});
    }

    public final String toString() {
        String str = this.b;
        return (str == null ? "<" : a.a(str, "\"", "\" <")) + this.a + ">";
    }

    public ebcq(String str) {
        this(null, str);
    }
}
