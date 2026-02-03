package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drnr extends evsn implements evui {
    public static final drnr a;
    private static volatile evuo e;
    public int b;
    public droh c;
    public evub d = evub.a;

    static {
        drnr drnrVar = new drnr();
        a = drnrVar;
        evsn.registerDefaultInstance(drnr.class, drnrVar);
    }

    private drnr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"b", "c", "d", drnq.a});
        }
        if (iOrdinal == 3) {
            return new drnr();
        }
        if (iOrdinal == 4) {
            return new drnp();
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
        synchronized (drnr.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
