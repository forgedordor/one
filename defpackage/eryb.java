package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eryb extends evsn implements evui {
    public static final eryb a;
    private static volatile evuo f;
    public evsx b = emptyIntList();
    public evsx c = emptyIntList();
    public evsx d = emptyIntList();
    public evsx e = emptyIntList();

    static {
        eryb erybVar = new eryb();
        a = erybVar;
        evsn.registerDefaultInstance(eryb.class, erybVar);
    }

    private eryb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0016\u0002\u0016\u0003\u0016\u0004\u0016", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eryb();
        }
        if (iOrdinal == 4) {
            return new erya();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eryb.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
