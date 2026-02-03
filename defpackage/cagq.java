package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cagq extends evsn implements evui {
    public static final cagq a;
    private static volatile evuo b;

    static {
        cagq cagqVar = new cagq();
        a = cagqVar;
        evsn.registerDefaultInstance(cagq.class, cagqVar);
    }

    private cagq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new cagq();
        }
        if (iOrdinal == 4) {
            return new cagp();
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
        synchronized (cagq.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
