package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmei extends evsn implements evui {
    public static final cmei a;
    private static volatile evuo d;
    public int b;
    public evvp c;

    static {
        cmei cmeiVar = new cmei();
        a = cmeiVar;
        evsn.registerDefaultInstance(cmei.class, cmeiVar);
    }

    private cmei() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new cmei();
        }
        if (iOrdinal == 4) {
            return new cmeh();
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
        synchronized (cmei.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
