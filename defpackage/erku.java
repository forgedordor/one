package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erku extends evsn implements evui {
    public static final erku a;
    private static volatile evuo f;
    public int b;
    public erla c;
    public erkq d;
    public int e;

    static {
        erku erkuVar = new erku();
        a = erkuVar;
        evsn.registerDefaultInstance(erku.class, erkuVar);
    }

    private erku() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new erku();
        }
        if (iOrdinal == 4) {
            return new erkt();
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
        synchronized (erku.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
