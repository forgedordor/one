package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enkb extends evsn implements evui {
    public static final enkb a;
    private static volatile evuo d;
    public int b = 0;
    public Object c;

    static {
        enkb enkbVar = new enkb();
        a = enkbVar;
        evsn.registerDefaultInstance(enkb.class, enkbVar);
    }

    private enkb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", enkd.class, enkf.class});
        }
        if (iOrdinal == 3) {
            return new enkb();
        }
        if (iOrdinal == 4) {
            return new enka();
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
        synchronized (enkb.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
