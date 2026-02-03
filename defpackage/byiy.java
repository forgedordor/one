package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byiy extends evsn implements evui {
    public static final byiy a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public boolean e;

    static {
        byiy byiyVar = new byiy();
        a = byiyVar;
        evsn.registerDefaultInstance(byiy.class, byiyVar);
    }

    private byiy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", byiz.a, "e"});
        }
        if (iOrdinal == 3) {
            return new byiy();
        }
        if (iOrdinal == 4) {
            return new byix();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (byiy.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
