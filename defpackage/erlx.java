package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erlx extends evsn implements evui {
    public static final erlx a;
    private static volatile evuo e;
    public int b;
    public int c;
    public int d;

    static {
        erlx erlxVar = new erlx();
        a = erlxVar;
        evsn.registerDefaultInstance(erlx.class, erlxVar);
    }

    private erlx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new erlx();
        }
        if (iOrdinal == 4) {
            return new erlw();
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
        synchronized (erlx.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
