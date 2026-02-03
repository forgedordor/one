package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ausb extends evsn implements evui {
    public static final ausb a;
    private static volatile evuo f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        ausb ausbVar = new ausb();
        a = ausbVar;
        evsn.registerDefaultInstance(ausb.class, ausbVar);
    }

    private ausb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            evsv evsvVar = aurz.a;
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", evsvVar, "d", evsvVar, "e", evsvVar});
        }
        if (iOrdinal == 3) {
            return new ausb();
        }
        if (iOrdinal == 4) {
            return new aury();
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
        synchronized (ausb.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
