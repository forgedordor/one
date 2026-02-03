package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erjy extends evsn implements evui {
    public static final erjy a;
    private static volatile evuo d;
    public int b;
    public evqs c = evqs.b;

    static {
        erjy erjyVar = new erjy();
        a = erjyVar;
        evsn.registerDefaultInstance(erjy.class, erjyVar);
    }

    private erjy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new erjy();
        }
        if (iOrdinal == 4) {
            return new erjx();
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
        synchronized (erjy.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
