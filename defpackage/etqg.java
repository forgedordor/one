package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etqg extends evsn implements evui {
    public static final etqg a;
    private static volatile evuo d;
    public evqs b = evqs.b;
    public int c;

    static {
        etqg etqgVar = new etqg();
        a = etqgVar;
        evsn.registerDefaultInstance(etqg.class, etqgVar);
    }

    private etqg() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\n\u0003\f", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new etqg();
        }
        if (iOrdinal == 4) {
            return new etqf();
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
        synchronized (etqg.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
