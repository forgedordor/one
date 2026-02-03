package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evdc extends evsn implements evui {
    public static final evdc a;
    private static volatile evuo b;

    static {
        evdc evdcVar = new evdc();
        a = evdcVar;
        evsn.registerDefaultInstance(evdc.class, evdcVar);
    }

    private evdc() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new evdc();
        }
        if (iOrdinal == 4) {
            return new evdb();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = b;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (evdc.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
