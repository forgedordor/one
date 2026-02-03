package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class seb extends evsn implements evui {
    public static final seb a;
    private static volatile evuo g;
    public int b;
    public evtg c = emptyProtobufList();
    public sex d;
    public long e;
    public int f;

    static {
        seb sebVar = new seb();
        a = sebVar;
        evsn.registerDefaultInstance(seb.class, sebVar);
    }

    private seb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဃ\u0001\u0004᠌\u0002", new Object[]{"b", "c", sed.class, "d", "e", "f", sfo.a});
        }
        if (iOrdinal == 3) {
            return new seb();
        }
        if (iOrdinal == 4) {
            return new sea();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = g;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (seb.class) {
            evsgVar = g;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                g = evsgVar;
            }
        }
        return evsgVar;
    }
}
