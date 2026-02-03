package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enir extends evsn implements evui {
    public static final enir a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        enir enirVar = new enir();
        a = enirVar;
        evsn.registerDefaultInstance(enir.class, enirVar);
    }

    private enir() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", eniq.class, enin.class});
        }
        if (iOrdinal == 3) {
            return new enir();
        }
        if (iOrdinal == 4) {
            return new enio();
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
        synchronized (enir.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
