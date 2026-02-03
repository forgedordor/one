package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erkq extends evsn implements evui {
    public static final erkq a;
    private static volatile evuo d;
    public int b;
    public ermh c;

    static {
        erkq erkqVar = new erkq();
        a = erkqVar;
        evsn.registerDefaultInstance(erkq.class, erkqVar);
    }

    private erkq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new erkq();
        }
        if (iOrdinal == 4) {
            return new erkp();
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
        synchronized (erkq.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
