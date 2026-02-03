package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffgm {
    public static final String a(int i) {
        char[] cArr = new char[i];
        Arrays.fill(cArr, ' ');
        return new String(cArr);
    }

    public static final String b(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        int length = str.length();
        while (length > 0) {
            int i = length - 1;
            if (!Character.isWhitespace(str.charAt(i))) {
                break;
            }
            length = i;
        }
        return str.substring(0, length);
    }

    public static final int c(String str) {
        int iIndexOf = str.indexOf(10, 0);
        if (iIndexOf != -1 && iIndexOf <= 74) {
            return iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(9, 0);
        if (iIndexOf2 != -1 && iIndexOf2 <= 74) {
            return iIndexOf2 + 1;
        }
        if (str.length() <= 74) {
            return -1;
        }
        int i = 74;
        while (i >= 0) {
            char cCharAt = str.charAt(i);
            if (cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r') {
                break;
            }
            i--;
        }
        return i > 0 ? i : str.length() == 74 ? -1 : 74;
    }
}
