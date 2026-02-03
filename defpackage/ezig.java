package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezig extends evsn implements evui {
    public static final ezig a;
    private static volatile evuo g;
    public int b;
    public ezpp c;
    public ezol d;
    public ezik e;
    public evqs f = evqs.b;

    static {
        ezig ezigVar = new ezig();
        a = ezigVar;
        evsn.registerDefaultInstance(ezig.class, ezigVar);
    }

    private ezig() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\n", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ezig();
        }
        if (iOrdinal == 4) {
            return new ezif();
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
        synchronized (ezig.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
