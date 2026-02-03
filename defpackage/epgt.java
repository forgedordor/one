package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epgt extends evsn implements evui {
    public static final epgt a;
    private static volatile evuo e;
    public int b;
    public int c;
    public long d;

    static {
        epgt epgtVar = new epgt();
        a = epgtVar;
        evsn.registerDefaultInstance(epgt.class, epgtVar);
    }

    private epgt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0002", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new epgt();
        }
        if (iOrdinal == 4) {
            return new epgs();
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
        synchronized (epgt.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
