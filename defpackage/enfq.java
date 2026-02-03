package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enfq extends evsn implements evui {
    public static final enfq a;
    private static volatile evuo f;
    public int b;
    public int c = 0;
    public Object d;
    public int e;

    static {
        enfq enfqVar = new enfq();
        a = enfqVar;
        evsn.registerDefaultInstance(enfq.class, enfqVar);
    }

    private enfq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"d", "c", "b", "e", enfl.a, enfk.class, enfp.class});
        }
        if (iOrdinal == 3) {
            return new enfq();
        }
        if (iOrdinal == 4) {
            return new enfg();
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
        synchronized (enfq.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
