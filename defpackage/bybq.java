package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bybq extends evsn implements evui {
    public static final bybq a;
    private static volatile evuo c;
    public long b;

    static {
        bybq bybqVar = new bybq();
        a = bybqVar;
        evsn.registerDefaultInstance(bybq.class, bybqVar);
    }

    private bybq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new bybq();
        }
        if (iOrdinal == 4) {
            return new bybp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (bybq.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
