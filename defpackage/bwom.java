package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwom extends evsn implements evui {
    public static final bwom a;
    private static volatile evuo f;
    public int b;
    public int c;
    public evqs d = evqs.b;
    public bwoy e;

    static {
        bwom bwomVar = new bwom();
        a = bwomVar;
        evsn.registerDefaultInstance(bwom.class, bwomVar);
    }

    private bwom() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ည\u0000\u0003ဉ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new bwom();
        }
        if (iOrdinal == 4) {
            return new bwol();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (bwom.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
