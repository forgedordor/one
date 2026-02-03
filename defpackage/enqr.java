package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enqr extends evsn implements evui {
    public static final enqr a;
    private static volatile evuo h;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public evqs f = evqs.b;
    public int g;

    static {
        enqr enqrVar = new enqr();
        a = enqrVar;
        evsn.registerDefaultInstance(enqr.class, enqrVar);
    }

    private enqr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ည\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", enqp.a, "f", "g", enqo.a});
        }
        if (iOrdinal == 3) {
            return new enqr();
        }
        if (iOrdinal == 4) {
            return new enqn();
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
        synchronized (enqr.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
