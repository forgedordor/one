package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqoq extends evsn implements evui {
    public static final eqoq a;
    private static volatile evuo d;
    public long b;
    public long c;

    static {
        eqoq eqoqVar = new eqoq();
        a = eqoqVar;
        evsn.registerDefaultInstance(eqoq.class, eqoqVar);
    }

    private eqoq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new eqoq();
        }
        if (iOrdinal == 4) {
            return new eqop();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eqoq.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
