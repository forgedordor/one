package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezsw extends evsn implements evui {
    public static final ezsw a;
    private static volatile evuo b;

    static {
        ezsw ezswVar = new ezsw();
        a = ezswVar;
        evsn.registerDefaultInstance(ezsw.class, ezswVar);
    }

    private ezsw() {
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
            return new ezsw();
        }
        if (iOrdinal == 4) {
            return new ezsv();
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
        synchronized (ezsw.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
