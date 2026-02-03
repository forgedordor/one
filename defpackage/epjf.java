package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epjf extends evsn implements evui {
    public static final epjf a;
    private static volatile evuo c;
    public evub b = evub.a;

    static {
        epjf epjfVar = new epjf();
        a = epjfVar;
        evsn.registerDefaultInstance(epjf.class, epjfVar);
    }

    private epjf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", epje.a});
        }
        if (iOrdinal == 3) {
            return new epjf();
        }
        if (iOrdinal == 4) {
            return new epjd();
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
        synchronized (epjf.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
