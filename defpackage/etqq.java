package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etqq extends evsn implements evui {
    public static final etqq a;
    private static volatile evuo f;
    public int b;
    public etpq c;
    public etpu d;
    public etpw e;

    static {
        etqq etqqVar = new etqq();
        a = etqqVar;
        evsn.registerDefaultInstance(etqq.class, etqqVar);
    }

    private etqq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new etqq();
        }
        if (iOrdinal == 4) {
            return new etqp();
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
        synchronized (etqq.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
