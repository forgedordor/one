package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etqv extends evsn implements evui {
    public static final etqv a;
    private static volatile evuo e;
    public evqs b = evqs.b;
    public int c;
    public int d;

    static {
        etqv etqvVar = new etqv();
        a = etqvVar;
        evsn.registerDefaultInstance(etqv.class, etqvVar);
    }

    private etqv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0000\u0000\u0001\n\u0002\f\u0005\u0004", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new etqv();
        }
        if (iOrdinal == 4) {
            return new etqu();
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
        synchronized (etqv.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
