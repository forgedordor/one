package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjjj extends evsn implements evui {
    public static final cjjj a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        cjjj cjjjVar = new cjjj();
        a = cjjjVar;
        evsn.registerDefaultInstance(cjjj.class, cjjjVar);
    }

    private cjjj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", cjkf.a});
        }
        if (iOrdinal == 3) {
            return new cjjj();
        }
        if (iOrdinal == 4) {
            return new cjji();
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
        synchronized (cjjj.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
