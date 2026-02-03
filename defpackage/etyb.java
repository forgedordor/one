package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etyb extends evsn implements evui {
    public static final etyb a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public etxy f;

    static {
        etyb etybVar = new etyb();
        a = etybVar;
        evsn.registerDefaultInstance(etyb.class, etybVar);
    }

    private etyb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004\f\u0005ဉ\u0000", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new etyb();
        }
        if (iOrdinal == 4) {
            return new etya();
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
        synchronized (etyb.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
