package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evhv extends evsn implements evui {
    public static final evhv a;
    private static volatile evuo g;
    public int b;
    public long d;
    public long e;
    public String c = "";
    public evqs f = evqs.b;

    static {
        evhv evhvVar = new evhv();
        a = evhvVar;
        evsn.registerDefaultInstance(evhv.class, evhvVar);
    }

    private evhv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0000\u0003ဂ\u0001\u0004ဈ\u0000\u0005ဂ\u0002\u0006ည\u0003", new Object[]{"b", "d", "c", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new evhv();
        }
        if (iOrdinal == 4) {
            return new evhu();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evhv.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
