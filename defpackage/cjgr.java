package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjgr extends evsn implements evui {
    public static final cjgr a;
    private static volatile evuo f;
    public int b;
    public int c;
    public cjju d;
    public cjjr e;

    static {
        cjgr cjgrVar = new cjgr();
        a = cjgrVar;
        evsn.registerDefaultInstance(cjgr.class, cjgrVar);
    }

    private cjgr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", cjgp.a, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new cjgr();
        }
        if (iOrdinal == 4) {
            return new cjgo();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cjgr.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
