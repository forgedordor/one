package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evxh extends evsn implements evxj {
    public static final evxh a;
    private static volatile evuo e;
    public int b;
    public evya c;
    public evxt d;

    static {
        evxh evxhVar = new evxh();
        a = evxhVar;
        evsn.registerDefaultInstance(evxh.class, evxhVar);
    }

    private evxh() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new evxh();
        }
        if (iOrdinal == 4) {
            return new evxg();
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
        synchronized (evxh.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
