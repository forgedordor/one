package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqqr extends evsn implements evui {
    public static final cqqr a;
    private static volatile evuo g;
    public int b;
    public cqqk c;
    public cqqm d;
    public cqqq e;
    public cqqo f;

    static {
        cqqr cqqrVar = new cqqr();
        a = cqqrVar;
        evsn.registerDefaultInstance(cqqr.class, cqqrVar);
    }

    private cqqr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new cqqr();
        }
        if (iOrdinal == 4) {
            return new cqqi();
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
        synchronized (cqqr.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
