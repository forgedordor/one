package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class eyor extends evsn implements evui {
    public static final eyor a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        eyor eyorVar = new eyor();
        a = eyorVar;
        evsn.registerDefaultInstance(eyor.class, eyorVar);
    }

    private eyor() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\f\u0003\f", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new eyor();
        }
        if (iOrdinal == 4) {
            return new eyoq();
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
        synchronized (eyor.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
