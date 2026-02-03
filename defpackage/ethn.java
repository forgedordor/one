package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ethn extends evsn implements evui {
    public static final ethn a;
    private static volatile evuo c;
    public evtg b = emptyProtobufList();

    static {
        ethn ethnVar = new ethn();
        a = ethnVar;
        evsn.registerDefaultInstance(ethn.class, ethnVar);
    }

    private ethn() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", ethk.class});
        }
        if (iOrdinal == 3) {
            return new ethn();
        }
        if (iOrdinal == 4) {
            return new ethi();
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
        synchronized (ethn.class) {
            evsgVar = c;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                c = evsgVar;
            }
        }
        return evsgVar;
    }
}
