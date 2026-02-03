package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auch extends evsn implements evui {
    public static final auch a;
    private static volatile evuo g;
    public int b;
    public aubl c;
    public aubq d;
    public evqs e = evqs.b;
    public int f;

    static {
        auch auchVar = new auch();
        a = auchVar;
        evsn.registerDefaultInstance(auch.class, auchVar);
    }

    private auch() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", enyv.a});
        }
        if (iOrdinal == 3) {
            return new auch();
        }
        if (iOrdinal == 4) {
            return new aucg();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (auch.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
