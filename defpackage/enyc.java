package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enyc extends evsn implements evui {
    public static final enyc a;
    private static volatile evuo e;
    public int b;
    public enpl c;
    public int d;

    static {
        enyc enycVar = new enyc();
        a = enycVar;
        evsn.registerDefaultInstance(enyc.class, enycVar);
    }

    private enyc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", enxd.a});
        }
        if (iOrdinal == 3) {
            return new enyc();
        }
        if (iOrdinal == 4) {
            return new enyb();
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
        synchronized (enyc.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
