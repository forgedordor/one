package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffsu implements fftt {
    public static final Map a;
    public final int b;
    private final String c;

    static {
        HashMap map = new HashMap();
        map.put(a("SHA-256", 32, 67, 20, 2), new ffsu(1, "XMSSMT_SHA2_20/2_256"));
        map.put(a("SHA-256", 32, 67, 20, 4), new ffsu(2, "XMSSMT_SHA2_20/4_256"));
        map.put(a("SHA-256", 32, 67, 40, 2), new ffsu(3, "XMSSMT_SHA2_40/2_256"));
        map.put(a("SHA-256", 32, 67, 40, 4), new ffsu(4, "XMSSMT_SHA2_40/4_256"));
        map.put(a("SHA-256", 32, 67, 40, 8), new ffsu(5, "XMSSMT_SHA2_40/8_256"));
        map.put(a("SHA-256", 32, 67, 60, 3), new ffsu(6, "XMSSMT_SHA2_60/3_256"));
        map.put(a("SHA-256", 32, 67, 60, 6), new ffsu(7, "XMSSMT_SHA2_60/6_256"));
        map.put(a("SHA-256", 32, 67, 60, 12), new ffsu(8, "XMSSMT_SHA2_60/12_256"));
        map.put(a("SHA-512", 64, 131, 20, 2), new ffsu(9, "XMSSMT_SHA2_20/2_512"));
        map.put(a("SHA-512", 64, 131, 20, 4), new ffsu(10, "XMSSMT_SHA2_20/4_512"));
        map.put(a("SHA-512", 64, 131, 40, 2), new ffsu(11, "XMSSMT_SHA2_40/2_512"));
        map.put(a("SHA-512", 64, 131, 40, 4), new ffsu(12, "XMSSMT_SHA2_40/4_512"));
        map.put(a("SHA-512", 64, 131, 40, 8), new ffsu(13, "XMSSMT_SHA2_40/8_512"));
        map.put(a("SHA-512", 64, 131, 60, 3), new ffsu(14, "XMSSMT_SHA2_60/3_512"));
        map.put(a("SHA-512", 64, 131, 60, 6), new ffsu(15, "XMSSMT_SHA2_60/6_512"));
        map.put(a("SHA-512", 64, 131, 60, 12), new ffsu(16, "XMSSMT_SHA2_60/12_512"));
        map.put(a("SHAKE128", 32, 67, 20, 2), new ffsu(17, "XMSSMT_SHAKE_20/2_256"));
        map.put(a("SHAKE128", 32, 67, 20, 4), new ffsu(18, "XMSSMT_SHAKE_20/4_256"));
        map.put(a("SHAKE128", 32, 67, 40, 2), new ffsu(19, "XMSSMT_SHAKE_40/2_256"));
        map.put(a("SHAKE128", 32, 67, 40, 4), new ffsu(20, "XMSSMT_SHAKE_40/4_256"));
        map.put(a("SHAKE128", 32, 67, 40, 8), new ffsu(21, "XMSSMT_SHAKE_40/8_256"));
        map.put(a("SHAKE128", 32, 67, 60, 3), new ffsu(22, "XMSSMT_SHAKE_60/3_256"));
        map.put(a("SHAKE128", 32, 67, 60, 6), new ffsu(23, "XMSSMT_SHAKE_60/6_256"));
        map.put(a("SHAKE128", 32, 67, 60, 12), new ffsu(24, "XMSSMT_SHAKE_60/12_256"));
        map.put(a("SHAKE256", 64, 131, 20, 2), new ffsu(25, "XMSSMT_SHAKE_20/2_512"));
        map.put(a("SHAKE256", 64, 131, 20, 4), new ffsu(26, "XMSSMT_SHAKE_20/4_512"));
        map.put(a("SHAKE256", 64, 131, 40, 2), new ffsu(27, "XMSSMT_SHAKE_40/2_512"));
        map.put(a("SHAKE256", 64, 131, 40, 4), new ffsu(28, "XMSSMT_SHAKE_40/4_512"));
        map.put(a("SHAKE256", 64, 131, 40, 8), new ffsu(29, "XMSSMT_SHAKE_40/8_512"));
        map.put(a("SHAKE256", 64, 131, 60, 3), new ffsu(30, "XMSSMT_SHAKE_60/3_512"));
        map.put(a("SHAKE256", 64, 131, 60, 6), new ffsu(31, "XMSSMT_SHAKE_60/6_512"));
        map.put(a("SHAKE256", 64, 131, 60, 12), new ffsu(32, "XMSSMT_SHAKE_60/12_512"));
        a = DesugarCollections.unmodifiableMap(map);
    }

    private ffsu(int i, String str) {
        this.b = i;
        this.c = str;
    }

    public static String a(String str, int i, int i2, int i3, int i4) {
        return str + "-" + i + "-16-" + i2 + "-" + i3 + "-" + i4;
    }

    public final String toString() {
        return this.c;
    }
}
