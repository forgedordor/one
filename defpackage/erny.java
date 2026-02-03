package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erny extends evsn implements evui {
    public static final erny a;
    private static volatile evuo d;
    public int b;
    public evqs c = evqs.b;

    static {
        erny ernyVar = new erny();
        a = ernyVar;
        evsn.registerDefaultInstance(erny.class, ernyVar);
    }

    private erny() {
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
            return new erny();
        }
        if (iOrdinal == 4) {
            return new ernx();
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
        synchronized (erny.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
