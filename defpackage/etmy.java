package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etmy extends evsn implements evui {
    public static final evsy a = new etmw();
    public static final etmy b;
    private static volatile evuo d;
    public evsx c = emptyIntList();

    static {
        etmy etmyVar = new etmy();
        b = etmyVar;
        evsn.registerDefaultInstance(etmy.class, etmyVar);
    }

    private etmy() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"c", etgc.a});
        }
        if (iOrdinal == 3) {
            return new etmy();
        }
        if (iOrdinal == 4) {
            return new etmx();
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = d;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (etmy.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(b);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
