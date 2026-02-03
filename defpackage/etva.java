package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etva extends evsn implements evui {
    public static final etva a;
    private static volatile evuo f;
    public etvu b;
    public evtg c = emptyProtobufList();
    public evtg d = emptyProtobufList();
    public evtg e = emptyProtobufList();
    private int g;

    static {
        etva etvaVar = new etva();
        a = etvaVar;
        evsn.registerDefaultInstance(etva.class, etvaVar);
    }

    private etva() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"g", "b", "c", etxa.class, "d", etwa.class, "e", etus.class});
        }
        if (iOrdinal == 3) {
            return new etva();
        }
        if (iOrdinal == 4) {
            return new etuz();
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
        synchronized (etva.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
