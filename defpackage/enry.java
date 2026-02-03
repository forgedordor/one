package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enry extends evsn implements evui {
    public static final enry a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        enry enryVar = new enry();
        a = enryVar;
        evsn.registerDefaultInstance(enry.class, enryVar);
    }

    private enry() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", enrw.a});
        }
        if (iOrdinal == 3) {
            return new enry();
        }
        if (iOrdinal == 4) {
            return new enrv();
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
        synchronized (enry.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
