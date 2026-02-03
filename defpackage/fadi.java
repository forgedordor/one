package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fadi extends evsn implements evui {
    public static final fadi a;
    private static volatile evuo d;
    public int b;
    public evqs c = evqs.b;

    static {
        fadi fadiVar = new fadi();
        a = fadiVar;
        evsn.registerDefaultInstance(fadi.class, fadiVar);
    }

    private fadi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new fadi();
        }
        if (iOrdinal == 4) {
            return new fadh();
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
        synchronized (fadi.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
