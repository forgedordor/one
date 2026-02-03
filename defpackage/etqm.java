package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etqm extends evsn implements evui {
    public static final etqm a;
    private static volatile evuo d;
    public evqs b;
    public evqs c;

    static {
        etqm etqmVar = new etqm();
        a = etqmVar;
        evsn.registerDefaultInstance(etqm.class, etqmVar);
    }

    private etqm() {
        evqs evqsVar = evqs.b;
        this.b = evqsVar;
        this.c = evqsVar;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new etqm();
        }
        if (iOrdinal == 4) {
            return new etql();
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
        synchronized (etqm.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
