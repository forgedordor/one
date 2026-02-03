package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjnm extends evsn implements evui {
    public static final cjnm a;
    private static volatile evuo e;
    public int b;
    public aubt c;
    public eyga d;

    static {
        cjnm cjnmVar = new cjnm();
        a = cjnmVar;
        evsn.registerDefaultInstance(cjnm.class, cjnmVar);
    }

    private cjnm() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0006ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new cjnm();
        }
        if (iOrdinal == 4) {
            return new cjnl();
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
        synchronized (cjnm.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
