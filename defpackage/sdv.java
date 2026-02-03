package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdv extends evsn implements evui {
    public static final sdv a;
    private static volatile evuo g;
    public int b;
    public long c;
    public int d;
    public int e;
    public int f;

    static {
        sdv sdvVar = new sdv();
        a = sdvVar;
        evsn.registerDefaultInstance(sdv.class, sdvVar);
    }

    private sdv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", sfa.a, "e", sfb.a, "f", sfc.a});
        }
        if (iOrdinal == 3) {
            return new sdv();
        }
        if (iOrdinal == 4) {
            return new sdu();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (sdv.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
