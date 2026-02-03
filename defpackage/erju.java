package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erju extends evsn implements evui {
    public static final erju a;
    private static volatile evuo d;
    public int b;
    public evqs c = evqs.b;

    static {
        erju erjuVar = new erju();
        a = erjuVar;
        evsn.registerDefaultInstance(erju.class, erjuVar);
    }

    private erju() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new erju();
        }
        if (iOrdinal == 4) {
            return new erjt();
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
        synchronized (erju.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
