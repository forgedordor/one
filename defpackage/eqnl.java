package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqnl extends evsn implements evui {
    public static final eqnl a;
    private static volatile evuo f;
    public int b;
    public String c = "";
    public eqnq d;
    public evqe e;

    static {
        eqnl eqnlVar = new eqnl();
        a = eqnlVar;
        evsn.registerDefaultInstance(eqnl.class, eqnlVar);
    }

    private eqnl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eqnl();
        }
        if (iOrdinal == 4) {
            return new eqnk();
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
        synchronized (eqnl.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
