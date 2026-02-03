package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spt extends evsn implements evui {
    public static final spt a;
    private static volatile evuo d;
    public int b;
    public int c;
    private int e;

    static {
        spt sptVar = new spt();
        a = sptVar;
        evsn.registerDefaultInstance(spt.class, sptVar);
    }

    private spt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new spt();
        }
        if (iOrdinal == 4) {
            return new sps();
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
        synchronized (spt.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
