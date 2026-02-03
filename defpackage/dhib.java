package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhib {
    public static String a(String str) {
        int iLastIndexOf;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iIndexOf = str.indexOf(64);
        if (iIndexOf > 0) {
            str = str.substring(iIndexOf + 1);
        }
        int iIndexOf2 = str.indexOf(59);
        if (iIndexOf2 > 0) {
            str = str.substring(0, iIndexOf2);
        } else {
            int iIndexOf3 = str.indexOf(63);
            if (iIndexOf3 > 0) {
                str = str.substring(0, iIndexOf3);
            }
        }
        String strTrim = str.trim();
        return (strTrim.charAt(strTrim.length() + (-1)) != ']' && (iLastIndexOf = strTrim.lastIndexOf(58)) > 0) ? strTrim.substring(0, iLastIndexOf).trim() : strTrim;
    }
}
