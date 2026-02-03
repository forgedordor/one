package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ensj extends evsn implements evui {
    public static final ensj a;
    private static volatile evuo h;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public enpl g;

    static {
        ensj ensjVar = new ensj();
        a = ensjVar;
        evsn.registerDefaultInstance(ensj.class, ensjVar);
    }

    private ensj() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ensj();
        }
        if (iOrdinal == 4) {
            return new ensi();
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
        synchronized (ensj.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
