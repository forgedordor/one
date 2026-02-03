package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezkb extends evsn implements evui {
    public static final ezkb a;
    private static volatile evuo f;
    public int b;
    public ezpp c;
    public evtg d = emptyProtobufList();
    public int e;

    static {
        ezkb ezkbVar = new ezkb();
        a = ezkbVar;
        evsn.registerDefaultInstance(ezkb.class, ezkbVar);
    }

    private ezkb() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u0004", new Object[]{"b", "c", "d", ezol.class, "e"});
        }
        if (iOrdinal == 3) {
            return new ezkb();
        }
        if (iOrdinal == 4) {
            return new ezka();
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
        synchronized (ezkb.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
