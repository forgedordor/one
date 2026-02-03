package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class encw extends evsn implements evui {
    public static final encw a;
    private static volatile evuo d;
    public int b;
    public int c;

    static {
        encw encwVar = new encw();
        a = encwVar;
        evsn.registerDefaultInstance(encw.class, encwVar);
    }

    private encw() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", encv.a});
        }
        if (iOrdinal == 3) {
            return new encw();
        }
        if (iOrdinal == 4) {
            return new encu();
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
        synchronized (encw.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
