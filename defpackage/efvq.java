package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efvq extends evsn implements evui {
    public static final efvq a;
    private static volatile evuo c;
    public int b = 1;
    private int d;

    static {
        efvq efvqVar = new efvq();
        a = efvqVar;
        evsn.registerDefaultInstance(efvq.class, efvqVar);
    }

    private efvq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0003", new Object[]{"d", "b", efvn.a});
        }
        if (iOrdinal == 3) {
            return new efvq();
        }
        if (iOrdinal == 4) {
            return new efvp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = c;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (efvq.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
