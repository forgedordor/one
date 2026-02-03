package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epuy extends evsn implements evui {
    public static final epuy a;
    private static volatile evuo b;

    static {
        epuy epuyVar = new epuy();
        a = epuyVar;
        evsn.registerDefaultInstance(epuy.class, epuyVar);
    }

    private epuy() {
        evqs evqsVar = evqs.b;
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new epuy();
        }
        if (iOrdinal == 4) {
            return new epux();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = b;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (epuy.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
