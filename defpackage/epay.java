package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epay extends evsn implements evui {
    public static final epay a;
    private static volatile evuo c;
    public int b;

    static {
        epay epayVar = new epay();
        a = epayVar;
        evsn.registerDefaultInstance(epay.class, epayVar);
    }

    private epay() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new epay();
        }
        if (iOrdinal == 4) {
            return new epax();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (epay.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
