package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eriu extends evsn implements evui {
    public static final eriu a;
    private static volatile evuo e;
    public int b;
    public eriw c;
    public int d;

    static {
        eriu eriuVar = new eriu();
        a = eriuVar;
        evsn.registerDefaultInstance(eriu.class, eriuVar);
    }

    private eriu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new eriu();
        }
        if (iOrdinal == 4) {
            return new erit();
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
        synchronized (eriu.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
