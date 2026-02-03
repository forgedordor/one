package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eriw extends evsn implements evui {
    public static final eriw a;
    private static volatile evuo g;
    public int b;
    public int c;
    public int d;
    public int e;
    public erlq f;

    static {
        eriw eriwVar = new eriw();
        a = eriwVar;
        evsn.registerDefaultInstance(eriw.class, eriwVar);
    }

    private eriw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f\u0004ဉ\u0000", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eriw();
        }
        if (iOrdinal == 4) {
            return new eriv();
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
        synchronized (eriw.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
