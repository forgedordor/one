package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enhy extends evsn implements evui {
    public static final enhy a;
    private static volatile evuo d;
    public int b;
    public long c;

    static {
        enhy enhyVar = new enhy();
        a = enhyVar;
        evsn.registerDefaultInstance(enhy.class, enhyVar);
    }

    private enhy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new enhy();
        }
        if (iOrdinal == 4) {
            return new enhx();
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
        synchronized (enhy.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
