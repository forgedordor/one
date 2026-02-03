package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezhm extends evsn implements evui {
    public static final ezhm a;
    private static volatile evuo c;
    public evtg b;

    static {
        ezhm ezhmVar = new ezhm();
        a = ezhmVar;
        evsn.registerDefaultInstance(ezhm.class, ezhmVar);
    }

    private ezhm() {
        emptyProtobufList();
        emptyProtobufList();
        this.b = emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"b", ezpt.class});
        }
        if (iOrdinal == 3) {
            return new ezhm();
        }
        if (iOrdinal == 4) {
            return new ezhl();
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
        synchronized (ezhm.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
