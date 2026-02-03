package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqjf extends evsn implements evui {
    public static final eqjf a;
    private static volatile evuo c;
    public evvp b;
    private int d;

    static {
        eqjf eqjfVar = new eqjf();
        a = eqjfVar;
        evsn.registerDefaultInstance(eqjf.class, eqjfVar);
    }

    private eqjf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0001", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new eqjf();
        }
        if (iOrdinal == 4) {
            return new eqje();
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
        synchronized (eqjf.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
