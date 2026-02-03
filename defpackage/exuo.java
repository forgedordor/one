package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exuo extends evsn implements evui {
    public static final exuo a;
    private static volatile evuo d;
    public int b;
    public evqs c = evqs.b;

    static {
        exuo exuoVar = new exuo();
        a = exuoVar;
        evsn.registerDefaultInstance(exuo.class, exuoVar);
    }

    private exuo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new exuo();
        }
        if (iOrdinal == 4) {
            return new exun();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exuo.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
