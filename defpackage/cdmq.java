package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdmq extends evsn implements evui {
    public static final cdmq a;
    private static volatile evuo e;
    public int b;
    public int c;
    public boolean d;

    static {
        cdmq cdmqVar = new cdmq();
        a = cdmqVar;
        evsn.registerDefaultInstance(cdmq.class, cdmqVar);
    }

    private cdmq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002\u0007", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new cdmq();
        }
        if (iOrdinal == 4) {
            return new cdmp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cdmq.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
