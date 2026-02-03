package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enkd extends evsn implements evui {
    public static final enkd a;
    private static volatile evuo e;
    public int b;
    public int c;
    public evtg d = emptyProtobufList();

    static {
        enkd enkdVar = new enkd();
        a = enkdVar;
        evsn.registerDefaultInstance(enkd.class, enkdVar);
    }

    private enkd() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"b", "c", enjy.a, "d", enxa.class});
        }
        if (iOrdinal == 3) {
            return new enkd();
        }
        if (iOrdinal == 4) {
            return new enkc();
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
        synchronized (enkd.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
