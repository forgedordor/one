package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cchi extends evsn implements evui {
    public static final cchi a;
    private static volatile evuo f;
    public evqs b;
    public evqs c;
    public evqs d;
    public evqs e;

    static {
        cchi cchiVar = new cchi();
        a = cchiVar;
        evsn.registerDefaultInstance(cchi.class, cchiVar);
    }

    private cchi() {
        evqs evqsVar = evqs.b;
        this.b = evqsVar;
        this.c = evqsVar;
        this.d = evqsVar;
        this.e = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004\n", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new cchi();
        }
        if (iOrdinal == 4) {
            return new cchh();
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
        synchronized (cchi.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
