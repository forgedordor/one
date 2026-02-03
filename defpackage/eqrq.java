package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqrq extends evsn implements evui {
    public static final eqrq a;
    private static volatile evuo b;

    static {
        eqrq eqrqVar = new eqrq();
        a = eqrqVar;
        evsn.registerDefaultInstance(eqrq.class, eqrqVar);
    }

    private eqrq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new eqrq();
        }
        if (iOrdinal == 4) {
            return new eqrp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = b;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eqrq.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
