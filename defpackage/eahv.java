package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eahv extends evsn implements evui {
    public static final eahv a;
    private static volatile evuo e;
    public int b = 0;
    public Object c;
    public eahp d;
    private int f;

    static {
        eahv eahvVar = new eahv();
        a = eahvVar;
        evsn.registerDefaultInstance(eahv.class, eahvVar);
    }

    private eahv() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", "f", "d", eaht.class, eahn.class});
        }
        if (iOrdinal == 3) {
            return new eahv();
        }
        if (iOrdinal == 4) {
            return new eahu();
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
        synchronized (eahv.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
