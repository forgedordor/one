package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emdx extends evsn implements evui {
    public static final emdx a;
    private static volatile evuo f;
    public int b;
    public evsx c = emptyIntList();
    public evsx d = emptyIntList();
    public int e;

    static {
        emdx emdxVar = new emdx();
        a = emdxVar;
        evsn.registerDefaultInstance(emdx.class, emdxVar);
    }

    private emdx() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = emcm.a;
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ࠞ\u0002ࠞ\u0003င\u0000", new Object[]{"b", "c", evsvVar, "d", evsvVar, "e"});
        }
        if (iOrdinal == 3) {
            return new emdx();
        }
        if (iOrdinal == 4) {
            return new emdw();
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
        synchronized (emdx.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
