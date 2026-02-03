package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elld extends evsn implements evui {
    public static final elld a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        elld elldVar = new elld();
        a = elldVar;
        evsn.registerDefaultInstance(elld.class, elldVar);
    }

    private elld() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", ellb.a});
        }
        if (iOrdinal == 3) {
            return new elld();
        }
        if (iOrdinal == 4) {
            return new ellc();
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
        synchronized (elld.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
