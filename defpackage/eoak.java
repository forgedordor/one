package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoak extends evsn implements evui {
    public static final eoak a;
    private static volatile evuo b;

    static {
        eoak eoakVar = new eoak();
        a = eoakVar;
        evsn.registerDefaultInstance(eoak.class, eoakVar);
    }

    private eoak() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new eoak();
        }
        if (iOrdinal == 4) {
            return new eoaj();
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
        synchronized (eoak.class) {
            evsgVar = b;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                b = evsgVar;
            }
        }
        return evsgVar;
    }
}
