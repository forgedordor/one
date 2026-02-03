package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eldn {
    public static final /* synthetic */ int a = 0;
    private static final ekqm b;

    static {
        HashMap map = new HashMap();
        ekqo.a('\"', "&quot;", map);
        ekqo.a('\'', "&#39;", map);
        ekqo.a('&', "&amp;", map);
        ekqo.a('<', "&lt;", map);
        ekqo.a('>', "&gt;", map);
        b = new ekqn(map);
    }

    static String a(String str) {
        char[] cArr;
        ekqm ekqmVar = b;
        str.getClass();
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            ekqj ekqjVar = (ekqj) ekqmVar;
            int i2 = ekqjVar.b;
            if (cCharAt < i2) {
                char[][] cArr2 = ekqjVar.a;
                if (cArr2[cCharAt] != null) {
                    int length = str.length();
                    char[] cArrA = ekqq.a();
                    int length2 = cArrA.length;
                    int i3 = 0;
                    int i4 = 0;
                    while (i < length) {
                        int i5 = i + 1;
                        char cCharAt2 = str.charAt(i);
                        char[] cArr3 = null;
                        if (cCharAt2 < i2 && (cArr = cArr2[cCharAt2]) != null) {
                            cArr3 = cArr;
                        }
                        if (cArr3 != null) {
                            int i6 = i - i3;
                            int i7 = i4 + i6;
                            int length3 = cArr3.length;
                            int i8 = i7 + length3;
                            if (length2 < i8) {
                                int i9 = length - i;
                                length2 = i9 + i9 + i8;
                                cArrA = ekql.a(cArrA, i4, length2);
                            }
                            if (i6 > 0) {
                                str.getChars(i3, i, cArrA, i4);
                                i4 = i7;
                            }
                            if (length3 > 0) {
                                System.arraycopy(cArr3, 0, cArrA, i4, length3);
                                i4 += length3;
                            }
                            i3 = i5;
                        }
                        i = i5;
                    }
                    int i10 = length - i3;
                    if (i10 > 0) {
                        int i11 = i10 + i4;
                        if (length2 < i11) {
                            cArrA = ekql.a(cArrA, i4, i11);
                        }
                        str.getChars(i3, length, cArrA, i4);
                        i4 = i11;
                    }
                    return new String(cArrA, 0, i4);
                }
            }
            char c = ekqjVar.c;
            i++;
        }
        return str;
    }
}
