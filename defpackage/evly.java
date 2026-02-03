package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evly extends evsn implements evui {
    public static final evly a;
    private static volatile evuo f;
    public int b;
    public evlo c;
    public evlu d;
    public int e;

    static {
        evly evlyVar = new evly();
        a = evlyVar;
        evsn.registerDefaultInstance(evly.class, evlyVar);
    }

    private evly() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0007᠌\u0002", new Object[]{"b", "c", "d", "e", evlv.a});
        }
        if (iOrdinal == 3) {
            return new evly();
        }
        if (iOrdinal == 4) {
            return new evlx();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evly.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
