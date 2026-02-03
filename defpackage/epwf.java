package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epwf extends evsn implements evui {
    public static final epwf a;
    private static volatile evuo f;
    public int b;
    public evqs c;
    public evqs d;
    public evqs e;

    static {
        epwf epwfVar = new epwf();
        a = epwfVar;
        evsn.registerDefaultInstance(epwf.class, epwfVar);
    }

    private epwf() {
        evqs evqsVar = evqs.b;
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
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new epwf();
        }
        if (iOrdinal == 4) {
            return new epwe();
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
        synchronized (epwf.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
