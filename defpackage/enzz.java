package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enzz extends evsn implements evui {
    public static final enzz a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        enzz enzzVar = new enzz();
        a = enzzVar;
        evsn.registerDefaultInstance(enzz.class, enzzVar);
    }

    private enzz() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", eoae.class, eoab.class});
        }
        if (iOrdinal == 3) {
            return new enzz();
        }
        if (iOrdinal == 4) {
            return new enzy();
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
        synchronized (enzz.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
