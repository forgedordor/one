package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feyp {
    public static final int a(String str) {
        str.getClass();
        if (fdbq.f(str, "http")) {
            return 80;
        }
        return !fdbq.f(str, "https") ? -1 : 443;
    }

    public static final feyq b(String str) {
        str.getClass();
        feyo feyoVar = new feyo();
        feyoVar.c(null, str);
        return feyoVar.a();
    }

    public static /* synthetic */ String c(String str, int i, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z2 = true;
        if (1 == (i3 & 1)) {
            i = 0;
        }
        boolean z3 = z & ((i3 & 4) == 0);
        str.getClass();
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%') {
                z2 = z3;
            } else if (cCharAt != '+' || !z3) {
                iCharCount++;
            }
            ffez ffezVar = new ffez();
            ffezVar.V(str, i, iCharCount);
            while (iCharCount < i2) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt == 37) {
                    int i4 = iCharCount + 2;
                    if (i4 < i2) {
                        int iF = fezr.f(str.charAt(iCharCount + 1));
                        int iF2 = fezr.f(str.charAt(i4));
                        if (iF == -1 || iF2 == -1) {
                            iCodePointAt = 37;
                            ffezVar.W(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            ffezVar.P((iF << 4) + iF2);
                            iCharCount = Character.charCount(37) + i4;
                        }
                    } else {
                        iCodePointAt = 37;
                    }
                }
                if (iCodePointAt == 43 && z2) {
                    ffezVar.P(32);
                    iCharCount++;
                } else {
                    ffezVar.W(iCodePointAt);
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            return ffezVar.n();
        }
        String strSubstring = str.substring(i, i2);
        strSubstring.getClass();
        return strSubstring;
    }

    public static final List d(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iN = fdgn.N(str, '&', i, 4);
            if (iN == -1) {
                iN = str.length();
            }
            int iN2 = fdgn.N(str, '=', i, 4);
            if (iN2 == -1 || iN2 > iN) {
                String strSubstring = str.substring(i, iN);
                strSubstring.getClass();
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i, iN2);
                strSubstring2.getClass();
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iN2 + 1, iN);
                strSubstring3.getClass();
                arrayList.add(strSubstring3);
            }
            i = iN + 1;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.String e(java.lang.String r17, int r18, int r19, java.lang.String r20, boolean r21, boolean r22, boolean r23, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.feyp.e(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, int):java.lang.String");
    }

    private static final boolean f(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && fezr.f(str.charAt(i + 1)) != -1 && fezr.f(str.charAt(i3)) != -1;
    }
}
