package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epbn extends evsn implements evui {
    public static final epbn a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        epbn epbnVar = new epbn();
        a = epbnVar;
        evsn.registerDefaultInstance(epbn.class, epbnVar);
    }

    private epbn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", epcq.class});
        }
        if (iOrdinal == 3) {
            return new epbn();
        }
        if (iOrdinal == 4) {
            return new epbm();
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
        synchronized (epbn.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
