package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjtr extends evsn implements evui {
    public static final cjtr a;
    private static volatile evuo f;
    public int b;
    public evvp c;
    public evvp d;
    public int e;

    static {
        cjtr cjtrVar = new cjtr();
        a = cjtrVar;
        evsn.registerDefaultInstance(cjtr.class, cjtrVar);
    }

    private cjtr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0002\u0003ဉ\u0001", new Object[]{"b", "c", "e", "d"});
        }
        if (iOrdinal == 3) {
            return new cjtr();
        }
        if (iOrdinal == 4) {
            return new cjtp();
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
        synchronized (cjtr.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
