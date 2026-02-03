package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epcd extends evsn implements evui {
    public static final epcd a;
    private static volatile evuo d;
    public int b;
    public boolean c;

    static {
        epcd epcdVar = new epcd();
        a = epcdVar;
        evsn.registerDefaultInstance(epcd.class, epcdVar);
    }

    private epcd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\f\u0003\u0007", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new epcd();
        }
        if (iOrdinal == 4) {
            return new epcc();
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
        synchronized (epcd.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
