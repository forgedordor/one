package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccco extends evsn implements evui {
    public static final ccco a;
    private static volatile evuo f;
    public int b;
    public evqs c = evqs.b;
    public evvp d;
    public evvp e;

    static {
        ccco cccoVar = new ccco();
        a = cccoVar;
        evsn.registerDefaultInstance(ccco.class, cccoVar);
    }

    private ccco() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ccco();
        }
        if (iOrdinal == 4) {
            return new cccn();
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
        synchronized (ccco.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
