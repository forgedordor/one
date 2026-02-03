package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqka extends evsn implements evui {
    public static final eqka a;
    private static volatile evuo b;

    static {
        eqka eqkaVar = new eqka();
        a = eqkaVar;
        evsn.registerDefaultInstance(eqka.class, eqkaVar);
    }

    private eqka() {
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
            return new eqka();
        }
        if (iOrdinal == 4) {
            return new eqjz();
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
        synchronized (eqka.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
