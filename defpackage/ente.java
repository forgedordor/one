package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ente extends evsn implements evui {
    public static final ente a;
    private static volatile evuo h;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;

    static {
        ente enteVar = new ente();
        a = enteVar;
        evsn.registerDefaultInstance(ente.class, enteVar);
    }

    private ente() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0003\u0004ဇ\u0004\u0005᠌\u0002", new Object[]{"b", "c", "d", "f", "g", "e", entn.a});
        }
        if (iOrdinal == 3) {
            return new ente();
        }
        if (iOrdinal == 4) {
            return new entd();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (ente.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
