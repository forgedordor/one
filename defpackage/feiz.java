package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feiz extends evsn implements evui {
    public static final feiz a;
    private static volatile evuo e;
    public int b;
    public long c;
    public int d;

    static {
        feiz feizVar = new feiz();
        a = feizVar;
        evsn.registerDefaultInstance(feiz.class, feizVar);
    }

    private feiz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", fefl.a});
        }
        if (iOrdinal == 3) {
            return new feiz();
        }
        if (iOrdinal == 4) {
            return new feiy();
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
        synchronized (feiz.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
