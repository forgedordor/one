package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejrf extends evsn implements evui {
    public static final ejrf a;
    private static volatile evuo d;
    public evsx b = emptyIntList();
    public long c;

    static {
        ejrf ejrfVar = new ejrf();
        a = ejrfVar;
        evsn.registerDefaultInstance(ejrf.class, ejrfVar);
    }

    private ejrf() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001+\u0002\u0010", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new ejrf();
        }
        if (iOrdinal == 4) {
            return new ejre();
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
        synchronized (ejrf.class) {
            evsgVar = d;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                d = evsgVar;
            }
        }
        return evsgVar;
    }
}
