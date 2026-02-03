package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epgv extends evsn implements evui {
    public static final epgv a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        epgv epgvVar = new epgv();
        a = epgvVar;
        evsn.registerDefaultInstance(epgv.class, epgvVar);
    }

    private epgv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0006\u0003\u0000\u0000\u0000\u0001\f\u0005\f\u0006\f", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new epgv();
        }
        if (iOrdinal == 4) {
            return new epgu();
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
        synchronized (epgv.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
