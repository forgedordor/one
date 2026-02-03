package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eozk extends evsn implements evui {
    public static final eozk a;
    private static volatile evuo g;
    public int b;
    public String c = "";
    public evqs d = evqs.b;
    public int e;
    public epdo f;

    static {
        eozk eozkVar = new eozk();
        a = eozkVar;
        evsn.registerDefaultInstance(eozk.class, eozkVar);
    }

    private eozk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002Ȉ\u0003\n\u0004\f\u0005ဉ\u0000", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new eozk();
        }
        if (iOrdinal == 4) {
            return new eozj();
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
        synchronized (eozk.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
