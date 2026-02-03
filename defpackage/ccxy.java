package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccxy extends evsn implements evui {
    public static final ccxy a;
    private static volatile evuo d;
    public int b;
    public boolean c;

    static {
        ccxy ccxyVar = new ccxy();
        a = ccxyVar;
        evsn.registerDefaultInstance(ccxy.class, ccxyVar);
    }

    private ccxy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ccxy();
        }
        if (iOrdinal == 4) {
            return new ccxx();
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
        synchronized (ccxy.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
