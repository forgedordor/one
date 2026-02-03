package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezrn extends evsn implements evui {
    public static final ezrn a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        ezrn ezrnVar = new ezrn();
        a = ezrnVar;
        evsn.registerDefaultInstance(ezrn.class, ezrnVar);
    }

    private ezrn() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"b", ezrp.class});
        }
        if (iOrdinal == 3) {
            return new ezrn();
        }
        if (iOrdinal == 4) {
            return new ezrm();
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
        synchronized (ezrn.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
