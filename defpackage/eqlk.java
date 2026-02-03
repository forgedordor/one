package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqlk extends evsn implements evui {
    public static final eqlk a;
    private static volatile evuo f;
    public int b;
    public eqny c;
    public evsx d = emptyIntList();
    public int e;

    static {
        eqlk eqlkVar = new eqlk();
        a = eqlkVar;
        evsn.registerDefaultInstance(eqlk.class, eqlkVar);
    }

    private eqlk() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0002ϧ\u0003\u0000\u0001\u0000\u0002,\u0003\u0004ϧဉ\u0000", new Object[]{"b", "d", "e", "c"});
        }
        if (iOrdinal == 3) {
            return new eqlk();
        }
        if (iOrdinal == 4) {
            return new eqlj();
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
        synchronized (eqlk.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
