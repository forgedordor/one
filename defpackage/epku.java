package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epku extends evsn implements evui {
    public static final epku a;
    private static volatile evuo e;
    public int b;
    public boolean c;
    public boolean d;

    static {
        epku epkuVar = new epku();
        a = epkuVar;
        evsn.registerDefaultInstance(epku.class, epkuVar);
    }

    private epku() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0007", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new epku();
        }
        if (iOrdinal == 4) {
            return new epkt();
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
        synchronized (epku.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
