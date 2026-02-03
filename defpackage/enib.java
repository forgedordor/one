package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enib extends evsn implements evui {
    public static final enib a;
    private static volatile evuo f;
    public int b;
    public int c;
    public long d;
    public long e;

    static {
        enib enibVar = new enib();
        a = enibVar;
        evsn.registerDefaultInstance(enib.class, enibVar);
    }

    private enib() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"b", "c", enjn.a, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new enib();
        }
        if (iOrdinal == 4) {
            return new enia();
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
        synchronized (enib.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
