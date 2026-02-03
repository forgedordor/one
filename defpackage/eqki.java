package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqki extends evsn implements evui {
    public static final eqki a;
    private static volatile evuo e;
    public int b;
    public eqny c;
    public String d = "";

    static {
        eqki eqkiVar = new eqki();
        a = eqkiVar;
        evsn.registerDefaultInstance(eqki.class, eqkiVar);
    }

    private eqki() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0000\u0000\u0001Ȉϧဉ\u0000", new Object[]{"b", "d", "c"});
        }
        if (iOrdinal == 3) {
            return new eqki();
        }
        if (iOrdinal == 4) {
            return new eqkh();
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
        synchronized (eqki.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
