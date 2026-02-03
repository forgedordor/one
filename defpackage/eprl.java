package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eprl extends evsn implements evui {
    public static final eprl a;
    private static volatile evuo d;
    public evqs b = evqs.b;
    public eprj c;
    private int e;

    static {
        eprl eprlVar = new eprl();
        a = eprlVar;
        evsn.registerDefaultInstance(eprl.class, eprlVar);
    }

    private eprl() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ည\u0000\u0003ဉ\u0001", new Object[]{"e", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new eprl();
        }
        if (iOrdinal == 4) {
            return new eprk();
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
        synchronized (eprl.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
