package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjjf extends evsn implements evui {
    public static final cjjf a;
    private static volatile evuo h;
    public int b;
    public int c = 0;
    public Object d;
    public cjgr e;
    public evvp f;
    public int g;

    static {
        cjjf cjjfVar = new cjjf();
        a = cjjfVar;
        evsn.registerDefaultInstance(cjjf.class, cjjfVar);
    }

    private cjjf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004ဉ\u0001\u0005င\u0002", new Object[]{"d", "c", "b", "e", cjjn.class, cjjj.class, "f", "g"});
        }
        if (iOrdinal == 3) {
            return new cjjf();
        }
        if (iOrdinal == 4) {
            return new cjje();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cjjf.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
