package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class augk extends evsn implements evui {
    public static final augk a;
    private static volatile evuo e;
    public int b;
    public aubl c;
    public evqs d = evqs.b;

    static {
        augk augkVar = new augk();
        a = augkVar;
        evsn.registerDefaultInstance(augk.class, augkVar);
    }

    private augk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new augk();
        }
        if (iOrdinal == 4) {
            return new augj();
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
        synchronized (augk.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
