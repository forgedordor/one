package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enso extends evsn implements evui {
    public static final enso a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        enso ensoVar = new enso();
        a = ensoVar;
        evsn.registerDefaultInstance(enso.class, ensoVar);
    }

    private enso() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", ensn.a});
        }
        if (iOrdinal == 3) {
            return new enso();
        }
        if (iOrdinal == 4) {
            return new ensm();
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
        synchronized (enso.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
