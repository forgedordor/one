package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ainp extends evsn implements evui {
    public static final ainp a;
    private static volatile evuo d;
    public int b;
    public evtg c = emptyProtobufList();
    private int e;

    static {
        ainp ainpVar = new ainp();
        a = ainpVar;
        evsn.registerDefaultInstance(ainp.class, ainpVar);
    }

    private ainp() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"e", "b", eyej.a, "c", aink.class});
        }
        if (iOrdinal == 3) {
            return new ainp();
        }
        if (iOrdinal == 4) {
            return new aino();
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
        synchronized (ainp.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
