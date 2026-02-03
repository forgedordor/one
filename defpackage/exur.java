package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exur extends evsn implements evui {
    public static final exur a;
    private static volatile evuo e;
    public int b;
    public int c;
    public evqs d = evqs.b;

    static {
        exur exurVar = new exur();
        a = exurVar;
        evsn.registerDefaultInstance(exur.class, exurVar);
    }

    private exur() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ည\u0001", new Object[]{"b", "c", exut.a, "d"});
        }
        if (iOrdinal == 3) {
            return new exur();
        }
        if (iOrdinal == 4) {
            return new exuq();
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
        synchronized (exur.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
