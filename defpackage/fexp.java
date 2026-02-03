package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fexp {
    public static final fexq b(String str) {
        fexq fexqVar = new fexq(str);
        fexq.c.put(str, fexqVar);
        return fexqVar;
    }

    public final synchronized fexq a(String str) {
        fexq fexqVar;
        String strConcat;
        str.getClass();
        Map map = fexq.c;
        fexqVar = (fexq) map.get(str);
        if (fexqVar == null) {
            if (fdgn.t(str, "TLS_")) {
                String strSubstring = str.substring(4);
                strSubstring.getClass();
                strConcat = "SSL_".concat(strSubstring);
            } else if (fdgn.t(str, "SSL_")) {
                String strSubstring2 = str.substring(4);
                strSubstring2.getClass();
                strConcat = "TLS_".concat(strSubstring2);
            } else {
                strConcat = str;
            }
            fexqVar = (fexq) map.get(strConcat);
            if (fexqVar == null) {
                fexqVar = new fexq(str);
            }
            map.put(str, fexqVar);
        }
        return fexqVar;
    }
}
