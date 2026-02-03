package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eojt extends evsn implements evui {
    public static final eojt a;
    private static volatile evuo f;
    public int b;
    public evtg c = emptyProtobufList();
    public long d;
    public long e;

    static {
        eojt eojtVar = new eojt();
        a = eojtVar;
        evsn.registerDefaultInstance(eojt.class, eojtVar);
    }

    private eojt() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဃ\u0000\u0003ဃ\u0001", new Object[]{"b", "c", eojs.class, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new eojt();
        }
        if (iOrdinal == 4) {
            return new eojq();
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
        synchronized (eojt.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
