package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffsv implements fftt {
    public static final Map a;
    public final int b;
    private final String c;

    static {
        HashMap map = new HashMap();
        map.put(a("SHA-256", 32, 67, 10), new ffsv(1, "XMSS_SHA2_10_256"));
        map.put(a("SHA-256", 32, 67, 16), new ffsv(2, "XMSS_SHA2_16_256"));
        map.put(a("SHA-256", 32, 67, 20), new ffsv(3, "XMSS_SHA2_20_256"));
        map.put(a("SHA-512", 64, 131, 10), new ffsv(4, "XMSS_SHA2_10_512"));
        map.put(a("SHA-512", 64, 131, 16), new ffsv(5, "XMSS_SHA2_16_512"));
        map.put(a("SHA-512", 64, 131, 20), new ffsv(6, "XMSS_SHA2_20_512"));
        map.put(a("SHAKE128", 32, 67, 10), new ffsv(7, "XMSS_SHAKE_10_256"));
        map.put(a("SHAKE128", 32, 67, 16), new ffsv(8, "XMSS_SHAKE_16_256"));
        map.put(a("SHAKE128", 32, 67, 20), new ffsv(9, "XMSS_SHAKE_20_256"));
        map.put(a("SHAKE256", 64, 131, 10), new ffsv(10, "XMSS_SHAKE_10_512"));
        map.put(a("SHAKE256", 64, 131, 16), new ffsv(11, "XMSS_SHAKE_16_512"));
        map.put(a("SHAKE256", 64, 131, 20), new ffsv(12, "XMSS_SHAKE_20_512"));
        a = DesugarCollections.unmodifiableMap(map);
    }

    private ffsv(int i, String str) {
        this.b = i;
        this.c = str;
    }

    public static String a(String str, int i, int i2, int i3) {
        return str + "-" + i + "-16-" + i2 + "-" + i3;
    }

    public final String toString() {
        return this.c;
    }
}
