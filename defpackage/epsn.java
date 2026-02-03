package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epsn extends evsn implements evui {
    public static final epsn a;
    private static volatile evuo e;
    public int b = 0;
    public Object c;
    public int d;
    private int f;

    static {
        epsn epsnVar = new epsn();
        a = epsnVar;
        evsn.registerDefaultInstance(epsn.class, epsnVar);
    }

    private epsn() {
        evqs evqsVar = evqs.b;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000\u0003ဌ\u0000\u0005?\u0000", new Object[]{"c", "b", "f", "d"});
        }
        if (iOrdinal == 3) {
            return new epsn();
        }
        if (iOrdinal == 4) {
            return new epsm();
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
        synchronized (epsn.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
