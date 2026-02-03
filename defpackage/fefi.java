package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fefi extends evsn implements evui {
    public static final fefi a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        fefi fefiVar = new fefi();
        a = fefiVar;
        evsn.registerDefaultInstance(fefi.class, fefiVar);
    }

    private fefi() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new fefi();
        }
        if (iOrdinal == 4) {
            return new fefh();
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
        synchronized (fefi.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
