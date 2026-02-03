package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elve extends evsn implements evui {
    public static final elve a;
    private static volatile evuo f;
    public int b;
    public int c;
    public boolean d;
    public int e;

    static {
        elve elveVar = new elve();
        a = elveVar;
        evsn.registerDefaultInstance(elve.class, elveVar);
    }

    private elve() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\b᠌\u0007", new Object[]{"b", "c", elko.a, "d", "e", elvd.a});
        }
        if (iOrdinal == 3) {
            return new elve();
        }
        if (iOrdinal == 4) {
            return new elvc();
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
        synchronized (elve.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
