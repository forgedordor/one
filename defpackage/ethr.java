package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ethr extends evsn implements evui {
    public static final ethr a;
    private static volatile evuo f;
    public int b;
    public evtg c = emptyProtobufList();
    public evrj d;
    public boolean e;

    static {
        ethr ethrVar = new ethr();
        a = ethrVar;
        evsn.registerDefaultInstance(ethr.class, ethrVar);
    }

    private ethr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဇ\u0001", new Object[]{"b", "c", ethp.class, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ethr();
        }
        if (iOrdinal == 4) {
            return new ethq();
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
        synchronized (ethr.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
