package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drys extends evsn implements evui {
    public static final drys a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        drys drysVar = new drys();
        a = drysVar;
        evsn.registerDefaultInstance(drys.class, drysVar);
    }

    private drys() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", drwp.class});
        }
        if (iOrdinal == 3) {
            return new drys();
        }
        if (iOrdinal == 4) {
            return new dryr();
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
        synchronized (drys.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
