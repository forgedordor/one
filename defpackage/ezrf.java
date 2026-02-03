package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezrf extends evsn implements evui {
    public static final ezrf a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        ezrf ezrfVar = new ezrf();
        a = ezrfVar;
        evsn.registerDefaultInstance(ezrf.class, ezrfVar);
    }

    private ezrf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"b", ezol.class});
        }
        if (iOrdinal == 3) {
            return new ezrf();
        }
        if (iOrdinal == 4) {
            return new ezre();
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
        synchronized (ezrf.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
