package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epgn extends evsn implements evui {
    public static final epgn a;
    private static volatile evuo f;
    public boolean b;
    public long c;
    public boolean d;
    public boolean e;

    static {
        epgn epgnVar = new epgn();
        a = epgnVar;
        evsn.registerDefaultInstance(epgn.class, epgnVar);
    }

    private epgn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0002\u0003\u0007\u0004\u0007", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new epgn();
        }
        if (iOrdinal == 4) {
            return new epgm();
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
        synchronized (epgn.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
