package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epwp extends evsn implements evui {
    public static final epwp a;
    private static volatile evuo e;
    public int b;
    public int c;
    public evqs d = evqs.b;

    static {
        epwp epwpVar = new epwp();
        a = epwpVar;
        evsn.registerDefaultInstance(epwp.class, epwpVar);
    }

    private epwp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new epwp();
        }
        if (iOrdinal == 4) {
            return new epwo();
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
        synchronized (epwp.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
