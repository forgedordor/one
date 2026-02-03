package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxnx extends evsn implements evui {
    public static final bxnx a;
    private static volatile evuo h;
    public int b;
    public int c;
    public aubx e;
    public emki g;
    public String d = "";
    public evqs f = evqs.b;

    static {
        bxnx bxnxVar = new bxnx();
        a = bxnxVar;
        evsn.registerDefaultInstance(bxnx.class, bxnxVar);
    }

    private bxnx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0004ည\u0001\u0005ဉ\u0002\u0006ဉ\u0000", new Object[]{"b", "c", "d", "f", "g", "e"});
        }
        if (iOrdinal == 3) {
            return new bxnx();
        }
        if (iOrdinal == 4) {
            return new bxnv();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = h;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (bxnx.class) {
            evsgVar = h;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                h = evsgVar;
            }
        }
        return evsgVar;
    }
}
