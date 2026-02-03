package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nxc {
    public static nxd a(nxd nxdVar, String[] strArr, Map map) {
        int length;
        int i = 0;
        if (nxdVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (nxd) map.get(strArr[0]);
            }
            if (length2 > 1) {
                nxd nxdVar2 = new nxd();
                while (i < length2) {
                    nxdVar2.d((nxd) map.get(strArr[i]));
                    i++;
                }
                return nxdVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                nxdVar.d((nxd) map.get(strArr[0]));
                return nxdVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    nxdVar.d((nxd) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return nxdVar;
    }
}
