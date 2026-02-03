package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elzq extends evsn implements evui {
    public static final elzq a;
    private static volatile evuo f;
    public int b;
    public long c;
    public long d;
    public long e;

    static {
        elzq elzqVar = new elzq();
        a = elzqVar;
        evsn.registerDefaultInstance(elzq.class, elzqVar);
    }

    private elzq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new elzq();
        }
        if (iOrdinal == 4) {
            return new elzp();
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
        synchronized (elzq.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
