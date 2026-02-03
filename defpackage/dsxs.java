package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsxs extends evsn implements evui {
    public static final dsxs a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        dsxs dsxsVar = new dsxs();
        a = dsxsVar;
        evsn.registerDefaultInstance(dsxs.class, dsxsVar);
    }

    private dsxs() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", eole.a});
        }
        if (iOrdinal == 3) {
            return new dsxs();
        }
        if (iOrdinal == 4) {
            return new dsxr();
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
        synchronized (dsxs.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
