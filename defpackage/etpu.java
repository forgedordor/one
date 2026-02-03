package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etpu extends evsn implements evui {
    public static final etpu a;
    private static volatile evuo f;
    public int b;
    public long c;
    public long d;
    public evvp e;

    static {
        etpu etpuVar = new etpu();
        a = etpuVar;
        evsn.registerDefaultInstance(etpu.class, etpuVar);
    }

    private etpu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003ဉ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new etpu();
        }
        if (iOrdinal == 4) {
            return new etpt();
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
        synchronized (etpu.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
