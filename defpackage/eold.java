package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eold extends evsn implements evui {
    public static final eold a;
    private static volatile evuo c;
    public int b;
    private int d;

    static {
        eold eoldVar = new eold();
        a = eoldVar;
        evsn.registerDefaultInstance(eold.class, eoldVar);
    }

    private eold() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"d", "b", eolb.a});
        }
        if (iOrdinal == 3) {
            return new eold();
        }
        if (iOrdinal == 4) {
            return new eola();
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
        synchronized (eold.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
