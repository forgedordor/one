package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsbq extends evsn implements evui {
    public static final dsbq a;
    private static volatile evuo d;
    public int b;
    public evtg c = emptyProtobufList();
    private int e;

    static {
        dsbq dsbqVar = new dsbq();
        a = dsbqVar;
        evsn.registerDefaultInstance(dsbq.class, dsbqVar);
    }

    private dsbq() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"e", "b", etoq.a, "c", dsbp.class});
        }
        if (iOrdinal == 3) {
            return new dsbq();
        }
        if (iOrdinal == 4) {
            return new dsbn();
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
        synchronized (dsbq.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
