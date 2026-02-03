package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agzr extends evsn<agzr, agzp> implements evui {
    public static final agzr a;
    private static volatile evuo d;
    public int b;
    public long c;

    static {
        agzr agzrVar = new agzr();
        a = agzrVar;
        evsn.registerDefaultInstance(agzr.class, agzrVar);
    }

    private agzr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new agzr();
        }
        if (iOrdinal == 4) {
            return new agzp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (agzr.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
