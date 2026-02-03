package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqlu extends evsn implements evui {
    public static final eqlu a;
    private static volatile evuo e;
    public evtg b = emptyProtobufList();
    public String c = "";
    public int d;

    static {
        eqlu eqluVar = new eqlu();
        a = eqluVar;
        evsn.registerDefaultInstance(eqlu.class, eqluVar);
    }

    private eqlu() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003\u0004", new Object[]{"b", eqjv.class, "c", "d"});
        }
        if (iOrdinal == 3) {
            return new eqlu();
        }
        if (iOrdinal == 4) {
            return new eqlt();
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
        synchronized (eqlu.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
