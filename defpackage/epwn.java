package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epwn extends evsn implements evui {
    public static final epwn a;
    private static volatile evuo f;
    public int b;
    public int c;
    public evqs d;
    public evqs e;

    static {
        epwn epwnVar = new epwn();
        a = epwnVar;
        evsn.registerDefaultInstance(epwn.class, epwnVar);
    }

    private epwn() {
        evqs evqsVar = evqs.b;
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
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new epwn();
        }
        if (iOrdinal == 4) {
            return new epwm();
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
        synchronized (epwn.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
