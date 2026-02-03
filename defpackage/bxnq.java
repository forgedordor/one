package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxnq extends evsn implements evui {
    public static final bxnq a;
    private static volatile evuo e;
    public int b;
    public bxnt c;
    public aubx d;

    static {
        bxnq bxnqVar = new bxnq();
        a = bxnqVar;
        evsn.registerDefaultInstance(bxnq.class, bxnqVar);
    }

    private bxnq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new bxnq();
        }
        if (iOrdinal == 4) {
            return new bxnp();
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
        synchronized (bxnq.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
