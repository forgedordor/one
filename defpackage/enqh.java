package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enqh extends evsn implements evui {
    public static final enqh a;
    private static volatile evuo d;
    public int b;
    public evqs c = evqs.b;

    static {
        enqh enqhVar = new enqh();
        a = enqhVar;
        evsn.registerDefaultInstance(enqh.class, enqhVar);
    }

    private enqh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new enqh();
        }
        if (iOrdinal == 4) {
            return new enqg();
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
        synchronized (enqh.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
