package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqmi extends evsn implements evui {
    public static final eqmi a;
    private static volatile evuo c;
    public boolean b;
    private boolean d;
    private boolean e;

    static {
        eqmi eqmiVar = new eqmi();
        a = eqmiVar;
        evsn.registerDefaultInstance(eqmi.class, eqmiVar);
    }

    private eqmi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"d", "e", "b"});
        }
        if (iOrdinal == 3) {
            return new eqmi();
        }
        if (iOrdinal == 4) {
            return new eqmh();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eqmi.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
