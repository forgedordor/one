package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eltq extends evsn implements evui {
    public static final eltq a;
    private static volatile evuo f;
    public int b;
    public int c = -1;
    public elit d;
    public int e;

    static {
        eltq eltqVar = new eltq();
        a = eltqVar;
        evsn.registerDefaultInstance(eltq.class, eltqVar);
    }

    private eltq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", elto.a});
        }
        if (iOrdinal == 3) {
            return new eltq();
        }
        if (iOrdinal == 4) {
            return new eltn();
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
        synchronized (eltq.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
