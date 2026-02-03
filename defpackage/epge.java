package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epge extends evsn implements evui {
    public static final evsy a = new epgb();
    public static final epge b;
    private static volatile evuo d;
    public evsx c = emptyIntList();

    static {
        epge epgeVar = new epge();
        b = epgeVar;
        evsn.registerDefaultInstance(epge.class, epgeVar);
    }

    private epge() {
        emptyIntList();
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
            return newMessageInfo(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"c"});
        }
        if (iOrdinal == 3) {
            return new epge();
        }
        if (iOrdinal == 4) {
            return new epgd();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (epge.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
