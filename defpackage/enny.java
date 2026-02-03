package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enny extends evsn implements evui {
    public static final enny a;
    private static volatile evuo d;
    public int b;
    public evvp c;

    static {
        enny ennyVar = new enny();
        a = ennyVar;
        evsn.registerDefaultInstance(enny.class, ennyVar);
    }

    private enny() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new enny();
        }
        if (iOrdinal == 4) {
            return new ennx();
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
        synchronized (enny.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
