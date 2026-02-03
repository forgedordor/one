package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffbu {
    public static final ffbr[] a = {new ffbr(ffbr.f, ""), new ffbr(ffbr.c, "GET"), new ffbr(ffbr.c, "POST"), new ffbr(ffbr.d, "/"), new ffbr(ffbr.d, "/index.html"), new ffbr(ffbr.e, "http"), new ffbr(ffbr.e, "https"), new ffbr(ffbr.b, "200"), new ffbr(ffbr.b, "204"), new ffbr(ffbr.b, "206"), new ffbr(ffbr.b, "304"), new ffbr(ffbr.b, "400"), new ffbr(ffbr.b, "404"), new ffbr(ffbr.b, "500"), new ffbr("accept-charset", ""), new ffbr("accept-encoding", "gzip, deflate"), new ffbr("accept-language", ""), new ffbr("accept-ranges", ""), new ffbr("accept", ""), new ffbr("access-control-allow-origin", ""), new ffbr("age", ""), new ffbr("allow", ""), new ffbr("authorization", ""), new ffbr("cache-control", ""), new ffbr("content-disposition", ""), new ffbr("content-encoding", ""), new ffbr("content-language", ""), new ffbr("content-length", ""), new ffbr("content-location", ""), new ffbr("content-range", ""), new ffbr("content-type", ""), new ffbr("cookie", ""), new ffbr("date", ""), new ffbr("etag", ""), new ffbr("expect", ""), new ffbr("expires", ""), new ffbr("from", ""), new ffbr("host", ""), new ffbr("if-match", ""), new ffbr("if-modified-since", ""), new ffbr("if-none-match", ""), new ffbr("if-range", ""), new ffbr("if-unmodified-since", ""), new ffbr("last-modified", ""), new ffbr("link", ""), new ffbr("location", ""), new ffbr("max-forwards", ""), new ffbr("proxy-authenticate", ""), new ffbr("proxy-authorization", ""), new ffbr("range", ""), new ffbr("referer", ""), new ffbr("refresh", ""), new ffbr("retry-after", ""), new ffbr("server", ""), new ffbr("set-cookie", ""), new ffbr("strict-transport-security", ""), new ffbr("transfer-encoding", ""), new ffbr("user-agent", ""), new ffbr("vary", ""), new ffbr("via", ""), new ffbr("www-authenticate", "")};
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            ffbr[] ffbrVarArr = a;
            if (!linkedHashMap.containsKey(ffbrVarArr[i].g)) {
                linkedHashMap.put(ffbrVarArr[i].g, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        b = mapUnmodifiableMap;
    }

    public static final void a(fffd fffdVar) {
        int iB = fffdVar.b();
        for (int i = 0; i < iB; i++) {
            byte bA = fffdVar.a(i);
            if (bA >= 65 && bA < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(fffdVar.e()));
            }
        }
    }
}
