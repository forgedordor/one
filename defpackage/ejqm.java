package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ejqm {
    private final Map a = new HashMap();

    private final void c(String str, String str2, String str3) {
        Map map = this.a;
        Map map2 = (Map) map.get(str);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(str, map2);
        }
        map2.put(str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x0130 A[EDGE_INSN: B:97:0x0130->B:59:0x0130 BREAK  A[LOOP:4: B:48:0x00fe->B:58:0x0121], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0121 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ejql a(java.lang.CharSequence r13, java.lang.CharSequence r14) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejqm.a(java.lang.CharSequence, java.lang.CharSequence):ejql");
    }

    final void b(String str, String str2) {
        int iIndexOf = str.indexOf(32);
        if (iIndexOf > 0 && iIndexOf < str.length() - 1) {
            c(str.substring(str.offsetByCodePoints(iIndexOf, -1), str.offsetByCodePoints(iIndexOf, 2)), str, str2);
            return;
        }
        int iOffsetByCodePoints = str.offsetByCodePoints(str.length(), -1);
        int iOffsetByCodePoints2 = 0;
        while (iOffsetByCodePoints2 < iOffsetByCodePoints) {
            c(str.substring(iOffsetByCodePoints2, str.offsetByCodePoints(iOffsetByCodePoints2, 2)), str, str2);
            iOffsetByCodePoints2 = str.offsetByCodePoints(iOffsetByCodePoints2, 1);
        }
    }
}
