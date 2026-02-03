package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgov extends evsn implements evui {
    public static final cgov a;
    private static volatile evuo e;
    public int b;
    public long c;
    public int d;

    static {
        cgov cgovVar = new cgov();
        a = cgovVar;
        evsn.registerDefaultInstance(cgov.class, cgovVar);
    }

    private cgov() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", cgot.a});
        }
        if (iOrdinal == 3) {
            return new cgov();
        }
        if (iOrdinal == 4) {
            return new cgos();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cgov.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
