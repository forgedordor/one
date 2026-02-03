package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjjd extends evsn implements evui {
    public static final cjjd a;
    private static volatile evuo i;
    public int b;
    public int c = 0;
    public Object d;
    public cjgr e;
    public evvp f;
    public evvp g;
    public int h;

    static {
        cjjd cjjdVar = new cjjd();
        a = cjjdVar;
        evsn.registerDefaultInstance(cjjd.class, cjjdVar);
    }

    private cjjd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006င\u0003", new Object[]{"d", "c", "b", "e", cjjl.class, cjjh.class, "f", "g", "h"});
        }
        if (iOrdinal == 3) {
            return new cjjd();
        }
        if (iOrdinal == 4) {
            return new cjjc();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = i;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (cjjd.class) {
            evsgVar = i;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                i = evsgVar;
            }
        }
        return evsgVar;
    }
}
