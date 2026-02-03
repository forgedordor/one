package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evcr extends evsn implements evui {
    public static final evcr a;
    private static volatile evuo e;
    public int b;
    public evco c;
    public int d;

    static {
        evcr evcrVar = new evcr();
        a = evcrVar;
        evsn.registerDefaultInstance(evcr.class, evcrVar);
    }

    private evcr() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", evcq.a});
        }
        if (iOrdinal == 3) {
            return new evcr();
        }
        if (iOrdinal == 4) {
            return new evcp();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evcr.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
