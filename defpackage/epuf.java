package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epuf extends evsn implements evui {
    public static final epuf a;
    private static volatile evuo d;
    public int b;
    public int c;
    private int e;

    static {
        epuf epufVar = new epuf();
        a = epufVar;
        evsn.registerDefaultInstance(epuf.class, epufVar);
    }

    private epuf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0002", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new epuf();
        }
        if (iOrdinal == 4) {
            return new epue();
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
        synchronized (epuf.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
