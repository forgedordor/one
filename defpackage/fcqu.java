package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcqu {
    public static final fffd a;
    public static final fcqr[] b;
    public static final Map c;

    static {
        fffd fffdVar = fffd.a;
        a = fffc.b(":");
        int i = 0;
        b = new fcqr[]{new fcqr(fcqr.e, ""), new fcqr(fcqr.b, "GET"), new fcqr(fcqr.b, "POST"), new fcqr(fcqr.c, "/"), new fcqr(fcqr.c, "/index.html"), new fcqr(fcqr.d, "http"), new fcqr(fcqr.d, "https"), new fcqr(fcqr.a, "200"), new fcqr(fcqr.a, "204"), new fcqr(fcqr.a, "206"), new fcqr(fcqr.a, "304"), new fcqr(fcqr.a, "400"), new fcqr(fcqr.a, "404"), new fcqr(fcqr.a, "500"), new fcqr("accept-charset", ""), new fcqr("accept-encoding", "gzip, deflate"), new fcqr("accept-language", ""), new fcqr("accept-ranges", ""), new fcqr("accept", ""), new fcqr("access-control-allow-origin", ""), new fcqr("age", ""), new fcqr("allow", ""), new fcqr("authorization", ""), new fcqr("cache-control", ""), new fcqr("content-disposition", ""), new fcqr("content-encoding", ""), new fcqr("content-language", ""), new fcqr("content-length", ""), new fcqr("content-location", ""), new fcqr("content-range", ""), new fcqr("content-type", ""), new fcqr("cookie", ""), new fcqr("date", ""), new fcqr("etag", ""), new fcqr("expect", ""), new fcqr("expires", ""), new fcqr("from", ""), new fcqr("host", ""), new fcqr("if-match", ""), new fcqr("if-modified-since", ""), new fcqr("if-none-match", ""), new fcqr("if-range", ""), new fcqr("if-unmodified-since", ""), new fcqr("last-modified", ""), new fcqr("link", ""), new fcqr("location", ""), new fcqr("max-forwards", ""), new fcqr("proxy-authenticate", ""), new fcqr("proxy-authorization", ""), new fcqr("range", ""), new fcqr("referer", ""), new fcqr("refresh", ""), new fcqr("retry-after", ""), new fcqr("server", ""), new fcqr("set-cookie", ""), new fcqr("strict-transport-security", ""), new fcqr("transfer-encoding", ""), new fcqr("user-agent", ""), new fcqr("vary", ""), new fcqr("via", ""), new fcqr("www-authenticate", "")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (true) {
            fcqr[] fcqrVarArr = b;
            int length = fcqrVarArr.length;
            if (i >= 61) {
                c = DesugarCollections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(fcqrVarArr[i].f)) {
                    linkedHashMap.put(fcqrVarArr[i].f, Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    public static void a(fffd fffdVar) throws IOException {
        int iB = fffdVar.b();
        for (int i = 0; i < iB; i++) {
            byte bA = fffdVar.a(i);
            if (bA >= 65 && bA <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(fffdVar.e()));
            }
        }
    }
}
