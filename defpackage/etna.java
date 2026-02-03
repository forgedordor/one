package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etna extends evsn implements evui {
    public static final etna a;
    private static volatile evuo f;
    public int b;
    public boolean c;
    public etly d;
    public etmy e;

    static {
        etna etnaVar = new etna();
        a = etnaVar;
        evsn.registerDefaultInstance(etna.class, etnaVar);
    }

    private etna() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0001\u0003ဉ\u0003\u0004ဇ\u0000", new Object[]{"b", "d", "e", "c"});
        }
        if (iOrdinal == 3) {
            return new etna();
        }
        if (iOrdinal == 4) {
            return new etmz();
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
        synchronized (etna.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
