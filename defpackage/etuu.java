package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etuu extends evsn implements evui {
    public static final etuu a;
    private static volatile evuo h;
    public int b;
    public etul c;
    public long d;
    public evqs e = evqs.b;
    public int f = 100;
    public ettv g;

    static {
        etuu etuuVar = new etuu();
        a = etuuVar;
        evsn.registerDefaultInstance(etuu.class, etuuVar);
    }

    private etuu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ည\u0002\u0004င\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new etuu();
        }
        if (iOrdinal == 4) {
            return new etut();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etuu.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
