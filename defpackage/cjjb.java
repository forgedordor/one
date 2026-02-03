package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjjb extends evsn implements evui {
    public static final cjjb a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int d;
    public cjkk e;
    public int f;

    static {
        cjjb cjjbVar = new cjjb();
        a = cjjbVar;
        evsn.registerDefaultInstance(cjjb.class, cjjbVar);
    }

    private cjjb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0002\b᠌\u0003", new Object[]{"b", "c", cjhe.a, "d", cjhc.a, "e", "f", cjiz.a});
        }
        if (iOrdinal == 3) {
            return new cjjb();
        }
        if (iOrdinal == 4) {
            return new cjiy();
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
        synchronized (cjjb.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
