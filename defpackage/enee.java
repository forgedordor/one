package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enee extends evsn implements evui {
    public static final enee a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        enee eneeVar = new enee();
        a = eneeVar;
        evsn.registerDefaultInstance(enee.class, eneeVar);
    }

    private enee() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", ened.a});
        }
        if (iOrdinal == 3) {
            return new enee();
        }
        if (iOrdinal == 4) {
            return new enec();
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
        synchronized (enee.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
