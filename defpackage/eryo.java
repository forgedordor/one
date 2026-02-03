package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eryo extends evsn implements evui {
    public static final eryo a;
    private static volatile evuo d;
    public int b;
    public evqs c = evqs.b;
    private int e;

    static {
        eryo eryoVar = new eryo();
        a = eryoVar;
        evsn.registerDefaultInstance(eryo.class, eryoVar);
    }

    private eryo() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ည\u0001", new Object[]{"e", "b", erym.a, "c"});
        }
        if (iOrdinal == 3) {
            return new eryo();
        }
        if (iOrdinal == 4) {
            return new eryl();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eryo.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
