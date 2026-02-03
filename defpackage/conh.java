package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class conh extends evsn implements evui {
    public static final conh a;
    private static volatile evuo j;
    public int b;
    public int c;
    public int h;
    public String d = "";
    public String e = "";
    public String f = "";
    public evqs g = evqs.b;
    public String i = "";

    static {
        conh conhVar = new conh();
        a = conhVar;
        evsn.registerDefaultInstance(conh.class, conhVar);
    }

    private conh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ည\u0004\u0006င\u0005\u0007ဈ\u0006", new Object[]{"b", "c", conf.a, "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new conh();
        }
        if (iOrdinal == 4) {
            return new cone();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = j;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (conh.class) {
            evsgVar = j;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                j = evsgVar;
            }
        }
        return evsgVar;
    }
}
